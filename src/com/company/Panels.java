package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by COX08145982 on 16/12/2015.
 */
public class Panels {
    private String auto_book_author;
    private String auto_book_title;
    private String auto_book_date;
    private String auto_book_publisher;
    private String labelColour = "#FFFFFF";




/*
    anAaray (of hexidecial colors here )

    int (array position = 0 )

        array position ++

      Setbackground (array [array position])

          catch if array pos = < number of colors then start again.
          */






    private Font titleFont = new Font("Calibri", Font.TRUETYPE_FONT, 24);
    private Font mainFont = new Font("Calibri", Font.TRUETYPE_FONT, 18);
    public JPanel webpanel(JEditorPane jep){
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

        JLabel Clabel_2 = new JLabel("Year of publication");
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
                    author = author.split(" ")[1] + ", " + (author.split(" ")[0]).charAt(0) + ". ";
                String date = Ctextfield_2.getText();
                String title = Ctextfield_3.getText();
                    title = " \"<i>"+title + "</i>\". ";
                String publisher = Ctextfield_4.getText();
                String addr = Ctextfield_5.getText();

                String accessed = Ctextfield_6.getText();
                String full = author + date + title + publisher + ". [ONLINE] Available at: " + addr + " (Accessed: " + accessed + ")";
                // The output string (used html tags for format)
                //String to_return = author + ", (" + date + "). \"<i>" + title + "</i>\"." + publisher + ". [online] avaiable at: " + addr + ". Last accessed: " + accessed;
                //System.out.println(to_return);


                // Method to create actusl reference   //

                jep.setText("<div style=\"font-family:calibri;width:400px\">" + full + "</div>");
            }
        });

        example.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ctextfield_1.setText("Andy Swift");
                Ctextfield_2.setText("1972");
                Ctextfield_3.setText("How to make a referencer");
                Ctextfield_4.setText("keepitcash.net");
                Ctextfield_5.setText("http://website.com/article/23432224423");
                Ctextfield_6.setText("16th December 2015");
            }
        });

        return inner;

    }




    public JPanel bookpanel(JEditorPane jep){
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

        JLabel Clabel_drop = new JLabel("Enter date of publication:");
        Clabel_drop.setFont(mainFont);
        inner.add(Clabel_drop);

        // all the items in the drop-down list -- needs more adding
        String[] editions = { "1st", "2nd", "3rd", "4th", "5th" };

        //Create the combo box, select item at index 4.
        //Indices start at 0, so 4 specifies the pig.
        JComboBox edition_list = new JComboBox(editions);
        inner.add(edition_list);

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
        JButton Example = new JButton("Example");

        Example.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ctextfield_1.setText("Andy Swift");
                Ctextfield_2.setText("1972");
                Ctextfield_3.setText("Fortune favours the brave");
                Ctextfield_4.setText("Lorax Publishing");
                Ctextfield_5.setText("London");
            }
        });
        inner.add(Cbutton);
        inner.add(Example);

        Cbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String author = Ctextfield_1.getText();
                author = author.split(" ")[1] + ", " + (author.split(" ")[0]).charAt(0) + ". ";
                String date = Ctextfield_2.getText();
                String title = Ctextfield_3.getText();
                title = " \"<i>"+title + "</i>\". ";
                String publisher = Ctextfield_4.getText();
                String addr = Ctextfield_5.getText();




                String full2 = author + date + title + publisher + ". Published in " + addr;

                jep.setText("<div style=\"font-family:calibri;width:400px\">"+full2+"</div>");

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




