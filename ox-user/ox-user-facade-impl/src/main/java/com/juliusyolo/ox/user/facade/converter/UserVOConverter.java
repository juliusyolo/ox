package com.juliusyolo.ox.user.facade.converter;

import com.juliusyolo.ox.user.facade.model.UserVO;
import com.juliusyolo.ox.user.repository.model.User;
import com.juliusyolo.ox.user.service.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * converter description
 * </p>
 *
 * @author gesi.julius
 * @version : converter v0.1
 */
@Mapper
public interface UserVOConverter {

    UserVOConverter INSTANCE = Mappers.getMapper(UserVOConverter.class);

    @Mapping(target = "nickName", source = "nickName")
    @Mapping(target = "userName", source = "userName")
    UserVO convert(UserModel user);
}
