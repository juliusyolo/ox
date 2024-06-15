package com.juliusyolo.ox.user.facade.model.request;

import com.juliusyolo.ox.common.utils.OxUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Julius Wang
 * <p>
 * 用户注册请求
 * <p>
 * @since v0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserRegisterRequest {
    private String username;
    private String email;
    private String password;

    public String getPassword() {
        return OxUtils.sha256(this.password);
    }
}
