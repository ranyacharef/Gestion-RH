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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import net.proteanit.sql.DbUtils;

public class ModifierReunion extends JFrame{
	
	private JPanel p;
	private JPanel p1;
	private JLabel LabIcone;
	private JLabel background;
	private JLabel title;
	private JScrollPane sp;
	private JButton Save;
	private JButton retour;
	private JTextField id_rec;
	private JTextField id_tr;
	
	public ModifierReunion(String s) {
		 
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
        title.setText("Modifier une Reunion");
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
        
        
       Object[][] data = new Object[][]{
        		 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null},
                 {null, null, null, null,  null}
        };
        
      
        
        String[] head = new String[] {"N° Réunion", "Nom", "Date Début","Heure Début", "Type Réunion", "Membre(s)"};
        
        JTable tabletravail = new JTable(new DefaultTableModel(data,head));
        tabletravail.setSize(getPreferredSize());
        
        
        String[] combo = new String[] {
        		"Réunion de Travail", 
        		"Réunion de Recrutement"
        };
        JComboBox c = new JComboBox(combo);
        TableColumn colonneType = tabletravail.getColumnModel().getColumn(4);
        colonneType.setCellEditor(new DefaultCellEditor(c));
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
        
        Object[][] data2 = new Object[][] {};
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
        
        Save = new JButton();
        Save.setText("Modifier");
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
		Reunion r = new Reunion("");
		r.setVisible(true);
        this.dispose();
	}
	
	public static void main(String[] args) {
		ModifierReunion p = new ModifierReunion("Modifier Reunion");
		p.show();
	}
}
