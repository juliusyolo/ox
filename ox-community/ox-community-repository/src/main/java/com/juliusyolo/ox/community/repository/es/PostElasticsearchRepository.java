package com.juliusyolo.ox.community.repository.es;

import com.juliusyolo.ox.community.repository.es.model.AggregatedPost;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 *
 * <p>
 * @since v0.1
 */
public interface PostElasticsearchRepository extends ReactiveCrudRepository<AggregatedPost, String>, ReactiveSortingRepository<AggregatedPost, String> {

    Mono<AggregatedPost> findByPostId(String postId);

}
