package team.xingyue.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.UUID;

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

    private  String uuid= UUID.randomUUID().toString();

    /**
     * 请求的url
     */
    private String url;

    /**
     * 监测间隔表达式
     */
    private String expression;


    /**
     * 携带message备注消息
     */
    private String message;

    /**
     * 分组
     */
    private String grouping;

    /**
     * 是否开启反向监测
     */
    private boolean reverse=false;

    /**
     * 是否携带本机id
     */
    private boolean ip=true;

    /**
     * 是否携带服务器配置
     */
    private boolean configuration=false;


    /**
     * 数据库监测
     */
    private boolean databaseDetection=false;

    /**
     * redis监测
     */
    private boolean redisDetection=false;



    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public boolean isIp() {
        return ip;
    }

    public void setIp(boolean ip) {
        this.ip = ip;
    }

    public boolean isConfiguration() {
        return configuration;
    }

    public void setConfiguration(boolean configuration) {
        this.configuration = configuration;
    }

    public boolean isDatabaseDetection() {
        return databaseDetection;
    }

    public void setDatabaseDetection(boolean databaseDetection) {
        this.databaseDetection = databaseDetection;
    }

    public boolean isRedisDetection() {
        return redisDetection;
    }

    public void setRedisDetection(boolean redisDetection) {
        this.redisDetection = redisDetection;
    }
}
