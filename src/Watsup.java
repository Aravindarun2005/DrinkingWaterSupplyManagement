import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

import java.time.LocalDate;
import java.awt.print.*;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Watsup  {
      
    public static void main(String[] args){
      
        JFrame frm = new JFrame("GRACE WATER SUPPLIES");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\ARAVIND\\IMAGE\\WATERCAN.jpg");
        frm.setIconImage(icon);
        JLabel bgl = new JLabel();
        bgl.setIcon(new ImageIcon("C:\\ARAVIND\\IMAGE\\WATER CANS1.jpg")); 
        bgl.setSize(1200,700);       
        frm.add(bgl);
        frm.setExtendedState(Frame.MAXIMIZED_BOTH);
    	frm.setResizable(false);

        //Login Menu settings...

        JLabel log = new JLabel();
        log.setOpaque(true);
        log.setBackground(new Color(10,10,10,100));
        JLabel lbl1,lbl2;
        TextField txt1,txt2;
        Button Lb1,Lb2;

        lbl1 = new JLabel("User Name :");
        lbl2 = new JLabel("Pass Word :");
        lbl1.setFont(new Font("Arial", Font.BOLD, 18));
        lbl2.setFont(new Font("Arial", Font.BOLD, 18));

        lbl1.setForeground(Color.WHITE);
        lbl2.setForeground(Color.WHITE);
        lbl1.setBounds(50, 50, 120, 50);
        lbl2.setBounds(50, 100, 120, 50);

        txt1 = new TextField();
        txt2 = new TextField();
        txt2.setEchoChar('*');
        txt1.setBounds(170, 60, 190, 30);
        txt2.setBounds(170, 110, 190, 33);

        Lb1 = new Button("Login");
        Lb2 = new Button("Exit");
        Lb1.setFont(new Font("Arial", Font.BOLD, 18));
        Lb2.setFont(new Font("Arial", Font.BOLD, 18));
        txt1.setFont(new Font("Arial", Font.BOLD, 16));
        Lb1.setBounds(80, 200, 100, 50);
        Lb2.setBounds(230, 200, 100, 50);

        log.add(lbl1);
        log.add(lbl2);
        log.add(txt1);
        log.add(txt2);
        log.add(Lb1);
        log.add(Lb2);

        log.setBounds(50, 300, 400, 300);
        log.setVisible(true);
        bgl.add(log);

        //Main Menu settings...

        JLabel mmp = new JLabel();

        Label mmlul,mmlbl,mmlbl1,mmlbl2,mmlbl3,mmlbl4,mmlbl5;
        Button mmbuc,mmbua,mmbsc,mmbsa,mmbfc,mmbd,mmbfca,mmbda,mmbeb,mmbfcds, mmbecrs,mmbcw;

	mmlul = new Label();
        mmlbl = new Label("Create");
        mmlbl1 = new Label("Alter");
        mmlbl2 = new Label("Filled Cans");
        mmlbl3 = new Label("Reports");
        mmlul.setFont(new Font("Arial", Font.BOLD, 18));
        mmlbl.setFont(new Font("Arial", Font.BOLD, 18));
        mmlbl1.setFont(new Font("Arial", Font.BOLD, 18));
        mmlbl2.setFont(new Font("Arial", Font.BOLD, 18));
        mmlbl3.setFont(new Font("Arial", Font.BOLD, 18));
        mmlul.setBackground(new Color(0,0,100));
        mmlbl.setBackground(new Color(0,0,100));
        mmlbl1.setBackground(new Color(0,0,100));
        mmlbl2.setBackground(new Color(0,0,100));
        mmlbl3.setBackground(new Color(0,0,100));
        mmlul.setForeground(Color.WHITE);
        mmlbl.setForeground(Color.WHITE);
        mmlbl1.setForeground(Color.WHITE);
        mmlbl2.setForeground(Color.WHITE);
        mmlbl3.setForeground(Color.WHITE);
        mmlul.setBounds(5, 2, 377, 40);
        mmlbl.setBounds(5, 45, 150, 100);
        mmlbl1.setBounds(5, 150, 150, 100);
        mmlbl2.setBounds(5, 255, 150, 200);
        mmlbl3.setBounds(5, 460, 150, 150);

        mmbuc = new Button("User ID");
        mmbsc = new Button("Supplier");
        mmbua = new Button("User ID");
        mmbsa = new Button("Supplier");

        mmbfc = new Button("Receipt-Supplier");
        mmbd = new Button("Delivery-Customer");
        mmbfca = new Button("Alter-Receipt");
        mmbda = new Button("Alter-Delivery");

        mmbfcds = new Button("Filled Can Stock");
        mmbecrs = new Button("Empty Can Stock");
        mmbcw = new Button("Customer Wise");
        mmbeb = new Button("E X I T");

        mmbuc.setFont(new Font("Arial", Font.BOLD, 18));
        mmbua.setFont(new Font("Arial", Font.BOLD, 18));
        mmbsc.setFont(new Font("Arial", Font.BOLD, 18));
        mmbsa.setFont(new Font("Arial", Font.BOLD, 18));
        mmbfc.setFont(new Font("Arial", Font.BOLD, 18));
        mmbd.setFont(new Font("Arial", Font.BOLD, 18));
        mmbfca.setFont(new Font("Arial", Font.BOLD, 18));
        mmbda.setFont(new Font("Arial", Font.BOLD, 18));
        mmbfcds.setFont(new Font("Arial", Font.BOLD, 18));
        mmbecrs.setFont(new Font("Arial", Font.BOLD, 18));
	mmbcw.setFont(new Font("Arial", Font.BOLD, 18));
        mmbeb.setFont(new Font("Arial", Font.BOLD, 22));

        mmbeb.setBackground(new Color(0,100,100));
        mmbeb.setForeground(new Color(250,250,250));
        mmbuc.setBounds(160, 45, 220, 50);
        mmbsc.setBounds(160, 95, 220, 50);
        mmbua.setBounds(160, 150, 220, 50);
        mmbsa.setBounds(160, 200, 220, 50);
        mmbfc.setBounds(160, 255, 220, 50);
        mmbd.setBounds(160, 305, 220, 50);
        mmbfca.setBounds(160, 355, 220, 50);
        mmbda.setBounds(160, 405, 220, 50);
        mmbfcds.setBounds(160, 460, 220, 50);
        mmbecrs.setBounds(160, 510, 220, 50);
        mmbcw.setBounds(160, 560, 220, 50);
        mmbeb.setBounds(5, 615, 377, 50);

        mmp.add(mmlbl);
        mmp.add(mmlbl1);
        mmp.add(mmlbl2);
        mmp.add(mmlbl3);
        mmp.add(mmbuc);
        mmp.add(mmbsc);
        mmp.add(mmbua);
        mmp.add(mmbsa);
        mmp.add(mmbfc);
        mmp.add(mmbd);
        mmp.add(mmbfca);
        mmp.add(mmbda);

        mmp.add(mmbfcds);
        mmp.add(mmbecrs);
	mmp.add(mmbcw);
        mmp.add(mmbeb);

        bgl.add(mmp);
        mmp.setBounds(1, 1, 500, 1500);
        mmp.setVisible(false);

        //New User Creation Menu settings...

        JLabel Nuc = new JLabel();
        Nuc.setOpaque(true);
        Nuc.setBackground(new Color(10,10,10,100));
        Label Nuclbl;
        JLabel Nuclbl1,Nuclbl2;
        TextField Nuctxt1,Nuctxt2;
        Button Nucb1,Nucb2;

        Nuclbl = new Label("   Enter New User details here...");
        Nuclbl1 = new JLabel("User Name :");
        Nuclbl2 = new JLabel("Pass Word :");
        Nuclbl.setFont(new Font("Arial", Font.BOLD, 18));
        Nuclbl1.setFont(new Font("Arial", Font.BOLD, 18));
        Nuclbl2.setFont(new Font("Arial", Font.BOLD, 18));

        Nuclbl.setForeground(Color.WHITE);
        Nuclbl.setBackground(new Color(10,10,10));
        Nuclbl1.setForeground(Color.WHITE);
        Nuclbl2.setForeground(Color.WHITE);
        Nuclbl.setBounds(50, 5, 300, 50);
        Nuclbl1.setBounds(50, 65, 120, 50);
        Nuclbl2.setBounds(50, 115, 120, 50);

        Nuctxt1 = new TextField();
        Nuctxt1.setFont(new Font("Arial", Font.BOLD, 16));
        Nuctxt2 = new TextField();
        Nuctxt2.setEchoChar('*');
        Nuctxt1.setBounds(170, 75, 190, 30);
        Nuctxt2.setBounds(170, 125, 190, 33);

        Nucb1 = new Button("Save");
        Nucb2 = new Button("Back");
        Nucb1.setFont(new Font("Arial", Font.BOLD, 18));
        Nucb2.setFont(new Font("Arial", Font.BOLD, 18));
        Nucb1.setBounds(80, 205, 100, 50);
        Nucb2.setBounds(230, 205, 100, 50);

        Nuc.add(Nuclbl);
        Nuc.add(Nuclbl1);
        Nuc.add(Nuclbl2);
        Nuc.add(Nuctxt1);
        Nuc.add(Nuctxt2);
        Nuc.add(Nucb1);
        Nuc.add(Nucb2);

        Nuc.setBounds(50, 100, 400, 300);
        Nuc.setVisible(false);
        bgl.add(Nuc);

	// Button Action Area....

        Nucb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

             final String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
             final String USER="root";
             final String PASS="Aravind2005@";

             Connection conn = null;
             final String d_userid=Nuctxt1.getText();
             final String d_password=Nuctxt2.getText();

             try
             {
             conn = DriverManager.getConnection(DB_URL,USER,PASS);
             String q="insert into users values(?,?)";
             PreparedStatement stmt = conn.prepareStatement(q);
             stmt.setString(1,d_userid);
             stmt.setString(2,d_password);              
             int rows = stmt.executeUpdate();
             if (rows == 1){
             JOptionPane.showMessageDialog(null,"Inserted Successfully!");
              } 
             else
              {
                   JOptionPane.showMessageDialog(null,"Not Inserted!");
              }       
             }
             catch(Exception e1)
             { 
                System.out.println(e1);    
             }
		Nuctxt1.setText("");
		Nuctxt2.setText("");
            }
        
        });

        Nucb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             Nuctxt1.setText("");
             Nuc.setVisible(false);
             mmp.setVisible(true); 
            }
        
        });


        //User Alteration Menu settings...

        JLabel Ua = new JLabel();
        Ua.setOpaque(true);
        Ua.setBackground(new Color(10,10,10,100));
        Label Ualbl,Ualb;
        JLabel Ualbl1,Ualbl2;
        TextField Uatxt1,Uatxt2;
        Button Uab1,Uab2,Uab3;

        Ualbl = new Label("   User details Alteration...");
        Ualb = new Label("Click in List & Press Add Button");
        Ualbl1 = new JLabel("User Name :");
        Ualbl2 = new JLabel("Pass Word :");
        Ualbl.setFont(new Font("Arial", Font.BOLD, 18));
        Ualb.setFont(new Font("Arial", Font.BOLD, 18));
        Ualbl1.setFont(new Font("Arial", Font.BOLD, 18));
        Ualbl2.setFont(new Font("Arial", Font.BOLD, 18));

        Ualbl.setForeground(Color.WHITE);
        Ualbl.setBackground(new Color(10,10,10));
        Ualb.setForeground(Color.WHITE);
        Ualb.setBackground(new Color(10,10,10));

        Ualbl1.setForeground(Color.WHITE);
        Ualbl2.setForeground(Color.WHITE);

        Ualbl.setBounds(50, 5, 300, 50);
        Ualb.setBounds(380, 20, 300, 50);
        Ualbl1.setBounds(50, 65, 120, 50);
        Ualbl2.setBounds(50, 115, 120, 50);

        Uatxt1 = new TextField();
        Uatxt2 = new TextField();
        Uatxt2.setEchoChar('*');

        Uatxt1.setBounds(170, 75, 190, 30);
        Uatxt2.setBounds(170, 125, 190, 33);

        Uab1 = new Button("Save");
        Uab2 = new Button("Back");
        Uab3 = new Button("Add");

        Uab1.setFont(new Font("Arial", Font.BOLD, 18));
        Uab2.setFont(new Font("Arial", Font.BOLD, 18));
        Uab3.setFont(new Font("Arial", Font.BOLD, 18));

        Uab1.setBounds(80, 205, 100, 50);
        Uab2.setBounds(230, 205, 100, 50);
        Uab3.setBounds(380, 300, 300, 35);

        Ua.add(Ualbl);
        Ua.add(Ualb);
        Ua.add(Ualbl1);
        Ua.add(Ualbl2);
        Ua.add(Uatxt1);
        Ua.add(Uatxt2);
        Ua.add(Uab1);
        Ua.add(Uab2);
        Ua.add(Uab3);

        Ua.setVisible(false);


	// Button Action Area....
        Uab1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

             final String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
             final String USER="root";
             final String PASS="Aravind2005@";

             Connection conn = null;
             final String d_userid=Uatxt1.getText();
             final String d_password=Uatxt2.getText();

             try
             {
             conn = DriverManager.getConnection(DB_URL,USER,PASS);
             String q="update users set pwd = ? where username=?";
             PreparedStatement stmt = conn.prepareStatement(q);
             stmt.setString(1,d_password);
             stmt.setString(2,d_userid);
             int rows = stmt.executeUpdate();
             if (rows == 1){
             JOptionPane.showMessageDialog(null,"Password Changed Successfully!");
              } 
             else
              {
                   JOptionPane.showMessageDialog(null,"Not Updated!");
              }      
             }
             catch(Exception e1)
             { 
                System.out.println(e1);    
             }
		Uatxt1.setText("");
		Uatxt2.setText("");
            }
        
        });

        mmbua.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
             mmp.setVisible(false);
  	try
	 	{	
      	String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      	String USER="root";
      	String PASS="Aravind2005@";
      	Connection conn = null;
      	String query="SELECT USERNAME FROM USERS;";
      	conn = DriverManager.getConnection(DB_URL,USER,PASS);
	DefaultListModel<String> model = new DefaultListModel<>();
      	Statement st=conn.createStatement();
      	ResultSet rs=st.executeQuery(query);
        JList<String> LB1=new JList<>(model);
        LB1.setFont(new Font("Arial", Font.BOLD, 18));
        LB1.setBounds(380, 70, 300, 150);
        String[] arr=new String[10];
      	while(rs.next())
      		{
          	String user=rs.getString("USERNAME");
		model.addElement(user);
      		}
	JScrollPane JSP = new JScrollPane();
	JSP.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	JSP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JSP.setPreferredSize(new Dimension(300,150));
	LB1.setModel(model);
        JSP.setViewportView(LB1);
        JSP.setBounds(380, 70, 340, 200);
        LB1.setLayoutOrientation(JList.VERTICAL);
	JSP.setVisible(true);
        Ua.add(JSP,BorderLayout.CENTER);
 
        Uab3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            Uatxt1.setText(LB1.getSelectedValue().toString());
            }
        
        });

        	}
        catch(Exception e3)
		{
	System.out.println(e3);
		}

             Ua.setBounds(50, 100, 900, 400);
             Ua.setVisible(true); 
             bgl.add(Ua);

            }
        }); 

        Uab2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             Ua.setVisible(false);
             mmp.setVisible(true); 
            }
        
        });

        //Supplier Master Creation Menu settings...

        JLabel mcsp = new JLabel();
        mcsp.setOpaque(true);
        mcsp.setBackground(new Color(10,10,100,100));

        Label mcsptl;
        JLabel mcsnl,mcsal1,mcsal2,mcsal3,mcsal4,mcsal5;
        TextField mcsnt,mcsat1,mcsat2,mcsat3,mcsat4,mcsat5;
        Button mcssb,mcseb;

        mcsptl = new Label("  Master Creation - Suppliers");
        mcsnl = new JLabel("Supplier Name :");
        mcsal1 = new JLabel("Door/Flat No.:");
        mcsal2 = new JLabel("Area,Street Name:");
        mcsal3 = new JLabel("City Name:");
        mcsal4 = new JLabel("PIN Code:");
        mcsal5 = new JLabel("Contact Nos.:");

        mcsptl.setFont(new Font("Arial", Font.BOLD, 18));
        mcsptl.setBackground(new Color(10,10,10));
        mcsptl.setForeground(Color.WHITE);
        mcsnl.setForeground(Color.WHITE);
        mcsal1.setForeground(Color.WHITE);
        mcsal2.setForeground(Color.WHITE);
        mcsal3.setForeground(Color.WHITE);
        mcsal4.setForeground(Color.WHITE);
        mcsal5.setForeground(Color.WHITE);

        mcsnl.setFont(new Font("Arial", Font.BOLD, 18));
        mcsal1.setFont(new Font("Arial", Font.BOLD, 18));
        mcsal2.setFont(new Font("Arial", Font.BOLD, 18));
        mcsal3.setFont(new Font("Arial", Font.BOLD, 18));
        mcsal4.setFont(new Font("Arial", Font.BOLD, 18));
        mcsal5.setFont(new Font("Arial", Font.BOLD, 18));

        mcsptl.setBounds(50, 20, 490, 40);
        mcsnl.setBounds(50, 100, 170, 50);
        mcsal1.setBounds(50, 150, 170, 50);
        mcsal2.setBounds(50, 200, 170, 50);
        mcsal3.setBounds(50, 250, 170, 50);
        mcsal4.setBounds(50, 300, 170, 50);
        mcsal5.setBounds(50, 350, 170, 50);


        mcsnt = new TextField();
        mcsat1 = new TextField();
        mcsat2 = new TextField();
        mcsat3 = new TextField();
        mcsat4 = new TextField();
        mcsat5 = new TextField();

        mcsnt.setFont(new Font("Arial", Font.BOLD, 16));
        mcsat1.setFont(new Font("Arial", Font.BOLD, 16));
        mcsat2.setFont(new Font("Arial", Font.BOLD, 16));
        mcsat3.setFont(new Font("Arial", Font.BOLD, 16));
        mcsat4.setFont(new Font("Arial", Font.BOLD, 16));
        mcsat5.setFont(new Font("Arial", Font.BOLD, 16));

        mcsnt.setBounds(220, 110, 330, 35);
        mcsat1.setBounds(220, 160, 330, 35);
        mcsat2.setBounds(220, 210, 330, 35);
        mcsat3.setBounds(220, 260, 330, 35);
        mcsat4.setBounds(220, 310, 330, 35);
        mcsat5.setBounds(220, 360, 330, 35);

        mcssb = new Button("Save");
        mcseb = new Button("Back");
        mcssb.setFont(new Font("Arial", Font.BOLD, 18));
        mcseb.setFont(new Font("Arial", Font.BOLD, 18));
        mcssb.setBounds(150, 520, 100, 50);
        mcseb.setBounds(300, 520, 100, 50);

        mcsp.add(mcsptl);
        mcsp.add(mcsnl);
        mcsp.add(mcsal1);
        mcsp.add(mcsal2);
        mcsp.add(mcsal2);
        mcsp.add(mcsal3);
        mcsp.add(mcsal4);
        mcsp.add(mcsal5);

        mcsp.add(mcssb);
        mcsp.add(mcseb);
        mcsp.add(mcsnt);
        mcsp.add(mcsat1);
        mcsp.add(mcsat2);
        mcsp.add(mcsat3);
        mcsp.add(mcsat4);
        mcsp.add(mcsat5);

        mcsp.setVisible(false);
        bgl.add(mcsp);

	// Button Action Area....

        mcssb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
      		String sname=mcsnt.getText();
      		String doorno=mcsat1.getText();
     		String aname=mcsat2.getText();
      		String cname=mcsat3.getText();
      		String pincode=mcsat4.getText();
     		String phno=mcsat5.getText();
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection conn = null;
      		try
      			{
             		conn = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query1="select max(id) from supplier";
             		Statement st=conn.createStatement();
            		 ResultSet rs=st.executeQuery(query1);
             		rs.next();
             		int id=rs.getInt(1);
             		id=id+1;
            		String query2="insert into supplier values(?,?,?,?,?,?,?)";
             		PreparedStatement pst=conn.prepareStatement(query2);
             		pst.setInt(1,id);
             		pst.setString(2,sname);
             		pst.setString(3,doorno);
            		pst.setString(4,aname);
             		pst.setString(5,cname);
             		pst.setString(6,pincode);
             		pst.setString(7,phno);
             		int rows=pst.executeUpdate();
             		if(rows==1)
             			{
                		JOptionPane.showMessageDialog(null,"Record Inserted Successfully!");
      				mcsnt.setText("");
      				mcsat1.setText("");
     				mcsat2.setText("");
      				mcsat3.setText("");
     				mcsat4.setText("");
      				mcsat5.setText("");

             			}
             			else
             			{
                		  JOptionPane.showMessageDialog(null,"Not Inserted Successfully!");
             			}
            		}
             		catch(Exception e1)
             		   { 
                		System.out.println(e1);    
             		   }

		      }
       	  });
        mcseb.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){
      		mcsnt.setText("");
      		mcsat1.setText("");
     		mcsat2.setText("");
      		mcsat3.setText("");
     		mcsat4.setText("");
      		mcsat5.setText("");
             mcsp.setVisible(false); 
             mmp.setVisible(true); 
            }
        });
        //Supplier Master Alteration Menu settings...

        JLabel masp = new JLabel();
        masp.setOpaque(true);
        masp.setBackground(new Color(10,10,100,100));

        Label masptl;
        JLabel masidl,masnl,masal1,masal2,masal3,masal4,masal5;
        TextField masidt,masnt,masat1,masat2,masat3,masat4,masat5;
        Button masgb,masub,maseb;
        masptl = new Label("  Master Alteration - Suppliers");
        masidl = new JLabel("Enter ID Number :");
        masnl = new JLabel("Supplier Name :");
        masal1 = new JLabel("Door/Flat No.:");
        masal2 = new JLabel("Area,Street Name:");
        masal3 = new JLabel("City Name:");
        masal4 = new JLabel("PIN Code:");
        masal5 = new JLabel("Contact Nos.:");
        masptl.setFont(new Font("Arial", Font.BOLD, 18));
        masptl.setBackground(new Color(10,10,10));
        masptl.setForeground(Color.WHITE);
        masidl.setForeground(Color.WHITE);
        masnl.setForeground(Color.WHITE);
        masal1.setForeground(Color.WHITE);
        masal2.setForeground(Color.WHITE);
        masal3.setForeground(Color.WHITE);
        masal4.setForeground(Color.WHITE);
        masal5.setForeground(Color.WHITE);
        masidl.setFont(new Font("Arial", Font.BOLD, 18));
        masnl.setFont(new Font("Arial", Font.BOLD, 18));
        masal1.setFont(new Font("Arial", Font.BOLD, 18));
        masal2.setFont(new Font("Arial", Font.BOLD, 18));
        masal3.setFont(new Font("Arial", Font.BOLD, 18));
        masal4.setFont(new Font("Arial", Font.BOLD, 18));
        masal5.setFont(new Font("Arial", Font.BOLD, 18));
        masptl.setBounds(30, 30, 490, 40);
        masidl.setBounds(30, 90, 170, 50);
        masnl.setBounds(30, 140, 170, 50);
        masal1.setBounds(30, 190, 170, 50);
        masal2.setBounds(30, 240, 170, 50);
        masal3.setBounds(30, 290, 170, 50);
        masal4.setBounds(30, 340, 170, 50);
        masal5.setBounds(30, 390, 170, 50);
        masidt = new TextField();
        masnt = new TextField();
        masat1 = new TextField();
        masat2 = new TextField();
        masat3 = new TextField();
        masat4 = new TextField();
        masat5 = new TextField();
        masidt.setFont(new Font("Arial", Font.BOLD, 14));
        masnt.setFont(new Font("Arial", Font.BOLD, 14));
        masat1.setFont(new Font("Arial", Font.BOLD, 14));
        masat2.setFont(new Font("Arial", Font.BOLD, 14));
        masat3.setFont(new Font("Arial", Font.BOLD, 14));
        masat4.setFont(new Font("Arial", Font.BOLD, 14));
        masat5.setFont(new Font("Arial", Font.BOLD, 14));
        masidt.setBounds(210, 100, 110, 35);
        masnt.setBounds(210, 150, 330, 35);
        masat1.setBounds(210, 200, 330, 35);
        masat2.setBounds(210, 250, 330, 35);
        masat3.setBounds(210, 300, 330, 35);
        masat4.setBounds(210, 350, 330, 35);
        masat5.setBounds(210, 400, 330, 35);
        masgb = new Button("<--Get details");
        masub = new Button("Update");
        maseb = new Button("Back");
        masgb.setFont(new Font("Arial", Font.BOLD, 18));
        masub.setFont(new Font("Arial", Font.BOLD, 18));
        maseb.setFont(new Font("Arial", Font.BOLD, 18));
        masgb.setBounds(325, 102, 130, 35);
        masub.setBounds(150, 520, 100, 50);
        maseb.setBounds(300, 520, 100, 50);
        masp.add(masptl);
        masp.add(masidl);
        masp.add(masnl);
        masp.add(masal1);
        masp.add(masal2);
        masp.add(masal2);
        masp.add(masal3);
        masp.add(masal4);
        masp.add(masal5);
        masp.add(masgb);
        masp.add(masub);
        masp.add(maseb);
        masp.add(masidt);
        masp.add(masnt);
        masp.add(masat1);
        masp.add(masat2);
        masp.add(masat3);
        masp.add(masat4);
        masp.add(masat5);

	masgb.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){
	    try
	      {	
		//int id=1;
		String id = masidt.getText();
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection conn = null;
      		String query="SELECT * FROM SUPPLIER WHERE ID="+id;
      		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String sname=rs.getString(2);
		String doorno=rs.getString(3);
		String a_name=rs.getString(4);
		String c_name=rs.getString(5);
		String pincode=rs.getString(6);
		String conno=rs.getString(7);
        	masnt.setText(sname);
        	masat1.setText(doorno);
       		masat2.setText(a_name);
        	masat3.setText(c_name);
        	masat4.setText(pincode);
        	masat5.setText(conno);
	       }
	    catch(Exception ep)
	      {
		System.out.println("Exception occured while fetching supplier details");
	      }
             
             }
 	  });

        masp.setVisible(false);
        bgl.add(masp);

        masub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

             final String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
             final String USER="root";
             final String PASS="Aravind2005@";

             Connection conn4 = null;

             try
             {
		final int u_id=Integer.parseInt(masidt.getText());

        	final String u_sname=masnt.getText();
        	final String u_doorno=masat1.getText();
        	final String u_a_name=masat2.getText();
        	final String u_c_name=masat3.getText();
        	final String u_pincode=masat4.getText();
        	final String u_conno=masat5.getText();

             conn4 = DriverManager.getConnection(DB_URL,USER,PASS);

             PreparedStatement stmt1 = conn4.prepareStatement("update supplier"+" set sname=?,doorno= ?, a_name=?, c_name=?, pincode=?, contno=?"+"where id=?");

             stmt1.setString(1,u_sname);
             stmt1.setString(2,u_doorno);
             stmt1.setString(3,u_a_name);
             stmt1.setString(4,u_c_name);
             stmt1.setString(5,u_pincode);
             stmt1.setString(6,u_conno);
	     stmt1.setInt(7,u_id);

             stmt1.executeUpdate();

             JOptionPane.showMessageDialog(null,"Updated Successfully!");
             }
             catch(Exception e1)
             { 
                System.out.println(e1);    
             }
		masidt.setText("");
        	masnt.setText("");
        	masat1.setText("");
        	masat2.setText("");
        	masat3.setText("");
        	masat4.setText("");
        	masat5.setText("");

            }
        
        });

        // Can Receipts Entry Menu settings...

        JLabel mfcrp = new JLabel();
        mfcrp.setOpaque(true);
        mfcrp.setBackground(new Color(10,10,100,100));

        Label mfcrtl;
        JLabel mfcrsl,mfcrsidl,mfcrnl,mfcrdtl,mfcrql,mfcrql1,mfcrsal1,mfcrsal2,mfcrsal3,mfcrsal4,mfcrsal5,mfctl;
        TextField mfcrsidt,mfcrst,mfcrnt,mfcrdtt,mfcrqt;
        Button mfcrgb,mfcrsb,mfcreb;

        TextField mfcrsat1a,mfcrsat2a,mfcrsat3a,mfcrsat4a,mfcrsal5a;

        mfcrtl = new Label("Entry - Can Receipts from Suppliers");
        mfcrnl = new JLabel("Can Receipt No. :");
        mfcrdtl = new JLabel("Receipt Date :");
        mfcrsidl = new JLabel("Supplier ID No. :");
        mfcrsl = new JLabel("Supplier Name :");
        mfcrsal1 = new JLabel("Door/Flat No.:");
        mfcrsal2 = new JLabel("Area,Street Name:");
        mfcrsal3 = new JLabel("City Name:");
        mfcrsal4 = new JLabel("PIN Code:");
        mfcrsal5 = new JLabel("Contact Nos.:");
        mfcrql = new JLabel("Received Quantity:");
        mfcrql1 = new JLabel("Nos.");
        mfctl = new JLabel("Can Type :");

        mfcrtl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrtl.setBackground(new Color(10,10,10));
        mfcrsidl.setForeground(Color.WHITE);
        mfcrtl.setForeground(Color.WHITE);
        mfcrsl.setForeground(Color.WHITE);

        mfcrsal1.setForeground(Color.WHITE);
        mfcrsal2.setForeground(Color.WHITE);
        mfcrsal3.setForeground(Color.WHITE);
        mfcrsal4.setForeground(Color.WHITE);
        mfcrsal5.setForeground(Color.WHITE);

        mfcrnl.setForeground(Color.WHITE);
        mfcrdtl.setForeground(Color.WHITE);
        mfcrql.setForeground(Color.WHITE);
        mfcrql1.setForeground(Color.WHITE);
        mfctl.setForeground(Color.WHITE);

        mfcrsidl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsal1.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsal2.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsal3.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsal4.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsal5.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrnl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrdtl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrql.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrql1.setFont(new Font("Arial", Font.BOLD, 18));
        mfctl.setFont(new Font("Arial", Font.BOLD, 18));

        mfcrtl.setBounds(50, 20, 490, 40);
        mfcrsidl.setBounds(50, 155, 170, 50);
        mfcrsl.setBounds(50, 195, 170, 50);
        mfcrsal1.setBounds(50, 235, 170, 50);
        mfcrsal2.setBounds(50, 275, 170, 50);
        mfcrsal3.setBounds(50, 315, 170, 50);
        mfcrsal4.setBounds(50, 355, 170, 50);
        mfcrsal5.setBounds(50, 395, 170, 50);

        mfcrnl.setBounds(50, 80, 170, 50);
        mfcrdtl.setBounds(50, 120, 170, 50);
        mfcrql.setBounds(50, 435, 180, 50);
        mfcrql1.setBounds(355, 435, 40, 50);
        mfctl.setBounds(50, 470, 180, 50);

	mfcrnt = new TextField();
	mfcrdtt = new TextField();
        mfcrsidt = new TextField();
        mfcrst = new TextField();

	LocalDate d1 = LocalDate.now();
        mfcrdtt.setText(d1.toString());
	mfcrqt = new TextField();
	Choice mfctt = new Choice();
	mfctt.add("Filled Can");
	mfctt.add("Empty Can");

        mfcrsidt.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrst.setFont(new Font("Arial", Font.BOLD, 18));
	mfcrnt.setFont(new Font("Arial", Font.BOLD, 18));
	mfcrdtt.setFont(new Font("Arial", Font.BOLD, 18));
	mfcrqt.setFont(new Font("Arial", Font.BOLD, 18));
	mfctt.setFont(new Font("Arial", Font.BOLD, 18));

	mfcrnt.setBounds(230, 80, 180, 35);
	mfcrdtt.setBounds(230, 120, 180, 35);
        mfcrsidt.setBounds(230, 160, 100, 35);
        mfcrst.setBounds(230, 200, 330, 35);
	mfcrqt.setBounds(230, 445, 120, 35);
	mfctt.setBounds(230, 485, 150, 60);

        mfcrgb = new Button("<--Get details");
        mfcrsb = new Button("Save");
        mfcreb = new Button("Back");
        mfcrgb.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrsb.setFont(new Font("Arial", Font.BOLD, 18));
        mfcreb.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrgb.setBounds(340, 160, 120, 38);
        mfcrsb.setBounds(150, 560, 100, 50);
        mfcreb.setBounds(300, 560, 100, 50);

        mfcrsat1a = new TextField();
       	mfcrsat2a = new TextField();
        mfcrsat3a = new TextField();
        mfcrsat4a = new TextField();
        mfcrsal5a = new TextField();

	mfcrsat1a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrsat2a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrsat3a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrsat4a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrsal5a.setFont(new Font("Arial", Font.BOLD, 16));
        mfcrsat1a.setBounds(230, 245, 300, 35);
        mfcrsat2a.setBounds(230, 285, 300, 35);
        mfcrsat3a.setBounds(230, 325, 300, 35);
        mfcrsat4a.setBounds(230, 365, 300, 35);
        mfcrsal5a.setBounds(230, 405, 300, 35);
        mfcrp.add(mfcrsat1a);
        mfcrp.add(mfcrsat2a);
        mfcrp.add(mfcrsat3a);
        mfcrp.add(mfcrsat4a);
       	mfcrp.add(mfcrsal5a);
        mfcrp.add(mfcrtl);
        mfcrp.add(mfcrsidl);
        mfcrp.add(mfcrsl);
        mfcrp.add(mfcrsal1);
        mfcrp.add(mfcrsal2);
        mfcrp.add(mfcrsal3);
        mfcrp.add(mfcrsal4);
        mfcrp.add(mfcrsal5);
        mfcrp.add(mfcrdtl);
        mfcrp.add(mfcrql);
        mfcrp.add(mfcrql1);
        mfcrp.add(mfctl);
        mfcrp.add(mfcrsidt);
        mfcrp.add(mfcrst);
        mfcrp.add(mfcrdtt);
        mfcrp.add(mfcrqt);
        mfcrp.add(mfctt);
        mfcrp.add(mfcrgb);
        mfcrp.add(mfcrsb);
        mfcrp.add(mfcreb);
        mfcrp.setVisible(false);
        bgl.add(mfcrp);

	mfcrgb.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){
	    try
	      {	
		String id = mfcrsidt.getText();
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection conn = null;
      		String query="SELECT * FROM SUPPLIER WHERE ID="+id;
      		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String sname=rs.getString(2);
		String doorno=rs.getString(3);
		String a_name=rs.getString(4);
		String c_name=rs.getString(5);
		String pincode=rs.getString(6);
		String conno=rs.getString(7);

        	mfcrst.setText(sname);
        	mfcrsat1a.setText(doorno);
       		mfcrsat2a.setText(a_name);
       	 	mfcrsat3a.setText(c_name);
        	mfcrsat4a.setText(pincode);
        	mfcrsal5a.setText(conno);

	       }
	    catch(Exception en)
	      {
		System.out.println("Exception occured while fetching supplier details");
	      }
             
             }
 	  });

        mfcrsb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
      		String crdt=mfcrdtt.getText();
     		String sidno=mfcrsidt.getText();
      		String suname=mfcrst.getText();
     		String rqt=mfcrqt.getText();
		String ct=mfctt.getSelectedItem();
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";

      		try
      			{
      			Connection conn = null;
             		conn = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query3="select max(crn) from canreceipt";
             		Statement st=conn.createStatement();
            		 ResultSet rs=st.executeQuery(query3);
             		rs.next();
             		int crn=rs.getInt(1);
             		crn=crn+1;
            		String query4="insert into canreceipt values(?,?,?,?,?,?)";
             		PreparedStatement pst=conn.prepareStatement(query4);
             		pst.setInt(1,crn);
             		pst.setString(2,crdt);
             		pst.setString(3,sidno);
            		pst.setString(4,suname);
             		pst.setString(5,rqt);
             		pst.setString(6,ct);
             		int rows=pst.executeUpdate();
             		if(rows==1)
             			{
                		JOptionPane.showMessageDialog(null,"Record Inserted Successfully!");
             			}
             			else
             			{
                		  JOptionPane.showMessageDialog(null,"Not Inserted Successfully!");
             			}
			//String ctf=mfctt.getSelectedItem();
             		if(mfctt.getSelectedItem()=="Filled Can"){
      			Connection conn8 = null;
			conn8 = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query8="select max(Ecs_Slno) from ecstock";
             		Statement st8=conn8.createStatement();
            		ResultSet rs8=st8.executeQuery(query8);
			int Ecs_Slno=0;
             		if (rs8.next()){
             		Ecs_Slno=rs8.getInt(1);
			if(rs8.wasNull()){Ecs_Slno=0;}}

             		int Ecs_Slno2=Ecs_Slno+1;
      			Connection conn8a = null;
			conn8a = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query8a="select Ecd_Balance from ecstock order by Ecd_Balance desc";
             		Statement st8a=conn8a.createStatement();
            		ResultSet rs8a=st8a.executeQuery(query8a);
			int Ecd_Balance2=0;
             		if (rs8a.next()){
             		Ecd_Balance2=rs8a.getInt(1);
			if(rs8a.wasNull()){Ecd_Balance2=0;}}

      			Connection conn8a1 = null;
			conn8a1 = DriverManager.getConnection(DB_URL,USER,PASS);
            		String query9="insert into ecstock values(?,?,?,?,?,?,?)";
             		PreparedStatement pst8=conn8a1.prepareStatement(query9);
             		pst8.setInt(1,Ecs_Slno2);
             		pst8.setString(2,crdt);
             		pst8.setInt(3,0);
             		pst8.setInt(4,0);
             		pst8.setInt(5,crn);
             		pst8.setString(6,rqt);
			int rqt1 = Integer.parseInt(rqt);
			int Bal = Ecd_Balance2-rqt1;
             		pst8.setInt(7,Bal);
             		pst8.executeUpdate();
			//-----
      			Connection conn8f = null;
			conn8f = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query8f="select max(Fcs_Slno) from fcstock";
             		Statement st8f=conn8f.createStatement();
            		ResultSet rs8f=st8f.executeQuery(query8f);
			int Fcs_Slno=0;
             		if(rs8f.next()){
             		Fcs_Slno=rs8f.getInt(1);
			if(rs8f.wasNull()){Fcs_Slno=0;}}
             		int Fcs_Slno2=Fcs_Slno+1;

      			Connection conn8fa = null;
			conn8fa = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query8fa="select Fcd_Balance from fcstock order by Fcd_Balance desc";
             		Statement st8fa=conn8fa.createStatement();
            		ResultSet rs8fa=st8fa.executeQuery(query8fa);
			int Fcd_Balance2=0;
             		if (rs8fa.next()){
             		Fcd_Balance2=rs8fa.getInt(1);
			if(rs8fa.wasNull()){Fcd_Balance2=0;}}

      			Connection conn8fa1 = null;
			conn8fa1 = DriverManager.getConnection(DB_URL,USER,PASS);
            		String query9f1="insert into fcstock values(?,?,?,?,?,?,?)";
             		PreparedStatement pst8f=conn8fa1.prepareStatement(query9f1);
             		pst8f.setInt(1,Fcs_Slno2);
             		pst8f.setString(2,crdt);
             		pst8f.setInt(3,crn);
             		pst8f.setString(4,rqt);
             		pst8f.setInt(5,0);
             		pst8f.setInt(6,0);
			int rqt2 = Integer.parseInt(rqt);
			int Bal3 = Fcd_Balance2+rqt2;
             		pst8f.setInt(7,Bal3);
             		pst8f.executeUpdate();

			}
             		if(mfctt.getSelectedItem()=="Empty Can"){
			//String cte = mfctt.getSelectedItem();
			//if(cte.equals("Empty Can")){
			Connection conn9a = null;
			conn9a = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query9a="select max(Ecs_Slno) from ecstock";
             		Statement st9a=conn9a.createStatement();
            		ResultSet rs9a=st9a.executeQuery(query9a);
			int Ecs_Slno=0;
             		if (rs9a.next()){
             		Ecs_Slno=rs9a.getInt(1);
			if(rs9a.wasNull()){Ecs_Slno=0;}}

             		int Ecs_Slno3=Ecs_Slno+1;
      			Connection conn8b = null;
			conn8b = DriverManager.getConnection(DB_URL,USER,PASS);
             		String query8b="select Ecd_Balance from ecstock order by Ecd_Balance desc";
             		Statement st8b=conn8b.createStatement();
            		ResultSet rs8b=st8b.executeQuery(query8b);
			int Ecd_Balance3=0;
             		if (rs8b.next()){
             		Ecd_Balance3=rs8b.getInt(1);
			if(rs8b.wasNull()){Ecd_Balance3=0;}}

      			Connection conn8c = null;
			conn8c = DriverManager.getConnection(DB_URL,USER,PASS);
            		String query9c="insert into ecstock values(?,?,?,?,?,?,?)";
             		PreparedStatement pst8=conn8c.prepareStatement(query9c);
             		pst8.setInt(1,Ecs_Slno3);
             		pst8.setString(2,crdt);
             		pst8.setInt(3,crn);
             		pst8.setString(4,rqt);
             		pst8.setInt(5,0);
             		pst8.setInt(6,0);
			int rqt1 = Integer.parseInt(rqt);
			int Bal = Ecd_Balance3+rqt1;
             		pst8.setInt(7,Bal);
             		pst8.executeUpdate();
			}

				mfcrnt.setText("");
        			mfcrsidt.setText("");
        			mfcrst.setText("");
        			mfcrsat1a.setText("");
       				mfcrsat2a.setText("");
        			mfcrsat3a.setText("");
        			mfcrsat4a.setText("");
        			mfcrsal5a.setText("");
        			mfcrqt.setText("");
 
            		}
             		catch(Exception e6)
             		   { 
                		System.out.println(e6);    
             		   }
			
		      }
       	  });

        //Alter - Can Receipts Entries Menu settings...

        JLabel mfcrap = new JLabel();
        mfcrap.setOpaque(true);
        mfcrap.setBackground(new Color(10,10,100,100));

        Label mfcratl;
        JLabel mfcrasl,mfcrasidl,mfcranl,mfcradtl,mfcraql,mfcraql1,mfcrasal1,mfcrasal2,mfcrasal3,mfcrasal4,mfcrasal5,mfctal;
        TextField mfcrasidt,mfcrast,mfcrant,mfcradtt,mfcraqt,mfcrasat1,mfcrasal2a,mfcrasal3a,mfcrasal4a,mfcrasal5a,mfctta;
        Button mfcragb1,mfcragb2,mfcraub,mfcraeb;

        mfcratl = new Label("    Alteration - Filled Can Receipts Entries ");
        mfcrasidl = new JLabel("Supplier ID No. :");
        mfcrasl = new JLabel("Supplier Name :");
        mfcrasal1 = new JLabel("Door/Flat No.:");
        mfcrasal2 = new JLabel("Area,Street Name:");
        mfcrasal3 = new JLabel("City Name:");
        mfcrasal4 = new JLabel("PIN Code:");
        mfcrasal5 = new JLabel("Contact Nos.:");
        mfcranl = new JLabel("Can Receipt No. :");
        mfcradtl = new JLabel("Receipt Date :");
        mfcraql = new JLabel("Received Quantity:");
        mfcraql1 = new JLabel("Nos.");
	mfctal = new JLabel("Can Type :");

        mfcratl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcratl.setBackground(new Color(10,10,10));
        mfcrasidl.setForeground(Color.WHITE);
        mfcratl.setForeground(Color.WHITE);
        mfcrasl.setForeground(Color.WHITE);

        mfcrasal1.setForeground(Color.WHITE);
        mfcrasal2.setForeground(Color.WHITE);
        mfcrasal3.setForeground(Color.WHITE);
        mfcrasal4.setForeground(Color.WHITE);
        mfcrasal5.setForeground(Color.WHITE);

        mfcranl.setForeground(Color.WHITE);
        mfcradtl.setForeground(Color.WHITE);
        mfcraql.setForeground(Color.WHITE);
        mfcraql1.setForeground(Color.WHITE);
        mfctal.setForeground(Color.WHITE);

        mfcrasidl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrasl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrasal1.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrasal2.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrasal3.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrasal4.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrasal5.setFont(new Font("Arial", Font.BOLD, 18));
        mfcranl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcradtl.setFont(new Font("Arial", Font.BOLD, 18));
        mfcraql.setFont(new Font("Arial", Font.BOLD, 18));
        mfcraql1.setFont(new Font("Arial", Font.BOLD, 18));
        mfctal.setFont(new Font("Arial", Font.BOLD, 18));

        mfcratl.setBounds(50, 20, 490, 40);
        mfcrasidl.setBounds(50, 155, 170, 50);
        mfcrasl.setBounds(50, 195, 170, 50);
        mfcrasal1.setBounds(50, 235, 170, 50);
        mfcrasal2.setBounds(50, 275, 170, 50);
        mfcrasal3.setBounds(50, 315, 170, 50);
        mfcrasal4.setBounds(50, 355, 170, 50);
        mfcrasal5.setBounds(50, 395, 170, 50);

        mfcranl.setBounds(50, 80, 170, 50);
        mfcradtl.setBounds(50, 120, 170, 50);
        mfcraql.setBounds(50, 435, 180, 50);
        mfcraql1.setBounds(355, 435, 40, 50);
        mfctal.setBounds(50, 475, 180, 50);

	mfcrant = new TextField();
	mfcradtt = new TextField();
        mfcrasidt = new TextField();
        mfcrast = new TextField();
	mfcraqt = new TextField();
	mfctta = new TextField();
	mfctta.setEditable(false);

        mfcrasidt.setFont(new Font("Arial", Font.BOLD, 18));
        mfcrast.setFont(new Font("Arial", Font.BOLD, 18));
	mfcrant.setFont(new Font("Arial", Font.BOLD, 18));
	mfcradtt.setFont(new Font("Arial", Font.BOLD, 18));
	mfcraqt.setFont(new Font("Arial", Font.BOLD, 18));
	mfctta.setFont(new Font("Arial", Font.BOLD, 18));

	mfcrant.setBounds(230, 80, 180, 35);
	mfcradtt.setBounds(230, 120, 180, 35);
        mfcrasidt.setBounds(230, 160, 100, 35);
        mfcrast.setBounds(230, 200, 330, 35);
	mfcraqt.setBounds(230, 445, 120, 35);
	mfctta.setBounds(230, 485, 150, 35);

        mfcragb1 = new Button("<--Get details");
        mfcragb2 = new Button("<--Get details");
        mfcraub = new Button("Update");
        mfcraeb = new Button("Back");
        mfcragb1.setFont(new Font("Arial", Font.BOLD, 18));
        mfcragb2.setFont(new Font("Arial", Font.BOLD, 18));
        mfcraub.setFont(new Font("Arial", Font.BOLD, 18));
        mfcraeb.setFont(new Font("Arial", Font.BOLD, 18));
        mfcragb1.setBounds(415, 80, 120, 38);
        mfcragb2.setBounds(335, 160, 120, 38);
        mfcraub.setBounds(150, 560, 100, 50);
        mfcraeb.setBounds(300, 560, 100, 50);

        mfcrasat1 = new TextField();
       	mfcrasal2a = new TextField();
        mfcrasal3a = new TextField();
        mfcrasal4a = new TextField();
        mfcrasal5a = new TextField();

	mfcrasat1.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrasal2a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrasal3a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrasal4a.setFont(new Font("Arial", Font.BOLD, 16));
	mfcrasal5a.setFont(new Font("Arial", Font.BOLD, 16));

        mfcrasat1.setBounds(230, 245, 300, 35);
        mfcrasal2a.setBounds(230, 285, 300, 35);
        mfcrasal3a.setBounds(230, 325, 300, 35);
        mfcrasal4a.setBounds(230, 365, 300, 35);
        mfcrasal5a.setBounds(230, 405, 300, 35);

        mfcrap.add(mfcrasat1);
        mfcrap.add(mfcrasal2a);
        mfcrap.add(mfcrasal3a);
        mfcrap.add(mfcrasal4a);
       	mfcrap.add(mfcrasal5a);

        mfcrap.add(mfcratl);
        mfcrap.add(mfcrasidl);
        mfcrap.add(mfcrasl);
        mfcrap.add(mfcrasal1);
        mfcrap.add(mfcrasal2);
        mfcrap.add(mfcrasal3);
        mfcrap.add(mfcrasal4);
        mfcrap.add(mfcrasal5);

        mfcrap.add(mfcranl);
        mfcrap.add(mfcradtl);
        mfcrap.add(mfcraql);
        mfcrap.add(mfcraql1);
        mfcrap.add(mfctal);

        mfcrap.add(mfcrasidt);
        mfcrap.add(mfcrast);
        mfcrap.add(mfcrant);
        mfcrap.add(mfcradtt);
        mfcrap.add(mfcraqt);
        mfcrap.add(mfctta);

        mfcrap.add(mfcragb1);
        mfcrap.add(mfcragb2);
        mfcrap.add(mfcraub);
        mfcrap.add(mfcraeb);
        mfcrap.setVisible(false);
        bgl.add(mfcrap);

	mfcragb1.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){

	try
	      {	
		String crn1 = mfcrant.getText();
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection conn6 = null;
      		String query6="SELECT * FROM canreceipt WHERE crn="+crn1;
      		conn6 = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st6=conn6.createStatement();
		ResultSet rs6=st6.executeQuery(query6);
		rs6.next();
		String crd=rs6.getString(2);
		String sid=rs6.getString(3);
		String s_name=rs6.getString(4);
		String rq=rs6.getString(5);
		String cty=rs6.getString(6);

        	mfcradtt.setText(crd);
       		mfcrasidt.setText(sid);
       	 	mfcrast.setText(s_name);
        	mfcraqt.setText(rq);
        	mfctta.setText(cty);

	       }
	    catch(Exception ee)
	      {
		System.out.println("Exception occured while fetching supplier details");
	      }
             
             }
 	  });

	mfcragb2.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){
	    try
	      {	
		String id = mfcrasidt.getText();
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection conn = null;
      		String query="SELECT * FROM SUPPLIER WHERE ID="+id;
      		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String sname2=rs.getString(2);
		String doorno2=rs.getString(3);
		String a_name2=rs.getString(4);
		String c_name2=rs.getString(5);
		String pincode2=rs.getString(6);
		String conno2=rs.getString(7);

        	mfcrast.setText(sname2);
        	mfcrasat1.setText(doorno2);
       		mfcrasal2a.setText(a_name2);
       	 	mfcrasal3a.setText(c_name2);
        	mfcrasal4a.setText(pincode2);
        	mfcrasal5a.setText(conno2);

	       }
	    catch(Exception en)
	      {
		//System.out.println("Exception occured while fetching supplier details");
	      }
             
             }
 	  });

        mfcraub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

             final String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
             final String USER="root";
             final String PASS="Aravind2005@";

             Connection conn7 = null;
             Connection conn7fc = null;
             Connection conn7ec = null;

             try
             {
		final int ucrn=Integer.parseInt(mfcrant.getText());

        	final String ucrd=mfcradtt.getText();
        	final String usid=mfcrasidt.getText();
        	final String us_name=mfcrast.getText();
        	final String urq=mfcraqt.getText();
        	final String uct=mfctta.getText();

             conn7 = DriverManager.getConnection(DB_URL,USER,PASS);
             PreparedStatement stmt4 = conn7.prepareStatement("update canreceipt"+" set crd=?,sid= ?, s_name=?, rq=?"+"where crn=?");

             stmt4.setString(1,ucrd);
             stmt4.setString(2,usid);
             stmt4.setString(3,us_name);
             stmt4.setString(4,urq);
	     stmt4.setInt(5,ucrn);
             stmt4.executeUpdate();

	     if(uct.equals("Filled Can")){ 
             conn7fc = DriverManager.getConnection(DB_URL,USER,PASS);
             PreparedStatement stmtfc = conn7fc.prepareStatement("update fcstock"+" set Fc_Date=?,Fcr_Qty= ?"+"where Fcr_No=?");
             stmtfc.setString(1,ucrd);
             stmtfc.setString(2,urq);
	     stmtfc.setInt(3,ucrn);
             stmtfc.executeUpdate();

             conn7ec = DriverManager.getConnection(DB_URL,USER,PASS);
             PreparedStatement stmtec = conn7ec.prepareStatement("update ecstock"+" set Ec_Date=?,Ecd_Qty= ?"+"where Ecd_No=?");
             stmtec.setString(1,ucrd);
             stmtec.setString(2,urq);
	     stmtec.setInt(3,ucrn);
             stmtec.executeUpdate();

		}

             JOptionPane.showMessageDialog(null,"Updated Successfully!");
             }
             catch(Exception et)
             { 
                System.out.println(et);    
             }
		  mfcrant.setText("");
        	  mfcradtt.setText("");
        	  mfcrasidt.setText("");
        	  mfcrast.setText("");
        	  mfcraqt.setText("");
        	  mfctta.setText("");
        	  mfcrast.setText("");
        	  mfcrasat1.setText("");
       		  mfcrasal2a.setText("");
       	 	  mfcrasal3a.setText("");
        	  mfcrasal4a.setText("");
        	  mfcrasal5a.setText("");
            }
        
        });

        // Can Delivery Entry Menu settings...

        JLabel mdp = new JLabel();
        mdp.setOpaque(true);
        mdp.setBackground(new Color(10,10,100,100));

        Label mdtl;
        JLabel mdcidl,mdcnl,mdbnl,mdonl,mdbdtl,mddql,mdoql,mdcal1,mdcal2,mdcal3,mdcal4,mdcal5,mdrl,mdal,mdrkl,mdcrql;
        TextField mdont,mdcidt,mdcnt,mdbnt,mddtt,mdoqt,mddqt,mdcat1,mdcat2,mdcat3,mdcat4,mdcat5,mdrt,mdat,mdrkt,mdrtqt;
        Button mdgb,mdsb,mdeb;

        mdtl = new Label("Entry - Filled Can Delivery to Customers");
        //mdbnl = new JLabel("Bill No. :");
        mdbdtl = new JLabel("Bill Date :");
        mdonl = new JLabel("Order No. :");
        mdcidl = new JLabel("Customer ID :");
        mdcnl = new JLabel("Customer Name :");
        mdcal1 = new JLabel("Address :");
        mdcal2 = new JLabel("City :");
        mdcal3 = new JLabel("PIN Code:");
        mdcal4 = new JLabel("Contact Nos.:");
        mdcal5 = new JLabel("e-Mail ID :");
        mddql = new JLabel("Delivery-Quantity:");
        mdoql = new JLabel("Ordered-Quantity:");
        mdrl = new JLabel("Rate Rs.");
        mdal = new JLabel("Amount Rs.");
        mdrkl = new JLabel("Remarks :");
        mdcrql = new JLabel("Can Return-Quantity:");

        mdtl.setFont(new Font("Arial", Font.BOLD, 18));
        mdtl.setBackground(new Color(10,10,10));
        //mdbnl.setForeground(Color.WHITE);
        mdtl.setForeground(Color.WHITE);
        mdcidl.setForeground(Color.WHITE);
        mdcnl.setForeground(Color.WHITE);

        mdcal1.setForeground(Color.WHITE);
        mdcal2.setForeground(Color.WHITE);
        mdcal3.setForeground(Color.WHITE);
        mdcal4.setForeground(Color.WHITE);
        mdcal5.setForeground(Color.WHITE);

        mdonl.setForeground(Color.WHITE);
        mdbdtl.setForeground(Color.WHITE);
        mddql.setForeground(Color.WHITE);
        mdoql.setForeground(Color.WHITE);
        mdrl.setForeground(Color.WHITE);
        mdal.setForeground(Color.WHITE);
        mdrkl.setForeground(Color.WHITE);
        mdcrql.setForeground(Color.WHITE);

        //mdbnl.setFont(new Font("Arial", Font.BOLD, 18));
        mdcidl.setFont(new Font("Arial", Font.BOLD, 18));
        mdcnl.setFont(new Font("Arial", Font.BOLD, 18));
        mdcal1.setFont(new Font("Arial", Font.BOLD, 18));
        mdcal2.setFont(new Font("Arial", Font.BOLD, 18));
        mdcal3.setFont(new Font("Arial", Font.BOLD, 18));
        mdcal4.setFont(new Font("Arial", Font.BOLD, 18));
        mdcal5.setFont(new Font("Arial", Font.BOLD, 18));
        mdonl.setFont(new Font("Arial", Font.BOLD, 18));
        mdbdtl.setFont(new Font("Arial", Font.BOLD, 18));
        mddql.setFont(new Font("Arial", Font.BOLD, 18));
        mdoql.setFont(new Font("Arial", Font.BOLD, 18));
        mdrl.setFont(new Font("Arial", Font.BOLD, 18));
        mdal.setFont(new Font("Arial", Font.BOLD, 18));
        mdrkl.setFont(new Font("Arial", Font.BOLD, 18));
        mdcrql.setFont(new Font("Arial", Font.BOLD, 18));

        mdtl.setBounds(50, 20, 490, 30);
        //mdbnl.setBounds(50, 75, 170, 30);
        mdbdtl.setBounds(50, 110, 170, 30);
        mdonl.setBounds(50, 145, 170, 30);
        mdcidl.setBounds(50, 180, 170, 30);
        mdcnl.setBounds(50, 215, 170, 30);
        mdcal1.setBounds(50, 250, 170, 30);
        mdcal2.setBounds(50, 285, 170, 30);
        mdcal3.setBounds(50, 320, 170, 30);
        mdcal4.setBounds(50, 355, 170, 30);
        mdcal5.setBounds(50, 390, 170, 30);

        mdoql.setBounds(50, 425, 180, 30);
        mddql.setBounds(50, 460, 180, 30);
        mdrl.setBounds(355, 460, 75, 30);
        mdal.setBounds(50, 495, 150, 30);
        mdrkl.setBounds(50, 530, 150, 30);
        mdcrql.setBounds(50, 565, 190, 30);

	//mdbnt = new TextField();
	mddtt = new TextField();
	LocalDate d2 = LocalDate.now();
        mddtt.setText(d2.toString());	
        mdont = new TextField();
        mdcidt = new TextField();
        mdcnt = new TextField();
        mdcat1 = new TextField();
       	mdcat2 = new TextField();
        mdcat3 = new TextField();
        mdcat4 = new TextField();
        mdcat5 = new TextField();
	mdoqt = new TextField();
	mddqt = new TextField();
	mdrt = new TextField();
	mdat = new TextField();
	mdrkt = new TextField();
	mdrtqt = new TextField();

        mdont.setFont(new Font("Arial", Font.BOLD, 18));
        mdcidt.setFont(new Font("Arial", Font.BOLD, 18));
        mdcnt.setFont(new Font("Arial", Font.BOLD, 18));
	mdcat1.setFont(new Font("Arial", Font.BOLD, 16));
	mdcat2.setFont(new Font("Arial", Font.BOLD, 16));
	mdcat3.setFont(new Font("Arial", Font.BOLD, 16));
	mdcat4.setFont(new Font("Arial", Font.BOLD, 16));
	mdcat5.setFont(new Font("Arial", Font.BOLD, 16));
	//mdbnt.setFont(new Font("Arial", Font.BOLD, 18));
	mddtt.setFont(new Font("Arial", Font.BOLD, 18));
	mddqt.setFont(new Font("Arial", Font.BOLD, 18));
	mdoqt.setFont(new Font("Arial", Font.BOLD, 18));
	mdrt.setFont(new Font("Arial", Font.BOLD, 18));
	mdat.setFont(new Font("Arial", Font.BOLD, 18));
	mdrkt.setFont(new Font("Arial", Font.BOLD, 18));
	mdrtqt.setFont(new Font("Arial", Font.BOLD, 18));

	//mdbnt.setBounds(240, 75, 180, 30);
	mddtt.setBounds(240, 110, 180, 30);
        mdont.setBounds(240, 145, 160, 30);
        mdcidt.setBounds(240, 180, 160, 30);
        mdcnt.setBounds(240, 215, 330, 30);
        mdcat1.setBounds(240, 250, 330, 30);
        mdcat2.setBounds(240, 285, 300, 30);
        mdcat3.setBounds(240, 320, 300, 30);
        mdcat4.setBounds(240, 355, 300, 30);
        mdcat5.setBounds(240, 390, 300, 30);
	mdoqt.setBounds(240, 425, 100, 30);
	mddqt.setBounds(240, 460, 100, 30);
	mdrt.setBounds(440, 460, 60, 30);
	mdat.setBounds(240, 495, 120, 30);
	mdrkt.setBounds(240, 530, 330, 30);
	mdrtqt.setBounds(240, 565, 120, 30);

        mdgb = new Button("<--Get details");
        mdsb = new Button("Save");
        mdeb = new Button("Back");
        mdgb.setFont(new Font("Arial", Font.BOLD, 18));
        mdsb.setFont(new Font("Arial", Font.BOLD, 18));
        mdeb.setFont(new Font("Arial", Font.BOLD, 18));
        mdgb.setBounds(405, 147, 120, 35);
        mdsb.setBounds(150, 610, 100, 40);
        mdeb.setBounds(300, 610, 100, 40);

        mdp.add(mdtl);
        //mdp.add(mdbnl);
        mdp.add(mdcidl);
        mdp.add(mdcnl);
        mdp.add(mdcal1);
        mdp.add(mdcal2);
        mdp.add(mdcal3);
        mdp.add(mdcal4);
        mdp.add(mdcal5);

        mdp.add(mdonl);
        mdp.add(mdbdtl);
        mdp.add(mddql);
        mdp.add(mdoql);
        mdp.add(mdrl);
        mdp.add(mdal);
        mdp.add(mdrkl);
        mdp.add(mdcrql);

        mdp.add(mdont);
        mdp.add(mdcidt);
        mdp.add(mdcnt);
        mdp.add(mdcat1);
        mdp.add(mdcat2);
        mdp.add(mdcat3);
        mdp.add(mdcat4);
        mdp.add(mdcat5);
        //mdp.add(mdbnt);
        mdp.add(mddtt);
        mdp.add(mdoqt);
        mdp.add(mddqt);
        mdp.add(mdrt);
        mdp.add(mdat);
        mdp.add(mdrkt);
        mdp.add(mdrt);
        mdp.add(mdrtqt);

        mdp.add(mdgb);
        mdp.add(mdsb);
        mdp.add(mdeb);

        mdp.setVisible(false);
        bgl.add(mdp);

	mdgb.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){
	    try
	      {	
		String oid3 = mdont.getText();
      		String URL1 = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection cn1 = null;
      		String qry="SELECT * FROM ORDERS WHERE orderno="+oid3;
      		cn1 = DriverManager.getConnection(URL1,USER,PASS);
		Statement stt=cn1.createStatement();
		ResultSet rss=stt.executeQuery(qry);
		rss.next();
		String cid1=rss.getString(1);
		String cname1=rss.getString(2);
		String caddress1=rss.getString(3);
		String ccity1=rss.getString(4);
		String cpincode1=rss.getString(5);
		String cmobileno1=rss.getString(6);
		String cmailid1=rss.getString(7);
		String orderqty1=rss.getString(10);

     		mdcidt.setText(cid1);
     		mdcnt.setText(cname1);
    		mdcat1.setText(caddress1);
     		mdcat2.setText(ccity1);
     		mdcat3.setText(cpincode1);
     		mdcat4.setText(cmobileno1);
     		mdcat5.setText(cmailid1);
     		mdoqt.setText(orderqty1);
     		mddqt.setText(orderqty1);
     		mdrtqt.setText(orderqty1);

	       }
	    catch(Exception et)
	      {
		System.out.println("Exception occured while fetching supplier details");
	      }
             
             }
 	  });

        mdrt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
		int qty=Integer.parseInt(mddqt.getText());
		int rat=Integer.parseInt(mdrt.getText());
		int amt=qty*rat;
		String samt=Integer.toString(amt);
	        mdrtqt.setText(mddqt.getText());
		mdat.setText(samt);
            }
        });

        mmbd.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){

        DefaultTableModel mdlfcd = new DefaultTableModel();
        JTable fcdjt = new JTable(mdlfcd);

        final String URL = "jdbc:mysql://localhost:3306/Aravind";
        final String USER = "root";
        final String PASSWORD = "Aravind2005@";
        String qrfcd = "SELECT * FROM orders";

        mdlfcd.addColumn("Order No."); 
        mdlfcd.addColumn("Order Date");
        mdlfcd.addColumn("Order Qty");
        mdlfcd.addColumn("Customer-ID");
        mdlfcd.addColumn("Customer Name");
        mdlfcd.addColumn("Address"); 
        mdlfcd.addColumn("City");
        mdlfcd.addColumn("Pincode");
        mdlfcd.addColumn("Contact No");
        mdlfcd.addColumn("eMail-ID");

        try (Connection confcd = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stfcd = confcd.prepareStatement(qrfcd);
             ResultSet rsfcd = stfcd.executeQuery()) {

            while (rsfcd.next()) {
                Object[] rowData = new Object[]{
                    rsfcd.getObject("orderno"),
                    rsfcd.getObject("orderdate"),
                    rsfcd.getObject("orderqty"),
                    rsfcd.getObject("cid"), 
                    rsfcd.getObject("cname"), 
                    rsfcd.getObject("caddress"), 
                    rsfcd.getObject("ccity"), 
                    rsfcd.getObject("cpincode"), 
                    rsfcd.getObject("cmobileno"), 
                    rsfcd.getObject("cmailid"),
                };
                mdlfcd.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        fcdjt.setFont(new Font("Arial", Font.BOLD, 14));
        fcdjt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModelfcd = fcdjt.getColumnModel();
	colModelfcd.getColumn(0).setPreferredWidth(80);   
	colModelfcd.getColumn(1).setPreferredWidth(80);  
	colModelfcd.getColumn(2).setPreferredWidth(60);  
	colModelfcd.getColumn(3).setPreferredWidth(80);  
	colModelfcd.getColumn(4).setPreferredWidth(150); 
	colModelfcd.getColumn(5).setPreferredWidth(200); 
	colModelfcd.getColumn(6).setPreferredWidth(100); 
	colModelfcd.getColumn(7).setPreferredWidth(60); 
	colModelfcd.getColumn(8).setPreferredWidth(100); 
	colModelfcd.getColumn(9).setPreferredWidth(250); 

        JScrollPane fcdjsp = new JScrollPane(fcdjt);
        fcdjsp.setBounds(570, 100, 700, 200);
        fcdjsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mdp.add(fcdjsp);


             mmp.setVisible(false); 
             mdp.setBounds(5, 5, 1300, 670);
             mdp.setVisible(true);
	     //mdbnt.setText("");
             mdont.setText("");
             mdcidt.setText("");
             mdcnt.setText("");
             mdcat1.setText("");
       	     mdcat2.setText("");
             mdcat3.setText("");
             mdcat4.setText("");
             mdcat5.setText("");
	     mddqt.setText("");
	     mdrt.setText("");
	     mdat.setText("");
	     mdrtqt.setText("");
             bgl.add(mdp);
            }
        });


        //Alter - Can Delivery Entry Menu settings...

        JLabel madp = new JLabel();
        madp.setOpaque(true);
        madp.setBackground(new Color(10,10,100,100));

        Label madtl;
        JLabel madcidl,madcnl,madbnl,madonl,madbdtl,maddql,madoql,madcal1,madcal2,madcal3,madcal4,madcal5,madrl,madal,madrkl,madcrql;
        TextField madont,madcidt,madcnt,madbnt,maddtt,madoqt,maddqt,madcat1,madcat2,madcat3,madcat4,madcat5,madrt,madat,madrkt,madrtqt;
        Button madgb,madsb,madeb,madbg,madbp,madbm;

        madtl = new Label("Alter - Filled Can Delivery to Customers");
        madbnl = new JLabel("Bill No. :");
        madbdtl = new JLabel("Bill Date :");
        madonl = new JLabel("Order No. :");
        madcidl = new JLabel("Customer ID :");
        madcnl = new JLabel("Customer Name :");
        madcal1 = new JLabel("Address :");
        madcal2 = new JLabel("City :");
        madcal3 = new JLabel("PIN Code:");
        madcal4 = new JLabel("Contact Nos.:");
        madcal5 = new JLabel("e-Mail ID :");
        maddql = new JLabel("Delivery-Quantity:");
        madoql = new JLabel("Ordered-Quantity:");
        madrl = new JLabel("Rate Rs.");
        madal = new JLabel("Amount Rs.");
        madrkl = new JLabel("Remarks :");
        madcrql = new JLabel("Can Return-Quantity:");

        madtl.setFont(new Font("Arial", Font.BOLD, 18));
        madtl.setBackground(new Color(10,10,10));
        madbnl.setForeground(Color.WHITE);
        madtl.setForeground(Color.WHITE);
        madcidl.setForeground(Color.WHITE);
        madcnl.setForeground(Color.WHITE);

        madcal1.setForeground(Color.WHITE);
        madcal2.setForeground(Color.WHITE);
        madcal3.setForeground(Color.WHITE);
        madcal4.setForeground(Color.WHITE);
        madcal5.setForeground(Color.WHITE);

        madonl.setForeground(Color.WHITE);
        madbdtl.setForeground(Color.WHITE);
        maddql.setForeground(Color.WHITE);
        madoql.setForeground(Color.WHITE);
        madrl.setForeground(Color.WHITE);
        madal.setForeground(Color.WHITE);
        madrkl.setForeground(Color.WHITE);
        madcrql.setForeground(Color.WHITE);

        madbnl.setFont(new Font("Arial", Font.BOLD, 18));
        madcidl.setFont(new Font("Arial", Font.BOLD, 18));
        madcnl.setFont(new Font("Arial", Font.BOLD, 18));
        madcal1.setFont(new Font("Arial", Font.BOLD, 18));
        madcal2.setFont(new Font("Arial", Font.BOLD, 18));
        madcal3.setFont(new Font("Arial", Font.BOLD, 18));
        madcal4.setFont(new Font("Arial", Font.BOLD, 18));
        madcal5.setFont(new Font("Arial", Font.BOLD, 18));
        madonl.setFont(new Font("Arial", Font.BOLD, 18));
        madbdtl.setFont(new Font("Arial", Font.BOLD, 18));
        maddql.setFont(new Font("Arial", Font.BOLD, 18));
        madoql.setFont(new Font("Arial", Font.BOLD, 18));
        madrl.setFont(new Font("Arial", Font.BOLD, 18));
        madal.setFont(new Font("Arial", Font.BOLD, 18));
        madrkl.setFont(new Font("Arial", Font.BOLD, 18));
        madcrql.setFont(new Font("Arial", Font.BOLD, 18));

        madtl.setBounds(50, 20, 490, 30);
        madbnl.setBounds(50, 75, 170, 30);
        madbdtl.setBounds(50, 110, 170, 30);
        madonl.setBounds(50, 145, 170, 30);
        madcidl.setBounds(50, 180, 170, 30);
        madcnl.setBounds(50, 215, 170, 30);
        madcal1.setBounds(50, 250, 170, 30);
        madcal2.setBounds(50, 285, 170, 30);
        madcal3.setBounds(50, 320, 170, 30);
        madcal4.setBounds(50, 355, 170, 30);
        madcal5.setBounds(50, 390, 170, 30);

        madoql.setBounds(50, 425, 180, 30);
        maddql.setBounds(50, 460, 180, 30);
        madrl.setBounds(355, 460, 75, 30);
        madal.setBounds(50, 495, 150, 30);
        madrkl.setBounds(50, 530, 150, 30);
        madcrql.setBounds(50, 565, 190, 30);

	madbnt = new TextField();
	maddtt = new TextField();	
        madont = new TextField();
        madcidt = new TextField();
        madcnt = new TextField();
        madcat1 = new TextField();
       	madcat2 = new TextField();
        madcat3 = new TextField();
        madcat4 = new TextField();
        madcat5 = new TextField();
	madoqt = new TextField();
	maddqt = new TextField();
	madrt = new TextField();
	madat = new TextField();
	madrkt = new TextField();
	madrtqt = new TextField();

        madont.setFont(new Font("Arial", Font.BOLD, 18));
        madcidt.setFont(new Font("Arial", Font.BOLD, 18));
        madcnt.setFont(new Font("Arial", Font.BOLD, 18));
	madcat1.setFont(new Font("Arial", Font.BOLD, 16));
	madcat2.setFont(new Font("Arial", Font.BOLD, 16));
	madcat3.setFont(new Font("Arial", Font.BOLD, 16));
	madcat4.setFont(new Font("Arial", Font.BOLD, 16));
	madcat5.setFont(new Font("Arial", Font.BOLD, 16));
	madbnt.setFont(new Font("Arial", Font.BOLD, 18));
	maddtt.setFont(new Font("Arial", Font.BOLD, 18));
	maddqt.setFont(new Font("Arial", Font.BOLD, 18));
	madoqt.setFont(new Font("Arial", Font.BOLD, 18));
	madrt.setFont(new Font("Arial", Font.BOLD, 18));
	madat.setFont(new Font("Arial", Font.BOLD, 18));
	madrkt.setFont(new Font("Arial", Font.BOLD, 18));
	madrtqt.setFont(new Font("Arial", Font.BOLD, 18));

	madbnt.setBounds(240, 75, 180, 30);
	maddtt.setBounds(240, 110, 180, 30);
        madont.setBounds(240, 145, 160, 30);
        madcidt.setBounds(240, 180, 160, 30);
        madcnt.setBounds(240, 215, 330, 30);
        madcat1.setBounds(240, 250, 330, 30);
        madcat2.setBounds(240, 285, 300, 30);
        madcat3.setBounds(240, 320, 300, 30);
        madcat4.setBounds(240, 355, 300, 30);
        madcat5.setBounds(240, 390, 300, 30);
	madoqt.setBounds(240, 425, 100, 30);
	maddqt.setBounds(240, 460, 100, 30);
	madrt.setBounds(440, 460, 60, 30);
	madat.setBounds(240, 495, 120, 30);
	madrkt.setBounds(240, 530, 330, 30);
	madrtqt.setBounds(240, 565, 120, 30);

        madgb = new Button("<--Get details");
        madsb = new Button("Save");
        madeb = new Button("Back");
        madbg = new Button("Generate Bill");
        madbm = new Button("Send e-Mail");
        madbp = new Button("Print");

        madgb.setFont(new Font("Arial", Font.BOLD, 18));
        madsb.setFont(new Font("Arial", Font.BOLD, 18));
        madeb.setFont(new Font("Arial", Font.BOLD, 18));
        madbg.setFont(new Font("Arial", Font.BOLD, 18));
        madbm.setFont(new Font("Arial", Font.BOLD, 18));
        madbp.setFont(new Font("Arial", Font.BOLD, 18));
        madgb.setBounds(420, 77, 120, 35);
        madsb.setBounds(50, 610, 80, 40);
        madeb.setBounds(140, 610, 80, 40);
        madbg.setBounds(230, 610, 130, 40);
        madbm.setBounds(370, 610, 110, 40);
        madbp.setBounds(490, 610, 80, 40);

        madp.add(madtl);
        madp.add(madbnl);
        madp.add(madcidl);
        madp.add(madcnl);
        madp.add(madcal1);
        madp.add(madcal2);
        madp.add(madcal3);
        madp.add(madcal4);
        madp.add(madcal5);

        madp.add(madonl);
        madp.add(madbdtl);
        madp.add(maddql);
        madp.add(madoql);
        madp.add(madrl);
        madp.add(madal);
        madp.add(madrkl);
        madp.add(madcrql);

        madp.add(madont);
        madp.add(madcidt);
        madp.add(madcnt);
        madp.add(madcat1);
        madp.add(madcat2);
        madp.add(madcat3);
        madp.add(madcat4);
        madp.add(madcat5);
        madp.add(madbnt);
        madp.add(maddtt);
        madp.add(madoqt);
        madp.add(maddqt);
        madp.add(madrt);
        madp.add(madat);
        madp.add(madrkt);
        madp.add(madrt);
        madp.add(madrtqt);

        madp.add(madgb);
        madp.add(madsb);
        madp.add(madeb);
        madp.add(madbg);
        madp.add(madbm);
        madp.add(madbp);
	madp.setVisible(false);

        JLabel Billdisplay = new JLabel();
        Billdisplay.setIcon(new ImageIcon("C:\\ARAVIND\\IMAGE\\Bill1.jpg")); 
	Billdisplay.setVisible(false);       

        madbg.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
        	Billdisplay.setBounds(600, 180, 420, 470);
        	madp.add(Billdisplay);
		Billdisplay.setVisible(true);
       		String bn1= madbnt.getText();
       		String bd1= maddtt.getText();
       		String cnm1= madcnt.getText();
       		String cad1= madcat1.getText();
       		String cad2= madcat2.getText();
       		String cad3= madcat3.getText();
       		String cad4= madcat4.getText();
       		String dqt1= maddqt.getText();
       		String drt1= madrt.getText();
       		String dat1= madat.getText();

		JLabel bnl1 = new JLabel(bn1);
		JLabel bdl1 = new JLabel(bd1);
		JLabel cnml1 = new JLabel(cnm1);
		JLabel cad1l = new JLabel(cad1);
		JLabel cad21 = new JLabel(cad2+" - "+cad3+", PH/Mbl.:"+cad4);
		JLabel sln11 = new JLabel("1.");
		JLabel in11 = new JLabel("WATER CANS");
		JLabel dqt11 = new JLabel(dqt1);
		JLabel drt11 = new JLabel(drt1);
		JLabel dat11 = new JLabel("Rs."+dat1);
		JLabel dtat11 = new JLabel("Rs."+dat1);

		bnl1.setFont(new Font("Arial", Font.BOLD, 14));
		bdl1.setFont(new Font("Arial", Font.BOLD, 14));
		cnml1.setFont(new Font("Arial", Font.BOLD, 14));
		cad1l.setFont(new Font("Arial", Font.BOLD, 14));
		cad21.setFont(new Font("Arial", Font.BOLD, 14));
		sln11.setFont(new Font("Arial", Font.BOLD, 14));
		in11.setFont(new Font("Arial", Font.BOLD, 14));
		dqt11.setFont(new Font("Arial", Font.BOLD, 14));
		drt11.setFont(new Font("Arial", Font.BOLD, 14));
		dat11.setFont(new Font("Arial", Font.BOLD, 14));
		dtat11.setFont(new Font("Arial", Font.BOLD, 14));

		bnl1.setBounds(85,110,100,25);
		bdl1.setBounds(330,110,100,20);
		cnml1.setBounds(30,140,200,20);
		cad1l.setBounds(30,170,300,20);
		cad21.setBounds(30,195,300,20);
		sln11.setBounds(45,270,20,20);
		in11.setBounds(80,270,100,20);
		dqt11.setBounds(230,270,40,20);
		drt11.setBounds(265,270,40,20);
		dat11.setBounds(350,270,60,20);
		dtat11.setBounds(350,430,60,20);

		Billdisplay.add(bnl1);
		Billdisplay.add(bdl1);
		Billdisplay.add(cnml1);
		Billdisplay.add(cad1l);
		Billdisplay.add(cad21);
		Billdisplay.add(sln11);
		Billdisplay.add(in11);
		Billdisplay.add(dqt11);
		Billdisplay.add(drt11);
		Billdisplay.add(dat11);
		Billdisplay.add(dtat11);

            }
        }); 

    
    madbp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            PrinterJob printJob = PrinterJob.getPrinterJob();

            // Anonymous Printable implementation
            printJob.setPrintable(new Printable() {
                public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
                    if (pageIndex > 0) {
                        return NO_SUCH_PAGE;
                    }

                    Graphics2D g2d = (Graphics2D) g;
                    g2d.translate(pf.getImageableX(), pf.getImageableY());

                    // Billdisplay should be a JComponent
                    Billdisplay.paint(g2d);

                    return PAGE_EXISTS;
                }
            });

            boolean doPrint = printJob.printDialog();
            if (doPrint) {
                try {
                    printJob.print();
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }
        }
    });


        madp.setVisible(false);
        bgl.add(madp);

	madgb.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e){
	    try
	      {	
		String bno = madbnt.getText();
      		String URL1a = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection cn1a = null;
      		String qrya="SELECT * FROM DELIVERY WHERE Bill_No="+bno;
      		cn1a = DriverManager.getConnection(URL1a,USER,PASS);
		Statement stt1a=cn1a.createStatement();
		ResultSet rss1a=stt1a.executeQuery(qrya);
		rss1a.next();

		//String bno1=rss1a.getString(1);
		String bdate1=rss1a.getString(2);
		String orno1=rss1a.getString(3);
		String cusid1=rss1a.getString(4);
		String cusname1=rss1a.getString(5);
		String cusadd1=rss1a.getString(6);
		String cuscity1=rss1a.getString(7);
		String cuspin1=rss1a.getString(8);
		String cusconno1=rss1a.getString(9);
		String cusmail1=rss1a.getString(10);
		String oqty1a=rss1a.getString(11);
		String dqty1a=rss1a.getString(12);
		String rt1a=rss1a.getString(13);
		String amt1a=rss1a.getString(14);
		String rkt1a=rss1a.getString(15);
		String rtqty1a=rss1a.getString(16);

		 //madbnt.setText(bno1);
		 maddtt.setText(bdate1);
        	 madont.setText(orno1);
        	 madcidt.setText(cusid1);
        	 madcnt.setText(cusname1);
        	 madcat1.setText(cusadd1);
        	 madcat2.setText(cuscity1);
        	 madcat3.setText(cuspin1);
        	 madcat4.setText(cusconno1);
        	 madcat5.setText(cusmail1);
		 madoqt.setText(oqty1a);
		 maddqt.setText(dqty1a);
		 madrt.setText(rt1a);
		 madat.setText(amt1a);
		 madrkt.setText(rkt1a);
		 madrtqt.setText(rtqty1a);
            	 //JLabel Billnol = new JLabel("Bill No. : "+bno);
		 //Billdisplay.add(Billno1);
	       }
	    catch(Exception et)
	      {
		System.out.println("Exception occured while fetching delivery details");
	      }
             
             }
 	  });

        mmbda.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        DefaultTableModel mdl3a = new DefaultTableModel();
        JTable masjt4a = new JTable(mdl3a);

        final String URL = "jdbc:mysql://localhost:3306/Aravind";
        final String USER = "root";
        final String PASSWORD = "Aravind2005@";
        String qr3a = "SELECT * FROM delivery";

        // Set up table columns
        mdl3a.addColumn("Bill No."); 
        mdl3a.addColumn("Bill Date"); 
        mdl3a.addColumn("Order No."); 
        mdl3a.addColumn("Cust-ID"); 
        mdl3a.addColumn("Customer Name");
        mdl3a.addColumn("Address"); 
        mdl3a.addColumn("City");
        mdl3a.addColumn("Pincode");
        mdl3a.addColumn("Contact No");
        mdl3a.addColumn("eMail-ID");
        mdl3a.addColumn("Order Qty");
        mdl3a.addColumn("Delivery Qty");
        mdl3a.addColumn("Rate");
        mdl3a.addColumn("Amount");
        mdl3a.addColumn("Remarks");
        mdl3a.addColumn("Returned Can Qty");

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stm3a = connection.prepareStatement(qr3a);
             ResultSet rst3a = stm3a.executeQuery()) {

            while (rst3a.next()) {
                Object[] rowData = new Object[]{
                    rst3a.getObject("Bill_No"), 
                    rst3a.getObject("Bill_Date"), 
                    rst3a.getObject("Order_No"), 
                    rst3a.getObject("Cust_ID"), 
                    rst3a.getObject("Cust_Name"), 
                    rst3a.getObject("Address"), 
                    rst3a.getObject("City"), 
                    rst3a.getObject("Pincode"),
                    rst3a.getObject("contact_no"),
                    rst3a.getObject("eMail_ID"),
                    rst3a.getObject("Order_Qty"),
                    rst3a.getObject("Delivery_Qty"),
                    rst3a.getObject("Rate"),
                    rst3a.getObject("Amount"),
                    rst3a.getObject("Remarks"),
                    rst3a.getObject("Can_Returned_Qty")
                };
                mdl3a.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        masjt4a.setFont(new Font("Arial", Font.BOLD, 14));
        masjt4a.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModel = masjt4a.getColumnModel();
	colModel.getColumn(0).setPreferredWidth(50);   // Bill No.
	colModel.getColumn(1).setPreferredWidth(80);  // Bill Date
	colModel.getColumn(2).setPreferredWidth(60);   // Order No.
	colModel.getColumn(3).setPreferredWidth(50);   // Cust-ID
	colModel.getColumn(4).setPreferredWidth(150);  // Customer Name
	colModel.getColumn(5).setPreferredWidth(200);  // Address
	colModel.getColumn(6).setPreferredWidth(100);  // City
	colModel.getColumn(7).setPreferredWidth(60);  // Pincode
	colModel.getColumn(8).setPreferredWidth(100);  // Contact No.
	colModel.getColumn(9).setPreferredWidth(250);  // Email
	colModel.getColumn(10).setPreferredWidth(70);  // OrderQty
	colModel.getColumn(11).setPreferredWidth(80);  // DeliveryQty
	colModel.getColumn(12).setPreferredWidth(30);  // Rate
	colModel.getColumn(13).setPreferredWidth(50);  // Amount
	colModel.getColumn(14).setPreferredWidth(100);  // Remarks
	colModel.getColumn(15).setPreferredWidth(120);  // CanReturnQty

        JScrollPane masjsp4a = new JScrollPane(masjt4a);
        masjsp4a.setBounds(570, 30, 720, 130);
        masjsp4a.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        madp.add(masjsp4a);

        mmp.setVisible(false);
        madp.setVisible(true);

        // Clear input fields
        madbnt.setText("");
        madont.setText("");
        madcidt.setText("");
        madcnt.setText("");
        madcat1.setText("");
        madcat2.setText("");
        madcat3.setText("");
        madcat4.setText("");
        madcat5.setText("");
        maddqt.setText("");
        madrt.setText("");
        madat.setText("");
        madrtqt.setText("");

        bgl.add(madp);
        madp.setBounds(5, 5, 1300, 670);
    }
});

        madbm.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){

	final String username = "gracewatersupplies@gmail.com"; // Sender's email
        final String password = "rdgr rfus vtdt wosh"; // Sender's email password

        // Set up the email server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a session with authentication
        Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

        try {
            // Create a default MimeMessage object.
	    String Tomail = madcat5.getText();
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); // From email
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Tomail)); // To email
            message.setSubject("Bill for Water Can Delivery"); // Email subject
	    String content = "Hello Mr/Ms."+madcnt.getText()+"\n"+"Thank you for your Valuable Order of Water Cans - "+maddqt.getText()+"Nos., Rate Rs.:"+madrt.getText()+" & Total Amount Rs."+madat.getText()+"."+"\n"+" Please Contact us again for our best services"+"\n"+"Best Regards"+"\n"+"Grace Water Supplies"; 
            message.setText(content); // Email body
            String emailid = madcat5.getText(); 
		//sendEmail(emailid,Subject,content);        

            // Send the message
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Email sent successfully!");

        } catch (MessagingException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to send email: " + ex.getMessage());
        }

            }
        }); 


	madsb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

             final String DB_URL3 = "jdbc:mysql://localhost:3306/Aravind";
             final String USER3="root";
             final String PASS3="Aravind2005@";

             Connection cn7a = null;
             Connection cfcd = null;
             Connection cecd = null;

             try
             {
		final int ubno=Integer.parseInt(madbnt.getText());

		 final String ubdate = maddtt.getText();
        	 final String uorno = madont.getText();
        	 final String ucusid = madcidt.getText();
        	 final String ucusname = madcnt.getText();
        	 final String ucusadd = madcat1.getText();
        	 final String ucuscity = madcat2.getText();
        	 final String ucuspin = madcat3.getText();
        	 final String ucusconno = madcat4.getText();
        	 final String ucusmail = madcat5.getText();
		 final String uoqty = madoqt.getText();
		 final String udqty = maddqt.getText();
		 final String urt = madrt.getText();
		 final String uamt = madat.getText();
		 final String urk = madrkt.getText();
		 final String urtqty = madrtqt.getText();


             cn7a = DriverManager.getConnection(DB_URL3,USER3,PASS3);

             PreparedStatement stmt4a = cn7a.prepareStatement("update delivery"+" set Bill_Date=?,Order_No= ?,Cust_ID=?,Cust_Name=?, Address=?,City=?,Pincode=?, contact_no=?,eMail_ID=?,Order_Qty =?, Delivery_Qty=?,Rate=?,Amount=?,Remarks=?,Can_Returned_Qty=? "+"where Bill_No=?");

             stmt4a.setString(1,ubdate);
             stmt4a.setString(2,uorno);
             stmt4a.setString(3,ucusid);
             stmt4a.setString(4,ucusname);
             stmt4a.setString(5,ucusadd);
             stmt4a.setString(6,ucuscity);
             stmt4a.setString(7,ucuspin);
             stmt4a.setString(8,ucusconno);
             stmt4a.setString(9,ucusmail);
             stmt4a.setString(10,uoqty);
             stmt4a.setString(11,udqty);
             stmt4a.setString(12,urt);
             stmt4a.setString(13,uamt);
             stmt4a.setString(14,urk);
	     stmt4a.setString(15,urtqty);
	     stmt4a.setInt(16,ubno);
             stmt4a.executeUpdate();

             cfcd = DriverManager.getConnection(DB_URL3,USER3,PASS3);
             PreparedStatement stmtfcd = cfcd.prepareStatement("update fcstock"+" set Fc_Date=?,Fcd_Qty= ?"+"where Fcd_No=?");
             stmtfcd.setString(1,ubdate);
             stmtfcd.setString(2,udqty);
	     stmtfcd.setInt(3,ubno);
             stmtfcd.executeUpdate();

             cecd = DriverManager.getConnection(DB_URL3,USER3,PASS3);
             PreparedStatement stmtecd = cecd.prepareStatement("update ecstock"+" set Ec_Date=?,Ecr_Qty= ?"+"where Ecr_No=?");
             stmtecd.setString(1,ubdate);
             stmtecd.setString(2,urtqty);
	     stmtecd.setInt(3,ubno);
             stmtecd.executeUpdate();

             JOptionPane.showMessageDialog(null,"Updated Successfully!");
             }
             catch(Exception eta)
             { 
                System.out.println(eta);    
             }
		madbnt.setText("");
		maddtt.setText("");
		madont.setText("");
		madcidt.setText("");
		madcnt.setText("");
		madcat1.setText("");
		madcat2.setText("");
		madcat3.setText("");
		madcat4.setText("");
		madcat5.setText("");
		madoqt.setText("");
		maddqt.setText("");
		madrt.setText("");
		madat.setText("");
		madrkt.setText("");
		madrtqt.setText("");

            }
        
        });

        madeb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
	     Billdisplay.setVisible(false);
             madp.setVisible(false); 
             mmp.setVisible(true); 
            }
        }); 

        mdeb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
             mdp.setVisible(false); 
             mmp.setVisible(true); 
            }
        }); 

        mdsb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		String billdate = mddtt.getText();
        	String ordernum=mdont.getText();
        	String customerid=mdcidt.getText();
        	String custname=mdcnt.getText();
        	String cusadd=mdcat1.getText();
        	String cuscity=mdcat2.getText();
        	String cuspin=mdcat3.getText();
        	String cuscont=mdcat4.getText();
        	String cusemail=mdcat5.getText();
		String orderqty=mdoqt.getText();
		String delivqty=mddqt.getText();
		String crate=mdrt.getText();
		String camount=mdat.getText();
		String remark=mdrkt.getText();
		String ecrqty=mdrtqt.getText();

      		String DB_URL3 = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		try
      			{
      			Connection conn11 = null;
      			Connection conn12 = null;
      			Connection conn12a = null;
      			Connection conn12b = null;
      			Connection conn13 = null;
      			Connection conn13a = null;
      			Connection conn13b = null;
			Connection conn_d = null;

             		conn11 = DriverManager.getConnection(DB_URL3,USER,PASS);
             		String qd="select max(Bill_No) from delivery";
             		Statement std=conn11.createStatement();
            		 ResultSet rsd=std.executeQuery(qd);
             		rsd.next();
             		int Bill_No=rsd.getInt(1);
             		Bill_No=Bill_No+1;
            		String qd4="insert into delivery values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             		PreparedStatement pstd=conn11.prepareStatement(qd4);
             		pstd.setInt(1,Bill_No);
             		pstd.setString(2,billdate);
             		pstd.setString(3,ordernum);
            		pstd.setString(4,customerid);
             		pstd.setString(5,custname);
             		pstd.setString(6,cusadd);
             		pstd.setString(7,cuscity);
             		pstd.setString(8,cuspin);
             		pstd.setString(9,cuscont);
             		pstd.setString(10,cusemail);
             		pstd.setString(11,orderqty);
             		pstd.setString(12,delivqty);
             		pstd.setString(13,crate);
             		pstd.setString(14,camount);
             		pstd.setString(15,remark);
             		pstd.setString(16,ecrqty);

             		int rows=pstd.executeUpdate();
             		if(rows==1)
             			{
                		JOptionPane.showMessageDialog(null,"Record Inserted Successfully!");
             			}
             			else
             			{
                		  JOptionPane.showMessageDialog(null,"Not Inserted Successfully!");
             			}
             		conn12 = DriverManager.getConnection(DB_URL3,USER,PASS);
             		String qd12="select max(Ecs_Slno) from ecstock";
             		Statement st12=conn12.createStatement();
            		ResultSet rs12=st12.executeQuery(qd12);
             		rs12.next();
             		int Ecs_Slno1=rs12.getInt(1);
             		int Ecs_Slno=Ecs_Slno1+1;

             		conn12a = DriverManager.getConnection(DB_URL3,USER,PASS);
             		String qd12a="select Ecd_Balance from ecstock order by Ecd_Balance desc";
             		Statement st12a=conn12.createStatement();
            		ResultSet rs12a=st12a.executeQuery(qd12a);
			int Ecd_Balance1=0;
             		if (rs12a.next()){
             		Ecd_Balance1=rs12a.getInt(1);
			if(rs12a.wasNull()){Ecd_Balance1=0;}}

             		conn12b = DriverManager.getConnection(DB_URL3,USER,PASS);
            		String qd13="insert into ecstock values(?,?,?,?,?,?,?)";
             		PreparedStatement pst12=conn12b.prepareStatement(qd13);
             		pst12.setInt(1,Ecs_Slno);
             		pst12.setString(2,billdate);
             		pst12.setInt(3,Bill_No);
			int ecrqty1 = Integer.parseInt(ecrqty);
             		pst12.setInt(4,ecrqty1);
             		pst12.setInt(5,0);
             		pst12.setInt(6,0);
			int Bal = Ecd_Balance1+ecrqty1;
             		pst12.setInt(7,Bal);
             		pst12.executeUpdate();
				
             		conn13 = DriverManager.getConnection(DB_URL3,USER,PASS);
             		String qd14="select max(Fcs_Slno) from fcstock";
             		Statement st13=conn13.createStatement();
            		ResultSet rs13=st13.executeQuery(qd14);
			int Fcs_Slno=0;
             		if(rs13.next()){
             		Fcs_Slno=rs13.getInt(1);
			if(rs13.wasNull()){Fcs_Slno=0;}}

             		Fcs_Slno=Fcs_Slno+1;
             		conn13a = DriverManager.getConnection(DB_URL3,USER,PASS);
             		String qd14a="select Fcd_Balance from fcstock order by Fcd_Balance desc";
             		Statement st13a=conn13a.createStatement();
            		ResultSet rs13a=st13a.executeQuery(qd14);
			int Fcd_Balance1=0;
             		if (rs13a.next()){
             		Fcd_Balance1=rs13a.getInt(1);
			if(rs13a.wasNull()){Fcd_Balance1=0;}}

             		conn13b = DriverManager.getConnection(DB_URL3,USER,PASS);
            		String qd15="insert into fcstock values(?,?,?,?,?,?,?)";
             		PreparedStatement pst13=conn13b.prepareStatement(qd15);
             		pst13.setInt(1,Fcs_Slno);
             		pst13.setString(2,billdate);
             		pst13.setInt(3,0);
             		pst13.setInt(4,0);
             		pst13.setInt(5,Bill_No);
             		pst13.setString(6,delivqty);
			int delivqty1 = Integer.parseInt(delivqty);
			int Bal2 = Fcd_Balance1-delivqty1;
             		pst13.setInt(7,Bal2);
             		pst13.executeUpdate();

			String ordno =  mdont.getText();
             		conn_d = DriverManager.getConnection(DB_URL3,USER,PASS);
             		String qy_d="delete from orders where orderno= "+ordno;
             		Statement stm_d=conn_d.createStatement();
            		stm_d.executeUpdate(qy_d);

		 		mddtt.setText("");
        	 		mdont.setText("");
        			mdcidt.setText("");
        		 	mdcnt.setText("");
        	 		mdcat1.setText("");
        	 		mdcat2.setText("");
        	 		mdcat3.setText("");
        	 		mdcat4.setText("");
        	 		mdcat5.setText("");
		 		mdoqt.setText("");
		 		mddqt.setText("");
		 		mdrt.setText("");
		 		mdat.setText("");
		 		mdrkt.setText("");
		 		mdrtqt.setText("");
            		}
             		catch(Exception e6)
             		   { 
                		System.out.println(e6);    
             		   }
 
		      }
       	  });


	//Customer Wise Report settings...

        JLabel cwr = new JLabel();
        cwr.setOpaque(true);
        cwr.setBackground(new Color(10,10,10,100));
        Label cwrlbl;
        JLabel cwrlbl1,cwrlbl2,cwrlbl3;
        TextField cwrtxt1,cwrtxt2,cwrtxt3;
        Button cwrb1,cwrb2,cwrb3,cwrb4;

        cwrlbl = new Label("Customer Wise Report");
        cwrlbl1 = new JLabel("Customer ID :");
        cwrlbl2 = new JLabel("Starting Date :");
        cwrlbl3 = new JLabel("End Date :");
        cwrlbl.setFont(new Font("Arial", Font.BOLD, 18));
        cwrlbl1.setFont(new Font("Arial", Font.BOLD, 18));
        cwrlbl2.setFont(new Font("Arial", Font.BOLD, 18));
        cwrlbl3.setFont(new Font("Arial", Font.BOLD, 18));


        cwrlbl.setForeground(Color.WHITE);
        cwrlbl.setBackground(new Color(10,10,10));
        cwrlbl1.setForeground(Color.WHITE);
        cwrlbl2.setForeground(Color.WHITE);
        cwrlbl3.setForeground(Color.WHITE);

        cwrlbl.setBounds(50, 5, 310, 50);
        cwrlbl1.setBounds(50, 65, 150, 50);
        cwrlbl2.setBounds(50, 115, 150, 50);
        cwrlbl3.setBounds(50, 165, 150, 50);

        cwrtxt1 = new TextField();
        cwrtxt2 = new TextField();
        cwrtxt3 = new TextField();
        cwrtxt1.setFont(new Font("Arial", Font.BOLD, 16));
        cwrtxt2.setFont(new Font("Arial", Font.BOLD, 16));
        cwrtxt3.setFont(new Font("Arial", Font.BOLD, 16));
        cwrtxt1.setBounds(200, 75, 160, 30);
        cwrtxt2.setBounds(200, 125, 160, 33);
        cwrtxt3.setBounds(200, 175, 160, 33);
	LocalDate dt4 = LocalDate.now();
        cwrtxt2.setText(dt4.toString());
        cwrtxt3.setText(dt4.toString());

        cwrb1 = new Button("Generate Table");
        cwrb2 = new Button("Back");
        cwrb3 = new Button("Export to XL");
        cwrb4 = new Button("Clear Table");

        cwrb1.setFont(new Font("Arial", Font.BOLD, 18));
        cwrb2.setFont(new Font("Arial", Font.BOLD, 18));
        cwrb3.setFont(new Font("Arial", Font.BOLD, 18));
        cwrb4.setFont(new Font("Arial", Font.BOLD, 18));

        cwrb1.setBounds(50, 230, 140, 40);
        cwrb2.setBounds(200, 300, 140, 40);
        cwrb3.setBounds(50, 300, 140, 40);
        cwrb4.setBounds(200, 230, 140, 40);

        cwr.add(cwrlbl);
        cwr.add(cwrlbl1);
        cwr.add(cwrlbl2);
        cwr.add(cwrlbl3);
        cwr.add(cwrtxt1);
        cwr.add(cwrtxt2);
        cwr.add(cwrtxt3);
        cwr.add(cwrb1);
        cwr.add(cwrb2);
        cwr.add(cwrb3);
        cwr.add(cwrb4);

        cwr.setBounds(50, 100, 1200, 600);
        cwr.setVisible(false);
        bgl.add(cwr);

	DefaultTableModel modelcw = new DefaultTableModel();
        JTable tablecw = new JTable();

        cwrb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		if(modelcw.getRowCount()==0){

   	final String URL =  "jdbc:mysql://localhost:3306/Aravind";
   	final String USER = "root";
   	final String PASSWORD = "Aravind2005@";

            String searchId = cwrtxt1.getText();
	    LocalDate sd1 = LocalDate.parse(cwrtxt2.getText());
	    LocalDate ed1 = LocalDate.parse(cwrtxt3.getText());

            Date startDate = Date.valueOf(sd1);  
            Date endDate = Date.valueOf(ed1);    


        String query = "SELECT * FROM delivery WHERE Cust_ID = ? AND Bill_Date BETWEEN ? AND ?";
	tablecw.setModel(modelcw);

        // Define the column names for the JTable (change these to match your table's structure)
        modelcw.addColumn("Bill No."); 
        modelcw.addColumn("Bill Date"); 
        modelcw.addColumn("Customer Name");
        modelcw.addColumn("City");
        modelcw.addColumn("Order Qty");
        modelcw.addColumn("Delivery Qty");
        modelcw.addColumn("Rate");
        modelcw.addColumn("Amount");
        modelcw.addColumn("Returned Can Qty");

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
             
            statement.setString(1, searchId);
            statement.setDate(2, startDate);
            statement.setDate(3, endDate);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (!resultSet.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(tablecw, "No data found for ID: " + searchId + " in the selected date range.");
                } 
                    while (resultSet.next()) {
                        Object[] rowData = new Object[]{
                                resultSet.getObject("Bill_No"), 
                                resultSet.getObject("Bill_Date"), 
                                resultSet.getObject("Cust_Name"), 
                                resultSet.getObject("City"), 
                                resultSet.getObject("Order_Qty"), 
                                resultSet.getObject("Delivery_Qty"), 
                                resultSet.getObject("Rate"), 
                                resultSet.getObject("Amount"), 
                                resultSet.getObject("Can_Returned_Qty"), 

                        };
                        modelcw.addRow(rowData);
                    
                }
            }
        } 
	catch (Exception e5) {

            e5.printStackTrace();
            JOptionPane.showMessageDialog(tablecw, "Error fetching data: " + e5.getMessage());
        }
            tablecw.setFont(new Font("Arial", Font.BOLD, 12));
            tablecw.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	    TableColumnModel colModel2 = tablecw.getColumnModel();
	    colModel2.getColumn(0).setPreferredWidth(50);  
	    colModel2.getColumn(1).setPreferredWidth(70);  
	    colModel2.getColumn(2).setPreferredWidth(200); 
	    colModel2.getColumn(3).setPreferredWidth(115); 
	    colModel2.getColumn(4).setPreferredWidth(60);  
	    colModel2.getColumn(5).setPreferredWidth(80); 
	    colModel2.getColumn(6).setPreferredWidth(40); 
	    colModel2.getColumn(7).setPreferredWidth(60); 
	    colModel2.getColumn(8).setPreferredWidth(120); 

            JScrollPane scrollPane = new JScrollPane(tablecw);
		   scrollPane.setBounds(400,250,800,300);
		   scrollPane.setVisible(true);
            cwr.add(scrollPane, BorderLayout.CENTER);

		}
           }
        
        });

        cwrb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             cwr.setVisible(false);
             mmp.setVisible(true); 
            }
        
        });

        cwrb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
			String fileName = "CustomerWise_Report.csv";

        try (FileWriter csv = new FileWriter(fileName)) {
            // Write column headers
            for (int i = 0; i < tablecw.getColumnCount(); i++) {
                csv.write(tablecw.getColumnName(i) + (i < tablecw.getColumnCount() - 1 ? "," : ""));
            }
            csv.write("\n");

            // Write rows
            for (int row = 0; row < tablecw.getRowCount(); row++) {
                for (int col = 0; col < tablecw.getColumnCount(); col++) {
                    Object value = tablecw.getValueAt(row, col);
                    csv.write((value != null ? value.toString() : "") + (col < tablecw.getColumnCount() - 1 ? "," : ""));
                }
                csv.write("\n");
            }
                 JOptionPane.showMessageDialog(null,"File - CustomerWise_Report.csv - exported");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

            }
        
        });

        cwrb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                cwrtxt1.setText("");
		if(modelcw.getRowCount()>0){
		modelcw.setRowCount(0);
		modelcw.setColumnCount(0);
		}

		}
	});

	//Filled Can Stock - Date Wise Report settings...

        JLabel fcsr = new JLabel();
        fcsr.setOpaque(true);
        fcsr.setBackground(new Color(10,10,10,100));
        Label fcsrlbl;
        JLabel fcsrlbl2,fcsrlbl3;
        TextField fcsrtxt1,fcsrtxt2,fcsrtxt3;
        Button fcsrb1,fcsrb2,fcsrb3,fcsrb4;

        fcsrlbl = new Label("Filled Can Stock Report - Date Wise");
        fcsrlbl2 = new JLabel("Starting Date :");
        fcsrlbl3 = new JLabel("End Date :");
        fcsrlbl.setFont(new Font("Arial", Font.BOLD, 18));
        fcsrlbl2.setFont(new Font("Arial", Font.BOLD, 18));
        fcsrlbl3.setFont(new Font("Arial", Font.BOLD, 18));


        fcsrlbl.setForeground(Color.WHITE);
        fcsrlbl.setBackground(new Color(10,10,10));
        fcsrlbl2.setForeground(Color.WHITE);
        fcsrlbl3.setForeground(Color.WHITE);

        fcsrlbl.setBounds(50, 50, 340, 50);
        fcsrlbl2.setBounds(50, 115, 150, 50);
        fcsrlbl3.setBounds(50, 165, 150, 50);

        fcsrtxt2 = new TextField();
        fcsrtxt3 = new TextField();
        fcsrtxt2.setFont(new Font("Arial", Font.BOLD, 16));
        fcsrtxt3.setFont(new Font("Arial", Font.BOLD, 16));
        fcsrtxt2.setBounds(200, 125, 160, 33);
        fcsrtxt3.setBounds(200, 175, 160, 33);
	LocalDate dt6 = LocalDate.now();
        fcsrtxt2.setText(dt6.toString());
        fcsrtxt3.setText(dt6.toString());

        fcsrb1 = new Button("Generate Table");
        fcsrb2 = new Button("Back");
        fcsrb4 = new Button("Clear Table");

        fcsrb1.setFont(new Font("Arial", Font.BOLD, 18));
        fcsrb2.setFont(new Font("Arial", Font.BOLD, 18));
        fcsrb4.setFont(new Font("Arial", Font.BOLD, 18));

        fcsrb1.setBounds(50, 230, 140, 40);
        fcsrb2.setBounds(50, 300, 140, 40);
        fcsrb4.setBounds(200, 230, 140, 40);

        fcsr.add(fcsrlbl);
        fcsr.add(fcsrlbl2);
        fcsr.add(fcsrlbl3);
        fcsr.add(fcsrtxt2);
        fcsr.add(fcsrtxt3);
        fcsr.add(fcsrb1);
        fcsr.add(fcsrb2);
        fcsr.add(fcsrb4);

        fcsr.setBounds(5, 10, 1200, 600);
        fcsr.setVisible(false);
        bgl.add(fcsr);

	DefaultTableModel modelfc = new DefaultTableModel();
        JTable tablefc = new JTable();

        fcsrb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		if(modelfc.getRowCount()==0){

   	final String URL =  "jdbc:mysql://localhost:3306/Aravind";
   	final String USER = "root";
   	final String PASSWORD = "Aravind2005@";

	    LocalDate sd2 = LocalDate.parse(fcsrtxt2.getText());
	    LocalDate ed2 = LocalDate.parse(fcsrtxt3.getText());

            Date startDate = Date.valueOf(sd2);  
            Date endDate = Date.valueOf(ed2);    


        String queryfc = "SELECT * FROM fcstock WHERE Fc_Date BETWEEN ? AND ?";
	tablefc.setModel(modelfc);

        modelfc.addColumn("Serial No."); 
        modelfc.addColumn("Can Receipt Date"); 
        modelfc.addColumn("Receipt No.");
        modelfc.addColumn("Receipt Qty");
        modelfc.addColumn("Delivery No.");
        modelfc.addColumn("Delivery Qty");
        modelfc.addColumn("Filled Can Balance");

        try (Connection connection2 = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement2 = connection2.prepareStatement(queryfc)) {
             
            statement2.setDate(1, startDate);
            statement2.setDate(2, endDate);

            try (ResultSet resultSet2 = statement2.executeQuery()) {
                // Check if there's data

                if (!resultSet2.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(tablefc, "No data found for ID: " + sd2 + " in the selected date range.");
                } 
                    while (resultSet2.next()) {
                        Object[] rowData2 = new Object[]{
                                resultSet2.getObject("Fcs_Slno"), 
                                resultSet2.getObject("Fc_Date"), 
                                resultSet2.getObject("Fcr_No"), 
                                resultSet2.getObject("Fcr_Qty"), 
                                resultSet2.getObject("Fcd_No"), 
                                resultSet2.getObject("Fcd_Qty"), 
                                resultSet2.getObject("Fcd_Balance"), 
                        };
                        modelfc.addRow(rowData2);
                    
                }
            }
        } 
	catch (Exception e5) {

            e5.printStackTrace();
            JOptionPane.showMessageDialog(tablefc, "Error fetching data: " + e5.getMessage());
        }
            tablefc.setFont(new Font("Arial", Font.BOLD, 12));
            JScrollPane scrollPane = new JScrollPane(tablefc);
		   scrollPane.setBounds(400,50,800,500);
		   scrollPane.setVisible(true);
            fcsr.add(scrollPane, BorderLayout.CENTER);

		}
           }
        
        });

        fcsrb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             fcsr.setVisible(false);
             mmp.setVisible(true); 
            }
        
        });

        fcsrb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		if(modelfc.getRowCount()>0){
		modelfc.setRowCount(0);
		modelfc.setColumnCount(0);
		}

		}
	});

        mmbfcds.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

	String DB_URL5 = "jdbc:mysql://localhost:3306/Aravind";
        String USER5 = "root";
        String PASS5 = "Aravind2005@";

	try (Connection conn = DriverManager.getConnection(DB_URL5, USER5, PASS5)) {
    	int currentBalance = 0; 
    	String selectSql = "SELECT Fcs_Slno, Fcr_Qty, Fcd_Qty FROM fcstock ORDER BY Fcs_Slno";
    	try (Statement selectStmt = conn.createStatement();
         ResultSet rs = selectStmt.executeQuery(selectSql)) {

        String updateSql = "UPDATE fcstock SET Fcd_Balance = ? WHERE Fcs_Slno = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {

            while (rs.next()) {
                int slno = rs.getInt("Fcs_Slno");
                int rQty = rs.getInt("Fcr_Qty");
                int dQty = rs.getInt("Fcd_Qty");
                int newBalance = currentBalance + rQty - dQty;
                updateStmt.setInt(1, newBalance);
                updateStmt.setInt(2, slno);
                updateStmt.executeUpdate();
                currentBalance = newBalance;
            			}
      	  		} 
   	 	} 

	} catch (SQLException se) {
    	se.printStackTrace();
	} catch (Exception ee) {
    	ee.printStackTrace();
	}
             mmp.setVisible(false);
             fcsr.setVisible(true); 

		}
	});

	//Empty Can Stock - Date Wise Report settings...

        JLabel ecsr = new JLabel();
        ecsr.setOpaque(true);
        ecsr.setBackground(new Color(10,10,10,100));
        Label ecsrlbl;
        JLabel ecsrlbl2,ecsrlbl3;
        TextField ecsrtxt1,ecsrtxt2,ecsrtxt3;
        Button ecsrb1,ecsrb2,ecsrb3,ecsrb4;

        ecsrlbl = new Label("Empty Can Stock Report - Date Wise");
        ecsrlbl2 = new JLabel("Starting Date :");
        ecsrlbl3 = new JLabel("End Date :");
        ecsrlbl.setFont(new Font("Arial", Font.BOLD, 18));
        ecsrlbl2.setFont(new Font("Arial", Font.BOLD, 18));
        ecsrlbl3.setFont(new Font("Arial", Font.BOLD, 18));

        ecsrlbl.setForeground(Color.WHITE);
        ecsrlbl.setBackground(new Color(10,10,10));
        ecsrlbl2.setForeground(Color.WHITE);
        ecsrlbl3.setForeground(Color.WHITE);

        ecsrlbl.setBounds(50, 50, 340, 50);
        ecsrlbl2.setBounds(50, 115, 150, 50);
        ecsrlbl3.setBounds(50, 165, 150, 50);

        ecsrtxt2 = new TextField();
        ecsrtxt3 = new TextField();
        ecsrtxt2.setFont(new Font("Arial", Font.BOLD, 16));
        ecsrtxt3.setFont(new Font("Arial", Font.BOLD, 16));
        ecsrtxt2.setBounds(200, 125, 160, 33);
        ecsrtxt3.setBounds(200, 175, 160, 33);
	LocalDate dt7 = LocalDate.now();
        ecsrtxt2.setText(dt7.toString());
        ecsrtxt3.setText(dt7.toString());

        ecsrb1 = new Button("Generate Table");
        ecsrb2 = new Button("Back");
        ecsrb4 = new Button("Clear Table");

        ecsrb1.setFont(new Font("Arial", Font.BOLD, 18));
        ecsrb2.setFont(new Font("Arial", Font.BOLD, 18));
        ecsrb4.setFont(new Font("Arial", Font.BOLD, 18));

        ecsrb1.setBounds(50, 230, 140, 40);
        ecsrb2.setBounds(50, 300, 140, 40);
        ecsrb4.setBounds(200, 230, 140, 40);

        ecsr.add(ecsrlbl);
        ecsr.add(ecsrlbl2);
        ecsr.add(ecsrlbl3);
        ecsr.add(ecsrtxt2);
        ecsr.add(ecsrtxt3);
        ecsr.add(ecsrb1);
        ecsr.add(ecsrb2);
        ecsr.add(ecsrb4);

        ecsr.setBounds(5, 10, 1200, 600);
        ecsr.setVisible(false);
        bgl.add(ecsr);

	DefaultTableModel modelec = new DefaultTableModel();
        JTable tableec = new JTable();

        ecsrb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		if(modelec.getRowCount()==0){

   	final String URL =  "jdbc:mysql://localhost:3306/Aravind";
   	final String USER = "root";
   	final String PASSWORD = "Aravind2005@";

	    LocalDate sd3 = LocalDate.parse(ecsrtxt2.getText());
	    LocalDate ed3 = LocalDate.parse(ecsrtxt3.getText());

            Date startDate = Date.valueOf(sd3);  
            Date endDate = Date.valueOf(ed3);    


        String queryfc = "SELECT * FROM ecstock WHERE Ec_Date BETWEEN ? AND ?";
	tableec.setModel(modelec);

        modelec.addColumn("Serial No."); 
        modelec.addColumn("Can Receipt Date"); 
        modelec.addColumn("Receipt No.");
        modelec.addColumn("Receipt Qty");
        modelec.addColumn("Delivery No.");
        modelec.addColumn("Delivery Qty");
        modelec.addColumn("Empty Can Balance");

        try (Connection connection3 = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement3 = connection3.prepareStatement(queryfc)) {
             
            statement3.setDate(1, startDate);
            statement3.setDate(2, endDate);

            try (ResultSet resultSet2 = statement3.executeQuery()) {
                // Check if there's data

                if (!resultSet2.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(tableec, "No data found for ID: " + sd3 + " in the selected date range.");
                } 
                    while (resultSet2.next()) {
                        Object[] rowData3 = new Object[]{
                                resultSet2.getObject("Ecs_Slno"), 
                                resultSet2.getObject("Ec_Date"), 
                                resultSet2.getObject("Ecr_No"), 
                                resultSet2.getObject("Ecr_Qty"), 
                                resultSet2.getObject("Ecd_No"), 
                                resultSet2.getObject("Ecd_Qty"), 
                                resultSet2.getObject("Ecd_Balance"), 
                        };
                        modelec.addRow(rowData3);
                    
                }
            }
        } 
	catch (Exception e5) {

            e5.printStackTrace();
            JOptionPane.showMessageDialog(tableec, "Error fetching data: " + e5.getMessage());
        }
            tableec.setFont(new Font("Arial", Font.BOLD, 12));
            JScrollPane scrollPane2 = new JScrollPane(tableec);
		   scrollPane2.setBounds(400,50,800,500);
		   scrollPane2.setVisible(true);
            ecsr.add(scrollPane2, BorderLayout.CENTER);

		}
           }
        
        });

        ecsrb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             ecsr.setVisible(false);
             mmp.setVisible(true); 
            }
        
        });

        ecsrb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		if(modelec.getRowCount()>0){
		modelec.setRowCount(0);
		modelec.setColumnCount(0);
		}

		}
	});

        mmbecrs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

	String DB_URL6 = "jdbc:mysql://localhost:3306/Aravind";
        String USER6 = "root";
        String PASS6 = "Aravind2005@";

	try (Connection constk = DriverManager.getConnection(DB_URL6, USER6, PASS6)) {
    	int curBal = 0; 
    	String selectSql2 = "SELECT Ecs_Slno, Ecr_Qty, Ecd_Qty FROM ecstock ORDER BY Ecs_Slno";
    	try (Statement selectStmt2 = constk.createStatement();
         ResultSet rsdb = selectStmt2.executeQuery(selectSql2)) {

        String updateSql2 = "UPDATE ecstock SET Ecd_Balance = ? WHERE Ecs_Slno = ?";
        try (PreparedStatement updateStmt2 = constk.prepareStatement(updateSql2)) {

            while (rsdb.next()) {
                int slno2 = rsdb.getInt("Ecs_Slno");
                int rQty2 = rsdb.getInt("Ecr_Qty");
                int dQty2 = rsdb.getInt("Ecd_Qty");
                int newBal = curBal + rQty2 - dQty2;
                updateStmt2.setInt(1, newBal);
                updateStmt2.setInt(2, slno2);
                updateStmt2.executeUpdate();
                curBal = newBal;
            			}
      	  		} 
   	 	} 

	} catch (SQLException se1) {
    	se1.printStackTrace();
	} catch (Exception ee1) {
    	ee1.printStackTrace();
	}

             mmp.setVisible(false);
             ecsr.setVisible(true); 

		}
	});

        frm.setLayout(new FlowLayout());
        frm.setVisible(true);

        // Buttons Events 
        Lb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 try{
		   if (txt1.getText().trim().isEmpty() && txt2.getText().trim().isEmpty()) {
                		JOptionPane.showMessageDialog(null, "Enter Username and password");
                		return;
            	   }
            	   if (!txt1.getText().trim().isEmpty() && txt2.getText().trim().isEmpty()) {
                		JOptionPane.showMessageDialog(null, "Enter password");
                		return;
            	   }
            	   if (txt1.getText().trim().isEmpty() && !txt2.getText().trim().isEmpty()) {
                		JOptionPane.showMessageDialog(null, "Enter username");
                		return;
            	   }
                   String url1 = "jdbc:mysql://localhost:3306/Aravind";
            	   String uname1 = "root";
            	   String passwd2 = "Aravind2005@";
            	   //String passwd = txt2.getText();
           	   String id = "'" +txt1.getText() + "'";
            	   String query1 = "select count(*) from users where username=" + id;
            	   Connection con3 = DriverManager.getConnection(url1, uname1, passwd2);
            	   Statement st2 = con3.createStatement();
            	   ResultSet rs3 = st2.executeQuery(query1);
            	   if (rs3.next() && rs3.getInt(1) == 0) {
                		JOptionPane.showMessageDialog(null, "Invalid User Name");
                		return;
            	   }
                   //String name="Aravind";
                   String url="jdbc:mysql://localhost:3306/Aravind";
                   String uname="root";
                   String passwd1="Aravind2005@";
                   String name = txt1.getText();
                   String passwd = txt2.getText();
                   Connection con=DriverManager.getConnection(url,uname,passwd1);
                   CallableStatement cst=con.prepareCall("{call Getname(?)}");
                   cst.setString(1,name);
                   //Statement st=con.createStatement();
                   ResultSet rs=cst.executeQuery();
                   rs.next();
                   String password=rs.getString(1);
                   //JOptionPane.showMessageDialog(null,password);
                   if(password.equals(passwd))
                      { 
                       System.out.println("Login sucessful"); 
                       log.setVisible(false);  
                       mmp.setBounds(1, 1, 500, 1500);
                       mmp.setVisible(true);
                       bgl.add(mmp);
                       }
                     else
                     {
                     JOptionPane.showMessageDialog(null,"Incorrect password");
                     }
                   }
                   catch(Exception ex)
                   {
                      System.out.println("exception occured");
                   } 
		String un = txt1.getText();
            	Label mmlul = new Label("Logged User : "+un);
        	mmlul.setFont(new Font("Arial", Font.BOLD, 18));
        	mmlul.setBackground(new Color(0,0,100));
        	mmlul.setForeground(Color.WHITE);
        	mmlul.setBounds(5, 2, 377, 40);	
            	mmp.add(mmlul);        
                }

        });

        mmbuc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             mmp.setVisible(false);  
             Nuc.setBounds(50, 100, 400, 300);
             Nuc.setVisible(true); 
             bgl.add(Nuc);

            }
        
        });


        Lb2.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){                
                  System.exit(0);
            }
        
        });

        mmbeb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
                  System.exit(0);
            }
        });

        mmbsc.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
             mmp.setVisible(false); 
             mcsp.setBounds(5, 5, 600, 600);
             mcsp.setVisible(true); 
             bgl.add(mcsp);

            }
        });

        mmbsa.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {

        DefaultTableModel model2 = new DefaultTableModel();
        JTable masjt = new JTable(model2);

        final String URL = "jdbc:mysql://localhost:3306/Aravind";
        final String USER = "root";
        final String PASSWORD = "Aravind2005@";
        String query2 = "SELECT * FROM supplier";

        model2.addColumn("Supplier-ID"); 
        model2.addColumn("Supplier Name"); 
        model2.addColumn("Door No."); 
        model2.addColumn("Address"); 
        model2.addColumn("City");
        model2.addColumn("Pincode");
        model2.addColumn("Contact No");

        try (Connection conn2 = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt2 = conn2.prepareStatement(query2);
             ResultSet rs2 = stmt2.executeQuery()) {

            while (rs2.next()) {
                Object[] rowData = new Object[]{
                    rs2.getObject("Id"), 
                    rs2.getObject("sname"), 
                    rs2.getObject("doorno"), 
                    rs2.getObject("a_name"), 
                    rs2.getObject("c_name"), 
                    rs2.getObject("pincode"), 
                    rs2.getObject("contno"), 
                };
                model2.addRow(rowData);
            }
        } catch (SQLException ep) {
            ep.printStackTrace();
        }

        masjt.setFont(new Font("Arial", Font.BOLD, 14));
        masjt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModel = masjt.getColumnModel();
	colModel.getColumn(0).setPreferredWidth(70);  
	colModel.getColumn(1).setPreferredWidth(200);  
	colModel.getColumn(2).setPreferredWidth(80);  
	colModel.getColumn(3).setPreferredWidth(250);  
	colModel.getColumn(4).setPreferredWidth(100); 
	colModel.getColumn(5).setPreferredWidth(80); 
	colModel.getColumn(6).setPreferredWidth(120); 

        JScrollPane masjsp = new JScrollPane(masjt);
        masjsp.setBounds(570, 100, 700, 400);
        masjsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        masp.add(masjsp);

        mmp.setVisible(false); 
        masp.setBounds(5, 5, 1300, 600);
        masp.setVisible(true);
        bgl.add(masp);
    		}
	});

        mmbfc.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){

        DefaultTableModel model2a = new DefaultTableModel();
        JTable masjt_a = new JTable(model2a);

        final String URL = "jdbc:mysql://localhost:3306/Aravind";
        final String USER = "root";
        final String PASSWORD = "Aravind2005@";
        String query2a = "SELECT * FROM supplier";
        model2a.addColumn("Supplier-ID"); 
        model2a.addColumn("Supplier Name"); 
        model2a.addColumn("Door No."); 
        model2a.addColumn("Address"); 
        model2a.addColumn("City");
        model2a.addColumn("Pincode");
        model2a.addColumn("Contact No");

        try (Connection conn2a = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt2a = conn2a.prepareStatement(query2a);
             ResultSet rs2a = stmt2a.executeQuery()) {

            while (rs2a.next()) {
                Object[] rowData = new Object[]{
                    rs2a.getObject("Id"), 
                    rs2a.getObject("sname"), 
                    rs2a.getObject("doorno"), 
                    rs2a.getObject("a_name"), 
                    rs2a.getObject("c_name"), 
                    rs2a.getObject("pincode"), 
                    rs2a.getObject("contno"), 
                };
                model2a.addRow(rowData);
            }
        } catch (SQLException ep1) {
            ep1.printStackTrace();
        }

        masjt_a.setFont(new Font("Arial", Font.BOLD, 14));
        masjt_a.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModel1a = masjt_a.getColumnModel();
	colModel1a.getColumn(0).setPreferredWidth(70);  
	colModel1a.getColumn(1).setPreferredWidth(200);  
	colModel1a.getColumn(2).setPreferredWidth(80);  
	colModel1a.getColumn(3).setPreferredWidth(250);  
	colModel1a.getColumn(4).setPreferredWidth(100); 
	colModel1a.getColumn(5).setPreferredWidth(80); 
	colModel1a.getColumn(6).setPreferredWidth(120); 

        JScrollPane masjsp1a = new JScrollPane(masjt_a);
        masjsp1a.setBounds(570, 100, 700, 400);
        masjsp1a.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mfcrp.add(masjsp1a);

        mmp.setVisible(false); 
        mfcrp.setBounds(5, 5, 1300, 650);
        mfcrp.setVisible(true);
        bgl.add(mfcrp);
	mfcrsidt.setText("");
	mfcrst.setText("");
	mfcrnt.setText("");
	mfcrqt.setText("");
	mfcrsat1a.setText("");
	mfcrsat2a.setText("");
	mfcrsat3a.setText("");
	mfcrsat4a.setText("");
	mfcrsal5a.setText("");

            }
        });
 
        mmbfca.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){

        DefaultTableModel model3 = new DefaultTableModel();
        JTable masjt2 = new JTable(model3);

        final String URL = "jdbc:mysql://localhost:3306/Aravind";
        final String USER = "root";
        final String PASSWORD = "Aravind2005@";
        String qr3a = "SELECT * FROM canreceipt";
        model3.addColumn("Can Receipt No."); 
        model3.addColumn("Can Receipt Date"); 
        model3.addColumn("Supplier ID No."); 
        model3.addColumn("Supplier Name");
        model3.addColumn("Received Qty");
        model3.addColumn("Received Can Type");

        try (Connection conn3 = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt3 = conn3.prepareStatement(qr3a);
             ResultSet rs3 = stmt3.executeQuery()) {

            while (rs3.next()) {
                Object[] rowData = new Object[]{
                    rs3.getObject("crn"), 
                    rs3.getObject("crd"), 
                    rs3.getObject("sid"), 
                    rs3.getObject("s_name"), 
                    rs3.getObject("rq"), 
                    rs3.getObject("cantype"), 
                };
                model3.addRow(rowData);
            }
        } catch (SQLException ex1) {
            ex1.printStackTrace();
        }

        masjt2.setFont(new Font("Arial", Font.BOLD, 14));
        masjt2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModel4 = masjt2.getColumnModel();
	colModel4.getColumn(0).setPreferredWidth(100);  
	colModel4.getColumn(1).setPreferredWidth(110);  
	colModel4.getColumn(2).setPreferredWidth(100);   
	colModel4.getColumn(3).setPreferredWidth(250);   
	colModel4.getColumn(4).setPreferredWidth(90);  
	colModel4.getColumn(5).setPreferredWidth(120);  

        JScrollPane masjsp2 = new JScrollPane(masjt2);
        masjsp2.setBounds(570, 10, 700, 200);
        masjsp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mfcrap.add(masjsp2);

             mmp.setVisible(false); 
             mfcrap.setBounds(5, 5, 1300, 650);
             mfcrap.setVisible(true);

		mfcrasidt.setText("");
		mfcrast.setText("");
		mfcrant.setText("");
		mfcradtt.setText("");
		mfcraqt.setText("");
		mfctta.setText("");
		mfcrasat1.setText("");
		mfcrasal2a.setText("");
		mfcrasal3a.setText("");
		mfcrasal4a.setText("");
		mfcrasal5a.setText("");


        DefaultTableModel model2b = new DefaultTableModel();
        JTable masjt_b = new JTable(model2b);
        String query2b = "SELECT * FROM supplier";
        model2b.addColumn("Supplier-ID"); 
        model2b.addColumn("Supplier Name"); 
        model2b.addColumn("Door No."); 
        model2b.addColumn("Address"); 
        model2b.addColumn("City");
        model2b.addColumn("Pincode");
        model2b.addColumn("Contact No");

        try (Connection conn2b = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt2b = conn2b.prepareStatement(query2b);
             ResultSet rs2b = stmt2b.executeQuery()) {

            while (rs2b.next()) {
                Object[] rowData = new Object[]{
                    rs2b.getObject("Id"), 
                    rs2b.getObject("sname"), 
                    rs2b.getObject("doorno"), 
                    rs2b.getObject("a_name"), 
                    rs2b.getObject("c_name"), 
                    rs2b.getObject("pincode"), 
                    rs2b.getObject("contno"), 
                };
                model2b.addRow(rowData);
            }
        } catch (SQLException ep2) {
            ep2.printStackTrace();
        }
	masjt_b.setFont(new Font("Arial", Font.BOLD, 14));
        masjt_b.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModel1b = masjt_b.getColumnModel();
	colModel1b.getColumn(0).setPreferredWidth(70);  
	colModel1b.getColumn(1).setPreferredWidth(200);  
	colModel1b.getColumn(2).setPreferredWidth(80);  
	colModel1b.getColumn(3).setPreferredWidth(250);  
	colModel1b.getColumn(4).setPreferredWidth(100); 
	colModel1b.getColumn(5).setPreferredWidth(80); 
	colModel1b.getColumn(6).setPreferredWidth(120); 

        JScrollPane masjsp1b = new JScrollPane(masjt_b);
        masjsp1b.setBounds(570, 250, 700, 200);
        masjsp1b.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mfcrap.add(masjsp1b);
        bgl.add(mfcrap);

            }
        });

        maseb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
             masp.setVisible(false); 
             mmp.setVisible(true); 
            }
        }); 

        mfcreb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
             mfcrp.setVisible(false); 
             mmp.setVisible(true); 
            }
        }); 

        mfcraeb.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
             mfcrap.setVisible(false); 
             mmp.setVisible(true); 
            }
        });


        mmbcw.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        DefaultTableModel mdlc = new DefaultTableModel();
        JTable cwjt = new JTable(mdlc);

        final String URL = "jdbc:mysql://localhost:3306/Aravind";
        final String USER = "root";
        final String PASSWORD = "Aravind2005@";
        String qrc = "SELECT * FROM customers";
        mdlc.addColumn("Cust-ID"); 
        mdlc.addColumn("Customer Name");
        mdlc.addColumn("Address"); 
        mdlc.addColumn("City");
        mdlc.addColumn("Pincode");
        mdlc.addColumn("Contact No");
        mdlc.addColumn("eMail-ID");

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmc = connection.prepareStatement(qrc);
             ResultSet rstc = stmc.executeQuery()) {

            while (rstc.next()) {
                Object[] rowData = new Object[]{
                    rstc.getObject("id"), 
                    rstc.getObject("name"), 
                    rstc.getObject("address"), 
                    rstc.getObject("city"), 
                    rstc.getObject("pincode"),
                    rstc.getObject("mobileno"),
                    rstc.getObject("mailid")
                };
                mdlc.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        cwjt.setFont(new Font("Arial", Font.BOLD, 12));
        cwjt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	TableColumnModel colModel = cwjt.getColumnModel();
	colModel.getColumn(0).setPreferredWidth(50);   
	colModel.getColumn(1).setPreferredWidth(150);  
	colModel.getColumn(2).setPreferredWidth(200);  
	colModel.getColumn(3).setPreferredWidth(100);  
	colModel.getColumn(4).setPreferredWidth(60);  
	colModel.getColumn(5).setPreferredWidth(100);  
	colModel.getColumn(6).setPreferredWidth(250);  

        JScrollPane cwjsp = new JScrollPane(cwjt);
        cwjsp.setBounds(400, 20, 800, 200);
        cwjsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        cwr.add(cwjsp);

             mmp.setVisible(false); 
             cwr.setBounds(5, 5, 1200, 600);
             cwr.setVisible(true); 
             bgl.add(cwr);

    		}
	});
                     
    }
 }


