package com.juliusyolo.ox.community.facade;

import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.community.facade.model.CommentSaveRequest;
import com.juliusyolo.ox.community.facade.model.CommentVO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author Julius Wang
 * <p>
 * 评论接口
 * <p>
 * @since v0.1
 */
@RestController
public interface CommentFacade {
    @GetMapping("/api/v1/comments/{postId}")
    Mono<OxResult<List<CommentVO>>> getCommentsByPostId(@PathVariable("postId") String postId);

    @PostMapping("/api/v1/comment/save")
    Mono<OxResult<CommentVO>> saveComment(@RequestBody CommentSaveRequest request);
}
