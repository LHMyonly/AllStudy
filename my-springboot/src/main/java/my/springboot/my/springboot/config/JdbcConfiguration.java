package my.springboot.my.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * SpringBootConfiguration  Configuration 注解java类 为配置类 替代xml
 * Bean 将方法的返回值注入给spring容器
 * PropertySource 读取资源文件
 * EnableConfigurationProperties 启用JdbcProperties这个配置类
 */
@Configuration
//@PropertySource("classpath:jdbc.properties")
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

   /* @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;*/

   //1、注解配置
   //@Autowired
   //private JdbcProperties jdbcProperties;

    //2、构造器注入
   /* public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties=jdbcProperties;
    }*/
  /*  @Bean
    public DataSource dataSource(){
        DruidDataSource dds=new DruidDataSource();
        //这边写this代表是全局的 而不是这个方法的入参
        dds.setDriverClassName(this.jdbcProperties.getDriver());
        dds.setUrl(this.jdbcProperties.getUrl());
        dds.setUsername(this.jdbcProperties.getUser());
        dds.setPassword(this.jdbcProperties.getPassword());
        return dds;
    }*/

  //3、方法的入参(形参注入)
    @Bean
    public DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource dds=new DruidDataSource();
        //这边写this代表是全局的 而不是这个方法的入参
        dds.setDriverClassName(jdbcProperties.getDriver());
        dds.setUrl(jdbcProperties.getUrl());
        dds.setUsername(jdbcProperties.getUser());
        dds.setPassword(jdbcProperties.getPassword());
        return dds;
    }
  //4、直接ConfigurationProperties注解到方法上

  /*@Bean
  @ConfigurationProperties(prefix="jdbc")
    public DataSource dataSource(){
        DruidDataSource dds=new DruidDataSource();
        return dds;
    }*/
}
