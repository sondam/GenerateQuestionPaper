package createpaperinterface;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuestionPanel extends JPanel {
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JRadioButton radioButton1 ;
	JRadioButton radioButton2 ; 
	JRadioButton radioButton3 ; 
	JRadioButton radioButton4 ; 
	Component[] components ;
	final ButtonGroup group = new ButtonGroup();
	public static String correctAns;
	
	    /*
  //	System.out.println("QuestionSet1");
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public QuestionPanel(){
		panel.add(label);
		
	}
     public int noOfComponents(){
		return panel.getComponentCount() ;
	  
  }
    
    
     public void  setComponent(String ques, String option1, String option2, String option3, String option4, String correctAns){
    	 
    	    panel.add(label);
    	    label.setText(ques);
    	    QuestionPanel.correctAns = correctAns;
    	    /*
    	     * only one option can be selected
    	     */
    	    
    	    group.add(radioButton1 = new JRadioButton(option1));
    	    group.add(radioButton2 = new JRadioButton(option2));
    	    group.add(radioButton3 = new JRadioButton(option3));
    	    group.add(radioButton4 = new JRadioButton(option4));
    	    radioButton1.setActionCommand("option1");
    	    radioButton2.setActionCommand("option2");
    	    radioButton3.setActionCommand("option3");
    	    radioButton4.setActionCommand("option4");
    	    panel.add(radioButton1);
    	    panel.add(radioButton2);
    	    panel.add(radioButton3);
    	    panel.add(radioButton4);
    	    panel.setPreferredSize(new Dimension(400, 50));
    	    panel.setVisible(true);
    	    
    
    	   
    	   
    	    
     }
     
     public void getSelection(){
    	 
    	 
     }
     
     public String  checkCorrectAnswer(){
    	  return correctAns;
    	 
    	 
     }
     
     
     public Component[] getComponents(){
    	
    	 return panel.getComponents();
    	
     }
     public JPanel getPanel(){
    	 return panel;
     }
     
     
     
     
     
}
