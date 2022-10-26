package algorithms.sorting;

public class BubbleSort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j <N -i -1; j++) {
				if(less(a[j+1], a[j])) swap (a, j+1, j);
			}
		}
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[j] = a[i];
		a[i]= temp;
	}
}
