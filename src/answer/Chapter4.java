package answer;

public class Chapter4 {
	public static void main(String[] args) {
		chapter4_1();
		chapter4_2();
		chapter4_3();
		chapter4_4();
	}

	public static void chapter4_1() {
		// int[] points = new int[4];
		// double[] weights = new double[5];
		// boolean[] answers = new boolean[3];
		// String[] names = new String[3];
	}

	public static void chapter4_2() {
		int[] moneyList = { 121902, 8302, 55100 };

		for (int count = 0; count < 3; count++) {
			System.out.println(moneyList[count]);
		}
		for (int money : moneyList) {
			System.out.println(money);
		}
	}

	public static void chapter4_3() {
		int[] counts = { 145, 140, 135 };
		float[] heights = { 171.3F, 175.0F };

		System.out.println(counts[2]);
		System.out.println(heights[1]);
		// NullPointerException
		// ArrayIdexOutOfBoundsException
	}

	@SuppressWarnings("resource")
	public static void chapter4_4() {
		int[] numbers = { 3, 4, 9 };

		System.out.println("1桁の数字を入力してください");

		int input = new java.util.Scanner(System.in).nextInt();

		for (int num : numbers) {
			if (num == input) {
				System.out.println("アタリ！");
			}
		}
	}
}
