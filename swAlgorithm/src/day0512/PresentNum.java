package day0512;

public class PresentNum {
	public static void main(String[] args) {
		int n= 15;
		 int answer = 0;
	        for(int i=1;i<n+1;i++){
	             int sum = 0;
	            for(int j=i;j<n+1;j++){
	                sum+=j;
	                if(sum==n) {answer+=1; break;}
	                else if(sum>n) break;
	            }
	            
	        }
	        
	        System.out.println(answer);
	}
}
