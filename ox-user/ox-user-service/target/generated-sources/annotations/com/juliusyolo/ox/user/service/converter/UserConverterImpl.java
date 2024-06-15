package com.juliusyolo.ox.user.service.converter;

import com.juliusyolo.ox.user.repository.model.User;
import com.juliusyolo.ox.user.service.model.UserModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T12:43:59+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class UserConverterImpl implements UserConverter {

    @Override
    public UserModel convert(User user) {
        if ( user == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setId( user.getId() );
        userModel.setUserId( user.getUserId() );
        userModel.setNickname( user.getNickname() );
        userModel.setUsername( user.getUsername() );
        userModel.setPassword( user.getPassword() );
        userModel.setEmail( user.getEmail() );
        userModel.setPhoneNumber( user.getPhoneNumber() );
        userModel.setAvatarUrl( user.getAvatarUrl() );
        userModel.setRefreshToken( user.getRefreshToken() );
        userModel.setAccessToken( user.getAccessToken() );
        userModel.setCreateTime( user.getCreateTime() );
        userModel.setUpdateTime( user.getUpdateTime() );

        return userModel;
    }

    @Override
    public User convert(UserModel userModel) {
        if ( userModel == null ) {
            return null;
        }

        User user = new User();

        user.setId( userModel.getId() );
        user.setUserId( userModel.getUserId() );
        user.setNickname( userModel.getNickname() );
        user.setUsername( userModel.getUsername() );
        user.setPassword( userModel.getPassword() );
        user.setEmail( userModel.getEmail() );
        user.setPhoneNumber( userModel.getPhoneNumber() );
        user.setAvatarUrl( userModel.getAvatarUrl() );
        user.setRefreshToken( userModel.getRefreshToken() );
        user.setAccessToken( userModel.getAccessToken() );
        user.setCreateTime( userModel.getCreateTime() );
        user.setUpdateTime( userModel.getUpdateTime() );

        return user;
    }
}
