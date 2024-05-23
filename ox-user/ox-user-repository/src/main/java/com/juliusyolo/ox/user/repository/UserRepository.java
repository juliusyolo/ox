package com.juliusyolo.ox.user.repository;

import com.juliusyolo.ox.user.repository.model.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

/**
 * <p>
 * UserRepository description
 * </p>
 *
 * @author gesi.julius
 * @version : UserRepository v0.1
 */
@Repository
public interface UserRepository extends ReactiveCrudRepository<User,Long> {

    /**
     *  根据用户名查询用户
     * @param username 用户名
     * @return Mono<User>
     */
    @Query("SELECT * FROM user WHERE user_name = :username")
    Mono<User> findByUsername(String username);

}
