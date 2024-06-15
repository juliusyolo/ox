package com.juliusyolo.ox.user.facade.converter;

import com.juliusyolo.ox.user.facade.model.UserLoginVO;
import com.juliusyolo.ox.user.facade.model.UserVO;
import com.juliusyolo.ox.user.facade.model.request.UserLoginRequest;
import com.juliusyolo.ox.user.facade.model.request.UserRegisterRequest;
import com.juliusyolo.ox.user.service.model.UserModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T20:49:38+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class UserVOConverterImpl implements UserVOConverter {

    @Override
    public UserVO convert(UserModel user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setUsername( user.getUsername() );
        userVO.setNickname( user.getNickname() );
        userVO.setPassword( user.getPassword() );
        userVO.setEmail( user.getEmail() );

        return userVO;
    }

    @Override
    public UserModel convert(UserLoginRequest request) {
        if ( request == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setEmail( request.getAccount() );
        userModel.setUsername( request.getAccount() );
        userModel.setPassword( request.getPassword() );

        return userModel;
    }

    @Override
    public UserModel convert(UserRegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setNickname( request.getUsername() );
        userModel.setUsername( request.getUsername() );
        userModel.setPassword( request.getPassword() );
        userModel.setEmail( request.getEmail() );

        userModel.setUserId( com.juliusyolo.ox.common.utils.OxUtils.uuid() );

        return userModel;
    }

    @Override
    public UserLoginVO convertUserLoginVO(UserModel user) {
        if ( user == null ) {
            return null;
        }

        UserLoginVO userLoginVO = new UserLoginVO();

        userLoginVO.setRefreshToken( user.getRefreshToken() );
        userLoginVO.setAccessToken( user.getAccessToken() );
        userLoginVO.setUsername( user.getUsername() );
        userLoginVO.setNickname( user.getNickname() );
        userLoginVO.setAvatarUrl( user.getAvatarUrl() );

        return userLoginVO;
    }
}
