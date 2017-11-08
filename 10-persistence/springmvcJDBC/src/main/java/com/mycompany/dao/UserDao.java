package com.mycompany.dao;

import com.mycompany.domain.User;

public interface UserDao {
    User getUser(long userId);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long userId);
}
