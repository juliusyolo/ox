package com.juliusyolo.ox.user.service.converter;

import com.juliusyolo.ox.user.repository.model.User;
import com.juliusyolo.ox.user.service.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * UserConverter description
 * </p>
 *
 * @author gesi.julius
 * @version : UserConverter v0.1
 */
@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    @Mapping(target = "nickname", source = "nickname")
    @Mapping(target = "username", source = "username")
    UserModel convert(User user);

    @Mapping(target = "nickname", source = "nickname")
    @Mapping(target = "username", source = "username")
    User convert(UserModel userModel);
}
