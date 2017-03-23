package com.junbaor.motan.service;

import com.junbaor.motan.model.Users;

import java.util.List;

public interface UsersService {

    void sayHello();

    List<Users> getAll();

    Users getByOne(String id);
}
