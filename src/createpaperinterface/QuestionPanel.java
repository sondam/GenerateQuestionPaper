package createpaperinterface;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
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
    
    
     public void  setComponent(String ques,String option1, String option2, String option3, String option4){
    	 
    	    panel.add(label);
    	    label.setText(ques);
    
    	    /*
    	     * only one option can be selected
    	     */
    	    final ButtonGroup group = new ButtonGroup();
    	    group.add(radioButton1 = new JRadioButton(option1));
    	    group.add(radioButton2 = new JRadioButton(option2));
    	    group.add(radioButton3 = new JRadioButton(option3));
    	    group.add(radioButton4 = new JRadioButton(option4));
    	    panel.add(radioButton1);
    	    panel.add(radioButton2);
    	    panel.add(radioButton3);
    	    panel.add(radioButton4);
    	    panel.setPreferredSize(new Dimension(400, 50));
    	    panel.setVisible(true);
    	    
    	    
    	   
    	   
    	    
     }
     public JPanel getPanel(){
		return panel;
    	
     }
     
     
     
     
     
}
