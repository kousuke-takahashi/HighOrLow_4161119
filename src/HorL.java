import java.util.Random;
import java.util.Scanner;

public class HorL {

	public static void main(String[] args) {
		int mnum,cnum,num,p = 0;
		boolean win = true;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HIGH OR LOW GAME!!!");
		
		while(win){
			mnum = rnd.nextInt(13)+1;
			cnum = rnd.nextInt(13)+1;
			if(mnum == cnum) continue;
			System.out.println("相手の数字→" + cnum);
			System.out.println(" ");
			System.out.println("HIGH OR LOW?");
			System.out.println(" ");
			System.out.print("HIGHなら1 LOWなら2を入力→");
			num = sc.nextInt();
			System.out.println(" ");
			
			if(num == 1){
				System.out.println("COM" + cnum + " YOU" + mnum);
				if(mnum > cnum){
					System.out.println("あたり！ 現在のポイント→" + (p = p + mnum));
					System.out.println(" ");
				}
				
				else{
					System.out.println("はずれ！ ゲーム終了！最終ポイント→" + p);
					System.out.println(" ");
					win = false;
				}
			}
			
			else if(num == 2){
				if(mnum < cnum){
					System.out.println("あたり！ 現在のポイント→" + (p = p + mnum));
					System.out.println(" ");
				}
				
				else{
					System.out.println("はずれ！ ゲーム終了！最終ポイント→" + p);
					System.out.println(" ");
					win = false;
				}
			}
		}

	}

}
