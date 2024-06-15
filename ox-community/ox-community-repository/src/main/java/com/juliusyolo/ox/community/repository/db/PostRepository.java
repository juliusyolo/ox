package com.juliusyolo.ox.community.repository.db;

import com.juliusyolo.ox.community.repository.db.model.Post;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @author Julius Wang
 * <p>
 * 帖子数据访问层
 * <p>
 * @since v0.1
 */
public interface PostRepository extends ReactiveCrudRepository<Post,Long> {

    @Query("SELECT * FROM post WHERE post_id = :postId")
    Flux<Post> findByPostId(String postId);

}
