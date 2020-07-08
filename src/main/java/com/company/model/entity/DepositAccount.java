package com.company.model.entity;

import com.company.model.service.AccountStatus;

import java.util.Random;

/**
 * Created on 09.05.2020 22:37.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class DepositAccount {

    private int idDepositAccount;
    private String currencyDepositAccount;
    private String typeDepositAccount;
    private String termDepositAccount;
    private String numberDepositAccount;
    private double amountDepositAccount;
    private double percentDepositAccount;
    private int statusDepositAccount;

    public int createdStatusDepositAccount() {
        setStatusDepositAccount(AccountStatus.OPEN_ACCOUNT);
        return statusDepositAccount;
    }

    public String createdDepositAccount() {
        StringBuilder sb = new StringBuilder();
        sb.append("UA");
        sb.append(numberRandom());
        sb.append("D");
        return sb.toString();
    }

    private int numberRandom() {
        // min = 10000 , max = 90000, range = (max - min)
        return new Random().nextInt(
                (AccountStatus.MAX_RANGE - AccountStatus.MIN_RANGE) + 1) + AccountStatus.MIN_RANGE;
    }

    public int getIdDepositAccount() {
        return idDepositAccount;
    }

    public void setIdDepositAccount(int idDepositAccount) {
        this.idDepositAccount = idDepositAccount;
    }

    public String getCurrencyDepositAccount() {
        return currencyDepositAccount;
    }

    public void setCurrencyDepositAccount(String currencyDepositAccount) {
        this.currencyDepositAccount = currencyDepositAccount;
    }

    public String getTypeDepositAccount() {
        return typeDepositAccount;
    }

    public void setTypeDepositAccount(String typeDepositAccount) {
        this.typeDepositAccount = typeDepositAccount;
    }

    public String getTermDepositAccount() {
        return termDepositAccount;
    }

    public void setTermDepositAccount(String termDepositAccount) {
        this.termDepositAccount = termDepositAccount;
    }

    public String getNumberDepositAccount() {
        return numberDepositAccount;
    }

    public void setNumberDepositAccount(String numberDepositAccount) {
        this.numberDepositAccount = numberDepositAccount;
    }

    public double getAmountDepositAccount() {
        return amountDepositAccount;
    }

    public void setAmountDepositAccount(double amountDepositAccount) {
        this.amountDepositAccount = amountDepositAccount;
    }

    public double getPercentDepositAccount() {
        return percentDepositAccount;
    }

    public void setPercentDepositAccount(double percentDepositAccount) {
        this.percentDepositAccount = percentDepositAccount;
    }

    public int getStatusDepositAccount() {
        return statusDepositAccount;
    }

    public void setStatusDepositAccount(int statusDepositAccount) {
        this.statusDepositAccount = statusDepositAccount;
    }

    @Override
    public String toString() {
        return "DepositAccount{" +
                "idDepositAccount=" + idDepositAccount +
                ", currencyDepositAccount='" + currencyDepositAccount + '\'' +
                ", typeDepositAccount='" + typeDepositAccount + '\'' +
                ", termDepositAccount=" + termDepositAccount +
                ", numberDepositAccount='" + numberDepositAccount + '\'' +
                ", amountDepositAccount=" + amountDepositAccount +
                ", percentDepositAccount=" + percentDepositAccount +
                ", statusDepositAccount=" + statusDepositAccount +
                '}';
    }
}
