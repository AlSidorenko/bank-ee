package com.company.model.service;

import com.company.model.dao.DaoFactory;
import com.company.model.entity.User;

import static com.company.model.service.RegexContainer.*;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class UserService {

    DaoFactory daoFactory = DaoFactory.getInstance();

    public boolean validateData(User user){
        return false;
    }

    public static boolean validateUserInfoWithRegEx(User user) {
        return user.getUserFirstName().matches(REGEX_NAME_LAT) &&
                user.getUserLastName().matches(REGEX_NAME_LAT) &&
                user.getUserEmail().matches(REGEX_EMAIL) &&
                user.getUserPhone().matches(REGEX_PHONE) &&
                user.getUserLogin().matches(REGEX_LOGIN) &&
                user.getUserPassword().matches(REGEX_PASSWORD);
    }
}
