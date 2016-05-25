package createpaperinterface;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.util.ArrayList;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import createpaper.QuestionPaper;


//import javax.swing.border.EmptyBorder;

public class QuestionGenerator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int numClicks = 0;
	TextField text = new TextField(20);
	JLabel labelCorrectAns = new JLabel();
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public QuestionGenerator() {
		
	    
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
		
		//Component[] components ;
		ArrayList<String> questionSet1 = new ArrayList<String>();
		QuestionPaper qp1= new QuestionPaper();
		ArrayList<String> CorrectAnswer = new ArrayList<String>();
		
	  	questionSet1= qp1.getQuestionPaper(20);
	  	JPanel[] panels = new JPanel[questionSet1.size()];
		//JLabel[] labels = new JLabel[questionSet1.size()];
   		System.out.println(questionSet1);
   		
   		/*
   		 * for question paper heading
   		 */
   		JLabel label = new JLabel("All questions are mandatory to answer"); 
	    JPanel panel = new JPanel( );
	    contentPane.add(panel);
	    Font font = new Font("Courier", Font.BOLD,18);
        //set font for JLabel
        label.setFont(font);
        panel.add(label);

   		
		for (int i = 0; i < questionSet1.size(); i++)
		{   panels[i] = new QuestionPanel( );
		   // labels[i] = new JLabel( );
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
				  // labels[i].setText(ques);
				  // panels[i].add(labels[i]);
			    
				   QuestionPanel qp = new QuestionPanel();
				   qp.setComponent(ques,op1,op2,op3,op4);
				   contentPane.add(qp.getPanel());
				   
		
				 //  labels[i].setVisible(true);
				   Component[] components = panels[i].getComponents();
			        for (Component c : components) {
			        	JRadioButton cb = (JRadioButton) c;
			          if (cb.isSelected())
			           CorrectAnswer.add(cb.getText());
			          System.out.println(cb.getText());
			        }
				  
		}
		//System.out.println(panels.toString());
		
	    JButton submitBut = new JButton("Submit"); 
		//contentPane.add(submitBut);
		
	    JPanel panel1 = new JPanel( );
	    contentPane.add(panel1);
	    panel1.add(submitBut);
	   
            // action listener for submit button
	    add(text);
	    add(labelCorrectAns);
        submitBut.addActionListener(this);
    	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		numClicks++;
        text.setText("Button Clicked " + numClicks + " times");
        labelCorrectAns.setText("Button Clicked " + numClicks + " times");
        
       
	}
	
}
