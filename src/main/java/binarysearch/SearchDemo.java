package binarysearch;

/**
 * 
 * @author matrix
 *
 * @date 2015年12月18日
 */
public class SearchDemo {

	public static void main(String[] args) {
		long arr[] = { 1, 3, 5, 6, 15, 80, 100, 500 };
		System.out.println(binarySearch(80, arr));

	}

	/**
	 * 二分查找法
	 * 
	 * @param arr
	 */
	public static int binarySearch(long key, long arr[]) {

		int lowerBound = 0;
		int upperBound = arr.length - 1;

		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (arr[curIn] == key) {
				return curIn;
			} else if (lowerBound > upperBound) {
				return arr.length;
			} else {
				if (arr[curIn] < key) {
					lowerBound = curIn + 1;
				} else {
					upperBound = curIn - 1;
				}
			}
		}

	}

}
