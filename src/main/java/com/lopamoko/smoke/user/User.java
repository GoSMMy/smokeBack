package com.lopamoko.smoke.user;

import com.lopamoko.smoke.product.rating.Rating;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
public class User implements UserDetails {
    private String userId;
    private String username;
    private String email;
    private String firstName;
    private String secondName;
    private int age;
    private String password;
    private List<Rating> ratings;
    private List<String> roles = new ArrayList<>();
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
