package day0211;

public class Price {
	public static void main(String[] args) {
		int[] prices= {1,2,3,2,3};
		 int[] answer = new int[prices.length];
	        int time=0;
	        for(int i=0;i<prices.length;i++){
	            for(int j=i+1;j<prices.length;j++){
	                if(prices[i]>prices[j]){
	                    answer[i]=time++;
	                    break;
	                }
	                time++;
	            }
	            answer[i]=time;
	            time=0;
	        }
	        
	        
	   for (int i : answer) {
		System.out.println(i);
	}
	}
}
