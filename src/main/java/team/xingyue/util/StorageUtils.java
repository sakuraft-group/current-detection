package team.xingyue.util;

import org.springframework.stereotype.Component;
import team.xingyue.pojo.DetectionBean;
import team.xingyue.pojo.DetectionListBean;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName StorageUtils.java
 * @createTime 2021年03月20日 12:09:00
 */
@Component
public class StorageUtils {

    private static HashMap<String,DetectionListBean> hashMapHashMap=new HashMap<String,DetectionListBean>();



    public void setDs(DetectionBean ds) {

        String grouping = ds.getGrouping();
        String uuid = ds.getUuid();

        DetectionListBean detectionListBean = hashMapHashMap.get(grouping);

        if (detectionListBean == null) {
            detectionListBean = new DetectionListBean();
            detectionListBean.ds(uuid,ds);
            hashMapHashMap.put(grouping, detectionListBean);
        }else{
            List<DetectionBean> detectionBeans = detectionListBean.get(uuid);
            if(detectionBeans==null){
                detectionBeans=new ArrayList<DetectionBean>();
            }
            detectionBeans.add(ds);
            detectionListBean.put(uuid,detectionBeans);
        }


    }
        public static HashMap<String, DetectionListBean> getHashMapHashMap() {
            return hashMapHashMap;
        }
    }
