package algorithms.sorting;

public class ShellSort {

	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[j] = a[i];
		a[i] = temp;
	}

	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j = -h) {
					swap(a, j, j - h);
				}
			}
			h=h/3;
		}
	}
}
