package com.company.model.service;

/**
 * Created on 22.05.2020 22:29.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface AccountStatus {

    int OPEN_ACCOUNT = 1;
    int CLOSED_ACCOUNT = 0;

    //Account: min = 100 , max = 1000, range = (max - min)
    int MIN_RANGE_ACCOUNT = 100;
    int MAX_RANGE_ACCOUNT = 1000;

    // CurrentAccount: min = 10000 , max = 90000, range = (max - min)
    int MIN_RANGE = 10000;
    int MAX_RANGE = 90000;


}
