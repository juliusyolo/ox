package com.juliusyolo.ox.user.repository;

import com.juliusyolo.ox.user.repository.model.User;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 * 用户数据访问层
 * <p>
 * @since v0.1
 */
public interface UserRepository extends ReactiveCrudRepository<User, Long> {

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return Mono<User>
     */
    @Query("SELECT * FROM user WHERE username = :username")
    Mono<User> findByUsername(String username);

    /**
     * 根据用户名或者email查询用户
     * @param user 用户实体
     * @return Mono<User>
     */
    @Query("SELECT * FROM user WHERE username = :#{#user.username} or email = :#{#user.email} and password = :#{#user.password}")
    Mono<User> findByUsernameOrEmailAndPassword(User user);

    /**
     * 根据用户名或者email查询用户
     * @param user 用户实体
     * @return Mono<User>
     */
    @Query("SELECT * FROM user WHERE username = :#{#user.username} or email = :#{#user.email}")
    Mono<User> findByUsernameOrEmail(User user);


    @Modifying
    @Query("UPDATE user set refresh_token = :#{#user.refreshToken}, access_token = :#{#user.accessToken} WHERE id = :#{#user.id}")
    Mono<Long> updateLoginInfo(User user);


    @Query("SELECT * FROM user WHERE email = :email")
    Mono<User> findByEmail(String email);


    Mono<User> findByUserId(Long userId);
}
