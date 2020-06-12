package com.lopamoko.smoke.user;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class UserEntityToUserConverter implements Converter<UserEntity, User> {
    @Override
    @NonNull
    public User convert(UserEntity userEntity) {
        return new User()
                .setEmail(userEntity.getEmail())
                .setFirstName(userEntity.getFirstName())
                .setSecondName(userEntity.getSecondName())
                .setAge(userEntity.getAge())
                .setPassword(userEntity.getPassword())
                .setUsername(userEntity.getUsername())
                .setUserId(userEntity.getUserId());
    }
}
