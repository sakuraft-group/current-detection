package team.xingyue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import team.xingyue.pojo.DetectionBean;
import team.xingyue.pojo.DetectionListBean;
import team.xingyue.util.StorageUtils;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName ApiController.java
 * @createTime 2021年03月14日 03:56:00
 */
@Controller
@RequestMapping("/current")
@ResponseBody
public class ApiController {

    @Resource
    StorageUtils storageUtils;


    @RequestMapping(value = "/update",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    public String update(DetectionBean detectionBean){

       storageUtils.setDs(detectionBean);
        return "ok";
    }

    @RequestMapping(value = "/query",method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    public Object query(){
        HashMap<String, DetectionListBean> hashMapHashMap = StorageUtils.getHashMapHashMap();
        return hashMapHashMap;
    }


}
