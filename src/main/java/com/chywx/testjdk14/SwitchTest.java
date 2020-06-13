package com.chywx.testjdk14;

/**
 * 功能描述
 *
 * @author chy
 * @date 2020/6/13 0013
 */
public class SwitchTest {

    public static void main(String[] args) {
        WeekDaysEnum weekDay = WeekDaysEnum.FRI;
        switch (weekDay) {
            case MON:
            case FRI:
            case SUN:
                System.out.println(6);
                break;
            case TUS:
                System.out.println(7);
                break;
            case THU:
            case SAT:
                System.out.println(8);
                break;
            case WEN:
                System.out.println(9);
                break;
        }

//        switch (weekDay) {
//            case MON, FRI, SUN -> System.out.println(6);
//            case TUS -> System.out.println(7);
//            case THU, SAT -> System.out.println(8);
//            case WEN -> System.out.println(9);
//        }
    }

}
