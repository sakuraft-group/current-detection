package team.xingyue.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName CurrentProperties.java
 * @createTime 2021年03月12日 18:04:00
 */
@ConfigurationProperties(
        prefix = "current"
)
public class CurrentProperties {

    /**
     * 请求的url
     */
    private String url;

    /**
     * 监测间隔表达式
     */
    private String expression;

    /**
     * 是否开启反向监测
     */
    private Boolean reverse;

    /**
     * 分组
     */
    private String grouping;

    /**
     * 是否携带本机id
     */
    private Boolean ip;

    /**
     * 是否携带服务器配置
     */
    private Boolean configuration;

    /**
     * 携带message备注消息
     */
    private String message;

    /**
     * 数据库监测
     */
    private String databaseDetection;

    /**
     * redis监测
     */
    private String redisDetection;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Boolean getReverse() {
        return reverse;
    }

    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public Boolean getIp() {
        return ip;
    }

    public void setIp(Boolean ip) {
        this.ip = ip;
    }

    public Boolean getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Boolean configuration) {
        this.configuration = configuration;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDatabaseDetection() {
        return databaseDetection;
    }

    public void setDatabaseDetection(String databaseDetection) {
        this.databaseDetection = databaseDetection;
    }

    public String getRedisDetection() {
        return redisDetection;
    }

    public void setRedisDetection(String redisDetection) {
        this.redisDetection = redisDetection;
    }
}
