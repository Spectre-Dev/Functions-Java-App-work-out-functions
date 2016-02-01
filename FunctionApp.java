/*
*	Function.java
*	Author: Rich Mangan
*	Date: 06 December 2013
*/
import javax.swing.JOptionPane;
public class FunctionApp{
	public static void main(String args[]){
		// declare variables
		int x, option, ans = 0;
		//declare objects
		Function myFunction;
		//create object
		myFunction = new Function();
		//input
		x=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter value for X "));
		option=Integer.parseInt(JOptionPane.showInputDialog(null,"Please select option 1, 2, 3, 4, 5 or 6 \n 1. FoF \n 2.GoG \n 3.FoG \n 4.GoF \n 5.F-1oF \n 6.G-1oG "));
		//set x
		myFunction.setX(x);

		//F of F
			if(option==1){
				myFunction.fx();
					ans=myFunction.getAns();

				myFunction.setX(ans);
				myFunction.fx();
					ans=myFunction.getAns();
			}
		//G of G
			else if(option==2){
				myFunction.gx();
					ans=myFunction.getAns();

				myFunction.setX(ans);
				myFunction.gx();
					ans=myFunction.getAns();
			}
		//F of G
			else if(option==3){
				myFunction.gx();
					ans = myFunction.getAns();

				myFunction.setX(ans);
				myFunction.fx();
					ans = myFunction.getAns();
			}
			//G of F
			else if(option==4){
				myFunction.fx();
				ans = myFunction.getAns();

				myFunction.setX(ans);
				myFunction.gx();
					ans = myFunction.getAns();
			}
			//F Inverse of F
			else if(option==5){
				myFunction.fx();
				ans = myFunction.getAns();

				myFunction.setX(ans);
				myFunction.finv();
					ans = myFunction.getAns();
			}
			//G Inverse of G
			else if(option==6){
				myFunction.gx();
				ans = myFunction.getAns();

				myFunction.setX(ans);
				myFunction.ginv();
					ans = myFunction.getAns();
			}
			else {
				JOptionPane.showMessageDialog(null, "That input has not been recognised");
			}

		//output
			JOptionPane.showMessageDialog(null, "The answer is " + ans +"!");
		}
}
