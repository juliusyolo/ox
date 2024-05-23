package com.juliusyolo.ox.user.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/**
 * @author Julius Wang
 * <p>
 * 角色实体
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    private Long id;

    private String roleId;

    private String roleCode;

    private String roleDesc;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
