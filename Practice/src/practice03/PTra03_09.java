package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_09 {
	public static void main(String[] args) {
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("数字を入力してください");
		
		int num = scanner.nextInt();
		
		switch(num) {
			case 0:
				System.out.println("日曜");
				break;
			
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("土曜");
				break;
				
			default:
				System.out.println("0～6の数字を入力してください。");
				
				System.out.println("ありがとうございました！");
			
	
		}
	}
}
