package com.junbaor.motan;

import com.junbaor.motan.model.Users;
import com.junbaor.motan.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by junbaor on 2017/3/21.
 */
public class Run {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        UsersService usersService = applicationContext.getBean(UsersService.class);
        List<Users> all = usersService.getAll();

        System.out.println(all);
        System.out.println();
    }
}
