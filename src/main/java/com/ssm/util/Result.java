package com.ssm.util;

public class Result<T> {
    private static final int SUCCESS_CODE = 200;

    private String message;

    private T data;

    private int code;

    public Result(T data, String message){
        this.data = data;
        this.message = message;
        code = SUCCESS_CODE;
    }

    public Result(T data, String message, int code){
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
