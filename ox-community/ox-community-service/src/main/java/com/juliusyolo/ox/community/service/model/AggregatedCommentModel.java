package com.juliusyolo.ox.community.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Julius Wang
 * <p>
 * AggregatedCommentModel
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregatedCommentModel {
    private String commentId;

    private String userId;

    private String postId;

    private String content;

    private String avatarUrl;

}
