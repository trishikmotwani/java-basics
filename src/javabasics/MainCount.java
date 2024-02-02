package javabasics;

public class MainCount {

	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(count < 3) {
			count++;
			main(null);
		} else {
			
		}
		System.out.println("Called" + count);
	}

}
