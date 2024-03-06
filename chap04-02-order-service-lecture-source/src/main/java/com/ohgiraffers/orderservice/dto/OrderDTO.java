package com.ohgiraffers.orderservice.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private int orderCode;
    private int userId;
    private String orderDate;
    private String orderTime;
    private int totalOrderPrice;
}
