package annotation.controller;

import annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


//注入serve
    @Autowired
    private UserService userService;


    public void add() {
        userService.add();
    }
}
