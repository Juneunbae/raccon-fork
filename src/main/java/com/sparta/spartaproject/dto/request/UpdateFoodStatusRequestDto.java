package com.sparta.spartaproject.dto.request;

import com.sparta.spartaproject.domain.food.Status;

public record UpdateFoodStatusRequestDto(
    Status status
) {
}