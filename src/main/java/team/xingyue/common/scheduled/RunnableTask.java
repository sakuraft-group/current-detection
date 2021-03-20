package team.xingyue.common.scheduled;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import team.xingyue.autoconfigure.CurrentProperties;
import team.xingyue.impl.DatabaseDetection;
import team.xingyue.pojo.DetectionBean;
import team.xingyue.util.HttpUtil;
import team.xingyue.util.SpringContextUtil;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

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
            DetectionBean d=new DetectionBean();

            d.setGrouping(currentProperties.getGrouping());
            d.setUuid(currentProperties.getUuid());
            d.setTime(System.currentTimeMillis());
            InetAddress addr = InetAddress.getLocalHost();
            d.setIp(addr.getHostAddress());


            if(currentProperties.isDatabaseDetection()){
                DatabaseDetection bean = SpringContextUtil.getBean(DatabaseDetection.class);
                //数据库信息
                d.setDetection(bean.detection());
                d.setQueryParameter(bean.queryParameter());

            }


            Map<String, Object> stringObjectMap = object2Map(d);

            HttpUtil.post(currentProperties.getUrl(),
                    stringObjectMap,0,0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<String,Object> object2Map(Object object){
        Map<String,Object> result=new HashMap<String,Object>(6);
        //获得类的的属性名 数组
        Field[]fields=object.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                String name = new String(field.getName());
                result.put(name, field.get(object));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
