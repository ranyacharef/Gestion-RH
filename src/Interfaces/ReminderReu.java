package Interfaces;

import javax.swing.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReminderReu extends JFrame {

	private JLabel dateRec;
    private JLabel dateReuEq;
    private JButton Retour;
    private JLabel labIcone;
    private JLabel HeuredebRec;
    private JLabel HeureFinRec;
    private JLabel eq;
    private JLabel NomReu;
    private JLabel labDebH;
    private JLabel labFinH;
    private JLabel rec;
    private JLabel NomCand;
    private JPanel p;
    private JSeparator sep;
    
    public ReminderReu(String s) {
    	
    	super(s);
  

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(300, 5));
        setSize(1322,1000);
        setResizable(true);   
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        p.setBackground(new Color(204, 204, 204));
        p.setInheritsPopupMenu(true);
        p.setBounds(1, 1, 1322, 980);
        
        labIcone = new JLabel();
        labIcone.setIcon(new ImageIcon(getClass().getResource("/images/interface reunion.jpg"))); 
        labIcone.setBounds(1, 1, 1322, 739);
        p.add(labIcone);
      
        
        
        eq = new JLabel();
        eq.setFont(new Font("Century", 2, 18)); 
        eq.setText("Réunion d'équipe :");
        eq.setBounds(50,780,156,22);
        p.add(eq);
        
        NomReu = new JLabel();
        NomReu.setText("NomReuEq");
        NomReu.setBounds(350, 780, 200, 30);
        p.add(NomReu);
        
        dateReuEq = new JLabel();
        dateReuEq.setText("dateReuEq");
        dateReuEq.setBounds(650, 780, 300, 30);
        p.add(dateReuEq);
        
        labDebH = new JLabel();
        labDebH.setText("HeuredebReuEq");
        labDebH.setBounds(950, 780, 300, 30);
        p.add(labDebH);
        
        labFinH = new JLabel();
        labFinH.setText("HeureFin");
        labFinH.setBounds(1150, 780, 300, 30);
        p.add(labFinH);
        
        sep = new JSeparator();
        sep.setForeground(new Color(0, 0, 0));
        sep.setBounds(50, 810, 1200, 5);
        p.add(sep);
        
       
        
        

        rec = new JLabel();
        rec.setFont(new Font("Century", 2, 18));
        rec.setText("Réunion Recrutement  :");
        rec.setBounds(50, 820, 200, 22);
        p.add(rec);
        
        NomCand = new JLabel();
        NomCand.setText("Nom Candidat :");
        NomCand.setBounds(350, 820, 200, 30);
        p.add(NomCand);
        
        dateRec = new JLabel();
        dateRec.setText("dateRec");
        dateRec.setBounds(650, 820, 200, 30);
        p.add(dateRec);

        HeuredebRec = new JLabel();
        HeuredebRec.setText("datedebRec");
        HeuredebRec.setBounds(950, 820, 200, 30);
        p.add(HeuredebRec);

        HeureFinRec = new JLabel();
        HeureFinRec.setText("HeureFinRec");
        HeureFinRec.setBounds(1150, 820, 200, 30);
        p.add(HeureFinRec);

        
        
        Retour = new JButton();
        Retour.setText("RETOUR");
        Retour.setFont(new Font("Arial",0,16));
        Retour.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jButton1MouseClicked(e);
            }
        });
        Retour.setBounds(600, 880, 161, 50);
        p.add(Retour);
        
        showDate();
        showTime();
    }
    
     void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        dateReuEq.setText(s.format(d));
        dateRec.setText(s.format(d));
        
        
    }
    
    void showTime(){
                new Timer(0,new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                     Date d = new Date();
                     
                     SimpleDateFormat h = new SimpleDateFormat("hh:mm");
                     
                     HeuredebRec.setText(h.format(d));
                     HeureFinRec.setText(h.format(d));
                     labDebH.setText(h.format(d));
                     labFinH.setText(h.format(d));
                     
                    }
                 }).start();
           
        
             
                
    }
   
        
    private void jButton1MouseClicked(MouseEvent evt) {                                      
        
        Reunion r = new Reunion("");
        r.setVisible(true);
        this.dispose();
    }                                     

   
    public static void main(String args[]) throws ClassNotFoundException {
       
        ReminderReu r = new ReminderReu("Reminder Reunion");
        r.show();
        try {
        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:odbc:RHM");
        Statement stmt = (Statement) con.createStatement();

       
        String maRequete = "SELECT [date] FROM reunion";
        ResultSet rs = (ResultSet) stmt.executeQuery(maRequete);
        while(rs.next()){
        JOptionPane.showMessageDialog(null, rs.getString(2));}
        rs.close();
        stmt.close();
        con.close();
        }catch (SQLException sqle) {
        	System.out.println("Exception: " +sqle.getMessage());
        }
        
        
       

        
    }

   
}
