package JAVA.bankManagementSys.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class login extends JFrame implements ActionListener{

    JButton but1, but2, but3;
    JLabel label1, label2, label3;
    JTextField tf2;
    JPasswordField pf3;
    
    login(){

        super("Bank Management System"); //mini text on the top of the frame
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("JAVA/bankManagementSys/icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(370, 10, 100, 100); //set the height and position of image in frame 
        add(image);

        label1 = new JLabel ("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font ("AvantGarde", Font.BOLD, 38));
        label1.setBounds(245,125,450,40);
        add(label1);

        label2 = new JLabel("Card No : ");
        label2.setFont(new Font ("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        tf2 = new JTextField(15);
        tf2.setBounds(325,190,230,30);
        tf2.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf2);

        label3 = new JLabel("PIN : ");
        label3.setFont(new Font ("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        pf3 = new JPasswordField(15);
        pf3.setBounds(325, 250,230,30);
        pf3.setFont(new Font("Arial", Font.BOLD, 14));
        add(pf3);


        but1 = new JButton("SIGN IN");
        but1.setFont(new Font("Arial", Font.BOLD, 14));
        but1.setBounds(325,320,100,30);
        but1.setForeground(Color.WHITE);
        but1.setBackground(Color.BLACK);
        but1.addActionListener(this);
        add(but1);

        but2 = new JButton("CLEAR");
        but2.setFont(new Font("Arial", Font.BOLD, 14));
        but2.setBounds(455,320,100,30);
        but2.setForeground(Color.WHITE);
        but2.setBackground(Color.BLACK);
        but2.addActionListener(this);
        add(but2);

        but3 = new JButton("SIGN UP");
        but3.setFont(new Font("Arial", Font.BOLD, 14));
        but3.setBounds(325,370,232,30);
        but3.setForeground(Color.WHITE);
        but3.setBackground(Color.BLACK);
        but3.addActionListener(this);
        add(but3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("JAVA/bankManagementSys/icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480); //set the height and position of image in frame 
        add(iiimage);

        


        setLayout(null); //give access to manually control the attributes of component in container
        setSize(850, 480); //size of frame
        setLocation(550, 300); //location of frame
        setVisible(true); //make the frame window visible

    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            if (e.getSource() == but1){

            } else if (e.getSource() ==  but2){
                tf2.setText("");
                pf3.setText("");
            } else if (e.getSource() == but3){

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main (String []args){
        new login();
    }

}


/* PROGRESS LOG
(22/3) 19:36, https://www.youtube.com/watch?v=aeam0iUVGsI&list=PLbKub4Jss9oVSgCL6pFsiq0NLluRCDOdU&index=2
*/
