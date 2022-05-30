package kzt6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main6 {
    public static void main(String[] args){
        Contact contact = new Contact();
        contact.setVisible(true);
    }
}

class ContactPeople{
     String name;
     String phone;
    int age;


    public ContactPeople() {
    }

    public ContactPeople(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

}



class Contact extends JFrame{

    public Contact (){
        setSize(600,800);
        setTitle("Bitlab Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel labelNamePeople = new JLabel();
        labelNamePeople.setText("Name :");
        labelNamePeople.setSize(200,30);
        labelNamePeople.setLocation(100,100);

        JTextField textFieldName = new JTextField();
        textFieldName.setSize(200,30);
        textFieldName.setLocation(200,100);

        JLabel labelPhone = new JLabel();
        labelPhone.setText("Phone :");
        labelPhone.setSize(200,30);
        labelPhone.setLocation(100,200);

        JTextField textFieldPhone = new JTextField();
        textFieldPhone.setSize(200,30);
        textFieldPhone.setLocation(200,200);

        JLabel labelAge = new JLabel();
        labelAge.setText("Age :");
        labelAge.setSize(200,30);
        labelAge.setLocation(100,300);

        Integer [] ageType = new Integer[]{20,21,22,23,24,25,26,27,28,29,30};
        JComboBox comboBoxAgeType = new JComboBox(ageType);
        comboBoxAgeType.setSize(100,30);
        comboBoxAgeType.setLocation(200,300);

        JButton btnAddContact = new JButton();
        btnAddContact.setText("Add Contact");
        btnAddContact.setSize(100,30);
        btnAddContact.setLocation(200,400);

        JTextArea labelResult = new JTextArea();
        labelResult.setSize(300,200);
        labelResult.setLocation(100,450);

        add(labelNamePeople);
        add(labelAge);
        add(labelResult);
        add(labelPhone);
        add(textFieldName);
        add(textFieldPhone);
        add(comboBoxAgeType);
        add(btnAddContact);
        btnAddContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                String phone = textFieldPhone.getText();
                int ageType = Integer.parseInt(comboBoxAgeType.getSelectedItem().toString());

                if (!name.equals("")){
                    labelResult.append(name + " - " + phone +  " - " + ageType + " years" + "\n");
                    textFieldName.setText("");
                    textFieldPhone.setText("");
                    comboBoxAgeType.setSelectedIndex(0);
                }
            }
        });
    }

}
