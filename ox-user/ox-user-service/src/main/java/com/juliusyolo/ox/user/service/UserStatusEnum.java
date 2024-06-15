package com.juliusyolo.ox.user.service;

import com.juliusyolo.ox.common.OxStatus;

/**
 * @author Julius Wang
 * <p>
 * 用户状态枚举
 * <p>
 * @since v0.1
 */
public enum UserStatusEnum implements OxStatus {
    USER_NOT_EXIST("","用户不存在"),
    USERNAME_ALREADY_REGISTERED("","用户名已被注册"),
    EMAIL_ALREADY_REGISTERED("","邮箱已被注册"),
    LOGIN_STATUS_RECORD_ERROR("","登录状态记录失败");

    private final String code;
    private final String message;

    UserStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
