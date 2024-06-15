package com.juliusyolo.ox.community.repository.db;

import com.juliusyolo.ox.community.repository.db.model.Comment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Julius Wang
 * <p>
 * 评论数据访问层
 * <p>
 * @since v0.1
 */
public interface CommentRepository extends ReactiveCrudRepository<Comment,Long> {
}
