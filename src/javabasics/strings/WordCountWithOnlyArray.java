package javabasics.strings;

import java.util.Arrays;

public class WordCountWithOnlyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Trishik This This This is is is Trishik Trishik";
        
        String sarr[] = s.split(" ");
        
        System.out.println(sarr.length);
        
        String sarr2d[][] = new String[sarr.length][2];
        
        for(int i=0; i < sarr.length; i++) {
            
            for(int j=0; j <= 1; j ++) {
               
                if(j == 0) {
                    
                    
                    int isPresentIndex = isPresent(sarr[i],sarr2d);
                    System.out.println(sarr[i] + " -> is Present" + isPresentIndex);
                    
                    if(isPresentIndex >= 0) {
                        sarr2d[isPresentIndex][1] = "" + (Integer.parseInt(sarr2d[isPresentIndex][1]) + 1);
                    } else {
                        
                        sarr2d[i][j] = sarr[i];
                        sarr2d[i][1] = "1";
                    }
                    
                    
                }
            }
        }
        System.out.println("Final Output ------>  ");
        
        for(int i=0; i < sarr.length; i++) {
            
            for(int j=0; j <= 1 && sarr2d[i][j] != null; j ++) {
               
                System.out.println(sarr2d[i][j]);
            }
        }
        
        
     }
     
     public static int isPresent(String toFind, String sarr2d[][]){
        Boolean isPresent = false;
        int presentIndex = -1;
        Arrays.asList(sarr2d);
        for(int k = 0; k < sarr2d.length; k++) {
            if(toFind.equals(sarr2d[k][0])) {
                
                isPresent = true;
                presentIndex = k;
                break;
            }
        }
        return presentIndex;
     }

}
