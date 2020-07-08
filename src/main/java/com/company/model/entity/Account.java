package com.company.model.entity;

import com.company.model.service.AccountStatus;

import java.util.Random;

/**
 * Created on 21.04.2020 13:24.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Account {

    private int idAccount;
    private String codeAccount;
    private String emailAccount;
    private String loginAccount;

    public String getCodeAccount() {
        StringBuilder sb = new StringBuilder();
        sb.append("user_");
        sb.append(numberRandom());
        return sb.toString();
    }

    private int numberRandom() {
        // min = 100 , max = 1000, range = (max - min)
        return new Random().nextInt((AccountStatus.MAX_RANGE_ACCOUNT - AccountStatus.MIN_RANGE_ACCOUNT) + 1)
                + AccountStatus.MIN_RANGE_ACCOUNT;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idAccount=" + idAccount +
                ", codeAccount='" + codeAccount + '\'' +
                ", emailAccount='" + emailAccount + '\'' +
                ", loginAccount='" + loginAccount + '\'' +
                '}';
    }
}
