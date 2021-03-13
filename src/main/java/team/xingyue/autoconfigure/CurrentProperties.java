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
     *
     */
    private String url;

    private String expression;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
