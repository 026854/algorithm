package day0409;

public class MatrixMul {
	public static void main(String[] args) {

		
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer[0].length;j++) {
				int temp=0;
				for(int k=0;k<arr1[0].length;k++) {
					System.out.println(arr1[i][k]*arr2[k][j]);
				}
				answer[i][j] = temp;
			}
		}

	}

}
