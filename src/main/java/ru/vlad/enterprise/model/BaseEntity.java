package ru.vlad.enterprise.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class BaseEntity {
    private String id;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }
}
