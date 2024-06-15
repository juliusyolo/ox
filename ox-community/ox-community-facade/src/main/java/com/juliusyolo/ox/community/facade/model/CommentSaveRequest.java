package com.juliusyolo.ox.community.facade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Julius Wang
 * <p>
 * CommentSaveRequest
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentSaveRequest {
    private String commentId;

    private String userId;

    private String postId;

    private String content;
}
