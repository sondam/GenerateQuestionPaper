package createpaperinterface;

import java.awt.EventQueue;
import java.awt.FlowLayout;

public class DisplayQuestionPaper {

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

}
