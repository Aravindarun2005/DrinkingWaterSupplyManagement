import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;

public class Cus{
      
    public static void main(String[] args){
      
        JFrame cfrm = new JFrame("GRACE-CUSTOMERS");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\ARAVIND\\IMAGE\\WATERCAN.jpg");
        cfrm.setIconImage(icon);
        cfrm.setResizable(false);
        JLabel bgimage = new JLabel();
        bgimage.setIcon(new ImageIcon("C:\\ARAVIND\\IMAGE\\WC.jpg")); 
        bgimage.setSize(400,650);
        cfrm.add(bgimage);

        //Main Menu settings...
        JLabel mpg = new JLabel();
        mpg.setOpaque(true);
        mpg.setBackground(new Color(0,40,0,200));
        JLabel mpgtl1,mpgtl2;
        JButton mpgb1,mpgb2,mpgbe;

        mpgtl1 = new JLabel("Grace - Customers Portal");
        mpgtl2 = new JLabel("Welcomes You");
        mpgtl1.setFont(new Font("Arial", Font.BOLD, 26));
        mpgtl2.setFont(new Font("Arial", Font.BOLD, 26));

        mpgtl1.setForeground(Color.WHITE);
        mpgtl2.setForeground(Color.WHITE);

        mpgtl1.setBounds(45, 5, 350, 50);
        mpgtl2.setBounds(100, 30, 350, 50);

        mpgb1 = new JButton("Existing Customer");
        mpgb2 = new JButton("New Customer");
        mpgbe = new JButton("Exit");
        mpgb1.setFont(new Font("Arial", Font.BOLD, 20));
        mpgb2.setFont(new Font("Arial", Font.BOLD, 20));
        mpgbe.setFont(new Font("Arial", Font.BOLD, 20));

        mpgb1.setBounds(80, 200, 220, 35);
        mpgb2.setBounds(80, 260, 220, 35);
        mpgbe.setBounds(80, 320, 220, 35);

        mpg.add(mpgtl1);
        mpg.add(mpgtl2);
        mpg.add(mpgb1);
        mpg.add(mpgb2);
        mpg.add(mpgbe);

        mpg.setBounds(1, 1, 400, 650);
        mpg.setVisible(true);
        bgimage.add(mpg);
        bgimage.setVisible(true);
	
	cfrm.add(bgimage);
        cfrm.setSize(400,650); 
	cfrm.setLocationRelativeTo(null);

        //Login Menu settings...
	JLabel exlab = new JLabel();      
	exlab.setOpaque(true);
        exlab.setBackground(new Color(0,40,0,200));
	//login menu to place order
	JLabel uname1=new JLabel("User Name:");
	JLabel passwd=new JLabel("Password:");
	JTextField unametxt=new JTextField();
	TextField pwdtxt=new TextField();
        pwdtxt.setEchoChar('*');
	JButton login=new JButton("Login");
	JButton back1=new JButton("Back");
	uname1.setFont(new Font("Arial", Font.BOLD, 18));
	passwd.setFont(new Font("Arial", Font.BOLD, 18));
	unametxt.setFont(new Font("Arial", Font.BOLD, 16));
	pwdtxt.setFont(new Font("Arial", Font.BOLD, 16));
	login.setFont(new Font("Arial", Font.BOLD, 20));
        back1.setFont(new Font("Arial", Font.BOLD, 20));
	login.setBounds(85, 390, 100, 35);
        back1.setBounds(215, 390, 100, 35);
        uname1.setForeground(Color.WHITE);
        passwd.setForeground(Color.WHITE);
	uname1.setBounds(50,205,120,100);
	passwd.setBounds(50,245,120,100);
	unametxt.setBounds(180,235,160,30);
	pwdtxt.setBounds(180,285,160,30);
	exlab.add(uname1);
        exlab.add(passwd);
	exlab.add(unametxt);
        exlab.add(pwdtxt);
	exlab.add(login);
	exlab.add(back1);
	exlab.setBounds(1, 1, 400, 650);

        //New Customer Menu settings...
	JLabel newlab = new JLabel();      
	newlab.setOpaque(true);
	newlab.setBackground(new Color(0,40,0,200));
	JLabel fbd=new JLabel("Customer Profile details");
        JLabel uname=new JLabel("User Name:");
	JLabel pwd=new JLabel("Password:");
	JLabel name=new JLabel("Name:");
	JLabel add=new JLabel("Address:");
	JLabel city=new JLabel("City:");
	JLabel pc=new JLabel("Pincode:");
	JLabel mobno=new JLabel("Mobile No:");
	JLabel mailid=new JLabel("eMail id:");
	JTextField txt1=new JTextField();
	TextField txt2=new TextField();
	JTextField txt3=new JTextField();
	JTextField txt4=new JTextField();
	JTextField txt5=new JTextField();
	JTextField txt6=new JTextField();
	JTextField txt7=new JTextField();
	JTextField txt8=new JTextField();
        fbd.setForeground(Color.WHITE);
        uname.setForeground(Color.WHITE);
        pwd.setForeground(Color.WHITE);
        name.setForeground(Color.WHITE);
        add.setForeground(Color.WHITE);
        city.setForeground(Color.WHITE);
        pc.setForeground(Color.WHITE);
        mobno.setForeground(Color.WHITE);
        mailid.setForeground(Color.WHITE);

	fbd.setFont(new Font("Arial", Font.BOLD, 22));
	uname.setFont(new Font("Arial", Font.BOLD, 18));
	pwd.setFont(new Font("Arial", Font.BOLD, 18));
	name.setFont(new Font("Arial", Font.BOLD, 18));
	add.setFont(new Font("Arial", Font.BOLD, 18));
	city.setFont(new Font("Arial", Font.BOLD, 18));
	pc.setFont(new Font("Arial", Font.BOLD, 18));
	mobno.setFont(new Font("Arial", Font.BOLD, 18));
	mailid.setFont(new Font("Arial", Font.BOLD, 18));
	fbd.setBounds(40,1,250,50);
	uname.setBounds(40,105,120,30);
	pwd.setBounds(40,140,120,30);
	name.setBounds(40,175,120,30);
	add.setBounds(40,210,120,30);
	city.setBounds(40,245,120,30);
	pc.setBounds(40,280,120,30);
	mobno.setBounds(40,315,120,30);
	mailid.setBounds(40,350,120,30);
	txt1.setFont(new Font("Arial", Font.BOLD, 16));
	txt2.setFont(new Font("Arial", Font.BOLD, 16));
	txt3.setFont(new Font("Arial", Font.BOLD, 16));
	txt4.setFont(new Font("Arial", Font.BOLD, 16));
	txt5.setFont(new Font("Arial", Font.BOLD, 16));
	txt6.setFont(new Font("Arial", Font.BOLD, 16));
	txt7.setFont(new Font("Arial", Font.BOLD, 16));
	txt8.setFont(new Font("Arial", Font.BOLD, 16));
	txt1.setBounds(160,110,180,30);
	txt2.setBounds(160,145,180,30);
	txt3.setBounds(160,180,180,30);
	txt4.setBounds(160,215,180,30);
	txt5.setBounds(160,250,180,30);
	txt6.setBounds(160,285,180,30);
	txt7.setBounds(160,320,180,30);
	txt8.setBounds(160,355,180,30);
	JButton save=new JButton("Save");
	JButton back=new JButton("Back");
	save.setFont(new Font("Arial", Font.BOLD, 20));
	back.setFont(new Font("Arial", Font.BOLD, 20));
	save.setBounds(70,450,90,40);
	back.setBounds(200,450,90,40);
	newlab.add(fbd);
	newlab.add(uname);
	newlab.add(pwd);
	newlab.add(name);
	newlab.add(add);
	newlab.add(city);
	newlab.add(pc);
	newlab.add(mobno);
	newlab.add(mailid);
	newlab.add(txt1);
	newlab.add(txt2);
	newlab.add(txt3);
	newlab.add(txt4);
	newlab.add(txt5);
	newlab.add(txt6);
	newlab.add(txt7);
	newlab.add(txt8);
	newlab.add(save);
	newlab.add(back);
	newlab.setBounds(1, 1, 400, 650);
	bgimage.add(newlab);
	newlab.setVisible(false);

	//User Modification....
	JLabel modlab = new JLabel();      
	modlab.setOpaque(true);
	modlab.setBackground(new Color(0,40,0,200));
	JLabel mpd=new JLabel("Modify - Profile details");
        JLabel mumname=new JLabel("User Name:");
	JLabel mpwd=new JLabel("Password:");
	JLabel mname=new JLabel("Name:");
	JLabel madd=new JLabel("Address:");
	JLabel mcity=new JLabel("City:");
	JLabel mpc=new JLabel("Pincode:");
	JLabel mmobno=new JLabel("Mobile No:");
	JLabel mmailid=new JLabel("eMail id:");
	JTextField mtxt1=new JTextField();
	TextField mtxt2=new TextField();
	JTextField mtxt3=new JTextField();
	JTextField mtxt4=new JTextField();
	JTextField mtxt5=new JTextField();
	JTextField mtxt6=new JTextField();
	JTextField mtxt7=new JTextField();
	JTextField mtxt8=new JTextField();
        mpd.setForeground(Color.WHITE);
        mumname.setForeground(Color.WHITE);
        mpwd.setForeground(Color.WHITE);
        mname.setForeground(Color.WHITE);
        madd.setForeground(Color.WHITE);
        mcity.setForeground(Color.WHITE);
        mpc.setForeground(Color.WHITE);
        mmobno.setForeground(Color.WHITE);
        mmailid.setForeground(Color.WHITE);

	mpd.setFont(new Font("Arial", Font.BOLD, 22));
	mumname.setFont(new Font("Arial", Font.BOLD, 18));
	mpwd.setFont(new Font("Arial", Font.BOLD, 18));
	mname.setFont(new Font("Arial", Font.BOLD, 18));
	madd.setFont(new Font("Arial", Font.BOLD, 18));
	mcity.setFont(new Font("Arial", Font.BOLD, 18));
	mpc.setFont(new Font("Arial", Font.BOLD, 18));
	mmobno.setFont(new Font("Arial", Font.BOLD, 18));
	mmailid.setFont(new Font("Arial", Font.BOLD, 18));
	mpd.setBounds(40,1,250,50);
	mumname.setBounds(40,105,120,30);
	mpwd.setBounds(40,140,120,30);
	mname.setBounds(40,175,120,30);
	madd.setBounds(40,210,120,30);
	mcity.setBounds(40,245,120,30);
	mpc.setBounds(40,280,120,30);
	mmobno.setBounds(40,315,120,30);
	mmailid.setBounds(40,350,120,30);
	mtxt1.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt2.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt3.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt4.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt5.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt6.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt7.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt8.setFont(new Font("Arial", Font.BOLD, 16));
	mtxt1.setBounds(160,110,180,30);
	mtxt2.setBounds(160,145,180,30);
	mtxt3.setBounds(160,180,180,30);
	mtxt4.setBounds(160,215,180,30);
	mtxt5.setBounds(160,250,180,30);
	mtxt6.setBounds(160,285,180,30);
	mtxt7.setBounds(160,320,180,30);
	mtxt8.setBounds(160,355,180,30);
	JButton mupdate=new JButton("Update");
	JButton mback=new JButton("Back");
	mupdate.setFont(new Font("Arial", Font.BOLD, 20));
	mback.setFont(new Font("Arial", Font.BOLD, 20));
	mupdate.setBounds(80,450,110,40);
	mback.setBounds(220,450,90,40);
	modlab.add(mpd);
	modlab.add(mumname);
	modlab.add(mpwd);
	modlab.add(mname);
	modlab.add(madd);
	modlab.add(mcity);
	modlab.add(mpc);
	modlab.add(mmobno);
	modlab.add(mmailid);
	modlab.add(mtxt1);
	modlab.add(mtxt2);
	modlab.add(mtxt3);
	modlab.add(mtxt4);
	modlab.add(mtxt5);
	modlab.add(mtxt6);
	modlab.add(mtxt7);
	modlab.add(mtxt8);
	modlab.add(mupdate);
	modlab.add(mback);
	modlab.setBounds(1, 1, 400, 650);
	bgimage.add(modlab);
	modlab.setVisible(false);

	//order label
	JLabel ordlab = new JLabel();
	ordlab.setOpaque(true);
	ordlab.setBackground(new Color(0,40,0,200));
	JButton moduser=new JButton("Modify-User");
	JButton ordcre=new JButton("New Order");
	JButton ordsta=new JButton("Order Status");
	JButton ordback=new JButton("Exit");
	moduser.setFont(new Font("Arial", Font.BOLD, 20));
	ordcre.setFont(new Font("Arial", Font.BOLD, 20));
        ordsta.setFont(new Font("Arial", Font.BOLD, 20));
        ordback.setFont(new Font("Arial", Font.BOLD, 20));
  	moduser.setBounds(90,190,200,35);
	ordcre.setBounds(90,250,200,35);
	ordsta.setBounds(90,310,200,35);
	ordback.setBounds(90,370,200,35);
	ordlab.add(moduser);
	ordlab.add(ordcre);
	ordlab.add(ordsta); 
	ordlab.add(ordback); 
	ordlab.setBounds(1, 1, 400, 650);
	ordlab.setVisible(false);
	bgimage.add(ordlab);

	//Order Creation.....
	JLabel ordnew = new JLabel();      
	ordnew.setOpaque(true);
        ordnew.setBackground(new Color(0,40,0,200));
	JLabel ordnewl=new JLabel("Place Your Order");
	JLabel orddt=new JLabel("Order Date :");
	JLabel eqtyl=new JLabel("Enter Quantity:");
	JLabel cqtyl=new JLabel("Confirm Quantity:");
	JTextField dtxt=new JTextField();
	JTextField eqtxt=new JTextField();
	JTextField cqtxt=new JTextField();
	JButton ordsubmit=new JButton("Submit");
	JButton back2=new JButton("Back");
	ordnewl.setFont(new Font("Arial", Font.BOLD, 22));
	orddt.setFont(new Font("Arial", Font.BOLD, 18));
	eqtyl.setFont(new Font("Arial", Font.BOLD, 18));
	cqtyl.setFont(new Font("Arial", Font.BOLD, 18));
	dtxt.setFont(new Font("Arial", Font.BOLD, 16));
	eqtxt.setFont(new Font("Arial", Font.BOLD, 16));
	cqtxt.setFont(new Font("Arial", Font.BOLD, 16));
	ordsubmit.setFont(new Font("Arial", Font.BOLD, 20));
        back2.setFont(new Font("Arial", Font.BOLD, 20));
	ordsubmit.setBounds(80, 390, 100, 35);
        back2.setBounds(200, 390, 100, 35);
        ordnewl.setForeground(Color.WHITE);
        orddt.setForeground(Color.WHITE);
        eqtyl.setForeground(Color.WHITE);
        cqtyl.setForeground(Color.WHITE);
	ordnewl.setBounds(100,110,180,30);
	orddt.setBounds(60,185,180,30);
	eqtyl.setBounds(60,235,180,30);
	cqtyl.setBounds(60,285,180,30);
	dtxt.setBounds(230,185,100,25);
	eqtxt.setBounds(230,235,50,25);
	cqtxt.setBounds(230,285,50,25);
	LocalDate dt1 = LocalDate.now();
        dtxt.setText(dt1.toString());
	//dtxt.setEditable(false);
	
	ordnew.add(ordnewl);
	ordnew.add(orddt);
	ordnew.add(eqtyl);
        ordnew.add(cqtyl);
	ordnew.add(dtxt);
	ordnew.add(eqtxt);
        ordnew.add(cqtxt);
	ordnew.add(ordsubmit);
	ordnew.add(back2);
	ordnew.setBounds(1, 1, 400, 650);
	ordnew.setVisible(false);
	bgimage.add(ordnew);
    
        mpgbe.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){                
                  System.exit(0);
            }
 	});
	 mpgb1.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		  exlab.setVisible(true); 
		  bgimage.add(exlab);
		  bgimage.setBounds(1, 1, 400, 650);
		  exlab.setBounds(1, 1, 400, 650);
		  bgimage.setVisible(true); 
	          mpg.setVisible(false);  

            }
 	});
	mpgb2.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){ 
		  newlab.setVisible(true);
		  bgimage.add(newlab);
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.setVisible(true); 
	          mpg.setVisible(false);  
      		  txt1.setText("");
      		  txt2.setText("");
      		  txt2.setEchoChar('*');
      		  txt3.setText("");
      		  txt4.setText("");
      		  txt5.setText("");
      		  txt6.setText("");
      		  txt7.setText("");
      		  txt8.setText("");

            }
 	});
	save.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){ 
      		        	try {
            		if (txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty() ||
                	txt3.getText().trim().isEmpty() || txt4.getText().trim().isEmpty() ||
                	txt5.getText().trim().isEmpty() || txt6.getText().trim().isEmpty() ||
                	txt7.getText().trim().isEmpty() || txt8.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter all the details");
                		return;
            		}

            		String uname = txt1.getText();
            		if (!uname.matches("[a-zA-Z\\s]+")) {
                		JOptionPane.showMessageDialog(null, "Invalid User Name");
                		return;
            		}

            		String pword = txt2.getText();
            		String cname = txt3.getText();
            		if (!cname.matches("[a-zA-Z\\s]+")) {
                		JOptionPane.showMessageDialog(null, "Invalid name");
                		return;
            		}

            		String cadd = txt4.getText();
            		String ccity = txt5.getText();
            		if (!ccity.matches("[a-zA-Z\\s]+")) {
                		JOptionPane.showMessageDialog(null, "Invalid City name");
                		return;
            		}

            		String cpincode = txt6.getText();
            		if (!cpincode.matches("\\d{6}")) {
                		JOptionPane.showMessageDialog(null, "Invalid Pincode");
                		return;
            		}

            		String cmobile = txt7.getText();
            		if (!cmobile.matches("\\d{10}")) {
                		JOptionPane.showMessageDialog(null, "Invalid Mobile no");
                		return;
            		}

            		String cemail = txt8.getText();
            		if (!cemail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                		JOptionPane.showMessageDialog(null, "Invalid Email id");
                		return;
            		}

            		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
            		String USER = "root";
            		String PASS = "Aravind2005@";

            		Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

            		// Check if username already exists
            		String queryCheck = "SELECT COUNT(*) FROM customers WHERE username = ?";
            		PreparedStatement checkStmt = con.prepareStatement(queryCheck);
            		checkStmt.setString(1, uname);
            		ResultSet rsCheck = checkStmt.executeQuery();

            		if (rsCheck.next() && rsCheck.getInt(1) != 0) {
                		JOptionPane.showMessageDialog(null, "Username already exists");
                		con.close();
                		return;
            		}

            		String queryID = "SELECT MAX(id) FROM customers";
            		Statement st = con.createStatement();
            		ResultSet rs = st.executeQuery(queryID);
            		int id = 1;
            		if (rs.next()) {
                		id = rs.getInt(1) + 1;
            		}

 	    		String queryInsert = "INSERT INTO customers VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            		PreparedStatement pst = con.prepareStatement(queryInsert);
            		pst.setInt(1, id);
            		pst.setString(2, uname);
            		pst.setString(3, pword);
            		pst.setString(4, cname);
            		pst.setString(5, cadd);
            		pst.setString(6, ccity);
            		pst.setString(7, cpincode);
            		pst.setString(8, cmobile);
           		pst.setString(9, cemail);

            		int rows = pst.executeUpdate();

            		if (rows == 1) {
                		JOptionPane.showMessageDialog(null, "Profile Saved Successfully!");
                		bgimage.setBounds(1, 1, 400, 650);
                		bgimage.add(mpg);
                		mpg.setVisible(true);
                		bgimage.setVisible(true);
                		newlab.setVisible(false);
            		} 
			else 
			{
                		JOptionPane.showMessageDialog(null, "Not Inserted!");
            		}
			con.close();

        	} 
		catch (Exception e1) 
		{
            		e1.printStackTrace();
        	}
            }
 	});

	back.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(mpg); 
		  mpg.setVisible(true);
		  bgimage.setVisible(true);               
                  newlab.setVisible(false);  

            }
 	});

	back1.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(mpg); 
		  mpg.setVisible(true);
		  bgimage.setVisible(true);               
                  exlab.setVisible(false);  

            }
 	});
      
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 try{
		   if (unametxt.getText().trim().isEmpty() && pwdtxt.getText().trim().isEmpty()) {
                		JOptionPane.showMessageDialog(null, "Enter Username and password");
                		return;
            	   }
            	   if (!unametxt.getText().trim().isEmpty() && pwdtxt.getText().trim().isEmpty()) {
                		JOptionPane.showMessageDialog(null, "Enter password");
                		return;
            	   }
            	   if (unametxt.getText().trim().isEmpty() && !pwdtxt.getText().trim().isEmpty()) {
                		JOptionPane.showMessageDialog(null, "Enter username");
                		return;
            	   }
		   String url1 = "jdbc:mysql://localhost:3306/Aravind";
            	   String uname1 = "root";
            	   String passwd2 = "Aravind2005@";
            	   //String passwd = txt2.getText();
           	   String id = "'" + unametxt.getText() + "'";
            	   String query1 = "select count(*) from customers where username=" + id;
            	   Connection con3 = DriverManager.getConnection(url1, uname1, passwd2);
            	   Statement st2 = con3.createStatement();
            	   ResultSet rs3 = st2.executeQuery(query1);
            	   if (rs3.next() && rs3.getInt(1) == 0) {
                		JOptionPane.showMessageDialog(null, "Invalid User Name");
                		return;
            	   }
                   String url="jdbc:mysql://localhost:3306/Aravind";
                   String uname="root";
                   String passwd="Aravind2005@";
                   String name1 = unametxt.getText();
                   String passwd1 = pwdtxt.getText();
		   String temp="'"+name1+"'";
		   Connection con2=DriverManager.getConnection(url,uname,passwd);
		   String query="select passwd from customers where username="+temp;
		   String query2="select id from customers where username="+temp;
	           Statement pst2=con2.createStatement();
	           Statement pst3=con2.createStatement();
                   //CallableStatement cst=con2.prepareCall("{call Getname(?)}");
                   //cst.setString(1,name1);
                   ResultSet rs1=pst2.executeQuery(query);
                   ResultSet rs2=pst3.executeQuery(query2);
                   rs1.next();
                   rs2.next();
                   String password1=rs1.getString(1);
                   String id1=rs2.getString(1);		
		   if (passwd1.equals(null))
			{
			 unametxt.setText("");
			 pwdtxt.setText("");
			 JOptionPane.showMessageDialog(null,"Invalid username or password");
			}
			else
			{
			}
                   if(password1.equals(passwd1))
                      { 
                       System.out.println("Login sucessful");
		       ordlab.setVisible(true);
		       bgimage.add(ordlab);
		       bgimage.setBounds(1, 1, 400, 650);
		       ordlab.setBounds(1, 1, 400, 650);
		       bgimage.setVisible(true); 
                       exlab.setVisible(false);
                       }                     
                     else
                     {
                     JOptionPane.showMessageDialog(null,"Invalid username or password");
			unametxt.setText("");
			pwdtxt.setText("");
                     }
            	JLabel cul = new JLabel("Customer ID :"+id1);
        	cul.setFont(new Font("Arial", Font.BOLD, 18));
        	cul.setForeground(Color.WHITE);
        	cul.setBounds(1, 30, 380, 30);
                ordlab.add(cul);
                   }	
                   catch(Exception ex)
                   {
                      System.out.println(ex);
                   } 
		String un = unametxt.getText();
            	JLabel lul = new JLabel("Welcome Mr/Ms."+un);
        	lul.setFont(new Font("Arial", Font.BOLD, 18));
        	lul.setForeground(Color.WHITE);
        	lul.setBounds(1, 1, 380, 30);	
            	//ordlab.add(lul);
                }

        });

	 moduser.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		  modlab.setVisible(true); 
		  bgimage.add(modlab);
		  bgimage.setBounds(1, 1, 400, 650);
		  modlab.setBounds(1, 1, 400, 650);
		  bgimage.setVisible(true); 
	          ordlab.setVisible(false);
             try
             {
                   String url="jdbc:mysql://localhost:3306/Aravind";
                   String uname="root";
                   String passwd="Aravind2005@";
                   String name5 = unametxt.getText();
		   String temp5="'"+name5+"'";
		   Connection con12=DriverManager.getConnection(url,uname,passwd);
		   String query="select * from customers where username="+temp5;
	           Statement psmt2=con12.createStatement();
                   ResultSet rs11=psmt2.executeQuery(query);
                   rs11.next();

		String susername=rs11.getString(2);
		String spasswd=rs11.getString(3);
		String sname=rs11.getString(4);
		String saddress=rs11.getString(5);
		String scity=rs11.getString(6);
		String spincode=rs11.getString(7);
		String smobileno=rs11.getString(8);
		String smailid=rs11.getString(9);

        	mtxt1.setText(susername);
		mtxt1.setEditable(false);
        	mtxt2.setText(spasswd);
		mtxt2.setEchoChar('*');
        	mtxt3.setText(sname);
        	mtxt4.setText(saddress);
        	mtxt5.setText(scity);
        	mtxt6.setText(spincode);
        	mtxt7.setText(smobileno);
        	mtxt8.setText(smailid);
             }
             catch(Exception e1)
             { 
		//cnn4.rollback();
                System.out.println(e1);    
             }
            }
 	});
	mback.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(ordlab); 
		  ordlab.setVisible(true);
		  bgimage.setVisible(true);               
                  modlab.setVisible(false);  

            }
 	});

        mupdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
  try
             {
	     final String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
             final String USER="root";
             final String PASS="Aravind2005@";

             Connection cnn4 = null;
        	final String uuser=mtxt1.getText();
        	final String upwd=mtxt2.getText();
        	final String ucname=mtxt3.getText();
        	final String uaddress=mtxt4.getText();
        	final String ucity=mtxt5.getText();
        	final String upincode=mtxt6.getText();
        	final String umobileno=mtxt7.getText();
        	final String umailid=mtxt8.getText();

             cnn4 = DriverManager.getConnection(DB_URL,USER,PASS);

             PreparedStatement smt1 = cnn4.prepareStatement("update customers"+" set passwd=?,name= ?, address=?, city=?, pincode=?, mobileno=?, mailid=?"+"where username=?");

             smt1.setString(1,upwd);
             smt1.setString(2,ucname);
             smt1.setString(3,uaddress);
             smt1.setString(4,ucity);
             smt1.setString(5,upincode);
             smt1.setString(6,umobileno);
	     smt1.setString(7,umailid);
	     smt1.setString(8,uuser);

             smt1.executeUpdate();
             JOptionPane.showMessageDialog(null,"Updated Successfully!");
}
             catch(Exception e11)
             { 
                System.out.println(e11);    
             }
            }
        
        });

	ordback.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
 
                  System.exit(0);

            }
 	});

	ordcre.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){

		try{
                   String url="jdbc:mysql://localhost:3306/Aravind";
                   String uname="root";
                   String passwd="Aravind2005@";
                   String name1 = unametxt.getText();
                   String passwd1 = pwdtxt.getText();
		   String temp1="'"+name1+"'";
		   Connection con2=DriverManager.getConnection(url,uname,passwd);
		   String query3="select id from customers where username="+temp1;
	           Statement pst3=con2.createStatement();
                   ResultSet rs3=pst3.executeQuery(query3);
                   rs3.next();
                   String id1=rs3.getString(1);		
            	JLabel cul1 = new JLabel("Customer ID :"+id1);
        	cul1.setFont(new Font("Arial", Font.BOLD, 18));
        	//cul1.setBackground(new Color(0,20,0));
        	cul1.setForeground(Color.WHITE);
        	cul1.setBounds(1, 30, 380, 30);
                ordnew.add(cul1);
                   }	
                   catch(Exception ex)
                   {
                      System.out.println(ex);
                   } 
		String un = unametxt.getText();
            	JLabel lul1 = new JLabel("Welcome Mr/Ms."+un);
        	lul1.setFont(new Font("Arial", Font.BOLD, 18));
        	//lul1.setBackground(new Color(0,20,0));
        	lul1.setForeground(Color.WHITE);
        	lul1.setBounds(1, 1, 380, 30);	
            	ordnew.add(lul1);
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(ordnew);               
		  ordnew.setBounds(1, 1, 400, 650);
		  bgimage.setVisible(true);
		  ordnew.setVisible(true); 
                  ordlab.setVisible(false);
		  cfrm.add(bgimage); 
		  eqtxt.setText("");
		  cqtxt.setText("");		   

            }
 	});

	ordsubmit.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		     String s1 = eqtxt.getText();
 		     String s2 = cqtxt.getText();
		if (!s1.equals(s2))
		   { 
                      JOptionPane.showMessageDialog(null,"Confirm Quantity not Matched");
		   }
		else
		  {
		try{
     		   String eqty1=eqtxt.getText();
                   String url2="jdbc:mysql://localhost:3306/Aravind";
                   String uname2="root";
                   String passwd2="Aravind2005@";
		   Connection cn7 = null;
                   String name1 = unametxt.getText();
		   String temp2="'"+name1+"'";
		   String q1="select id,name,address,city,pincode,mobileno,mailid from customers where username="+temp2;
		   cn7=DriverManager.getConnection(url2,uname2,passwd2);
	           Statement st1=cn7.createStatement();
                   ResultSet rs6=st1.executeQuery(q1);
                   rs6.next();
                   String id2=rs6.getString(1);
		   String oname=rs6.getString(2);
                   String oaddress=rs6.getString(3);
                   String ocity=rs6.getString(4);
                   String opincode=rs6.getString(5);
                   String omobileno=rs6.getString(6);
                   String omailid=rs6.getString(7);

		   String oorderdate=dtxt.getText();
		   //Integer oorderqty=eqtxt.getText();
		
      		String DB_URL = "jdbc:mysql://localhost:3306/Aravind";
      		String USER="root";
      		String PASS="Aravind2005@";
      		Connection conn9 = null;
             		conn9 = DriverManager.getConnection(DB_URL,USER,PASS);
             		String q2="select max(orderno) from orders";
             		Statement st9=conn9.createStatement();
            		 ResultSet rs9=st9.executeQuery(q2);
             		rs9.next();
             		int orderno1=rs9.getInt(1);
             		orderno1=orderno1+1;
            		String q3="insert into orders values(?,?,?,?,?,?,?,?,?,?)";
             		PreparedStatement pst9=conn9.prepareStatement(q3);
             		pst9.setString(1,id2);
             		pst9.setString(2,oname);
             		pst9.setString(3,oaddress);
            		pst9.setString(4,ocity);
             		pst9.setString(5,opincode);
             		pst9.setString(6,omobileno);
             		pst9.setString(7,omailid);
             		pst9.setInt(8,orderno1);
             		pst9.setString(9,oorderdate);
			int oorderqty=Integer.parseInt(eqtxt.getText());
             		pst9.setInt(10,oorderqty);

             		int rows=pst9.executeUpdate();
             		if(rows==1)
             			{
                   	 JOptionPane.showMessageDialog(null,"Order Placed Successfully!");
		    	bgimage.setBounds(1, 1, 400, 650);
		    	bgimage.add(ordlab); 
		    	ordlab.setVisible(true);
		    	bgimage.setVisible(true);               
                    	ordnew.setVisible(false);  
             			}
             			else
             			{
                		  JOptionPane.showMessageDialog(null,"Not Inserted!");
             			}

			}
		  
             		catch(Exception ep)
             		   { 
                		System.out.println(ep);    
             		   }
 			}
		}

 	});

	back2.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(ordlab); 
		  ordlab.setVisible(true);
		  bgimage.setVisible(true);               
                  ordnew.setVisible(false);  

            }
 	});


	//Order Status Report settings...

        JLabel osr = new JLabel();
        osr.setOpaque(true);
        osr.setBackground(new Color(0,40,0,200));
        JLabel osrlbl,osrlbl2,osrlbl3,osrlbl4,osrlbl5;
        JTextField osrtxt2,osrtxt3;
        Button osrb1,osrb2,osrb3;

        osrlbl = new JLabel("Order Status");
        osrlbl2 = new JLabel("Starting Date :");
        osrlbl3 = new JLabel("End Date :");
        osrlbl4 = new JLabel("Status-Order Delivered");
        osrlbl5 = new JLabel("Status-Order Pending");

        osrlbl.setFont(new Font("Arial", Font.BOLD, 18));
        osrlbl2.setFont(new Font("Arial", Font.BOLD, 18));
        osrlbl3.setFont(new Font("Arial", Font.BOLD, 18));
        osrlbl4.setFont(new Font("Arial", Font.BOLD, 18));
        osrlbl5.setFont(new Font("Arial", Font.BOLD, 18));

        osrlbl.setForeground(Color.WHITE);
        //osrlbl.setBackground(new Color(10,10,10));
        osrlbl2.setForeground(Color.WHITE);
        osrlbl3.setForeground(Color.WHITE);
        osrlbl4.setForeground(Color.WHITE);
        osrlbl5.setForeground(Color.WHITE);

        osrlbl.setBounds(150, 50, 130, 50);
        osrlbl2.setBounds(50, 115, 150, 30);
        osrlbl3.setBounds(50, 145, 150, 30);
        osrlbl4.setBounds(95, 260, 250, 30);
        osrlbl5.setBounds(100, 405, 250, 30);

        osrtxt2 = new JTextField();
        osrtxt3 = new JTextField();
        osrtxt2.setFont(new Font("Arial", Font.BOLD, 16));
        osrtxt3.setFont(new Font("Arial", Font.BOLD, 16));
        osrtxt2.setBounds(230, 115, 100, 25);
        osrtxt3.setBounds(230, 155, 100, 25);
	LocalDate dtf1 = LocalDate.now();
        osrtxt2.setText(dtf1.toString());
        osrtxt3.setText(dtf1.toString());

        osrb1 = new Button("Submit");
        osrb2 = new Button("Back");
        osrb3 = new Button("Clear");

        osrb1.setFont(new Font("Arial", Font.BOLD, 18));
        osrb2.setFont(new Font("Arial", Font.BOLD, 18));
        osrb3.setFont(new Font("Arial", Font.BOLD, 18));

        osrb1.setBounds(50, 200, 80, 30);
        osrb2.setBounds(150, 200, 80, 30);
        osrb3.setBounds(250, 200, 80, 30);

        osr.add(osrlbl);
        osr.add(osrlbl2);
        osr.add(osrlbl3);
        osr.add(osrlbl4);
        osr.add(osrlbl5);
        osr.add(osrtxt2);
        osr.add(osrtxt3);
        osr.add(osrb1);
        osr.add(osrb2);
        osr.add(osrb3);

        //osr.setBounds(1, 1, 400, 650);
        osr.setVisible(false);
	bgimage.add(osr);

	ordsta.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e){

		try{
                   String url="jdbc:mysql://localhost:3306/Aravind";
                   String uname="root";
                   String passwd="Aravind2005@";
                   String name1 = unametxt.getText();
		   String temp="'"+name1+"'";
		   Connection con2=DriverManager.getConnection(url,uname,passwd);
		   String query="select id from customers where username="+temp;
	           Statement pst2=con2.createStatement();
                   ResultSet rs1=pst2.executeQuery(query);
                   rs1.next();
                   String cid1=rs1.getString(1);
        	   JLabel Un = new JLabel ("Welcome Mr/Ms."+name1);
		   JLabel Uid = new JLabel ("Customer ID:"+cid1);
        	   Un.setFont(new Font("Arial", Font.BOLD, 18));
        	   Uid.setFont(new Font("Arial", Font.BOLD, 18));
        	   Un.setForeground(Color.WHITE);
        	   Uid.setForeground(Color.WHITE);
		   Un.setBounds(1,1,250,30);
		   Uid.setBounds(1,25,250,30);
		   osr.add(Un);
		   osr.add(Uid);
			}	
                   catch(Exception ex)
                   {
                      System.out.println(ex);
                   }

		  cfrm.add(bgimage);
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(osr); 
		  osr.setBounds(1, 1, 400, 650); 
		  bgimage.setVisible(true); 
		  osr.setVisible(true);
                  ordlab.setVisible(false); 
            }
 	});
        osrb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		  bgimage.setBounds(1, 1, 400, 650);
		  bgimage.add(ordlab); 
             	  ordlab.setVisible(true); 
		  bgimage.setVisible(true);               
                  osr.setVisible(false);
            }
        
        });


        cfrm.setVisible(true);

	DefaultTableModel modelos1 = new DefaultTableModel();
        JTable tableos1 = new JTable();
	DefaultTableModel modelos2 = new DefaultTableModel();
        JTable tableos2 = new JTable();

        osrb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
	if(modelos1.getRowCount()==0){
		
		try{
                   String url="jdbc:mysql://localhost:3306/Aravind";
                   String uname="root";
                   String passwd="Aravind2005@";
                   String name1 = unametxt.getText();
		   String temp="'"+name1+"'";
		   Connection con2=DriverManager.getConnection(url,uname,passwd);
		   String query="select id from customers where username="+temp;
	           Statement pst2=con2.createStatement();
                   ResultSet rs1=pst2.executeQuery(query);
                   rs1.next();
                   String cid1=rs1.getString(1);

   		final String URL =  "jdbc:mysql://localhost:3306/Aravind";
   		final String USER = "root";
   		final String PASSWORD = "Aravind2005@";

	    	LocalDate sd1 = LocalDate.parse(osrtxt2.getText());
	    	LocalDate ed1 = LocalDate.parse(osrtxt3.getText());
            	Date startDate = Date.valueOf(sd1);  
            	Date endDate = Date.valueOf(ed1);    


        	String query3 = "SELECT * FROM delivery WHERE Cust_ID = ? AND Bill_Date BETWEEN ? AND ?";
		tableos1.setModel(modelos1);

        	// Define the column names for the JTable (change these to match your table's structure)
        	modelos1.addColumn("Date"); 
        	modelos1.addColumn("Order Qty");
        	modelos1.addColumn("Delivery Qty");

           	Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             	PreparedStatement statement2 = connection.prepareStatement(query3);
            	statement2.setString(1, cid1);
            	statement2.setDate(2, startDate);
            	statement2.setDate(3, endDate);

           	ResultSet resultSet = statement2.executeQuery();

                // Check if there's data

                if (!resultSet.isBeforeFirst()) {
			modelos1.setRowCount(0);
			modelos1.setColumnCount(0);
                    JOptionPane.showMessageDialog(tableos1, "No data found for ID: " + cid1 + " in the selected date range.");
                } 
                    while (resultSet.next()) {
                        Object[] rowData = new Object[]{
                                resultSet.getObject("Bill_Date"), 
                                resultSet.getObject("Order_Qty"), 
                                resultSet.getObject("Delivery_Qty"),  
                                //resultSet.getObject("Can_Returned_Qty"), 

                        };
                        modelos1.addRow(rowData);
                    }
        	String query4 = "SELECT * FROM orders WHERE cid = ? AND orderdate BETWEEN ? AND ?";
		tableos2.setModel(modelos2);

        	// Define the column names for the JTable (change these to match your table's structure)
        	modelos2.addColumn("Date"); 
        	modelos2.addColumn("Order Qty");
        	//modelos2.addColumn("Delivery Qty");

           	Connection connection2 = DriverManager.getConnection(URL, USER, PASSWORD);
             	PreparedStatement statement3 = connection2.prepareStatement(query4);
            	statement3.setString(1, cid1);
            	statement3.setDate(2, startDate);
            	statement3.setDate(3, endDate);

           	ResultSet resultSet2 = statement3.executeQuery();

                // Check if there's data

                if (!resultSet2.isBeforeFirst()) {
			modelos2.setRowCount(0);
			modelos2.setColumnCount(0);
                    JOptionPane.showMessageDialog(tableos1, "No data found for ID: " + cid1 + " in the selected date range.");
                } 
                    while (resultSet2.next()) {
                        Object[] rowData2 = new Object[]{
                                resultSet2.getObject("orderdate"), 
                                resultSet2.getObject("orderqty"), 

                        };
                        modelos2.addRow(rowData2);

                }
            } 
		catch (Exception ec) {

            	ec.printStackTrace();
            	JOptionPane.showMessageDialog(tableos1, "Error fetching data: " + ec.getMessage());
        	}
            JScrollPane scrollPane = new JScrollPane(tableos1);
		   scrollPane.setBounds(50,285,300,100);
		   scrollPane.setVisible(true);
            osr.add(scrollPane, BorderLayout.CENTER);

            JScrollPane scrollPane2 = new JScrollPane(tableos2);
		   scrollPane2.setBounds(50,430,300,100);
		   scrollPane2.setVisible(true);
            osr.add(scrollPane2, BorderLayout.CENTER);

		}
             }
        });
        osrb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
		modelos1.setRowCount(0);
		modelos1.setColumnCount(0);
		modelos2.setRowCount(0);
		modelos2.setColumnCount(0);
            }
        
        });

	}
}
