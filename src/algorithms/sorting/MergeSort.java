package algorithms.sorting;

public class MergeSort {
	public void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length);
	}

	private void sort(Comparable[] a, Comparable[] aux, int from, int to) {
		if (from >= to)
			return;
		int mid = from + (to - from) / 2;
		sort(a, aux, from, mid);
		sort(a, aux, mid, to);
		merge(a, aux, from, mid, to);
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private void merge(Comparable[] a, Comparable[] aux, int from, int mid, int to) {
		for (int k = from; k < to; k++)
			aux[k] = a[k];
		int i = from;
		int j = mid;
		for (int k = from; k < to; k++)
			if (i >= mid)
				a[k] = aux[j++];
			else if (j >= to)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
	}

}
