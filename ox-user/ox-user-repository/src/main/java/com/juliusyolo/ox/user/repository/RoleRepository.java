package com.juliusyolo.ox.user.repository;

import com.juliusyolo.ox.user.repository.model.Role;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Julius Wang
 * <p>
 * 角色数据访问层
 * <p>
 * @since v0.1
 */
public interface RoleRepository extends ReactiveCrudRepository<Role,Long> {
}
