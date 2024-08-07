package com.max.quizspring.controller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderRequest {
    private Long userId;
    private Long productId;
    private String userAddress;
    private String payMethod;
}
