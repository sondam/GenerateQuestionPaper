package createpaperinterface;

import java.awt.BorderLayout;
import java.awt.Component;
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
	ArrayList<String> questionSet1 = new ArrayList<String>();
	QuestionPaper qp1= new QuestionPaper();
	JPanel[] panels = new JPanel[questionSet1.size()];
	ArrayList<JPanel> questionPanelArray = new ArrayList<JPanel>();
	ArrayList<String> CorrectAnswer = new ArrayList<String>();
	ArrayList<String> SelectedAnswer = new ArrayList<String>();
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
			
	  	questionSet1= qp1.getQuestionPaper(20);
	  	
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
		{   //panels[i] = new QuestionPanel( );
		   
		   // labels[i] = new JLabel( );
			//contentPane.add(panels[i],BorderLayout.NORTH);
		   //panels[i] = questionPanelArray.get(i);
		   
			String str = questionSet1.get(i);
			
			//ArrayList<String> questionOption = (str.split(","));
				String string[]=str.split(",");
				String op1= null;
				String op2= null;
				String op3= null;
				String op4= null;
				String ques=null;
				String correctAns=null;
			    for(String y:string){
				       ques = string[0];
		               op1 = string[1];
		               op2 = string[2];
		               op3 = string[3];
		               op4 = string[4];
		               correctAns=string[5];
		         }
			    CorrectAnswer.add(correctAns);
			    
			   // System.out.println(correctAns);
	        	//    labels[i].setText(questionSet1.get(i));
				  // labels[i].setText(ques);
				  // panels[i].add(labels[i]);
			    
				   QuestionPanel qp = new QuestionPanel();
				   qp.setComponent(ques,op1,op2,op3,op4,correctAns);
				   JPanel pa= (qp.getPanel());
				   contentPane.add(pa);
				   
				  // System.out.println(qp.noOfComponents());
				   questionPanelArray.add(pa);
				   contentPane.add(questionPanelArray.get(i));
				   
				  // System.out.println(questionPanelArray.get(i));
				 //  labels[i].setVisible(true);
				/*   Component[] components = panels[i].getComponents();
			        for (Component c : components) {
			        	JRadioButton cb = (JRadioButton) c;
			          if (cb.isSelected())
			           CorrectAnswer.add(cb.getText());
			          System.out.println("correct answer is"+ cb.getText());
			          
			        }
				  */
		}
		//System.out.println(panels.toString());
		
	    JButton submitBut = new JButton("Submit"); 
		//contentPane.add(submitBut);
		
	    JPanel panel1 = new JPanel( );
	    contentPane.add(panel1);
	    panel1.add(submitBut);
	   
            // action listener for submit button
	    panel1.add(text);
	    panel1.add(labelCorrectAns);
	    submitBut.addActionListener(this);
    	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		numClicks++;
        text.setText("Button Clicked " + numClicks + " times");
        
        /*
   		 * adding selected answers to array
   		 */
        {
        	if (e.getActionCommand().equals("Submit")) 
	        {
	       
				for (JPanel p: questionPanelArray)
					for (Component c: p.getComponents())
						if (c instanceof JRadioButton)
							if(((JRadioButton) c).isSelected())
							{
								SelectedAnswer.add(((JRadioButton) c).getText());
								//System.out.println(((JRadioButton) c).getText());				
		                    }    
							
			 }
	        
	        /*
	   		 * counting number of correct answers
	   		 */
	        int noOFCorrectAnswers= 0;
	        for(int counter = 0; counter < CorrectAnswer.size(); counter++) 
	        {
	            if((SelectedAnswer.get(counter)).equals(CorrectAnswer.get(counter)) )
	            {
					noOFCorrectAnswers++;
	             }
	        }
	        
	        labelCorrectAns.setText(" No of correct Answers " + noOFCorrectAnswers);
	        System.out.println(noOFCorrectAnswers);
	        System.out.println(SelectedAnswer);
	        System.out.println(CorrectAnswer);
	        
	        /*
	   		 * disabling radio button after submit button click
	   		 */
	        for (JPanel p: questionPanelArray)
				for (Component c: p.getComponents())
				{
					if (c instanceof JRadioButton)
	                      c.setEnabled(false);
	            }
	        
	        
	}
	}}

