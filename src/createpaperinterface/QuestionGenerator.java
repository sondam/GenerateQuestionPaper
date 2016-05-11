package createpaperinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import createpaper.QuestionPaper;

//import javax.swing.border.EmptyBorder;

public class QuestionGenerator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionGenerator frame = new QuestionGenerator();
					frame.setVisible(true);
					frame.setLayout(new FlowLayout());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuestionGenerator() {
		QuestionPaper qp1= new QuestionPaper();
		ArrayList<String> questionSet1 = new ArrayList<String>(1);
	  	questionSet1= qp1.getQuestionPaper(20);
	  	System.out.println("QuestionSet1");
	    System.out.println(questionSet1);
	    
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Question Paper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel(new BorderLayout());
		contentPane.setLocation(150, 150);
	//	contentPane.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel[] panels = new JPanel[questionSet1.size()];
   		JLabel[] labels = new JLabel[questionSet1.size()];
   		
		
		for (int i = 0; i < questionSet1.size(); i++)
		{   panels[i] = new JPanel( );
		    labels[i] = new JLabel( );
			contentPane.add(panels[i],BorderLayout.NORTH);
		    labels[i].setText(questionSet1.get(i));
		   
		    panels[i].add(labels[i]);
		
		       JRadioButton radioButton1 = new JRadioButton("1");
		       JRadioButton radioButton2 = new JRadioButton("2");
		       JRadioButton radioButton3 = new JRadioButton("3");
		       JRadioButton radioButton4 = new JRadioButton("4");
		 
		  
			    panels[i].add(radioButton1);
			    panels[i].add(radioButton2);
			    panels[i].add(radioButton3);
			    panels[i].add(radioButton4);
			   
			    panels[i].setVisible(true);
			    labels[i].setVisible(true);
		    
		    
		}
		
		//JLabel label1= new JLabel();
		//label1.setText("Question1");
		
		JButton submitBut = new JButton("Submit"); 
		//submitBut.setText("Submit");
	
		contentPane.add(submitBut);
	}

}
