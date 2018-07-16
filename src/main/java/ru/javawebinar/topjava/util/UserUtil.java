package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.List;

public class UserUtil {
    public static final List<User> USERS = Arrays.asList(
            new User("Name_1", "email_1", "pswd_1", 2000, Role.ROLE_USER),
            new User("Name_2", "email_2", "pswd_2", 2100, Role.ROLE_USER),
            new User("Name_3", "email_3", "pswd_3", 1900, Role.ROLE_ADMIN),
            new User("Name_4", "email_4", "pswd_4", 2500, Role.ROLE_USER, Role.ROLE_ADMIN)
    );

}