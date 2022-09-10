package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import net.proteanit.sql.DbUtils;

public class SupprimerReunion extends JFrame {
	
	
	private JPanel p;
	private JPanel p1;
	private JLabel LabIcone;
	private JLabel background;
	private JLabel title;
	private JScrollPane sp;
	private JButton supp;
	private JButton retour;
	private JTable table;
	private static DefaultTableModel model;
	private static int x;
	private static int r;
	private JTextField id_rec;
	private JTextField id_tr;
	
	public SupprimerReunion(String s) {
		 
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
        title.setBounds(800,10,500,40);
        title.setText("Supprimer une Reunion");
        p1.add(title);
        
		
        id_tr = new JTextField();
        id_tr.setBounds(300, 390, 150, 70);
        background.add(id_tr);
        
        id_rec = new JTextField();
        id_rec.setBounds(1410, 390, 150, 70);
        background.add(id_rec);
        
      
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//TABLE//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
     // Data to be displayed in the JTable 
       Object[][] data = new Object[][]{
        		 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null},
                 {null, null, null, null, null, null}
        };
        
      
        
        String[] head = new String[] {"N° Réunion", "Nom", "Date Début","Heure Début", "Type Réunion", "Membre(s)"};
        
        JTable tabletravail = new JTable(new DefaultTableModel(data,head));
        tabletravail.setSize(getPreferredSize());
        tabletravail.getRowSelectionAllowed();
        x = tabletravail.getModel().getRowCount();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
      
        sp = new JScrollPane(tabletravail);
        sp.setBounds(10,150,800,200);
        background.add(sp);
        Connexion cnx = new Connexion();
        try {
            String query="Select * from reuniontravail" ;
                    PreparedStatement stm=(PreparedStatement) cnx.con.prepareStatement(query) ;
                    ResultSet rs= (ResultSet) stm.executeQuery() ;
                    tabletravail.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        Object[][] data2 = new Object[][] {
        	{null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null}
        };
        String[] head2 = new String[] {"N° Réunion", "Nom", "Date Début","Heure Début", "Type Réunion", "Membre(s)"};
        
        JTable tablerec = new JTable(new DefaultTableModel(data2,head2));
        tablerec.setSize(getPreferredSize());
        
        
        ;
       
       
      
        sp = new JScrollPane(tablerec);
        sp.setBounds(1100,150,800,200);
        background.add(sp);
        try {
            String q="Select * from reunionrec" ;
                    PreparedStatement stm=(PreparedStatement) cnx.con.prepareStatement(q) ;
                    ResultSet rs= (ResultSet) stm.executeQuery() ;
                    tablerec.setModel(DbUtils.resultSetToTableModel(rs));
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
        supp.setBounds(700, 800, 150,70);
        supp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	supp(e);
            }
			
        });
        background.add(supp);
        
        
			
        
        retour = new JButton();
        retour.setText("Retour");
        retour.setFont(new Font("Arial",0,16));
        retour.setBounds(1100,800, 150,70);
        retour.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Retour(e);
            }

			
        });
        background.add(retour);


	}
	
	private void supp(MouseEvent e) {
		// TODO Auto-generated method stub
		/*r = table.getSelectedRow();
	    model.removeRow(r);*/
		Connexion c = new Connexion();
		if(id_tr.getText() != null) {
		String suppEnseignant = "DELETE FROM reuniontravail WHERE id_Reunion=?" ;
		try {
			PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(suppEnseignant);
			
			statement.setString(1,  id_tr.getText());
			statement.executeUpdate();
			System.out.println("Une réunion de travail avec id="+id_tr.getText()+" est supprimé!");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("sql exception!!");
			e1.printStackTrace();
		}}
		else
			if(id_rec.getText() != null) {
				String suppEnseignant = "DELETE FROM reunionrec WHERE id_Reunion=?" ;
				try {
					PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(suppEnseignant);
					
					statement.setString(1,  id_rec.getText());
					statement.executeUpdate();
					System.out.println("Une réunion de recrutement avec id="+id_rec.getText()+" est supprimé!");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("sql exception!!");
					e1.printStackTrace();
				}
		}
	}

	private void Retour(MouseEvent e) {
		// TODO Auto-generated method stub
		Reunion r = new Reunion("");
        
        r.setVisible(true);
        this.dispose();
	}
	
	public static void main(String[] args) {
		SupprimerReunion p = new SupprimerReunion("Supprimer une Reunion");
		p.show();
	}
}
