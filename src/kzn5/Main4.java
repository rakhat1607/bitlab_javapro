package kzn5;

import java.util.Arrays;

public class Main4 {

        public static void main(String[] args) {
            User list[] = new User[15];
            list[0] = new User(1, "asd", "asd", "asd", "Asd");
            list[1] = new User(12, "asd", "asd", "asd", "Asd");
            list[2] = new User(13, "asd", "asd", "asd", "Asd");
            list[3] = new User(14, "asd", "asd", "asd", "Asd");
            list[4] = new User(15, "asd", "asd", "asd", "Asd");
            list[5] = new Student(2, "QWE", "QWe", "QWEQ", "SADASD", 4);
            list[6] = new Student(22, "QWE", "QWe", "QWEQ", "SADASD", 4);
            list[7] = new Student(23, "QWE", "QWe", "QWEQ", "SADASD", 4);
            list[8] = new Student(24, "QWE", "QWe", "QWEQ", "SADASD", 4);
            list[9] = new Student(25, "QWE", "QWe", "QWEQ", "SADASD", 4);
            list[10] = new Staff(3, "asdasd", "Asdasd", "Asdasd", "asdasdasd", 500000);
            list[11] = new Staff(32, "asdasd", "Asdasd", "Asdasd", "asdasdasd", 500000);
            list[12] = new Staff(33, "asdasd", "Asdasd", "Asdasd", "asdasdasd", 500000);
            list[13] = new Staff(34, "asdasd", "Asdasd", "Asdasd", "asdasdasd", 500000);
            list[14] = new Staff(35, "asdasd", "Asdasd", "Asdasd", "asdasdasd", 500000);

            for (User user : list) {
                if (user instanceof Student) {
                    Student student = (Student) user;
                    for (int i = 0; i < 5; i++) {
                        student.addCourse("Course " + i);
                    }
                }else if(user instanceof Staff){
                    Staff staff = (Staff) user;
                    for (int i = 0; i < 10; i++) {
                        staff.addSubject("Subject " + i);
                    }
                }
            }

            for (User user : list) {
                user.getData();
                System.out.println("----------------------");
            }

        }
    }

    class User {
        protected int id;
        protected String login;
        protected String password;
        protected String name;
        protected String surname;

        public User() {

        }

        public User(int id, String login, String password, String name, String surname) {
            this.id = id;
            this.login = login;
            this.password = password;
            this.name = name;
            this.surname = surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public String getPassword() {
            return password;
        }

        public String getLogin() {
            return login;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        void getData() {
            System.out.println(getId() + " " + getLogin() + " " + getPassword() + " " + getName() + " " + getSurname());
        }

    }

    class Staff extends User {
        private double salary;
        private String subjects[] = new String[100];
        private int indexOfSubject = 0;


        public Staff() {

        }

        public void addSubject(String subject) {
            subjects[indexOfSubject++] = subject;
        }

        public Staff(int id, String login, String password, String name, String surname, double salary) {
            super(id, login, password, name, surname);
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }


        void getData() {
            System.out.println(getId() + getSurname() + getName() + getPassword() + getLogin() + getSalary());
            for (int i = 0; i < indexOfSubject; i++) {
                System.out.println(subjects[i]);
            }
        }

    }

    class Student extends User {
        private double gpa;
        private String courses[] = new String[100];
        private int indexOfCouses = 0;


        public void addCourse(String course) {
            courses[indexOfCouses++] = course;
        }


        public Student() {

        }

        public Student(int id, String login, String password, String name, String surname, double gpa) {
            super(id, login, password, name, surname);
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        void getData() {
            System.out.println(getId() + getSurname() + getName() + getPassword() + getLogin() + getGpa());
            for (int i = 0; i < indexOfCouses; i++) {
                System.out.println(courses[i]);
            }
        }
    }