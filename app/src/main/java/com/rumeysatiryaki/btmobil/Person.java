package com.rumeysatiryaki.btmobil;


import java.util.ArrayList;

public class Person {
    private String username;
    private String password;
    private int photoId;
    /*attributelerde erişimin herkes tarafından olmaması için prvate yapıyoruz*/

    public Person(String username, String password, int photoId) {
        this.username = username;
        this.password = password;
        this.photoId = photoId;
    }

    public static ArrayList<Person> getPersonsList() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static ArrayList<Person> getPersonsList{}
    {

        ArrayList persons = new ArrayList();
        persons.add(new Person(username:"emre", password:"123", R.drawable.emre));
        persons.add(new Person(username:"ayşe", password:"ayse", R.drawable.ayse));
        persons.add(new Person(username:"nergis", password:"abcde", R.drawable.nergis));
        persons.add(new Person(username:"engin", password:"xyz", R.drawable.engin));
        persons.add(new Person(username:"meltem", password:"klmj", R.drawable.meltem));
        persons.add(new Person(username:"rumeysati", password:"123rumeysa", R.drawable.rumeysa));
        persons.add(new Person(username:"salih", password:"ankara", R.drawable.salih));
        persons.add(new Person(username:"ayşenur", password: "tiryaki",R.drawable.aysenur));
        persons.add(new Person(username:"h.büşra", password: "anadolu99",R.drawable.hbusra));
        return persons;

    }

}
