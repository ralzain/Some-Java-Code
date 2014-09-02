// This program checks to see if a string is a palidrome or not, it then produces a boolean value based on the result
// It is capabalbe of checking BOTH one word and two word inputs

public class palendromeChecker {
	static boolean isPalindrome(String wop) {
		   boolean a=true;
		   
		   System.out.println("The input string: "+wop );
			String x[]=wop.split(" ");
		    
			
			//If the length of x=1, then we are dealing with a single word, if it is greater than one, then a phrase
		    
		   
		    if(x.length==1){
		    	System.out.println("Entered the first Codition");
		    int j=wop.length()-1;
		char []c= wop.toCharArray();
		for(int i=0;i<c.length;i++){
		            if(c[i]!=c[j]){
		            	
		            a=false;
		            return a;
		            			  }
		                j--;
		                
		                }
		
		}

			if(x.length>1){
				System.out.println("Entered the Second Codition");
				int j=x.length-1;
				for(int i=0;i<x.length;i++){
					
					//This reverses the string at position x[j] so we can compare it
					//To the string at position x[i]
					String rev = new StringBuffer(x[j]).reverse().toString();
					
					// Compare the strings at position x[i] with the reverse of the
					//String at x[j]
					if(x[i].equals(rev)==false){
						
					System.out.println("Entered the false Loop");
					System.out.println("Value of X[i]: "+x[i]);
					System.out.println("Value of X[j]:"+x[j]);
					

						a=false;
						

					return a;
					
												}
					j--;
											}
				
				
			}
			
			
			
			
			
			return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Testing the code: Should produce 'true'
		System.out.println(isPalindrome("evil live"));
		System.out.println();
		//Testing the code: Should produce 'true'
		System.out.println(isPalindrome("bob"));
		System.out.println();
		//Testing the code: Should produce 'false'
		System.out.println(isPalindrome("random"));
		System.out.println();
		//Testing the code: Should produce 'false'
		System.out.println(isPalindrome("random word"));
		

	}

}
