package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Bob", "Dilan", (byte) 38);
        userService.saveUser("Robert", "Lowson", (byte) 31);
        userService.saveUser("Mike", "Klimson", (byte) 24);
        userService.saveUser("Dan", "Balan", (byte) 42);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
