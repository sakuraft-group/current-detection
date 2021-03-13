package team.xingyue.common.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import team.xingyue.autoconfigure.CurrentProperties;
import team.xingyue.util.HttpUtil;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName Runnable.java
 * @createTime 2021年03月12日 19:36:00
 */
@Component
public class RunnableTask implements Runnable {

    @Autowired
    CurrentProperties currentProperties;

    @Override
    public void run() {
        try {
            System.out.println("定时任务已开启");
            HttpUtil.get(currentProperties.getUrl(),null,0,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
