class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	   int [] result = new int [nums1.length + nums2.length];
		int length1 = 0;
		int length2 = 0;
		int rIndex = 0;
		while (length1 < nums1.length || length2 < nums2.length) {
			int a = Integer.MAX_VALUE;
			int b = Integer.MAX_VALUE;
			if (length1 < nums1.length) {
				a = nums1 [length1];
			}

			if (length2 < nums2.length) {
				b = nums2[length2];
			}
			if (a < b) {
				result[rIndex] = a;
				length1++;
			} else {
				result[rIndex] = b;
				length2++;
			}
			rIndex++;

		}

		if (result.length % 2 == 0) {
			int index = result.length / 2;
			return ( result [index - 1] + result[index]) /2d;
		}

		int index = result.length / 2;
		return result [index];

	}
}