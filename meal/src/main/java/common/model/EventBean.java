package common.model;

public class EventBean {
    private int code;

    private String info;

    public EventBean(int code) {
        this.code = code;
    }

    public EventBean(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
