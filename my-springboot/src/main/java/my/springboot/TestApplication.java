package my.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 引导类  springboot应用的入口
 * 只需要一个Main方法 一个自动装配 所以不能放在controller里面 EnableAutoConfiguration启动自动配置 根据导入的依赖去相关配置
 * ComponentScan 类似于<context:component-scan base-package=""></context:component-scan>会扫描该类或者其子类所在包的controller
 */

@SpringBootApplication//组合注解 上面注解的作用都包含 可以查看源码
public class TestApplication {
    //直接用main去启动就可以了 内置tomcat
    public static void main(String[] args) {

        SpringApplication.run(TestApplication.class,args);
    }
}
