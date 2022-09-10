package Interfaces;

import java.sql.*;

import javax.swing.JOptionPane;

public class Connexion {
	public Connection con;
	static Statement stm;
	
	public Connexion()
	{ 
	
		try
	{ Class.forName("com.mysql.jdbc.Driver");
	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm","root","");
	stm =con.createStatement();		
	if(con!=null) JOptionPane.showMessageDialog(null, "connected");
	}catch(SQLException sqle)
	{ JOptionPane.showMessageDialog(null, sqle.getMessage(),"Erreur",JOptionPane.WARNING_MESSAGE);} 
	catch(ClassNotFoundException cnx)
	{JOptionPane.showMessageDialog(null, cnx.getMessage(),"Erreur",JOptionPane.WARNING_MESSAGE);}}
	
	
	public void close()
	{try
	{stm.close();
	con.close();
		
	}catch(SQLException sql)
	{ JOptionPane.showMessageDialog(null, sql.getMessage(),"Erreur",JOptionPane.WARNING_MESSAGE);}	
	}
	}

