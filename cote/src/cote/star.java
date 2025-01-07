package cote;

import java.util.Scanner;

public class star {

	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // 가로
	        int m = sc.nextInt(); // 세로

	        // 세로 길이만큼 반복
	        for (int i = 0; i < m; i++) {
	            // 가로 길이만큼 별을 출력
	            for (int j = 0; j < n; j++) {
	                System.out.print("*");
	            }
	            // 줄바꿈
	            System.out.println();
	        }
	    }
	}


