package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import net.proteanit.sql.DbUtils;

public class SupprimerConge extends JFrame {
	
	
	private JPanel p;
	private JPanel p1;
	private JLabel LabIcone;
	private JLabel title;
	private JLabel background;
	private JScrollPane sp;
	private JButton supp;
	private JButton retour;
	private JTable table;
	private  DefaultTableModel model;
	private static int r;
	private static int x;
	private JTextField sup;
	
	
	public SupprimerConge(String s) {
		 
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0,0);
        setSize(1920, 1030);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        
        background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
        background.setBounds(0,80,1920,970);
        p.add( background);
        //////////////////////////////////////////////////////////////////////////////////////////////////
        										//Header//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(3, 3, 22));
        p1.setBounds(0,0,1920,70);
        p.add(p1);
        
        LabIcone = new JLabel();
        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
        LabIcone.setBounds(0,0,140,65);
        p1.add(LabIcone);
        
        title = new JLabel();
        title.setFont(new Font("Century", 2, 24)); 
        title.setForeground(new Color(204, 204, 204));
        title.setBounds(850,10,500,40);
        title.setText("Supprimer un Conge");
        p1.add(title);
        
        sup = new JTextField();
        sup.setBounds(860, 380, 150, 70);
        background.add(sup);
		
      
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//TABLE//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        
       Object[][] data = new Object[][]{
        		 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null},
                 {null, null, null, null, null, null, null, null, null}
        };
        
      
        
        String[] head = new String[] {"CIN", "Nom", "Prenom", "Sexe","Poste", "Grade","Date Début","Date Fin", "Type Congé"};
        
        JTable table = new JTable(new DefaultTableModel(data,head));
        table.setSize(getPreferredSize());
        x = table.getModel().getRowCount();
	     
	    DefaultTableModel model =  (DefaultTableModel)table.getModel();
        
       
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
      
        sp = new JScrollPane(table);
        sp.setBounds(50,50,1820,295);
        background.add(sp);
        
        Connexion c = new Connexion();
        try {
            String query="Select * from conge" ;
                    PreparedStatement stm=(PreparedStatement) c.con.prepareStatement(query) ;
                    ResultSet rs= (ResultSet) stm.executeQuery() ;
                    table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        									//Buttons//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        supp = new JButton();
        supp.setText("Supprimer");
        supp.setFont(new Font("Arial",0,16));
        supp.setBounds(700, 800, 119,50);
        supp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	supp(e);
            }

			private void supp(MouseEvent e) {
				// TODO Auto-generated method stub
				// r = table.getSelectedRow();
			    // model.removeRow(r);
				Connexion c = new Connexion();
				String suppEnseignant = "DELETE FROM conge WHERE id_Conge=?" ;
				try {
					PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(suppEnseignant);
					
					statement.setString(1,  sup.getText());
					statement.executeUpdate();
					System.out.println("Un congé avec id="+sup.getText()+" est supprimé!");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("sql exception!!");
					e1.printStackTrace();
				}

			}

			
        });
        background.add(supp);
        
        
			
        
        retour = new JButton();
        retour.setText("Retour");
        retour.setFont(new Font("Arial",0,16));
        retour.setBounds(1100,800, 119,50);
        retour.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Retour(e);
            }

			
        });
        background.add(retour);


	}
	
	
	private void Retour(MouseEvent e) {
		// TODO Auto-generated method stub
		Conge r = new Conge("");
        
        r.setVisible(true);
        this.dispose();
	}
	
	public static void main(String[] args) {
		SupprimerConge p = new SupprimerConge("Supprimer un congé");
		p.show();
	}
}
