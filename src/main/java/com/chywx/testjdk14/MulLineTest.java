package com.chywx.testjdk14;

/**
 * 功能描述
 *
 * @author chy
 * @date 2020/6/11 0011
 */
public class MulLineTest {

    public static void main(String[] args) {
        String html = "<html>\n" +
            "    <body>\n" +
            "        <p>Hello, world %s</p>\n" +
            "    </body>\n" +
            "</html>\n";
        System.out.println(String.format(html,"chy"));
    }

}
