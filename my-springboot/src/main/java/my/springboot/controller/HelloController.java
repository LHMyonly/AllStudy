package my.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

//RestController 相当于controller加responsebody 返回json的字符串
@RestController
@RequestMapping("hello")
public class HelloController {


    @Autowired
    private DataSource dataSource;

    //浏览器访问
    @GetMapping("show")
    public String test(){
        return "hello springboot";
    }
}
