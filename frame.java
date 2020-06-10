import java.awt.*;
import java.util.AbstractQueue;


import javax.swing.*;
import java.awt.event.*;

class frame extends JFrame implements ActionListener{
    JLabel l1 = new JLabel("Name");
    JLabel l2 = new JLabel("Age");
    JLabel l3 = new JLabel("Email");
    JButton b1 = new JButton("Check");
    JButton b2 = new JButton("Resset");
    JButton b3 = new JButton("Exit");
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    JTextField t3 = new JTextField(20);
    
    frame(){
        setTitle("Singup");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        setSize(270,300);
        setLayout(new FlowLayout());
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        if(e.getSource() == b3)
        {
            this.dispose();
        }
        if(e.getSource() == b1)
        {
            if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty())
            {
                b1.setBackground(Color.RED);
            }
            else
                b1.setBackground(Color.GREEN);
        }
        if(e.getSource() == b2){
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            s1 = null;
            s2 = null;
            s3 = null;
        }
    }
    public static void main(String[] s){
        frame ob = new frame();
    }
    
}