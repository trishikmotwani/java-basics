package javabasics.designpatterns;

public class SingletonDp {

	public static SingletonDp sdpi;
	
	private SingletonDp() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	public static SingletonDp getInstace() {
		
		if(sdpi != null) {
			synchronized(SingletonDp.class) {
				if(sdpi != null) {
					sdpi = new SingletonDp();
				}
			}
		}
		return sdpi;
	}
	
}
