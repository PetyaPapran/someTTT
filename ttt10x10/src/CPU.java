

//Tic-Tac-Toe Artificial Intelligence
//Created: October 13, 2008
import javax.swing.JButton;

public class CPU	{
	public static int doMove(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5, JButton btn6, JButton btn7, JButton btn8, JButton btn9)	{
		if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals(""))
			return 3;
		else if(btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals(""))
			return 6;
		else if(btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals(""))
			return 9;
		
		else if(btn2.getText().equals("O") && btn3.getText().equals("O") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("O") && btn6.getText().equals("O") && btn4.getText().equals(""))
			return 4;
		else if(btn8.getText().equals("O") && btn9.getText().equals("O") && btn7.getText().equals(""))
			return 7;
		
		else if(btn1.getText().equals("O") && btn3.getText().equals("O") && btn2.getText().equals(""))
			return 2;
		else if(btn4.getText().equals("O") && btn6.getText().equals("O") && btn5.getText().equals(""))
			return 5;
		else if(btn7.getText().equals("O") && btn9.getText().equals("O") && btn8.getText().equals(""))
			return 8;
		
		else if(btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals(""))
			return 7;
		else if(btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals(""))
			return 8;
		else if(btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals(""))
			return 9;
		
		else if(btn4.getText().equals("O") && btn7.getText().equals("O") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("O") && btn8.getText().equals("O") && btn2.getText().equals(""))
			return 2;
		else if(btn6.getText().equals("O") && btn9.getText().equals("O") && btn3.getText().equals(""))
			return 3;
		
		else if(btn1.getText().equals("O") && btn7.getText().equals("O") && btn4.getText().equals(""))
			return 4;
		else if(btn2.getText().equals("O") && btn8.getText().equals("O") && btn5.getText().equals(""))
			return 5;
		else if(btn3.getText().equals("O") && btn9.getText().equals("O") && btn6.getText().equals(""))
			return 6;
		
		else if(btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals(""))
			return 9;
		else if(btn5.getText().equals("O") && btn9.getText().equals("O") && btn1.getText().equals(""))
			return 1;
		else if(btn1.getText().equals("O") && btn9.getText().equals("O") && btn5.getText().equals(""))
			return 5;
		
		else if(btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals(""))
			return 7;
		else if(btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals(""))
			return 3;
		else if(btn7.getText().equals("O") && btn3.getText().equals("O") && btn5.getText().equals(""))
			return 5;
		
		else if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals(""))
			return 3;
		else if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals(""))
			return 6;
		else if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals(""))
			return 9;
		
		else if(btn2.getText().equals("X") && btn3.getText().equals("X") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("X") && btn6.getText().equals("X") && btn4.getText().equals(""))
			return 4;
		else if(btn8.getText().equals("X") && btn9.getText().equals("X") && btn7.getText().equals(""))
			return 7;
		
		else if(btn1.getText().equals("X") && btn3.getText().equals("X") && btn2.getText().equals(""))
			return 2;
		else if(btn4.getText().equals("X") && btn6.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		else if(btn7.getText().equals("X") && btn9.getText().equals("X") && btn8.getText().equals(""))
			return 8;

		else if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals(""))
			return 7;
		else if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals(""))
			return 8;
		else if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals(""))
			return 9;
		
		else if(btn4.getText().equals("X") && btn7.getText().equals("X") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("X") && btn8.getText().equals("X") && btn2.getText().equals(""))
			return 2;
		else if(btn6.getText().equals("X") && btn9.getText().equals("X") && btn3.getText().equals(""))
			return 3;
		
		else if(btn1.getText().equals("X") && btn7.getText().equals("X") && btn4.getText().equals(""))
			return 4;
		else if(btn2.getText().equals("X") && btn8.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		else if(btn3.getText().equals("X") && btn9.getText().equals("X") && btn6.getText().equals(""))
			return 6;
		
		else if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals(""))
			return 9;
		else if(btn5.getText().equals("X") && btn9.getText().equals("X") && btn1.getText().equals(""))
			return 1;
		else if(btn1.getText().equals("X") && btn9.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		
		else if(btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals(""))
			return 7;
		else if(btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals(""))
			return 3;
		else if(btn7.getText().equals("X") && btn3.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		
		else if(btn1.getText().equals("X") && btn5.getText().equals("O") && btn9.getText().equals("X"))
			return 6;
			
		else if(btn3.getText().equals("X") && btn5.getText().equals("O") && btn7.getText().equals("X")) 
			return 4;
		
		else if(btn5.getText().equals(""))
			return 5;
		
		else if(btn1.getText().equals(""))
			return 1;
		else
			return 0;
	}
	
	
	public static boolean doRandomMove(JButton button)	{
		if(button.getText().equals("O") || button.getText().equals("X"))
			return false;
		else	{
			return true;
		}
	}
}