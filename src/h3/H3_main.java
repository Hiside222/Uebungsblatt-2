package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 3;
		int k = -10;
		if (i > j) {
			if (i <= 200) {
				if (j <= 100) {
					k = 1;
				}
			} else if (j <= 100) {
				k = 2;
			} else {
				k = 3;
			}
		} else if (i <= 200) {
			if (j <= 100) {
				k = 4;
			}

		}
		System.out.println("k = " + k);

	}

}
