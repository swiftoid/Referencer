package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by swi94000733 on 01/12/2015.
 */
// DO NOT EDIT inner PANEL, IF YOU DO, MAKE THE SAME SETTINGS FOR EACH FUNCTION IN PANELS.JAVA CLASS.



    // Andy Swift 2nd Jan 2016

public class Main extends Frame {

    public static String direct;
    public static String content_bg;


    public static void main(String args[])  throws IOException {




        // default background color
        content_bg = "#9BC29E";



        // Get the files current directory
        String current = new java.io.File(".").getCanonicalPath();
        direct = current;

        // Create main Form
        System.out.println(direct);
        JFrame frame = new JFrame("Her Majesties Referencer");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);


        // Create header panel for image and buttons
        JPanel header = new JPanel();
        header.setBackground(Color.decode("#2d2d2f"));
        header.setPreferredSize(new Dimension(700, 50));

        // Set the logo image & panel
        JPanel logo_panel = new JPanel();
        logo_panel.setPreferredSize(new Dimension(78, 39));
        logo_panel.setBackground(Color.decode("#2d2d2f"));


        // Make crown image (Direct is current directory)
        BufferedImage myPicture = ImageIO.read(new File(direct + "/logo.png"));
        JLabel pn = new JLabel(new ImageIcon(myPicture));
        pn.setForeground(Color.decode("#FFFFFF"));


        // create header buttons
        JButton btn_web = new JButton("Website");
        JButton btn_book = new JButton("Book");
        JButton greenButton = new JButton ("Green");
        JButton blueButton = new JButton ("Blue");
        JButton font = new JButton ("Change Font");

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
        header.add(blueButton);
        header.add(greenButton);




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

        //Add bottom Panel
        JPanel bottom = new JPanel();
        bottom.setBackground(Color.decode("#ffffff"));;
        bottom.setPreferredSize(new Dimension(700, 100));
        bottom.setAlignmentY(Component.BOTTOM_ALIGNMENT);


        //Add textfeild to bottom panel
        JEditorPane jep = new JEditorPane();
        jep.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(jep);
        jep.setContentType("text/html");
        jep.setText("<html><i>Your reference will be outputted here</i></html>");

        bottom.add(jep);



        //Add all panels to Frame and complete
        frame.add(header);
        frame.add(content);
        frame.add(bottom);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

        // Call for web to be first form shown
        center.removeAll();
        Panels newer = new Panels();
        inner = newer.webpanel(jep);
        inner.setBackground(Color.decode(content_bg));
        inner.setPreferredSize(new Dimension(400, 400));
        center.add(inner);
        frame.pack();



        // button ONCLICK events




        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //panel_2.setBackground(Color.decode("#cccc00"));
                String new_color;
                if(content_bg == "#009933") {
                    new_color = "#009999";
                }else {
                    new_color = "#009933";
                }
                content_bg = new_color;
                center.setBackground(Color.decode(new_color));
                content.setBackground(Color.decode(new_color));
                left.setBackground(Color.decode(new_color));
                search_panel.setBackground(Color.decode(new_color));
                search_inner.setBackground(Color.decode(new_color));

                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.webpanel(jep);
                inner.setBackground(Color.decode(content_bg));
                inner.setPreferredSize(new Dimension(400, 400));
                center.add(inner);
                frame.pack();
                //  CODE HERE  to call function for color change.


            }


        });





        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                //panel_2.setBackground(Color.decode("#cccc00"));
                String new_color;
                if(content_bg == "#3399ff") {
                    new_color = "#9BC29E";
                }else {
                    new_color = "#3399ff";
                }
                content_bg = new_color;
                center.setBackground(Color.decode(new_color));
                content.setBackground(Color.decode(new_color));
                left.setBackground(Color.decode(new_color));
                search_panel.setBackground(Color.decode(new_color));
                search_inner.setBackground(Color.decode(new_color));

                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.webpanel(jep);
                inner.setBackground(Color.decode(content_bg));
                inner.setPreferredSize(new Dimension(400, 400));
                center.add(inner);
                frame.pack();
                //  CODE HERE  to call function for color change.


                //  CODE HERE  to call function for color change

            }


        });





        btn_web.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.webpanel(jep);
                inner.setBackground(Color.decode(content_bg));
                inner.setPreferredSize(new Dimension(400, 400));
                center.add(inner);
                frame.pack();
            }
        });



        btn_book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                Panels newer = new Panels();
                JPanel inner = new JPanel();
                inner = newer.bookpanel(jep);
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
                            inner = newer.bookpanel(jep);
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
}




