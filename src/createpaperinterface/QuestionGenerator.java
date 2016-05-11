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
	  //	System.out.println("QuestionSet1");
	  //  System.out.println(questionSet1);
	    
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Question Paper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel(new BorderLayout());
		contentPane.setLocation(150, 150);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel[] panels = new JPanel[questionSet1.size()];
   		JLabel[] labels = new JLabel[questionSet1.size()];
   			
		for (int i = 0; i < questionSet1.size(); i++)
		{   panels[i] = new JPanel( );
		    labels[i] = new JLabel( );
			contentPane.add(panels[i],BorderLayout.NORTH);
			String str = questionSet1.get(i);
			//ArrayList<String> questionOption = (str.split(","));
				String string[]=str.split(",");
				String op1= null;
				String op2= null;
				String op3= null;
				String op4= null;
				String ques=null;
			    for(String y:string){
				       ques = string[0];
		               op1 = string[1];
		               op2 = string[2];
		               op3 = string[3];
		               op4 = string[4];
		           
		         }
		//    labels[i].setText(questionSet1.get(i));
				   labels[i].setText(ques);
				   panels[i].add(labels[i]);
			    
				   JRadioButton radioButton1= new JRadioButton(op1);
			       JRadioButton radioButton2 = new JRadioButton(op2);
			       JRadioButton radioButton3 = new JRadioButton(op3);
			       JRadioButton radioButton4 = new JRadioButton(op4);
			       /*
			        * only one option can be selected
			        */
			       ButtonGroup group = new ButtonGroup();
			       group.add(radioButton1);
			       group.add(radioButton2);
			       group.add(radioButton3);
			       group.add(radioButton4);
				  
				   panels[i].add(radioButton1);
				   panels[i].add(radioButton2);
				   panels[i].add(radioButton3);
				   panels[i].add(radioButton4);
				   
				   panels[i].setVisible(true);
				   labels[i].setVisible(true);
		   
		}
				
		JButton submitBut = new JButton("Submit"); 
		contentPane.add(submitBut);
	}

	
}
