package com.chywx;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import java.net.URISyntaxException;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/7/22 0022
 */
public class DemoSocketClient {
    public static void main(String[] args) {
        try{
            IO.Options options = new IO.Options();
            options.path = "/bet";
            options.query = "loginUserNum=123";
            final Socket socket = IO.socket("http://192.168.1.223:6688", options);
            socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    System.out.println("connect");
                    socket.emit("bet_ping","hahaha");
//                    socket.close();
                }
            }).on(Socket.EVENT_CONNECT_TIMEOUT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    System.out.println("connect timeout");
                }
            }).on(Socket.EVENT_CONNECT_ERROR, new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    System.out.println("connect error");
                }
            }).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {
                    System.out.println("disconnect");
                }
            }).on("notice_info", new Emitter.Listener(){
                @Override
                public void call(Object... args){
                    String data = (String)args[0];
                }
            });
            socket.open();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
