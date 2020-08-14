package my.springboot.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController 相当于controller加responsebody 返回json的字符串  EnableAutoConfiguration启动自动配置
@RestController
@RequestMapping("hello")
public class Hello2Controller {


    //浏览器访问
    @GetMapping("show2")
    public String test() {
        return "hello springboot2";
    }


}
