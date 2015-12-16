package com.company;

import javax.swing.*;

/**
 * Created by COX08145982 on 16/12/2015.
 */
public class Panels {
    public JPanel webpanel(){
        JPanel inner = new JPanel();

        inner.setLayout(new BoxLayout(inner, BoxLayout.Y_AXIS));
        JLabel Clabel_1 = new JLabel("Enter Author Details");
        inner.add(Clabel_1);
        JTextField Ctextfield_1 = new JTextField(20);
        inner.add(Ctextfield_1);

        JLabel Clabel_2 = new JLabel("Enter Title of Publiction");
        inner.add(Clabel_2);
        JTextField Ctextfield_2 = new JTextField(20);
        inner.add(Ctextfield_2);

        JLabel Clabel_3 = new JLabel("Enter Date of Publication");
        inner.add(Clabel_3);
        JTextField Ctextfield_3 = new JTextField(20);
        inner.add(Ctextfield_3);

        JLabel Clabel_4 = new JLabel("Enter Publisher");
        inner.add(Clabel_4);
        JTextField Ctextfield_4 = new JTextField(20);
        inner.add(Ctextfield_4);

        JLabel Clabel_5 = new JLabel("Enter Place of Publication");
        inner.add(Clabel_5);
        JTextField Ctextfield_5 = new JTextField(20);
        inner.add(Ctextfield_5);

        JButton Cbutton = new JButton("Create reference");
        inner.add(Cbutton);

        return inner;

    }





    public JPanel bookpanel(){
        JPanel inner = new JPanel();

        inner.setLayout(new BoxLayout(inner, BoxLayout.Y_AXIS));
        JLabel Clabel_1 = new JLabel("Enter AuthorADHKKELs;jdkflhjkjskl;jdklfas Details");
        inner.add(Clabel_1);
        JTextField Ctextfield_1 = new JTextField(20);
        inner.add(Ctextfield_1);

        JLabel Clabel_2 = new JLabel("Enter Title of Publiction");
        inner.add(Clabel_2);
        JTextField Ctextfield_2 = new JTextField(20);
        inner.add(Ctextfield_2);

        JLabel Clabel_3 = new JLabel("Enter Date of Publication");
        inner.add(Clabel_3);
        JTextField Ctextfield_3 = new JTextField(20);
        inner.add(Ctextfield_3);

        JLabel Clabel_4 = new JLabel("Enter Publisher");
        inner.add(Clabel_4);
        JTextField Ctextfield_4 = new JTextField(20);
        inner.add(Ctextfield_4);

        JLabel Clabel_5 = new JLabel("Enter Place of Publication");
        inner.add(Clabel_5);
        JTextField Ctextfield_5 = new JTextField(20);
        inner.add(Ctextfield_5);

        JButton Cbutton = new JButton("Create reference");
        inner.add(Cbutton);

        return inner;

    }
}

