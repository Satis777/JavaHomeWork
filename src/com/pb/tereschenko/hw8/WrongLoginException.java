package com.pb.tereschenko.hw8;

public class WrongLoginException extends WrongException {
    public WrongLoginException() {
        super("Логин не соответствует требованиям");
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
