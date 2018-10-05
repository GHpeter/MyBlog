package com.lfz.model;

import lombok.Getter;

@Getter
public enum ResponseEnum {
    SUCC(0, "operation_ok"),
    FAIL(1, "operation_fail"),
    ALREADY_LOGIN(2, "already_login"),
    USER_EXIST(3, "user_exist"),

    UNKNOWN_ERROR(-1, "unknown_error"),

    NON_LOGIN(-2, "non_login"),
    NON_PERM(-3, "non_perm"),
    NON_AUTH(-4, "non_auth"),

    ILLEGAL_PARAM(-5, "illegal_param"),
    ;
    private int code;
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
