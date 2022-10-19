package com.example.hw2.exception;

public enum CommonEnum implements BaseErrorInfo{
    SUCCESS("200", "success"),
    BODY_NOT_MATCH("400","Data format Error"),
    NOT_FOUND("404", "Not found!"),
    INTERNAL_SERVER_ERROR("500", "Internal Server Error"),
    SERVER_BUSY("503","Server Busy")
    ;

    private String resultCode;
    private String resultMsg;

    CommonEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return null;
    }

    @Override
    public String getResultMsg() {
        return null;
    }
}
