/*
*	Function.java
*	@author: Rich Mangan
*	Date: 06 December 2013
*/
public class Function{
		 //declare variables
		 private int x;
		 private int ans;
		 //constructor
		 public Function(){
			x=0;
			ans=0;
		}
		//compute
		public void setX(int x){
			this.x=x;
		}
		public void fx(){
		  ans = ((3 *x) + 2);
		}
		public void gx(){
			ans = 8 * x * x * x;
		}
		//F inverse
		public void finv(){
				ans = ((x - 2) /3);
		}
		//F inverse
		public void ginv(){
				ans = (int)Math.cbrt(x/8);
		}
		// answer
		public int getAns(){
			return ans;
   	}
}







