package javabasics.java8;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[10];  
        Optional<String> lowercaseString = Optional.ofNullable(str[5]);
        
        if(lowercaseString.isPresent()) {
        	System.out.print(str[5].toLowerCase());  
        } else {
        	System.out.print("lowercaseString is not present");
        }
        
	        
        
	        
	}

}
