package javaKadai;

public class javaSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int hensu1 = 10;
		int hensu2 = 10;

		hensu1 = add1(hensu1);
		hensu2 = add2(hensu2);

		System.out.println(hensu1);
		System.out.println(hensu2);
	}

	private static int add1(int hensu) {

		return hensu + 1;
	}

	private static int add2(int hensu) {

		return hensu + 2;
	}

}
