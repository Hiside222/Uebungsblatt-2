package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		int j = 33;
		int k = 3;
		int max = 0;
		int min = 0;

		if (i < j && j < k) {
			max = k;
			min = i;
		}
		if (i < k && k < j) {
			max = j;
			min = i;
		}
		if (j < i && i < k) {
			max = k;
			min = j;
		}
		if (j < k && k < i) {
			max = i;
			min = j;
		}
		if (k < i && i < j) {
			max = j;
			min = k;
		}
		if (k < j && j < i) {
			max = i;
			min = k;
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
