package com.juliusyolo.ox.community.facade.impl;

import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.community.facade.CommentFacade;
import com.juliusyolo.ox.community.facade.converter.CommentConverter;
import com.juliusyolo.ox.community.facade.model.CommentSaveRequest;
import com.juliusyolo.ox.community.facade.model.CommentVO;
import com.juliusyolo.ox.community.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author Julius Wang
 * <p>
 * CommentFacadeImpl
 * <p>
 * @since v0.1
 */
@RestController
@AllArgsConstructor
public class CommentFacadeImpl implements CommentFacade {

    private final CommentService commentService;

    @Override
    @GetMapping("/api/v1/comments/{postId}")
    public Mono<OxResult<List<CommentVO>>> getCommentsByPostId(@PathVariable("postId") String postId) {
        return commentService.getAggregatedCommentsByPostId(postId)
                .map(CommentConverter.INSTANCE::convert)
                .collectList()
                .map(OxResult::ok);
    }

    @Override
    @PostMapping("/api/v1/comment/save")
    public Mono<OxResult<CommentVO>> saveComment(@RequestBody CommentSaveRequest request) {
        return commentService.createAggregatedComment(CommentConverter.INSTANCE.convert(request))
                .map(CommentConverter.INSTANCE::convert)
                .map(OxResult::ok);
    }
}
