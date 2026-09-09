package com.perez.proyectoprueba.health.dto;

public record HealthResponseDto(String status, String error) {
    public  HealthResponseDto(String status) {
        this(status, null );
        //sad
    }
}
