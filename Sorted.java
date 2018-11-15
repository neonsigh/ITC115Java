
public class Sorted {

	public static void main(String[] args) {
		

		double[] list1 = {16.1, 12.3, 22.2, 14.4}; //should return false
		double[] list2 = {1.6, 4.3, 7.0, 19.5, 25.1, 46.2}; //should return true
		
		System.out.println(isSorted(list1));
		System.out.println();
		System.out.println(isSorted(list2));
		
	}
	
	public static boolean isSorted(double[] list) {
		if (list.length == 1) {
			return true;
		} else if (list.length == 2 && list[0] == list[1]) {
			return true;
		} else {
			for (int i = 0; i <= list.length -2 ; i++) {
				if (list[i] > list[i + 1]) {
					return false;
				} 
			}
			return true;
		}
	}

}
