package com.juliusyolo.ox.user.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/**
 * @author Julius Wang
 * <p>
 * 资源表
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @Id
    private Long id;

    private String resourceId;

    private String resourceCode;

    private String resourceDesc;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
