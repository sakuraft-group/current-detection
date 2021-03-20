package team.xingyue.pojo;

/**
 * @author HaoNan
 * @version 1.0.0
 * @ClassName detectionBean.java
 * @createTime 2021年03月20日 10:54:00
 */
public class DetectionBean {

    private String grouping;

    private String uuid;

    private Long time;

    private Boolean detection;

    private String queryParameter;

    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Boolean getDetection() {
        return detection;
    }

    public void setDetection(Boolean detection) {
        this.detection = detection;
    }

    public String getQueryParameter() {
        return queryParameter;
    }

    public void setQueryParameter(String queryParameter) {
        this.queryParameter = queryParameter;
    }
}
