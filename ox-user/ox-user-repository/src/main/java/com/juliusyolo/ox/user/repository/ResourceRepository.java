package com.juliusyolo.ox.user.repository;

import com.juliusyolo.ox.user.repository.model.Resource;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @author Julius Wang
 * <p>
 * 资源数据访问层
 * <p>
 * @since v0.1
 */
@Repository
public interface ResourceRepository extends ReactiveCrudRepository<Resource,Long> {

    @Query("SELECT * FROM role_resource_relation")
    Flux<Resource> findByRoleCodes(List<String> roleCodes);
}
