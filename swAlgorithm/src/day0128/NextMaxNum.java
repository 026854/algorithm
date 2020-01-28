package day0128;



public class NextMaxNum {
	public static void main(String[] args) {
		int n = 78;
		int cnt=0,mcnt=0;
		String num,max;
		cnt = (int) Integer.toBinaryString(n).chars().filter(e -> '1'==e).count();
		
		while(true) {
		
			mcnt = (int) Integer.toBinaryString(++n).chars().filter(e -> '1'==e).count();
			if(mcnt==cnt) break;
			
		}
			
		
			System.out.println(Integer.bitCount(n));
	}
}
