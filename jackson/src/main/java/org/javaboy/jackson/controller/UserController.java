package org.javaboy.jackson.controller;

import org.javaboy.jackson.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController

public class UserController {

    @RequestMapping("/user")
    public List<User> userList(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("javaboy>>>"+i);
            user.setBirthday(new Date());
            list.add(user);
        }
        return list;
    }
}
