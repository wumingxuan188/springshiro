package com.wu.controller;

import com.wu.pojo.Users;
import com.wu.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "success";
    }

    @RequiresPermissions("toList")
    @RequestMapping("toList")
    public String toList() {
        return "list";
    }

   // @RequiresPermissions("")
    @RequestMapping("findAll")
    @ResponseBody
    public List<Users> findAll(HttpServletRequest request) {
        Users user = (Users) request.getSession().getAttribute("user");
        System.err.println(user);
        return userService.findAll();
    }


    /**
     * 登陆方法
     *
     * @param users
     * @param request
     * @return
     */
    @RequestMapping("login")
    public String login(Users users, HttpServletRequest request) {
        if (users == null) {
            return "error";
        } else {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(users.getNames(), users.getPass());
            try {
                subject.login(token);
            } catch (Exception e) {
                e.printStackTrace();
                return "error";
            }
            Users u = (Users) subject.getPrincipal();
            request.getSession().setAttribute("user", users);
            return "users";
        }


    }
}
