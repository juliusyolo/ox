package com.juliusyolo.ox.user.facade.converter;

import com.juliusyolo.ox.user.facade.model.UserLoginVO;
import com.juliusyolo.ox.user.facade.model.UserVO;
import com.juliusyolo.ox.user.facade.model.request.UserLoginRequest;
import com.juliusyolo.ox.user.facade.model.request.UserRegisterRequest;
import com.juliusyolo.ox.user.service.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * UserVOConverter description
 * </p>
 *
 * @author gesi.julius
 * @version : converter v0.1
 */
@Mapper
public interface UserVOConverter {

    UserVOConverter INSTANCE = Mappers.getMapper(UserVOConverter.class);

    UserVO convert(UserModel user);

    @Mapping(target = "email", source = "account")
    @Mapping(target = "username", source = "account")
    UserModel convert(UserLoginRequest request);

    @Mapping(target = "userId", expression =
            """
            java(com.juliusyolo.ox.common.utils.OxUtils.uuid())
            """)
    @Mapping(target = "nickname", source = "username")
    UserModel convert(UserRegisterRequest request);

    UserLoginVO convertUserLoginVO(UserModel user);

}
