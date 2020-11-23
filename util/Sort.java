package util;
// 버블정렬
public class Sort {
	public static void main(String[] args) {
		int[] arr = {29, 45, 1, 14, 22};
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length -i -1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j]; // 6번 지우고 int temp = arr[j]도 가능
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}


// arr.length-i-1 은 첫 바퀴 검사에서 가장 큰 값이 맨 뒤로 가게 한다.
// 7: 순차적으로 비교하기 위한 반복문
// 8: 끝까지 돌았을 때 다시 처음부터 비교하기 위한 반복문
// 9: 두 수를 비교하여 앞의 수가 뒤의 수보다 크면
// 10: 두 수를 서로 바꿔준다.
// 5개의 데이터를 4번(n-1번) 반복한다. (29 45, 45 1, 1 14, 14 22)
