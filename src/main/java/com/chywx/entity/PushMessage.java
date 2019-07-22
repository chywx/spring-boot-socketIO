package com.chywx.entity;

import lombok.Data;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/7/16 0016
 */
@Data
public class PushMessage {
    private Integer loginUserNum;

    private String content;
}
