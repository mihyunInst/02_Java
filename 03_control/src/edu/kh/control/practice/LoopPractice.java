package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	/* 
	실습 문제 1
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다. 
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
	ex.
	1 이상의 숫자를 입력하세요 : 4			
	1 2 3 4 
	
	1 이상의 숫자를 입력하세요 : 0
	1 이상의 숫자를 입력해주세요.
	*/
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc .nextInt();
		
		if(input >= 1) {
			for(int i=1 ; i<=input ; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	/*
	실습문제 2
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다. 

	ex.
	1이상의 숫자를 입력하세요 : 4			
	4 3 2 1						
	
	1이상의 숫자를 입력하세요 : 0
	1 이상의 숫자를 입력해주세요.  
	*/
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc .nextInt();
		
		if(input >= 1) {
			for(int i=input ; i>=1 ; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	/*
	실습문제 3
	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

	ex.
	정수를 하나 입력하세요 : 8
	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	*/
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0; // 합계용 변수
		
		for(int i=1 ; i<=input-1 ; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		
		sum += input;
		System.out.print(input + " = " + sum);
		
	}
	
	/*
	실습문제 4
	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

	ex.
	첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
	두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
	4 5 6 7 8 			4 5 6 7 8 			1 이상의 숫자를 입력해주세요.
	*/
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { // 1 미만의 숫자가 입력된 경우
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}else {
			
			// 출력을 위한 for문의 초기식, 조거식 값 구하기
			
			// 일단 start에 첫 번째 숫자,  end에 두 번째 숫자를 대입하고
			int start = num1;
			int end = num2;
			
			// 만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for(int i=start ; i<=end ; i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	/*
	실습문제 5
	사용자로부터 입력 받은 숫자의 단을 출력하세요.

	ex.
	숫자 : 4
	===== 4단 =====
	4 * 1 = 4
	4 * 2 = 8
	4 * 3 = 12
	4 * 4 = 16
	4 * 5 = 20
	4 * 6 = 24
	4 * 7 = 28
	4 * 8 = 32
	4 * 9 = 36
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("=====" + dan + "단 =====");
		for(int i=1 ; i<=9 ; i++) {
			System.out.printf("%d * %d = %d\n", dan , i, dan*i);
		}
	}
	
	/*
	실습문제 6
	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.

	숫자 : 4								숫자 : 10
	===== 4단 ===== 						2~9 사이 숫자만 입력해주세요.
	===== 5단 =====
	===== 6단 =====
	===== 7단 =====
	===== 8단 =====
	===== 9단 =====
	(해당 단의 내용들은 길이 상 생략)
	 */
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) { // 2~9를 사이가 아닌 수를 입력한 경우
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		
		}else { // 2~9 사이를 입력한 경우
			
			for(int dan=input ; dan<=9 ; dan++) {
				// 입력받은 숫자의 단부터 9단까지 출력
				
				System.out.println("=====" + dan + "단 =====");
				for(int i=1 ; i<=9 ; i++) {
					System.out.printf("%d * %d = %d\n", dan , i, dan*i);
				}
			}
		}
		
	}
	
	/*
	실습문제 7
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	*
	**
	***
	****
	*/
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {
			for(int col=1 ; col<=row ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	실습문제 8
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	****
	***
	**
	*

	*/
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=input ; row>=1 ; row--) {
			// 내가 입력한 input 값을 row에 대입하여 반복할때마다 1씩 감소
			
			for(int col=1 ; col<=row ; col++) { //현재 row보다 작거나 같을떄까
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	실습문제 9
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	   *
	  **
	 ***
	****
	
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// for문을 이용한 풀이
		for(int row = 1 ; row <= input ; row++ ) {
			// 공백 부분이 입력한 input보다 1작은수에서 시작하여 1씩 감소하는것처럼 보임
			for(int i = input-1 ; i >= row ; i--) {
				System.out.print(" ");
			}
			
			// 그 다음 현재 row 만큼 반복하기
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			
			// 그 다음줄로 이동
			System.out.println();
		}
		
		System.out.println("===========================");
		
		// if문을 이용한 풀이
		for(int row=1 ; row<=input ; row++) {
			for(int col=1 ; col<=input ; col++) {
				
				if(col <= input - row) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	/*
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 3
	*
	**
	***
	**
	*
	
	*/
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 위쪽 삼각형
		for(int row = 1 ; row <= input ; row++) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		// 아랫쪽 삼각형
		for(int row = input - 1; row >= 1 ; row--) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		System.out.println("====================");
		
		
		for(int row=1; row<= input*2-1; row++) {
         
    	  if(row < input) {
        	  
             for(int col=1; col <= row; col++) {
                System.out.print("*");
             }
             
          } else {
             for(int col=input ; col > row-input; col--) {
                System.out.print("*");
             }
          }
          
          System.out.println();
       }
	}
	
	/*
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 4
												// 왼쪽에서부터 공백포함 
	   *          // input(4) + row(1) - 1 == 4 -> 한 행에 4번 접근하여 공백이나 * 찍음
	  ***		  // input(4) + row(2) - 1 == 5 -> 한 행에 5번 접근
	 *****		  // input(4) + row(3) - 1 == 6 -> 한 행에 6번 접근
	*******		  // input(4) + row(4) - 1 == 7 -> 한 행에 7번 접근
	
	(한 행당 마지막 별찍고 다음줄로 넘어감) 이러한 규칙이 있음
	
	- " " 규칙 : input-row 값이 col 이상일 때 
	- "*" 규칙 : col이 더 클 때
	(1줄 : input(4) - row(1) == 3 >= col(1,2,3,4)
 		col이 4일 때 false이므로 별찍힘
 		
 	2줄 : input(4) - row(2) == 2 >= col(1,2,3,4,5) 
		col이 3,4,5 일때 false이므로 별찍힘
		
	3줄 : input(4) - row(3) == 1 >= col(1,2,3,4,5,6) 
		col이 2,3,4,5,6 일때 false이므로 별찍힘
	
	4줄 : input(4) - row(4) == 0 >= col(1,2,3,4,5,6,7) 
		col이 1,2,3,4,5,6,7 일때 false이므로 별찍힘 (공백찍힐일없음)
	 */
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 4일때
		
		// 1부터 시작해서 입력한값input까지 1씩 증가
		for(int row=1 ; row<=input ; row++) {
			
			for(int col=1; col<=input+row-1 ; col++) {
				// [1-1턴] 1 <= (4 + 1 - 1) 4
				// [1-2턴] 2 <= 4
				// [1-3턴] 3 <= 4
				// [1-4턴] 4 <= 4
				// -----------------
				// [2-1턴] 1 <= (4 + 2 - 1) 5
				// [2-2턴] 2 <= 5
				// [2-3턴] 3 <= 5
				// [2-4턴] 4 <= 5
				// [2-5턴] 5 <= 5
				if(input-row >= col) { 
		// [1-1턴] (4 - 1) 3 >= 1 (true) " " 출력
		// [1-2턴] 		   3 >= 2 (true) " " 출력
		// [1-3턴] 		   3 >= 3 (true) " " 출력
		// [1-4턴]		   3 >= 4 (false) "*" 출력 (안 for문 끝)
		// -----------------
		// [2-1턴] (4 - 2) 2 >= 1 (true) " " 출력
		// [2-2턴] 		   2 >= 2 (true) " " 출력
		// [2-3턴]		   2 >= 3 (false) "*" 출력
		// [2-4턴]		   2 >= 4 (false) "*" 출력
		// [2-5턴]		   2 >= 5 (false) "*" 출력 (안 for문 끝)
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println(); 
	// [1-5턴] col이 5가 되면서 안쪽 for문 false로 줄바꿈하고 바깥for문 다시감
	// [2-5턴] col이 6이 되면서 안쪽 for문 false로 줄바꿈하고 바깥for문 다시감
	// 이런식으로 쭉 진행..
		}
	}
	
	/*
	다음과 같은 실행 예제를 구현하세요.
	ex.
	정수 입력 : 5
	*****
	*   *
	*   *
	*   *
	*****
	
	규칙1) input == row(행)  
	규칙2) 1행과 input행의 col(열)은 input만큼 "*" 출력
	

	 */
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1 ; col <= input ; col++) {
				
				// 첫 번째 / 마지막 줄, 칸일 때만 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	/*
	1부터 사용자에게 입력 받은 수까지 중에서
	1) 2와 3의 배수를 모두 출력하고
	2) 2와 3의 공배수의 개수를 출력하세요.
	* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
	모두 나머지가 0이 나오는 수
	ex.
	자연수 하나를 입력하세요 : 15
	2 3 4 6 8 9 10 12 14 15 
	count : 2
	*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;
		
		for(int i = 1; i <= input ; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if(i % 2 == 0 && i % 3 == 0) {
					// 2와 3의 공배수 갯수 세기
					count++; // count 증가
				}
			}
		}
		
		System.out.println("\ncount : " + count);
	}
	
}
