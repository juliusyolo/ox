package com.juliusyolo.ox.community.service.impl;

import com.juliusyolo.ox.community.repository.db.CommentRepository;
import com.juliusyolo.ox.community.repository.es.CommentElasticsearchRepository;
import com.juliusyolo.ox.community.service.CommentService;
import com.juliusyolo.ox.community.service.PostService;
import com.juliusyolo.ox.community.service.converter.CommentConverter;
import com.juliusyolo.ox.community.service.model.AggregatedCommentModel;
import com.juliusyolo.ox.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 * CommentServiceImpl
 * <p>
 * @since v0.1
 */
@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    private final CommentElasticsearchRepository commentElasticsearchRepository;

    private final UserService userService;

    private final PostService postService;

    @Override
    public Flux<AggregatedCommentModel> getAggregatedCommentsByPostId(String postId) {
        return commentElasticsearchRepository.findByPostId(postId).map(CommentConverter.INSTANCE::convert);
    }

    @Override
    public Mono<AggregatedCommentModel> createAggregatedComment(AggregatedCommentModel aggregatedComment) {
//        return commentRepository.save(CommentConverter.INSTANCE.convert(aggregatedComment))
//                .zipWith(userService.getUserByUserId(aggregatedComment.getUserId()))
//                .zipWith(postService.getPostByPostId(aggregatedComment.getPostId()))
//                .
//                .map(t -> {
//                    t.getT1().getT2()
//                    aggregatedComment.setAvatarUrl(t.getT1().getT2().getAvatarUrl());
//                    return aggregatedComment;
//                })
//                .map(CommentConverter.INSTANCE::convertAggregatedComment)
//                .flatMap(commentElasticsearchRepository::save)
//                .map(CommentConverter.INSTANCE::convert);
        return null;
    }
}
