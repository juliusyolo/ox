package com.juliusyolo.ox.user.service.converter;

import com.juliusyolo.ox.user.repository.model.User;
import com.juliusyolo.ox.user.service.model.UserModel;
import org.mapstruct.Mapper;
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

    UserModel convert(User user);

    User convert(UserModel userModel);

}
