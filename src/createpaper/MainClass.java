package createpaper;

import java.sql.SQLException;
import java.util.ArrayList;



public class MainClass {

	public static void main(String[] args) throws SQLException {
		
		/*
		 * Create table with number of questions specified 
		 */
		//InsertIntoDatabase idb= new InsertIntoDatabase();
		//idb.createTable(100);
		QuestionPaper qp1= new QuestionPaper();
	//	System.out.println("Questions in database"); 
	//	qp1.readDatabase();
	//	 System.out.println("********************************************************");
			
		ArrayList<String> questionSet1 = new ArrayList<String>(1);
	  	questionSet1= qp1.getQuestionPaper(10);
	  	System.out.println("QuestionSet1");
	    System.out.println(questionSet1);
	    System.out.println("********************************************************");
	    QuestionPaper qp2= new QuestionPaper();
		ArrayList<ArrayList<String>> questionSet2 = new ArrayList<ArrayList<String>>(2);
		questionSet2 = qp2.getQuestionSet(20,2);
		System.out.println("QuestionSet2");
		for (ArrayList<String> s:questionSet2) {
			System.out.println(s);}
		System.out.println("********************************************************");
	    QuestionPaper qp3= new QuestionPaper();
	    ArrayList<ArrayList<String>> questionSet3 = new ArrayList<ArrayList<String>>(3);
		questionSet3 = qp3.getQuestionSet(30,3);
		System.out.println("QuestionSet3");
		for (ArrayList<String> s:questionSet3) {
    	 	  System.out.println(s);
	    }
	
	}

}
