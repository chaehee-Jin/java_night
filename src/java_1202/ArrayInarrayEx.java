package java_1202;

public class ArrayInarrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1차원 배열 
		int []arr1 = {10, 20, 30, 40, 50};
		
		//2차원 배열 : 배열의 요소로 1차원 배열을 가지는 배열
		int [][]arr2 = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};
		
		System.out.println("arr2[4][1]:" + arr2[4][1]);
		System.out.println("arr2[2][3]:" + arr2[2][3]);
		
		
		System.out.println("arr2의 크기:" + arr2.length);
		// arr2.length: 2차원 배열의 크기를 출력 (2차원 배열의 라인 수를 뜻함)
		// arr2[index].length : 2차원 배열의 각 요소(라인)의 칸 수를 출력 
		System.out.println("arr2[0]의 크기 :" +arr2[0].length );
		System.out.println("arr2[1]의 크기 :" +arr2[1].length );
		System.out.println("arr2[2]의 크기 :" +arr2[2].length );
		System.out.println("arr2[3]의 크기 :" +arr2[3].length );
		System.out.println("arr2[4]의 크기 :" +arr2[4].length );
		
		// 2차원 배열의 요소로 1차원 배열을 사용 
		// 2차원 배열의 요소로 다양한 크기의 배열을 사용할 수 있음
		// 2차원 배열의 요소로 사용된 1차원 배열의 크기가 다르므로 해당 1차원 배열의 범위를 넘어서서 접근하는 것은 오류가 발생함 
		int[][]arr21 = {
				{1,2,3,4,5},
				{6,7},
				{8,9,10,11},
				{12,13,14}
				
		};
		System.out.println("배열 arr21의 크기:" + arr21.length);
		
		for (int i=0; i< arr21.length; i++) {
			System.out.println("배열 arr21["+ i +"]의 크기:" + arr21[i].length);
		}
		
		System.out.println(arr21[1][1]);
		System.out.println(arr21[2][2]);
		// System.out.println(arr21[1][2]); // 해당 배열의 최대범위를 넘어서서 접근하여 오류가 발생
		
		System.out.println("/n 반복문을 사용하여 2차원 배열의 모든 내용을 출력/n");
		// 반복문과 2차원 배열 
		for (int i=0; i<arr21.length; i++) {
			for (int j=0; j<arr21[i].length; j++) {
				System.out.println("arr21[" + i + "][" + j+ "]:" + arr21[i][j]);
			}
		}
		
		
		
		// 3차원 배열: 배열의 요소로 2차원 배열을 가지는 배열 
		
		int[][][] arr3= {
				{
					{1,2,3},
					{4,5,6}
				
				},
				{
					{7,8,9},
					{10,11,12},
		
				},
				{
					{13,14,15},
					{16,17,18}
				}
		};
		System.out.println(arr3[1][1][1]);
		System.out.println(arr3[0][0][2]);
		
	}

}
