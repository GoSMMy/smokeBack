package com.lopamoko.smoke.user;

import com.lopamoko.smoke.share.ApplicationException;

public class UserNameAlreadyExist extends ApplicationException {
    public UserNameAlreadyExist(String userName) {
        super("Login " + userName + " already exists");
    }
}
