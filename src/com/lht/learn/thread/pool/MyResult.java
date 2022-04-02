package com.lht.learn.thread.pool;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.pool
 * @date 2022/3/26 22:22
 */
public class MyResult {

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MyResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
