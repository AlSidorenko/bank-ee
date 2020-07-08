package com.company.model.dao.interfaces;

import com.company.model.entity.CurrentAccount;
import com.company.model.entity.User;

import java.util.List;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface GenericDao<T> extends AutoCloseable {

    void create(T entity);
    T findById(int id);
    List<T> findAll();
    void update(T entity, int id);
    void delete(int id);
    void closeAccount(T entity, int id);
    void close();
}
