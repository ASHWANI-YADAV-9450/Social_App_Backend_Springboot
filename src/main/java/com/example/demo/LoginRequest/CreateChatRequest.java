package com.example.demo.LoginRequest;

import com.example.demo.models.User;

import lombok.Data;

@Data
public class CreateChatRequest {
	
	private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}