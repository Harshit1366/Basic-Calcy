package calcy;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class calcu implements ActionListener {
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	static double a=0,b=0,res=0;
	static int op=0;
	JTextField tb;
	
calcu()
{
    JFrame f=new JFrame();
    f.setSize(200,300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tb=new JTextField();
    tb.setText("");
    tb.setBounds(0,0,200,50);
    f.add(tb);
    b1=new JButton("1");
   
    b1.addActionListener(this);
    f.add(b1);
    b2=new JButton("2");
    b2.addActionListener(this);
    f.add(b2);
    GridLayout g = new GridLayout(0,3);
    f.setLayout(g);
  //  b2.setBounds(50,100,50,50);
    b3=new JButton("3");
    b3.addActionListener(this);
    f.add(b3);
    //b3.setBounds(100,100,50,50);
    b4=new JButton("4");
    b4.addActionListener(this);
    f.add(b4);
    //b4.setBounds(0,150,50,50);
    b5=new JButton("5");
    b5.addActionListener(this);
    f.add(b5);
    //b5.setBounds(50,150,50,50);
    b6=new JButton("6");
    b6.addActionListener(this);
    f.add(b6);
    //b6.setBounds(100,150,50,50);
    b7=new JButton("7");
    b7.addActionListener(this);
    f.add(b7);
    //b7.setBounds(0,200,50,50);
    b8=new JButton("8");
    b8.addActionListener(this);
    f.add(b8);
    //b8.setBounds(50,200,50,50);
    b9=new JButton("9");
    b9.addActionListener(this);
    f.add(b9);
    b0=new JButton("0");
    b0.addActionListener(this);
    f.add(b0);
    //b9.setBounds(100,200,50,50);
    b10=new JButton("+");
    b10.addActionListener(this);
    //b10.setBounds(150,100,50,50);
    b11=new JButton("-");
    b11.addActionListener(this);
    //b11.setBounds(150,150,50,50);
    b12=new JButton("X");
    b12.addActionListener(this);
    //b12.setBounds(150,200,50,50);
    b13=new JButton("/");
    b13.addActionListener(this);
    //b13.setBounds(150,250,50,50);
b14=new JButton("=");
b14.addActionListener(this);
b15=new JButton("CLR");
b15.addActionListener(this);
b16=new JButton("<--");
b16.addActionListener(this);
    f.add(b10);
    f.add(b11);
    f.add(b12);
    f.add(b13);
    f.add(b14);
    f.add(b15);
    f.add(b16);
    f.setVisible(true);
    
    

    
}
    public static void main(String[] args) {
    new calcu();
    }
    
    public void actionPerformed(ActionEvent e) {
  
        if(e.getSource()==b1){
            tb.setText(tb.getText().concat("1"));
        }
        if(e.getSource()==b2){
            tb.setText(tb.getText().concat("2"));
        }
        if(e.getSource()==b3){
            tb.setText(tb.getText().concat("3"));
        }
        if(e.getSource()==b4){
            tb.setText(tb.getText().concat("4"));
        }
        if(e.getSource()==b5){
            tb.setText(tb.getText().concat("5"));
        }
        if(e.getSource()==b6){
            tb.setText(tb.getText().concat("6"));
        }
        if(e.getSource()==b7){
            tb.setText(tb.getText().concat("7"));
        }
        if(e.getSource()==b8){
            tb.setText(tb.getText().concat("8"));
        }
        if(e.getSource()==b9){
            tb.setText(tb.getText().concat("9"));
        }
        if(e.getSource()==b0){
            tb.setText(tb.getText().concat("0"));
        }
        if(e.getSource()==b10)
        {
            a=Double.parseDouble(tb.getText());
            op=1;
            tb.setText("+\n");
        } 
        
        if(e.getSource()==b11)
        {
            a=Double.parseDouble(tb.getText());
            op=2;
            tb.setText("-\n");
        }
        
        if(e.getSource()==b12)
        {
            a=Double.parseDouble(tb.getText());
            op=3;
            tb.setText("X\n");
        }
        
        if(e.getSource()==b13)
        {
            a=Double.parseDouble(tb.getText());
            op=4;
            tb.setText("/\n");
        }
        
        if(e.getSource()==b14)
        {
            b=Double.parseDouble(tb.getText());
        
            switch(op)
            {
                case 1: res=a+b;
                    break;
        
                case 2: res=a-b;
                    break;
        
                case 3: res=a*b;
                    break;
        
                case 4: res=a/b;
                    break;
        
                default: res=0;
            }
        
            tb.setText(""+res);
        }
        
        if(e.getSource()==b15)
            tb.setText("");
        
        if(e.getSource()==b16)
        {
            String s=tb.getText();
            tb.setText("");
            for(int i=0;i<s.length()-1;i++)
            tb.setText(tb.getText()+s.charAt(i));
        }        
    }
    }



