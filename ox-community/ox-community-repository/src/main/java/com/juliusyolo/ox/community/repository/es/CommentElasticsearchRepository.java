package com.juliusyolo.ox.community.repository.es;

import com.juliusyolo.ox.community.repository.es.model.AggregatedComment;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Flux;

/**
 * @author Julius Wang
 * <p>
 * CommentElasticsearchRepository
 * <p>
 * @since v0.1
 */
public interface CommentElasticsearchRepository extends ReactiveCrudRepository<AggregatedComment, String>, ReactiveSortingRepository<AggregatedComment, String> {

    Flux<AggregatedComment> findByPostId(String postId);

}
