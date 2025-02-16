package com.sparta.spartaproject.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderStatusResponseDto {
    private UUID orderId;
    private String orderStatus;
}
