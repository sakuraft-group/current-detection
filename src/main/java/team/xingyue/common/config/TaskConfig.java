package team.xingyue.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import team.xingyue.autoconfigure.CurrentProperties;
import team.xingyue.common.scheduled.RunnableTask;
import team.xingyue.util.DateUtils;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName TaskConfig.java
 * @createTime 2021年03月14日 03:20:00
 */
@Configuration
public class TaskConfig {

    @Resource
    CurrentProperties currentProperties;

    @Resource
    RunnableTask runnableTask;


    ScheduledFuture<?> schedules;

    @Bean
    public boolean w(){
        String url = currentProperties.getUrl();
        //开启定时任务
        if(url!=null && !"".equals(url)){


//            Calendar cal = Calendar.getInstance();
//
//            Date date=new Date();
//            cal.setTime(date);
//            //减去1分钟
//            cal.add(Calendar.MINUTE,-1);
//            //24小时制
//            int hour=cal.get(Calendar.HOUR_OF_DAY);
//            //分
//            int minute=cal.get(Calendar.MINUTE);
//            Integer day= DateUtils.getWeekDay(date);//获取今天周几
//            String cron="0 "+minute+" "+hour+" * * "+day+"";
//
//            System.out.println(cron);

            CronTrigger cronTrigger = new CronTrigger(currentProperties.getExpression());
            ScheduledFuture<?> schedule = threadPoolTaskScheduler().schedule(runnableTask, cronTrigger);

            schedules=schedule;
        }
        return true;
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        ThreadPoolTaskScheduler executor = new ThreadPoolTaskScheduler();
        return new ThreadPoolTaskScheduler();
    }
}
