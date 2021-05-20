import java.util.Comparator;

public class QuickSortWithComparator {
	public void sort(Object[] x) {
		quicksort(x, 0, x.length - 1);
	}
	private void quicksort(Object[] x, int start, int end) {
		if(start < end) {
			int pi = partition(x, start, end);
			quicksort(x, start, pi - 1);
			quicksort(x, pi + 1, end);
		}
	}
	private int partition(Object[] x, int start, int end) {
		Object pivot = x[end];
		 
		int i = start - 1;
		for(int j = start; j <= end; j++) {
			  if(((Comparable) x[j]).compareTo(pivot) > 0) {
				i++;
				Object temp = x[i];
				x[i] = x[j];
				x[j] = temp; 
			  }
				
			 
		}
		Object temp = x[i+1];
		x[i+1] = x[end];
		x[end] = temp;
		return (i + 1);
	}
	
	
}
