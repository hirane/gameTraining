package javaKadai;

public class javaKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		javaBean javabean = new javaBean();
		javabean.setHensu1(10);
		javabean.setHensu2(10);

		add(javabean);

		System.out.println(javabean.getHensu1());
		System.out.println(javabean.getHensu2());

	}

	private static void add(javaBean javabean) {

		int hensu1 = javabean.getHensu1();
		int hensu2 = javabean.getHensu1();

		hensu1 = hensu1 + 1;
		hensu2 = hensu2 + 2;

		javabean.setHensu1(hensu1);
		javabean.setHensu2(hensu2);

	}

}
