import java.util.Scanner;

public class seikuuti {

	public static void main(String[] args) {
		String yorn = "no";
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		int taikuuti = 0;
		int tousaisuu = 0;
		while(yorn.equals("n") || yorn.equals("no")){
			System.out.println("制空値を計算します。");

			while(true){
				System.out.println("艦載機の対空値を入力してください。");
				taikuuti = stdIn.nextInt();
				if(taikuuti<0)
					break;
				System.out.println("艦載機の搭載数を入力してください。");
				tousaisuu = stdIn.nextInt();
				if(tousaisuu<0)
					break;
				sum += taikuuti * Math.sqrt(tousaisuu);
				System.out.println("現在の制空値は"+sum+"です。(端数切捨て)");

			}
			while(true){
				System.out.println("終了しますか？[y/n]");
				yorn = stdIn.next();
				if(yorn.equals("y") || yorn.equals("n") || yorn.equals("yes") || yorn.equals("no") )
					break;
				System.out.print("なんですか？");
			}

		}

	}
}
