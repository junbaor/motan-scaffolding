package com.junbaor.motan.service;

import com.junbaor.motan.model.Users;

import java.util.Arrays;
import java.util.List;

public class UsersServiceImpl implements UsersService {
    public void sayHello() {
        System.out.println("say hello");
    }

    public List<Users> getAll() {
        Users users1 = new Users(1, "a", "a123");
        Users users2 = new Users(2, "b", "b123");
        Users users3 = new Users(3, "c", "c123");
        return Arrays.asList(users1, users2, users3);
    }

    public Users getByOne(String id) {
        return new Users(1, "a", "a123");
    }
}
