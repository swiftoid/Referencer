package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by COX08145982 on 16/12/2015.
 */
public class Panels {
    private String auto_book_author;
    private String auto_book_title;
    private String auto_book_date;
    private String auto_book_publisher;

    private Font titleFont = new Font("Calibri", Font.TRUETYPE_FONT, 24);
    private Font mainFont = new Font("Calibri", Font.TRUETYPE_FONT, 18);
    public JPanel webpanel(){
        JPanel inner = new JPanel();

        inner.setLayout(new BoxLayout(inner, BoxLayout.Y_AXIS));
        JLabel title = new JLabel("Website:");
        title.setFont(titleFont);
        inner.add(title);
        // Add a panel as a spacer
        JPanel spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(400, 1));
        spacer.setBackground(Color.black);
        inner.add(spacer);



        // Start Forms
        JLabel Clabel_1 = new JLabel("Author name");
        Clabel_1.setFont(mainFont);
        Clabel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
        inner.add(Clabel_1);
        JTextField Ctextfield_1 = new JTextField(20);
        inner.add(Ctextfield_1);

        JLabel Clabel_2 = new JLabel("Date");
        Clabel_2.setFont(mainFont);
        inner.add(Clabel_2);
        JTextField Ctextfield_2 = new JTextField(20);
        inner.add(Ctextfield_2);

        JLabel Clabel_3 = new JLabel("Article Title ");
        Clabel_3.setFont(mainFont);
        inner.add(Clabel_3);
        JTextField Ctextfield_3 = new JTextField(20);
        inner.add(Ctextfield_3);

        JLabel Clabel_4 = new JLabel("Website Publisher");
        Clabel_4.setFont(mainFont);
        inner.add(Clabel_4);
        JTextField Ctextfield_4 = new JTextField(20);
        inner.add(Ctextfield_4);

        JLabel Clabel_5 = new JLabel("Website Address");
        Clabel_5.setFont(mainFont);
        inner.add(Clabel_5);
        JTextField Ctextfield_5 = new JTextField(20);
        inner.add(Ctextfield_5);

        JLabel Clabel_6 = new JLabel("Date Accessed");
        Clabel_6.setFont(mainFont);
        inner.add(Clabel_6);
        JTextField Ctextfield_6 = new JTextField(20);
        inner.add(Ctextfield_6);


        JButton Cbutton = new JButton("Create Reference");
        JButton example = new JButton("Generate Example");
        inner.add(Cbutton);
        inner.add(example);

        Cbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String author = Ctextfield_1.getText();
                String date = Ctextfield_2.getText();
                String title = Ctextfield_3.getText();
                String publisher = Ctextfield_4.getText();
                String addr = Ctextfield_5.getText();
                String accessed = Ctextfield_6.getText();

                // The output string (used html tags for format)
                String to_return = author + ", (" + date + "). \"<i>" + title + "</i>\"." + publisher + ". [online] avaiable at: " + addr + ". Last accessed: " + accessed;
                System.out.println(to_return);

            }
        });

        example.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ctextfield_1.setText("C. Cox");
                Ctextfield_2.setText("22/01/2009");
                Ctextfield_3.setText("How to make a referencer");
                Ctextfield_4.setText("website.com");
                Ctextfield_5.setText("http://website.com/article/23432224423");
                Ctextfield_6.setText("16/12/15");
            }
        });

        return inner;

    }





    public JPanel bookpanel(){
        JPanel inner = new JPanel();
        inner.setLayout(new BoxLayout(inner, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Book:");
        title.setFont(titleFont);
        inner.add(title);

        // Add a panel as a spacer
        JPanel spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(400, 1));
        spacer.setBackground(Color.black);
        inner.add(spacer);

        JLabel Clabel_1 = new JLabel("Enter author details:");
        Clabel_1.setFont(mainFont);
        inner.add(Clabel_1);
        JTextField Ctextfield_1 = new JTextField(20);
        Ctextfield_1.setText(this.auto_book_author);
        inner.add(Ctextfield_1);

        JLabel Clabel_2 = new JLabel("Enter title of publication:");
        Clabel_2.setFont(mainFont);
        inner.add(Clabel_2);
        JTextField Ctextfield_2 = new JTextField(20);
        Ctextfield_2.setText(this.auto_book_title);
        inner.add(Ctextfield_2);

        JLabel Clabel_3 = new JLabel("Enter date of publication:");
        Clabel_3.setFont(mainFont);
        inner.add(Clabel_3);
        JTextField Ctextfield_3 = new JTextField(20);
        Ctextfield_3.setText(this.auto_book_date);
        inner.add(Ctextfield_3);

        JLabel Clabel_4 = new JLabel("Enter publisher:");
        Clabel_4.setFont(mainFont);
        inner.add(Clabel_4);
        JTextField Ctextfield_4 = new JTextField(20);
        Ctextfield_4.setText(this.auto_book_publisher);
        inner.add(Ctextfield_4);

        JLabel Clabel_5 = new JLabel("Enter place of publication:");
        Clabel_5.setFont(mainFont);
        inner.add(Clabel_5);
        JTextField Ctextfield_5 = new JTextField(20);
        inner.add(Ctextfield_5);



        JButton Cbutton = new JButton("Create reference");
        inner.add(Cbutton);

        Cbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(Ctextfield_1.getText() + " is the author");
                Ctextfield_5.setText(Ctextfield_1.getText() + "\"" + Ctextfield_4.getText() + "\"");

            }
        });
        return inner;

    }

    public void setAuto_book_author(String auto_book_author) {
        this.auto_book_author = auto_book_author;
    }

    public void setAuto_book_title(String auto_book_title) {
        this.auto_book_title = auto_book_title;
    }

    public void setAuto_book_date(String auto_book_date) {
        this.auto_book_date = auto_book_date;
    }

    public void setAuto_book_publisher(String auto_book_publisher) {
        this.auto_book_publisher = auto_book_publisher;
    }
}




