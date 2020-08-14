package my.springboot.my.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 默认读取application.properties   springboot只需要这一个配置文件即可
 * prefix 通过前缀去区分读取不同的配置
 */
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String driver;
    private String url;
    private String user;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
