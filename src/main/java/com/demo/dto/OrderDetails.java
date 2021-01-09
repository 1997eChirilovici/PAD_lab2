package com.demo.dto;

import com.demo.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetails implements Serializable {

    private Order order;

    private OrderStatus status;

    private String message;

}
