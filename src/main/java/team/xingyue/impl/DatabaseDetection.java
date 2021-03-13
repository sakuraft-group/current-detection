package team.xingyue.impl;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName Database.java
 * @createTime 2021年03月14日 02:41:00
 */
public interface DatabaseDetection {

    /**
     * 判断是否成功
     * @return
     */
    boolean detection();

    /**
     * 获取验证数据库返回的参数
     * @return
     */
    String queryParameter();
}
