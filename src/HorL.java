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
			System.out.println("����̐�����" + cnum);
			System.out.println(" ");
			System.out.println("HIGH OR LOW?");
			System.out.println(" ");
			System.out.print("HIGH�Ȃ�1 LOW�Ȃ�2����́�");
			num = sc.nextInt();
			System.out.println(" ");
			
			if(num == 1){
				System.out.println("COM" + cnum + " YOU" + mnum);
				if(mnum > cnum){
					System.out.println("������I ���݂̃|�C���g��" + (p = p + mnum));
					System.out.println(" ");
				}
				
				else{
					System.out.println("�͂���I �Q�[���I���I�ŏI�|�C���g��" + p);
					System.out.println(" ");
					win = false;
				}
			}
			
			else if(num == 2){
				if(mnum < cnum){
					System.out.println("������I ���݂̃|�C���g��" + (p = p + mnum));
					System.out.println(" ");
				}
				
				else{
					System.out.println("�͂���I �Q�[���I���I�ŏI�|�C���g��" + p);
					System.out.println(" ");
					win = false;
				}
			}
		}

	}

}
