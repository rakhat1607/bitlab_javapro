package kzt7;

import javax.swing.*;

public class Main7 {
    public static void main(String [] args){

    }
}
class Student {
    private int id;
    private String name ;
    private String surname;
    private String [] faculty;
    private String group;

    public Student() {
    }

    public Student(int id, String name, String surname, String[] faculty, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String[] getFaculty() {
        return faculty;
    }

    public void setFaculty(String[] faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}



class MainMenu extends JFrame {
    private JButton btnAddCitizen;
    private JButton btnGetallCitizens;
    private JButton btnExit;

}

