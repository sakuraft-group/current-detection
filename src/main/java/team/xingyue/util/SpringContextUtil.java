package team.xingyue.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName SpringContextUtil.java
 * @createTime 2021年03月20日 11:40:00
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext context; //应用上下文环境

    @SuppressWarnings("static-access")
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.context = applicationContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }

    /**
     * 根据bean name 获取对象
     *
     * @param name
     * @return
     */
    public static <T> T getBean(String name) {
        return (T) context.getBean(name);
    }

    /**
     * 根据Class获取对象
     * @param clazz
     * @param <T>
     * @return
     * @throws BeansException
     */
    public static <T> T getBean(Class<T> clazz) throws BeansException {
        return context.getBean(clazz);
    }
}