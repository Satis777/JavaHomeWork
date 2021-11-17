package com.pb.tereschenko.hw8;


public class Auth {
    private String login;
    private String password;

    public Auth() {
    }


    public void signUp(String log, String pas, String confirmPas) throws WrongException {
        if (log.length() >= 5 && log.length() <= 20 && log.matches("[a-zA-Z0-9]+")) {
            if (pas.length() >= 5 && pas.matches("[a-zA-Z0-9_]+") && pas.equals(confirmPas)) {
                login = log;
                password = pas;
                System.out.println("Поздравляю, Вы успешно зарегистрировались!");

            } else throw new WrongPasswordException();

        } else {
            throw new WrongLoginException();
        }
    }

    public void signIn(String log, String pas) {
        if (log.equals(login) && pas.equals(password)) {
            System.out.println(login + " Вы успешно авторизовались.");
        } else throw new WrongLoginException("Логин или пароль не верны, попробуйте еще раз.");
    }
}









