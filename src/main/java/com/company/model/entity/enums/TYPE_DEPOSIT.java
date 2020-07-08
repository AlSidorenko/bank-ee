package com.company.model.entity.enums;

/**
 * Created on 18.06.2020 13:36.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public enum TYPE_DEPOSIT {

    CLASSIC("CLASSIC"),
    SAVINGS("SAVINGS"),
    UNIVERSAL("UNIVERSAL");

    private String type;

    TYPE_DEPOSIT(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
