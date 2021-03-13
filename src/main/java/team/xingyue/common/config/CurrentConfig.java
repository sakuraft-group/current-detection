package team.xingyue.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import team.xingyue.autoconfigure.CurrentProperties;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName CurrentConfig.java
 * @createTime 2021年03月12日 18:21:00
 */
@Configuration
@EnableConfigurationProperties(CurrentProperties.class)
public class CurrentConfig {
}
