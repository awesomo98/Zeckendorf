import java.util.*;

class Zeckendorf {

	public static int[] fibonacci = {1, 2, 3, 5, 8, 13, 21};

	public static String zeck;

	public static String zeckendorf(int n) {
		zeck = "";
			for (int i = 6; i >= 0; i--) {
				if (n < fibonacci[i]) {
						zeck += "0";
				}
				if ((n >= fibonacci[i]) && zeck.endsWith("0")) {
					zeck += "1";
					n -= fibonacci[i];
				}
			}
			return zeck.replaceFirst("^0+(?!$)","");
	}


	public static void main(String[] args) {
		zeck = "";
		for (int i = 0; i <= 20; i++) {
			System.out.println("Zeckendorf number: " + i + " Output: " + zeckendorf(i));
		}
	}
}