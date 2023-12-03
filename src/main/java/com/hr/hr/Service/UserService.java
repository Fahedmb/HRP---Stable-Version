package com.hr.hr.Service;

import com.hr.hr.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    void deleteUser(Long userId);

}
