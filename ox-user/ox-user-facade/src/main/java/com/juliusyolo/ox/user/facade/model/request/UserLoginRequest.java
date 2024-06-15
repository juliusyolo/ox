package com.juliusyolo.ox.user.facade.model.request;

import com.juliusyolo.ox.common.utils.OxUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Julius Wang
 * <p>
 * 用户登录请求实体
 * <p>
 * @since v0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserLoginRequest {
    private String account;
    private String password;

    public String getPassword() {
        return OxUtils.sha256(this.password);
    }
}
