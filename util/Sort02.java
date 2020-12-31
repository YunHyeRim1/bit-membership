package util;

import java.util.Random;
import java.util.Scanner;

public class Sort02 {
	public int[] randomArr(int begin, int length, int end) {
		int[] arr = new int[length];
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int size = arr.length; // arr.length를 4번이나 써서 따로 뽑아줌
		for(int i = 0; i < size; i++) {
			arr[i] = random.nextInt(end)+begin;
		}
		return arr;
		
	}	
	public int[] selectionSort(int[] arr, boolean direction) {
		// false: ascending 오름차순
		// true: descending 내림차순
		int size = arr.length;
		for(int i = 0; i < size -1; i++) {
			for(int j = i+1; j < size; j++) {
				if(direction) {
					if(arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}else {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		return arr;
		
	}
	
	public int[] bubbleSort(int[] arr, boolean direction) {
		int t = 0;
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			for(int j = 1; j < (size -1); j++) {
				// false: ascending, true: descending
				if(direction) {
					if(arr[j-1] < arr[j]) {
						t = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = t;
					}
				}else {
					if(arr[j-1] > arr[j]) {
						t = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = t;
					}
				}
			}
		}
		return arr;
		
	}
}



















