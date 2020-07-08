package com.company.model.service;

/**
 * Created on 09.05.2020 21:50.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface AccountOperationMessages {

    String REGISTRATION_NEW_ACCOUNT = "Registration new account.";

    // Current Account
    String OPEN_CURRENT_ACCOUNT = "Open current account.";
    String CURRENT_ACCOUNT_REPLENISHMENT = "Current account replenishment.";
    String CURRENT_ACCOUNT_WRITE_OFF = "Current account write-off.";
    String CURRENT_ACCOUNT_CLOSED = "Current account is closed.";

    // Deposit Account
    String DEPOSIT_ACCOUNT_OPEN = "Open deposit account.";
    String DEPOSIT_ACCOUNT_CLOSED = "Deposit account is closed.";

    // Credit Account
    String OPEN_CREDIT_ACCOUNT = "Open credit account.";
}
