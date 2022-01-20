package day8;

public class sort {
	public static void main(String[] args) {
		int[] score = { 7, 30, 40, 50, 60, 80 };
		int temp = 0, max=0, idx=0;
		
		while(idx<6) {
			temp=score[idx];
			max=0;
			for(int i=idx; i<6; i++) {
				if(max<score[i]) {
					max=score[i];
				}
			}
			for(int i=idx; i<6; i++) {
				if(max==score[i]) {
					score[i]=temp;
				}
			}
			score[idx]=max;
			idx++;
			System.out.print("[ ");
			for(int i=0; i<6; i++) {
				System.out.print(score[i]+" ");
			}
			System.out.println("]");
		}	
	}
}
