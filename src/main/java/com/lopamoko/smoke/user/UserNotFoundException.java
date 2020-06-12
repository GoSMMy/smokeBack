package com.lopamoko.smoke.user;

import com.lopamoko.smoke.share.ApplicationException;

public class UserNotFoundException extends ApplicationException {

    public UserNotFoundException(String userName) {
        super("Can't find user by username " + userName);
    }
}
