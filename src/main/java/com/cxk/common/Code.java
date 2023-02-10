package com.cxk.common;

/**
 * 状态码 最后一位：1表示成功，0表示失败
 */
public class Code {
    public static final Integer SAVE_OK = 20011;
    public static final Integer DELETE_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer GET_OK = 20041;

    public static final Integer SAVE_ERR = 20010;
    public static final Integer DELETE_ERR = 20020;
    public static final Integer UPDATE_ERR = 20030;
    public static final Integer GET_ERR = 20040;

    //登录成功
    public static final Integer LOGIN_OK = 20051;
    //登录失败
    public static final Integer LOGIN_ERR = 20050;

    //注册成功
    public static final Integer REGISTER_OK = 20061;
    //注册失败
    public static final Integer REGISTER_ERR = 20060;







}
