package javabasics;

public abstract class AbstractTest {

	protected int testProtectedVar;
	public int show() {
		System.out.println(Thread.currentThread().getName() + "is calling Show()");
		return 10;
	};
}
