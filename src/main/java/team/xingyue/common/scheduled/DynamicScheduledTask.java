package team.xingyue.common.scheduled;


import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import team.xingyue.autoconfigure.CurrentProperties;

import javax.annotation.Resource;
import java.util.Date;
/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName DynamicScheduledTask.java
 * @createTime 2021年03月12日 19:26:00
 *Created by pudding on 2017-11-15.(动态定时器  用于打卡前10分钟推送消息)（!闹钟）
 */
@Component
public class DynamicScheduledTask implements SchedulingConfigurer {

    @Resource
    CurrentProperties currentProperties;

    @Resource
    RunnableTask runnableTask;

    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(runnableTask,new Trigger() {

            public Date nextExecutionTime(TriggerContext triggerContext) {
                //设置下次定时器

                // 定时任务触发，可修改定时任务的执行周期
                CronTrigger trigger = new CronTrigger(currentProperties.getExpression());

                Date nextExecDate = trigger.nextExecutionTime(triggerContext);

                return nextExecDate;
            }
        });
    }

}
