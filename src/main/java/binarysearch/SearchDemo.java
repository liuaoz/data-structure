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
		System.out.println(binarySearch(100, arr));
		System.out.println(recursionBinarySearch(80, arr.length / 2, arr));

	}

	/**
	 * 二分查找法
	 * 
	 * @param key
	 * @param arr
	 * @return
	 */
	public static int binarySearch(final long key, final long arr[]) {

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

	/**
	 * 递归二分查找
	 * 
	 * @param key
	 * @param arr
	 * @return
	 */
	public static int recursionBinarySearch(final long key, int curIn, final long arr[]) {
		if (key == arr[curIn]) {
			return curIn;
		} else if (curIn < 0 || curIn >= arr.length) {
			return arr.length;
		} else {
			if (key > arr[curIn]) {
				curIn = (arr.length + curIn + 1) / 2;
			} else {
				curIn = curIn / 2;
			}
		}
		return recursionBinarySearch(key, curIn, arr);

		// { 1, 3, 5, 6, 15, 80, 100, 500 } len=8
		// curIn=4 v=15
	}

}
