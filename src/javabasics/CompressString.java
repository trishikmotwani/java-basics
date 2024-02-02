package javabasics;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "AAAAAAAAAAABBXXXXXXCCCCCCT";
		
		
	        // write your code in Java SE 8

	        String[] sarr = S.split("");
	        int count = 1;
	        String newString = "";
	        System.out.println(" sarr length ->" + sarr.length);
	        for(int i = 0; i < sarr.length - 1; i++) {

	            if(sarr[i].equalsIgnoreCase(sarr[i+1])) {
	                count ++;
	                System.out.println(i + "=>" + sarr[i] + sarr[i+1]);
	                
	                if((i + 1) == sarr.length - 1) {
	                	newString = newString + count + sarr[i];
	                }
	                continue; 
	            }
	            newString = newString + count + sarr[i];
                count = 1;
	        }
	        System.out.println(newString);
	    
	}

}
