package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import net.proteanit.sql.DbUtils;

public class ListerFonctionnaires extends JFrame{
	
	private JPanel p;
	private JPanel p1;
	private JPanel pIcone;
	private JLabel LabIcone;
	private JLabel background;
	private JLabel title;
	private JLabel ajoutIcone;
	private JLabel supIcone;
	private JLabel printIcone;
	private JScrollPane sp;
	private JButton Save;
	private JButton retour;
	
	public ListerFonctionnaires(String s) {
		 
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0,0);
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
        title.setText("Liste des fonctionnaires");
        p1.add(title);
        
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//ICON//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        pIcone = new JPanel();
        pIcone.setLayout(null);
        pIcone.setBackground(new Color(3, 3, 22));
        pIcone.setBounds(0,80,1920,30);
        p.add(pIcone);
        
        ajoutIcone = new JLabel();
        ajoutIcone.setIcon(new ImageIcon(getClass().getResource("/images/new.png")));
        ajoutIcone.setBounds(870,0,30,30);
        ajoutIcone.addMouseListener(new MouseAdapter(){
        	public void addRow(MouseEvent e) {
        		
        	}});
        pIcone.add(ajoutIcone);
        
        supIcone = new JLabel();
        supIcone.setIcon(new ImageIcon(getClass().getResource("/images/delete.png")));
        supIcone.setBounds(980,0,30,30);
        supIcone.addMouseListener(new MouseAdapter(){
        	public void SupRow(MouseEvent e) {
        		//sup(e);
        	}

			});       
        pIcone.add(supIcone);
     
        printIcone = new JLabel();
        printIcone.setIcon(new ImageIcon(getClass().getResource("/images/user_print.png")));
        printIcone.setBounds(1100,0,30,30);
        printIcone.addMouseListener(new MouseAdapter(){
        	public void print(MouseEvent e) {
        		impression(e);
        	}
        });
       /* printIcone.addMouseListener(new MouseAdapter(){
        	public void print(MouseEvent e) {
        		impression(e);
        	}});*/
        pIcone.add(printIcone);
		////////////////////////////////////////////////////////////////////////////////////////////////
        										//TABLE//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
    	
       Object[][] data = new Object[][]{
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
        
      
        
        String[] head = new String[] {"CIN", "Nom", "Prenom","Date de Naissance", "Sexe","Diplome", "Contrat","Grade","N° téléphone"};
        
        
        JTable table = new JTable(new DefaultTableModel(data,head));
        table.setSize(getPreferredSize());
        
        sp = new JScrollPane(table);
        sp.setBounds(50,50,1820,350);
        background.add(sp);
        
        Connexion c = new Connexion();
        try {
            String query="Select * from fonctionnaire" ;
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
        
        Save = new JButton();
        Save.setText("Imprimer");
        Save.setFont(new Font("Arial",0,16));
        Save.setBounds(700, 800, 119,50);
        Save.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Save(e);
            }

			private void Save(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "En cours d'impression !");
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
	
	private void impression(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Impression en cours");
		
	}
	private void Retour(MouseEvent e) {
		
		LesFonctionnaires r = new LesFonctionnaires("Les Fonctionnaires");
        r.setVisible(true);
        this.dispose();
	}
	
	public static void main(String[] args) {
		ListerFonctionnaires p = new ListerFonctionnaires("Liste Des Fonctionnaires");
		p.show();
		
	}
}
