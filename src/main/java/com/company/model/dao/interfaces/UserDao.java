package com.company.model.dao.interfaces;

import com.company.model.entity.User;

import java.util.List;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface UserDao extends GenericDao<User> {

    boolean validateUserByLoginAndPassword(String login, String password);
    User getUserByLogin(String login);

}
