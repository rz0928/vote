package com.example.enums;
//枚举类，返回的code以及信息
public enum AppHttpCodeEnum {
    SUCCESS(200,"操作成功"),
    NEED_LOGIN(401,"需登录后操作"),
    SYSTEM_ERROR(500,"出现错误"),
    PHONENUMBER_EXIST(502,"手机号已存在"),
    LOGIN_ERROR(505,"账号或密码错误");
    final int code;
    final String message;
   AppHttpCodeEnum(int code,String message){
       this.code=code;
       this.message=message;
   }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return message;
    }

    @Override
    public String toString() {
        return "AppHttpCodeEnum{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
