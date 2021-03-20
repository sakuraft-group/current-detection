package team.xingyue.pojo;

import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName DetectionListBean.java
 * @createTime 2021年03月20日 12:31:00
 */
public class DetectionListBean extends HashMap<String,List<DetectionBean>> {



    public DetectionListBean ds(String key,DetectionBean value) {

        List<DetectionBean> detectionBeans = this.get(key);
        if(detectionBeans==null){
            detectionBeans=new ArrayList<DetectionBean>();
        }
        detectionBeans.add(value);
        int size = detectionBeans.size();
        if(size>10){
            detectionBeans.remove(0);
        }
        super.put(key,detectionBeans);
        return this;
    }


}
