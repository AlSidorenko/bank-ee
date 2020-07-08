package com.company.model.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 10.05.2020 23:08.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class AccountOperation {

    private int idAccountOperation;
    private String dateOperation;
    private String messageOperation;
    private int idAccount;

    public int getIdAccountOperation() {
        return idAccountOperation;
    }

    public void setIdAccountOperation(int idAccountOperation) {
        this.idAccountOperation = idAccountOperation;
    }

    public String getDateOperation() {
        Date dt = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SS");
        return sdf.format(dt);
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getMessageOperation() {
        return messageOperation;
    }

    public void setMessageOperation(String messageOperation) {
        this.messageOperation = messageOperation;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public String toString() {
        return "AccountOperation{" +
                "idAccountOperation=" + idAccountOperation +
                ", dateOperation='" + dateOperation + '\'' +
                ", messageOperation='" + messageOperation + '\'' +
                ", idAccount='" + idAccount + '\'' +
                '}';
    }
}
