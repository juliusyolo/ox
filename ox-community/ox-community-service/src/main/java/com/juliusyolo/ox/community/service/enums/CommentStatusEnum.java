package com.juliusyolo.ox.community.service.enums;

import com.juliusyolo.ox.common.OxStatus;

/**
 * @author Julius Wang
 * <p>
 * 用户状态枚举
 * <p>
 * @since v0.1
 */
public enum CommentStatusEnum implements OxStatus {
    COMMENT_NOT_EXIST("","评论不存在");

    private final String code;
    private final String message;

    CommentStatusEnum(String code, String message) {
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
