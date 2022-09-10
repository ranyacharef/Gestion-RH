package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import net.proteanit.sql.DbUtils;

public class ModifierConge extends JFrame{
		
	private JPanel p;
	private JPanel p1;
	private JLabel LabIcone;
	private JLabel background;
	private JLabel title;
	private JScrollPane sp;
	private JButton Save;
	private JButton retour;
	
	public ModifierConge(String s) {
		 
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(0, 0));
        setSize(1920,1030);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
       
        background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
        background.setBounds(00,70,1920,930);
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
        title.setText("Modifier les Données d'un Conge");
        p1.add(title);
        
		
      
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//TABLE//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        
       Object[][] data = new Object[][]{
        		 
        };
        
      
        
        String[] head = new String[] {"CIN", "Nom", "Prenom", "Sexe","Poste", "Grade","Date Début","Date Fin", "Type Congé"};
        
        JTable table = new JTable(new DefaultTableModel(data,head));
        table.setSize(getPreferredSize());
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
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
       /* String[] pos = new String[] {
        		"Ouvier qualifie",
        		"Employé",
        		"Cadre",
        		"Ingenieur"
        };
        JComboBox p = new JComboBox(pos);
        
        TableColumn colonneposte = table.getColumnModel().getColumn(4);
        colonneposte.setCellEditor(new DefaultCellEditor(p));
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] grade = new String[] {
        		"Grade 0",
        		"Grade 1",
        		"Grade 2",
        		"Grade 4"
        };
        JComboBox g = new JComboBox(grade);
        
        TableColumn colonnegrade = table.getColumnModel().getColumn(5);
        colonnegrade.setCellEditor(new DefaultCellEditor(g));*/
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        
        sp = new JScrollPane(table);
        sp.setBounds(50,50,1820,300);
        background.add(sp);
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        									//Buttons//
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Save = new JButton();
        Save.setText("Enregistrer");
        Save.setFont(new Font("Arial",0,16));
        Save.setBounds(700, 800, 150,70);
        Save.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Save(e);
            }

			private void Save(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        background.add(Save);
        
			
        
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
	
	
	private void Retour(MouseEvent e) {
		// TODO Auto-generated method stub
		Conge r = new Conge("");
        r.setVisible(true);
        this.dispose();
	}
	
	public static void main(String[] args) {
		ModifierConge p = new ModifierConge("Modifier un congé");
		p.show();
	}
}
