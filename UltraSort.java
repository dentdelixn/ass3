 

public class UltraSort {
	
	
	public void mergeSort(Object[] arr) {
		sort(arr, 0, arr.length - 1);
		
	}
	private static void sort(Object[] x, int start, int end) {
		if(start < end) {
			int middle = start + (end - start) / 2;
			sort(x, start, middle);
			sort(x, middle + 1, end);
		 	
		   merge(x, start, end, middle);	
		}
	}
	public static void merge(Object[] x, int start, int end, int middle) {
		int n = middle - start + 1;
		int n1 = end - middle;
		Object[] a = new Object[n];
		Object[] b = new Object[n1];
		// left part
	    for(int i = 0; i <= n - 1; i++) {
	    	 a[i] = x[start + i];
	    }
	    // right part
	    
	    for(int j = 0; j <= n1 - 1; j++) {
	    	b[j] = x[middle + j + 1];
	    }
	    
	    
	    int i = 0, j = 0;
	    
	    int k = start;
	    
	    while (i < n && j < n1) {
	    	if(((Comparable) a[j]).compareTo(b[i]) > 0) {
                x[k] = a[i];
                i++;
            }
            else {
                x[k] = b[j];
                j++;
            }
            k++;
        }
	    for(; i < n; i++) {
	    	x[k] = a[i];
	    	k++;
	    }
	    for(; j < n1; j++) {
	    	k++;
	    }
	    
	}
}
