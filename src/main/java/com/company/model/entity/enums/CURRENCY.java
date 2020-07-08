package com.company.model.entity.enums;

/**
 * Created on 19.04.2020 17:06.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public enum CURRENCY {

    UAH("UAH"), USD("USD"), EUR("EUR");

    private String currency;

    CURRENCY(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
