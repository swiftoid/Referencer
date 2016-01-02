package com.company;

import com.sun.xml.internal.bind.v2.TODO;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

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
// DO NOT EDIT inner PANEL, IF YOU DO, MAKE THE SAME SETTINGS FOR EACH FUNCTION IN PANELS.JAVA CLASS.

  // TODO  Reon to create the bottom pannel for output of final reference

    // Andy Swift 2nd Jan 2016 dthwrth
    // chris cox hghjghjghjghjgjhgjgjghgj

public class Main extends Frame {

    public static String direct;
    public static void main(String args[]) throws IOException {


        // Default content background
        String content_bg = "#9BC29E";
        // ggg
        // Get the files current directory
        String current = new java.io.File(".").getCanonicalPath();
        direct = current;

        // Create main Form
        System.out.println("starting form");
        JFrame frame = new JFrame("Her Majesties Referencer");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);


        // Create header panel for image and buttons
        JPanel header = new JPanel();
        header.setBackground(Color.decode("#2d2d2f"));
        header.setPreferredSize(new Dimension(700, 50));

        // Set the logo image & panel
        JPanel logo_panel = new JPanel();
        logo_panel.setPreferredSize(new Dimension(100, 50));
        logo_panel.setBackground(Color.decode("#00ff00"));
        JLabel pn = new JLabel("crown.png");
        pn.setForeground(Color.decode("#FFFFFF"));

        // create header buttons
        JButton btn_web = new JButton("Website");
        JButton btn_book = new JButton("Book");
        JButton database = new JButton("Connect");


        // Set content panel
        JPanel content = new JPanel();
        content.setLayout( new BoxLayout(content, BoxLayout.X_AXIS));
        content.setBackground(Color.decode(content_bg));
        content.setPreferredSize(new Dimension(400, 500));

        //Add items to HEADER panels
        logo_panel.add(pn);
        header.add(logo_panel);
        header.add(btn_web);
        header.add(btn_book);
        header.add(database);


        // Create Left Panel (ISBN search)
        JPanel left = new JPanel();
        left.setBackground(Color.decode(content_bg));
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        left.setMaximumSize(new Dimension(250, 450));
        left.setAlignmentX(Component.LEFT_ALIGNMENT);
        left.setAlignmentY(Component.TOP_ALIGNMENT);

        JLabel label_1 = new JLabel("Search By ISBN:");
        left.add(label_1);
        TextField textfield_1 = new TextField(20);
        textfield_1.setText("9781118008188"); // SET AN EXAMPLE ISBN (HTML & CSS By Jon Duckett)
        left.add(textfield_1);
        JButton search_button = new JButton("SEARCH");
        left.add(search_button);

        // Start search panel for putting results
        JPanel search_panel = new JPanel();
        search_panel.setBackground(Color.decode(content_bg)); //
        search_panel.setPreferredSize(new Dimension(250, 385));
        JPanel search_inner = new JPanel();
        search_inner.setPreferredSize(new Dimension(250, 385));
        search_inner.setBackground(Color.decode(content_bg)); //
        search_panel.add(search_inner);
        left.add(search_panel);
        // End of search panel
        //End of Left Panel
        JPanel inner = new JPanel();

        JPanel center = new JPanel();
        center.setBackground(Color.decode(content_bg));
        center.setMaximumSize(new Dimension(450, 500));
        center.setAlignmentX(Component.LEFT_ALIGNMENT);
        center.setAlignmentY(Component.TOP_ALIGNMENT);
        // add content to center panel
        content.add(left);
        content.add(center);
        center.add(inner);



        //Add all panels to Frame and complete
        frame.add(header);
        frame.add(content);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

        // Call for web to be first form shown
        center.removeAll();
        Panels newer = new Panels();
        inner = newer.webpanel();
        inner.setBackground(Color.decode(content_bg));
        inner.setPreferredSize(new Dimension(400, 400));
        center.add(inner);
        frame.pack();



        // button ONCLICK events







        btn_web.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.webpanel();
                inner.setBackground(Color.decode(content_bg));
                inner.setPreferredSize(new Dimension(400, 400));
                center.add(inner);
                frame.pack();
            }
        });



        database.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            Db_connect clicked = new Db_connect();

                String ret_data = clicked.connect("sadjkslahdjksahjdksa");
                System.out.println(ret_data);

            }
        });

        btn_book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.bookpanel();
                inner.setBackground(Color.decode(content_bg));
                inner.setPreferredSize(new Dimension(400, 400));
                center.add(inner);
                frame.pack();
            }
        });

        // Search button config
        search_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search_panel.removeAll();
                ISBN_Search search = new ISBN_Search();

                JPanel search_inner = new JPanel();
                search_inner.setBackground(Color.decode(content_bg));
                try {
                    search.run_search(textfield_1.getText());// run the search with ISBN textfield as value
                    String res_title = search.getIsbn_title();
                    String res_author = search.getIsbn_author();
                    String res_date = search.getIsbn_date();
                    String res_pub = search.getIsbn_pub();
                    String res_desc = search.getIsbn_desc();

                    JLabel tester = new JLabel(search.getIsbn_title());
                    search_inner.add(tester);

                    JButton auto_gen = new JButton("Auto fill..");
                    search_inner.add(auto_gen);
                    auto_gen.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            center.removeAll();
                            Panels newer = new Panels();
                            newer.setAuto_book_author(res_author);
                            newer.setAuto_book_title(res_title);
                            newer.setAuto_book_date(res_date);
                            newer.setAuto_book_publisher(res_pub);
                            JPanel inner = new JPanel();
                            inner = newer.bookpanel();
                            inner.setBackground(Color.decode(content_bg));
                            inner.setPreferredSize(new Dimension(400, 400));
                            center.add(inner);
                            frame.pack();
                        }
                    });
                } catch (Exception ex) {
                    System.out.println("Failed...");
                    System.out.println(ex.getMessage());
                    JLabel tester = new JLabel("Does not exist");
                    search_inner.add(tester);
                }

                search_panel.add(search_inner);
                frame.pack();
            }
        });

    }

// Function for auto completing forms.
public void AutoAdd(JPanel MainPanel) {

}
}




