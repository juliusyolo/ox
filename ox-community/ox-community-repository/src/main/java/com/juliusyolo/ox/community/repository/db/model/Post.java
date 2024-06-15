package com.juliusyolo.ox.community.repository.db.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * @author Julius Wang
 * <p>
 * 帖子实体
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Post {
    @Id
    private Long id;

    private Long postId;

    private Long userId;

    private String title;

    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
