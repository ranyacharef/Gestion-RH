package Interfaces;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.TableView.TableRow;
import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Presence extends JFrame {
	
	private JPanel p;
	private JPanel p1;
	private JPanel pIcone;
	private JLabel LabIcone;
	private JLabel title;
	private JButton ajout;
	private JButton sup;
	private JButton print;
	private JLabel background;
	private JScrollPane sp;
	private JButton Save;
	private JButton retour;
	private JComboBox c;
	public Presence(String s) {
		 
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(0,0 ));
        setSize(1920, 1030);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        
        background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
        background.setBounds(0,120,1920,970);
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
        title.setBounds(870,10,364,40);
        title.setText("Gestion des abscences");
        p1.add(title);
        
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//Boutons//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        pIcone = new JPanel();
        pIcone.setLayout(null);
        pIcone.setBackground(new Color(3, 3, 22));
        pIcone.setBounds(0,80,1920,30);
        p.add(pIcone);
        
        ajout = new JButton();
        ajout.setText("Nouveau");
        ajout.setFont(new Font("Arial",0,16));
        ajout.setBounds(419, 680, 200,50);
        ajout.addMouseListener(new MouseAdapter(){
        	public void addRow(MouseEvent e) {
        		
        	}});
        background.add(ajout);
        
        sup = new JButton();
        sup.setText("Supprimer");
        sup.setFont(new Font("Arial",0,16));
        sup.setBounds(819, 680, 200,50);
       
        sup.addMouseListener(new MouseAdapter(){
        	public void SupRow(MouseEvent e) {
        		//sup(e);
        	}

			});       
        
        background.add(sup);
     
        print = new JButton();
        print.setText("Imprimer");
        print.setFont(new Font("Arial",0,16));
        print.setBounds(1219,680,200,50);
        print.addMouseListener(new MouseAdapter(){
        	public void print(MouseEvent e) {
        		impression(e);
        	}
        });
       print.addMouseListener(new MouseAdapter(){
        	public void print(MouseEvent e) {
        		impression(e);
        	}});
        background.add(print);
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//TABLE//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        
       Object[][] data = new Object[][]{
    	   {"10", "06988527", "Charef", "Rania", "Justifié","14/05/2019", "8", null,null},
    	   
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null},
           {null, null, null, null, null, null, null, null,null}
        		
        		
        };
        
      
        
        String[] head = new String[] {"Id", "CIN", "Nom", "Prenom", "Type Abscence", "Date", "Nombre Heures"};
        
        JTable table = new JTable(new DefaultTableModel(data,head));
        table.setSize(getPreferredSize());
        
        String[] combo = new String[] {
        		"Justifiée", 
        		"Non Justifiée"
        };
        JComboBox c = new JComboBox(combo);
        
        TableColumn colonneTypeAbs = table.getColumnModel().getColumn(4);
        colonneTypeAbs.setCellEditor(new DefaultCellEditor(c));
        colonneTypeAbs.getMaxWidth();
        
        sp = new JScrollPane(table);
        sp.setBounds(120,50,1700,600);
        background.add(sp);
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        									//Buttons//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Save = new JButton();
        Save.setText("Enregistrer");
        Save.setFont(new Font("Arial",0,16));
        Save.setBounds(700, 800, 119,50);
        Save.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Save(e);
            }

			
        });
        background.add(Save);
        
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
	private void sup(MouseEvent e) {
		
		//removeRow(getRowCount(int));
	}
	
	
	/*private Object getRowCount() {
		return (Object)data;
		// TODO Auto-generated method stub
		
	}*/
	private void impression(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Impression en cours");
		
	}
	private void Retour(MouseEvent e) {
		// TODO Auto-generated method stub
		Home r = new Home("Home");
        
        r.setVisible(true);
        this.dispose();
	}
	private void Save(MouseEvent e) {
		// TODO Auto-generated method stub
		Connexion c = new Connexion();
		String absence = "INSERT INTO presence (id, cin, nom, prenom, date, heures) VALUES (?, ?, ?, ?,?)";

		//try {
			/*PreparedStatement statement = (PreparedStatement) c.con.prepareStatement(absence);
			statement.setString(1, tf2.getText());
			statement.setString(2, tf3.getText());
			statement.setInt(3, Integer.parseInt(tf4.getText()));
			statement.setInt(4, Integer.parseInt(tf6.getText()));
			statement.setString(5, Jour[jour.getSelectedIndex()]);

			statement.executeUpdate();
			System.out.println("A new abs was inserted successfully!");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("sql exception!!");
			e1.printStackTrace();
		}*/
	}
	
	public static void main(String[] args) {
		Presence p = new Presence("");
		p.show();
		
	}
}
