package com.chywx.testjdk14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WeekDaysEnum {

    MON(1, "周一"),
    TUS(2, "周二"),
    WEN(3, "周三"),
    THU(4, "周四"),
    FRI(5, "周五"),
    SAT(6, "周六"),
    SUN(7, "周日"),
    ;

    private int typeId;
    private String typeName;

    WeekDaysEnum(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public static List toList() {
        List list = new ArrayList();
        Map item = new HashMap();
        WeekDaysEnum[] values = values();
        for (int i = 0; i < values.length; ++i) {
            //item = new HashMap();
            WeekDaysEnum value = values[i];
            item.put("typeId", Integer.valueOf(value.getTypeId()));
            item.put("typeName", value.getTypeName());
            list.add(item);
        }
        return list;
    }

    public static String getTypeNameById(int typeId) {
        String value = "未知" + typeId;
        WeekDaysEnum[] values = values();

        for (int i = 0; i < values.length; ++i) {
            WeekDaysEnum type = values[i];
            if (type.getTypeId() == typeId) {
                value = type.getTypeName();
                break;
            }
        }

        return value;

    }

}
