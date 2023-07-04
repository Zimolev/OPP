package org.example.SeminarOne.HomeWork;

public class User{
    private String login;
    private String password;
    private Basket basket;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket(){
        return new Basket();
    }

}
