import java.util.ArrayList; 

public class ArrayTester {



	public static int[] getColumn(int[][] arr2D, int c) {
		
		int[] vals = new int[arr2D.length];
		int valctr = 0;

		int actualColumn = c - 1;
		for(int[] rows: arr2D) {
			vals[valctr] = rows[actualColumn];
			++valctr;
		}

		return vals;
	}


	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		//every val in arr1 is in arr2
		//basically, arr1 = arr2

		boolean flag = true;

		ArrayList<Integer> values = new ArrayList<Integer>();

		for(int i=0; i<arr1.length; i++) {
			values.add(arr1[i]);
		}

		for(int j: values) {
			boolean partialFlag = false; 
			for(int each: arr2) {
				if(j == each) {
					partialFlag = true; 
				}
			}
			if(partialFlag == false) {
				return false;
			}
		}

		return true;

	}

	public static boolean containsDuplicates(int[] arr) {
		ArrayList<Integer> dupes = new ArrayList<Integer>();
		for(int i=0; i< arr.length; i++) {
			for(int each: dupes) {
				if(arr[i] == each) {
					return true;
				}
				else {
					dupes.add(arr[i]);
				}
			}
		}
		return false;
	}


	public static boolean isLatin(int[][] arr2D) {
		int[] firstRow = arr2D[0];
		if(containsDuplicates(firstRow) == false) {
			boolean flag = true;
			for(int[] each: arr2D) {
				if(hasAllValues(firstRow, each) == false) {
					flag = false;
					break;
				}
			}

			if(flag != false) {
				
			}
		}
	}


	public static void main(String[] args) {
		int[][] d2arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[] values = getColumn(d2arr, 2);
		for(int each: values) {
			System.out.println(each);
		}
	}


}