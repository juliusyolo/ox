package com.juliusyolo.ox.community.service;

import com.juliusyolo.ox.community.service.model.AggregatedCommentModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 * CommentService
 * <p>
 * @since v0.1
 */
public interface CommentService {

    Flux<AggregatedCommentModel> getAggregatedCommentsByPostId(String postId);

    Mono<AggregatedCommentModel> createAggregatedComment(AggregatedCommentModel aggregatedComment);
}
