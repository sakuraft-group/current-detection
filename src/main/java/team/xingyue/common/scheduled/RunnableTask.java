package team.xingyue.common.scheduled;

import org.springframework.stereotype.Component;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName Runnable.java
 * @createTime 2021年03月12日 19:36:00
 */
@Component
public class RunnableTask implements Runnable {
    public void run() {
        System.out.println("提醒打卡");
    }
}
