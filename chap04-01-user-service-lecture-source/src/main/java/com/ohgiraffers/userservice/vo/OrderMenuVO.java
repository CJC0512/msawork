package com.ohgiraffers.userservice.vo;

import lombok.Data;

/* 설명. POST로 받아오는 JSON의 변수명과 동일해야 한다. */
@Data
public class OrderMenuVO {
    private int orderCode;
    private int menuCode;
    private int orderAmount;
}
