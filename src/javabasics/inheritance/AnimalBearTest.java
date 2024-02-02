package javabasics.inheritance;

public class AnimalBearTest {
	
	public static AnimalBearTest obj;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Animal a = new Bear();
		a.animalMethod1();
		a.animalMethod2();
		System.out.println(a.bearMethod());
		
		Bear b = new Bear();
		b.animalMethod1();
		b.animalMethod2();
		b.bearMethod1();
		b.bearMethod2();
		b.bearMethod();
		
		PolarBear pb = new PolarBear();
		pb.bearMethod1();
		pb.polarBearMethod();
		
	}
}
