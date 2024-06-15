package com.juliusyolo.ox.community.service;

import com.juliusyolo.ox.community.service.model.AggregatedPostModel;
import com.juliusyolo.ox.community.service.model.PostModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 * 帖子服务
 * <p>
 * @since v0.1
 */
public interface PostService {
    Flux<AggregatedPostModel> getAggregatedPosts();

    Mono<PostModel> getPostByPostId(String postId);

    Mono<AggregatedPostModel> getAggregatedPostsByPostId(String postId);

}
