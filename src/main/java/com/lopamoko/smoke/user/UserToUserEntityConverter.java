package com.lopamoko.smoke.user;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class UserToUserEntityConverter implements Converter<User, UserEntity> {

    @Override
    @NonNull
    public UserEntity convert(User user) {
        return new UserEntity()
                .setEmail(user.getEmail())
                .setFirstName(user.getFirstName())
                .setSecondName(user.getSecondName())
                .setAge(user.getAge())
                .setAccountNonExpired(user.isAccountNonExpired())
                .setUsername(user.getUsername())
                .setAccountNonLocked(user.isAccountNonLocked())
                .setRoles(user.getRoles())
                .setCredentialsNonExpired(user.isCredentialsNonExpired())
                .setEnabled(user.isEnabled())
                .setPassword(user.getPassword())
                .setUserId(user.getUserId());
    }
}
