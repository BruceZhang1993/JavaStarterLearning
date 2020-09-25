package io.github.brucezhang1993.lesson5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class LoginException extends RuntimeException {
    protected static int EMPTY = 1001;
    protected static int NO_USERNAME = 1002;
    protected static int WRONG_PASSWORD = 1003;
    protected static int LOCKED = 1004;

    protected static Map<Integer, String> messages = Map.of(
            EMPTY, "用户名或密码为空",
            NO_USERNAME, "用户名不存在",
            WRONG_PASSWORD, "密码错误",
            LOCKED, "此帐号已锁定"
    );

    private int code;

    public LoginException(int code) {
        super(messages.get(code));
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", code, this.getMessage());
    }
}

interface LoginInterface {
    void login(String username, String password);
}

class Login implements LoginInterface {
    private static String username = "iamaboy";
    private static String password = "1234";
    private static boolean locked = false;

    @Override
    public void login(String username, String password) {
        if ("".equals(username) || "".equals(password)) {
            throw new LoginException(1001);
        }
        if (!username.equals(Login.username)) {
            throw new LoginException(1002);
        }
        if (!password.equals(Login.password)) {
            throw new LoginException(1003);
        }
        if (locked) {
            throw new LoginException(1004);
        }
        System.out.println("Login success");
    }
}

public class AccountManager {
    public static void main(String[] args) {
        try {
            new Login().login("a", "b");
        } catch (LoginException exception) {
            System.out.println(exception.toString());
        }
    }
}
