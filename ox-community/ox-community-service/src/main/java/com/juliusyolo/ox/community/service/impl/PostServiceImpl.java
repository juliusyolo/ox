package com.juliusyolo.ox.community.service.impl;

import com.juliusyolo.ox.community.repository.db.PostRepository;
import com.juliusyolo.ox.community.repository.es.PostElasticsearchRepository;
import com.juliusyolo.ox.community.service.PostService;
import com.juliusyolo.ox.community.service.model.AggregatedPostModel;
import com.juliusyolo.ox.community.service.model.PostModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 *
 * <p>
 * @since v0.1
 */
@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    private final PostElasticsearchRepository postElasticsearchRepository;

    @Override
    public Flux<AggregatedPostModel> getAggregatedPosts() {
        return null;
    }

    @Override
    public Mono<PostModel> getPostByPostId(String postId) {
        return null;
    }

    @Override
    public Mono<AggregatedPostModel> getAggregatedPostsByPostId(String postId) {
        return null;
    }

}
