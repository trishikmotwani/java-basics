package javabasics;

public class CircleInOutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write your code in Java SE 8
        int countPoints = 0;
        
     
        
        int X[] = {2,-1,-4,-3,3};
        int Y[] = {2,-2,4,1,-3};
        String S = "ABDCA";
        String sarr[] =  S.split("");
        System.out.println(sarr.length);
        
        
        if(X.length == Y.length && Y.length == sarr.length) {

            for(int i = 0 ; i < sarr.length - 1; i ++) {
                if(!isSameCoordinatesForRepeatedValue
                            (sarr,X,Y,sarr[i],i)) {

                    
                    countPoints ++;
                }
            }
        }
        System.out.println("countPoints ----" + countPoints);
        
	}
	
	public static boolean isSameCoordinatesForRepeatedValue(String[] sarr, int[] X, int[] Y, String ele, int index) {

        int nextIndex = getIndexOfNextSameElement(ele,sarr,index);
        if(ele.equalsIgnoreCase(sarr[nextIndex])) {

            if(X[nextIndex] > X[index] || Y[nextIndex] > Y[index])  {
                return true;
            }          
        }
        return false;
    }

    public static int getIndexOfNextSameElement(String ele, String[] sarr, int index) {
    	int nextIndex = 0;
        for (int i=0;i<sarr.length;i++) {
            if (sarr[i].equals(ele)) {
                if(i > index) {
                	nextIndex = i;
                	 break;
                } 
            }
        }
        System.out.println("index returned" + index);
        return index;
    }
}
