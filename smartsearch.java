package Assignments;

public class smartsearch {
	public static int SmartSearch(int[]arr, int x) {
		int k = 0;
		int m = 0;
		while ( arr[m]!= 9999) {
			k++;
			m = 2^k;
		}
		int L = 0;
		int R = m - 1;
		while (L<=R) {
			int M = (R+L)/2;
			if (arr[M] == x) {
				return (M);
			}
			else if (arr[M] < x) {
				L = M+1;
			}
			else {
				R = M-1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
	int []arr = {1,9,18,24,32,45,62,98,100,103,123,143,145,165,199,221,9999,9999,9999,9999};
	int x = 24;
	int []arr1 = {-8,-5,0,3,9,13,24,34,74,89,91,103,234,324,456,564,678,9999,9999,9999,9999,9999,9999,9999,9999,9999,9999,9999,9999,9999};
	int y = 103;
	int []arr2 = {-1,1,18,24,32,45,62,123,154,198,234,299,312,342,376,431,465,498,546,876,897,998,999,1254,2534,4356,5463,6547,7865,8888,9876,9998,9999,9999,9999,9999,9999,9999,9999,9999};
	int z = 325;

	System.out.println("1. The index of the number "+x+ " is: " + SmartSearch(arr, x));
	System.out.println("2. The index of the number "+y+ " is: " + SmartSearch(arr1, y));
	System.out.println("3. The index of the number "+z+ " is: " + SmartSearch(arr2, z));
	}
}




