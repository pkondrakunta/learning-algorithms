package algorithms.sorting;

public class SelectionSort {
	
	public void sort(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j <a.length; j++) {
				if(less(a[j], a[min])) min = j;
				swap(a, i, j);
			}
		}
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void swap(Comparable[] a, int i, int j) {
		
		Comparable temp = a[i];
		a[j] = a[i];
		a[i] = temp;
		
	}

}
