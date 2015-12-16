package com.company;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.JTextField;

/**
 * Created by swi94000733 on 01/12/2015.
 */

public class Main extends Frame {

    public static String direct;

    //Left Panel

    public JLabel label_1;
    public JButton button;
    public TextField textfield_1;
    public JLabel label_2;
    public TextField textfield_2;
    public JLabel label_3;
    public TextField textfield_3;


    // end left pannel //

    public JPanel inner;

    // center pannel //

    public JLabel Clabel_1;
    public JButton Cbutton;
    public TextField Ctextfield_1;
    public JLabel Clabel_2;
    public TextField Ctextfield_2;
    public JLabel Clabel_3;
    public TextField Ctextfield_3;

    // end centyert pannel //


    public static void main(String args[]) throws IOException {


        String current = new java.io.File(".").getCanonicalPath();
        direct = current;

        System.out.println("starting form");
        JFrame frame = new JFrame("Her Majesties Referencer");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);


        JPanel header = new JPanel();
        header.setBackground(Color.decode("#2d2d2f"));
        header.setPreferredSize(new Dimension(700, 50));

        // Set the logo image & panel
        JPanel logo_panel = new JPanel();
        logo_panel.setPreferredSize(new Dimension(100, 50));
        logo_panel.setBackground(Color.decode("#00ff00"));
        JLabel pn = new JLabel("crown.png");
        pn.setForeground(Color.decode("#FFFFFF"));


        JButton btn_web = new JButton("Website");
        JButton btn_book = new JButton("Book");
        JButton btn_blog = new JButton("Blog");
        JButton btn_art = new JButton("Article");
        JButton btn_save = new JButton("SAVE");

        JTextPane Author = new JTextPane();

        // Set content panel
        JPanel content = new JPanel();
        content.setBackground(Color.decode("#FFFFFF"));
        content.setPreferredSize(new Dimension(400, 500));

        //Add items to HEADER panels

        logo_panel.add(pn);

        header.add(logo_panel);
        header.add(btn_web);
        header.add(btn_book);
        header.add(btn_blog);
        header.add(btn_art);
        header.add(btn_save);
        content.add(Author);

        //Add all panels to Frame
        frame.add(header);

        //

        JPanel left = new JPanel();

        //Left Panel ///

        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        JLabel label_1 = new JLabel("BOOK SEARCH");
        left.add(label_1);
        TextField textfield_1 = new TextField(20);
        left.add(textfield_1);
        JLabel label_2 = new JLabel("Enter Title of Publication");
        left.add(label_2);
        TextField textfield_2 = new TextField(20);
        left.add(textfield_2);
        JLabel label_3 = new JLabel("Enter Date of Publication");
        left.add(label_3);
        TextField textfield_3 = new TextField(20);
        left.add(textfield_3);
        JButton button = new JButton("SEARCH INTERNET");
        left.add(button);
        //End of Left Panel

        JPanel inner = new JPanel();
        inner.setLayout(new BoxLayout(inner, BoxLayout.Y_AXIS));
        JLabel inner_txt = new JLabel("dasfasdas");
        inner.add(inner_txt);

        JPanel center = new JPanel();
        //Center Panel


        //End of Center Panel


        // ADD content to frame //
        content.add(left);
        content.add(center);
        center.add(inner);
        frame.add(content);


        // complete the form
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

        center.removeAll();
        Panels newer = new Panels();
        inner = newer.bookpanel();
        center.add(inner);
        frame.pack();

        // button ONCLICK events
        btn_web.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.webpanel();
                center.add(inner);
                frame.pack();
            }
        });

        btn_book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.bookpanel();
                center.add(inner);
                frame.pack();
            }
        });


    }

}




