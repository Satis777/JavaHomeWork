package com.pb.tereschenko.hw8;

public class WrongPasswordException extends WrongException {

    public WrongPasswordException() {
        super("Пароль не соответствует требованиям");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
