package vn16;

import java.awt.*;
import java.awt.event.*;

public class hesapMakinesi  implements WindowListener,ActionListener{
 
	GridBagLayout a= new GridBagLayout();
	GridBagConstraints b= new GridBagConstraints();
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b10;
	Button b11;
	Button b12;
	Button b13;
	Button b14;
	Button b15;
	Button b16;
	Button b17;
TextField b0;

	
	Frame f=new Frame( );
	Panel p=new Panel();

	public hesapMakinesi(){
		p.setLayout(a);
		b.fill=GridBagConstraints.BOTH;
		b.insets= new Insets(3,3,3,3);
		
		
		b.gridx=0;
		b.gridy=0;
		b.gridwidth=4;
		b.gridheight=1;
		b0=new TextField();
		a.setConstraints(b0, b);
		p.add(b0);
		
		b.gridx=0;
		b.gridy=1;
		b.gridwidth=1;
		b.gridheight=1;
		b1=new Button("C");
		a.setConstraints(b1, b);
		p.add(b1);
	
		b.gridx=1;
		b.gridy=1;
		b.gridwidth=1;
		b.gridheight=1;
		b2=new Button("/");
		a.setConstraints(b2, b);
		p.add(b2);
	
		b.gridx=2;
		b.gridy=1;
		b.gridwidth=1;
		b.gridheight=1;
		b3=new Button("*");
		a.setConstraints(b3, b);
		p.add(b3);
		
		b.gridx=3;
		b.gridy=1;
		b.gridwidth=1;
		b.gridheight=1;
		b4=new Button("-");
		a.setConstraints(b4, b);
		p.add(b4);
	

		b.gridx=0;
		b.gridy=2;
		b.gridwidth=1;
		b.gridheight=1;
		b5=new Button("7");
		a.setConstraints(b5, b);
		p.add(b5);
		
		b.gridx=1;
		b.gridy=2;
		b.gridwidth=1;
		b.gridheight=1;
		b6=new Button("8");
		a.setConstraints(b6, b);
		p.add(b6);
		
		b.gridx=2;
		b.gridy=2;
		b.gridwidth=1;
		b.gridheight=1;
		b7=new Button("9");
		a.setConstraints(b7, b);
		p.add(b7);
		
		b.gridx=3;
		b.gridy=2;
		b.gridwidth=1;
		b.gridheight=2;
		b8=new Button("+");
		a.setConstraints(b8, b);
		p.add(b8);
	
		b.gridx=0;
		b.gridy=3;
		b.gridwidth=1;
		b.gridheight=1;
		b9=new Button("4");
		a.setConstraints(b9, b);
		p.add(b9);
		
		b.gridx=1;
		b.gridy=3;
		b.gridwidth=1;
		b.gridheight=1;
		b10=new Button("5");
		a.setConstraints(b10, b);
		p.add(b10);
		
		b.gridx=2;
		b.gridy=3;
		b.gridwidth=1;
		b.gridheight=1;
		b11=new Button("6");
		a.setConstraints(b11, b);
		p.add(b11);
		
		b.gridx=3;
		b.gridy=4;
		b.gridwidth=1;
		b.gridheight=2;
		b12=new Button("=");
		a.setConstraints(b12, b);
		p.add(b12);
	
		b.gridx=0;
		b.gridy=4;
		b.gridwidth=1;
		b.gridheight=1;
		b13=new Button("1");
		a.setConstraints(b13, b);
		p.add(b13);
		
		b.gridx=1;
		b.gridy=4;
		b.gridwidth=1;
		b.gridheight=1;
		b14=new Button("2");
		a.setConstraints(b14, b);
		p.add(b14);
		
		b.gridx=2;
		b.gridy=4;
		b.gridwidth=1;
		b.gridheight=1;
		b15=new Button("3");
		a.setConstraints(b15, b);
		p.add(b15);
		
		
		b.gridx=0;
		b.gridy=5;
		b.gridwidth=2;
		b.gridheight=1;
		b16=new Button("0");
		a.setConstraints(b16, b);
		p.add(b16);
		
		b.gridx=2;
		b.gridy=5;
		b.gridwidth=1;
		b.gridheight=1;
		b17=new Button(".");
		a.setConstraints(b17, b);
		p.add(b17);

	
		p.setBackground(Color.yellow);
		f.add(p);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		f.addWindowListener(this);
        f.pack( );
        f.setSize(150,250);
        f.setResizable(false);
        f.setVisible(true);
	}
	public static void main(String args[]) {
		hesapMakinesi  uygulama =new hesapMakinesi();
		
	}
	public void actionPerformed(ActionEvent e ) {
	String k = e.getActionCommand();
	
	
		try
		{
			if(k.equals("=")) {
				int i=0;
				double t=0.0;
				String c="", b="",a="";
			String s = b0.getText();
		
			for(i=1;i<s.length();i++) {
				b=s.substring(i,i+1);
				if(b.equals("*" )||b.equals("/" ) || b.equals("-" ) || b.equals("+" )) {
					c=b;
					a=s.substring(0,i);
					b=s.substring(i+1,s.length());
					i=s.length();
				}
			}
				double t1 = Double.valueOf(a);
				double t2 = Double.valueOf(b);
				
				switch(c) {
				case("+"): t = t1+t2;  break;
				case("-"): t = t1-t2;  break;
				case("/"): t= t1/t2;  break;
				case("*"): t= t1*t2;  break;
				}
			s= String.valueOf(t);
			b0.setText(s);
			
			}else if(k.equals("C")) {
				String s = b0.getText();
				s="";
				b0.setText(s);
			}else {
				String s = b0.getText();
				k=s+k;
				b0.setText(k);
			}
		}catch(Exception e1){
			System.out.println("Lütfen dogru giriniz!!");
		}
		
	
	}
	public void windowOpened(WindowEvent e ) {}
	public void windowClosing(WindowEvent e ) {
		System.exit(0);
		
	}

	public void windowClosed(WindowEvent e ) {}
	public void windowIconified(WindowEvent e ) {}
	public void windowDeiconified(WindowEvent e ) {}
	public void windowActivated(WindowEvent e ) {}
	public void windowDeactivated(WindowEvent e ) {}
		
	}
