package com.company.model.entity;

import com.company.model.entity.enums.CURRENCY;
import com.company.model.service.AccountStatus;

import java.util.Random;

/**
 * Created on 19.04.2020 17:04.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class CurrentAccount {

    private int idCurrentAccount;
    private String currency;
    private String numberCurrentAccount;
    private double amountCurrentAccount;
    private int statusCurrentAccount;

    public int createdStatusCurrentAccount() {
        setStatusCurrentAccount(AccountStatus.OPEN_ACCOUNT);
        return statusCurrentAccount;
    }

    public String createdCurrentAccount () {
        StringBuilder sb = new StringBuilder();
        sb.append("UA");
        sb.append(numberRandom());
        return sb.toString();
    }

    private int numberRandom() {
        // min = 10000 , max = 90000, range = (max - min)
        return new Random().nextInt(
                (AccountStatus.MAX_RANGE - AccountStatus.MIN_RANGE) + 1) + AccountStatus.MIN_RANGE;
    }

    public int getIdCurrentAccount() {
        return idCurrentAccount;
    }

    public void setIdCurrentAccount(int idCurrentAccount) {
        this.idCurrentAccount = idCurrentAccount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getNumberCurrentAccount() {
        return numberCurrentAccount;
    }

    public void setNumberCurrentAccount(String numberCurrentAccount) {
        this.numberCurrentAccount = numberCurrentAccount;
    }

    public double getAmountCurrentAccount() {
        return amountCurrentAccount;
    }

    public void setAmountCurrentAccount(double amountCurrentAccount) {
        this.amountCurrentAccount = amountCurrentAccount;
    }

    public int getStatusCurrentAccount() {
        return statusCurrentAccount;
    }

    public void setStatusCurrentAccount(int statusCurrentAccount) {
        this.statusCurrentAccount = statusCurrentAccount;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "idCurrentAccount=" + idCurrentAccount +
                ", currency='" + currency + '\'' +
                ", numberCurrentAccount='" + numberCurrentAccount + '\'' +
                ", amountCurrentAccount=" + amountCurrentAccount +
                ", statusCurrentAccount=" + statusCurrentAccount +
                '}';
    }
}
