package com.restaurant.model;

public enum Role {

    ROLE_CLIENT("Клиент"),
    ROLE_MANAGER("Менеджер"),
    ROLE_ADMIN("Администратор");

    private final String displayValue;

    private Role(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue(){
        return displayValue;
    }

}
