/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
			try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	               String[] input = line.split(",");


	                Player player = new Player();
	                player.setPosition(input[0]);
	                player.setName(input[1]);
	                player.setCountry(input[2]);
	                player.setTeam(input[3]);
	                array.add(player);


	            }


			} catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
			}



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
			int count = 0;

			for(int i = 0;i<array.size();i++) {
				int num = (int)(Math.random()*55);
				Player players = array.get(num);
				if(players.getPosition().equals("GK") && count<1) {
					System.out.println(players);
					count++;
				}
			}

				count = 0;
				for(int i = 0;i<array.size();i++) {
					int num = (int)(Math.random()*55);
					Player players = array.get(num);
				if(players.getPosition().equals("DF") && count<4) {
					System.out.println(players);
					count++;
				}
				}

				count = 0;
				for(int i = 0;i<array.size();i++) {
					int num = (int)(Math.random()*55);
					Player players = array.get(num);
				if(players.getPosition().equals("MF") && count<4) {
					System.out.println(players);
					count++;
				}
				}

				count = 0;
				for(int i = 0;i<array.size();i++) {
					int num = (int)(Math.random()*55);
					Player players = array.get(num);
				if(players.getPosition().equals("FW") && count<2) {
					System.out.println(players);
					count++;
				}
				}
			}


	}

