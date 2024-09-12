package com.val.mch.opentelemetry.service1.entity;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ServiceEntity")
public class ServiceEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "message", nullable = false)
    private String message;

    public ServiceEntity(String message) {
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
