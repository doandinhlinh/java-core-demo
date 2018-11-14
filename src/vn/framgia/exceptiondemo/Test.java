package vn.framgia.exceptiondemo;

public class Test {
	public int test(int n) {
		try {
			int r = n * n;
			return r;
		} finally {
			if (n == 2)
				return 0;
		}
	}
	public static void main(String[] args) {
		Test test= new Test();
		System.out.println(test.test(2));
	}
}
