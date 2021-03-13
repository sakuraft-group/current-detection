package team.xingyue.test;

import org.springframework.stereotype.Component;
import team.xingyue.autoconfigure.CurrentProperties;

import javax.annotation.Resource;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName Test.java
 * @createTime 2021年03月12日 18:13:00
 */
@Component
public class TestWWW {

    @Resource
    CurrentProperties currentProperties;

    public  void qu(){
        String url = currentProperties.getUrl();
        System.out.println(url);
    }
}
