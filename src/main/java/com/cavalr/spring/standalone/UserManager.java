package com.cavalr.spring.standalone;

public class UserManager {

    private UserService userService;

    private SecurityService securityService;

    public User createUser() {

        if (securityService.isAllowedToCreateUser()) {
            return userService.createUser();
        }
        throw new SecurityException();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }
}
