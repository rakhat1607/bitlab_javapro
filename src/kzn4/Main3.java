package kzn4;

import javax.annotation.processing.SupportedSourceVersion;

public class Main3 {
    public static void main(String[] args) {
        Users[] users = new Users[10];
        users[0] = new Users("Nmae", "Surname");
        users[1] = new Users("John", "KAd");
        users[2] = new Users("Ka", "Smith");
        users[3] = new Users("asf", "gd");
        users[4] = new Users("asf", "wq2");
        users[5] = new Users("swq", "qrq");
        users[6] = new Users("ca", "Surname");
        users[7] = new Users("vrw", "aqwr");
        users[8] = new Users("yeq", "atq");
        users[9] = new Users("afs", "tyqw");
        UserBeanImp userBeanImp = new UserBeanImp(users);
        userBeanImp.getAllUsers();
        userBeanImp.getUserByName("John");
        userBeanImp.getUserBySurname("Smith");
    }
}

class Users {
    private String name;
    private String surname;

    public Users() {
    }

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


interface UserBean {
    void getAllUsers();

    void getUserByName(String name);

    void getUserBySurname(String surname);
}

class UserBeanImp implements UserBean {
    private Users[] users;

    public UserBeanImp() {
    }

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    public Users[] getUsers() {
        return users;
    }

    public void setUsers(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());
        }
    }

    @Override
    public void getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if(users[i].getName().equals(name)){
                System.out.println(users[i].toString());
            }
        }
    }

    @Override
    public void getUserBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if(users[i].getSurname().equals(surname)){
                System.out.println(users[i].toString());
            }
        }

    }
}