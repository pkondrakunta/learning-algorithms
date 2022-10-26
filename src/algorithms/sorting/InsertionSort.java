package algorithms.sorting;

public class InsertionSort {

	public static void sort(Comparable[] a) {
		int N = a.length;
		for(int i=0; i<N; i++) insert(i,a);
	}
	
	public static void insert(int i, Comparable[] a) {
		for (int j = i-1; j>=0; j--) {
			if(a[j].compareTo(a[j+1])>0) swap(a,j,j+1);
			else break;
		}
	}
	
	public static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[j] = a[i];
		a[i]= temp;
	}
}
