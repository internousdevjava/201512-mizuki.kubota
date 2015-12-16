import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javakiso2{
	  public static void main(String args[]) {
		  System.out.println("私は1～100の範囲でひとつの整数の書かれたカードを持っています。");
		  System.out.println("その数字を当ててもらいます。");
		  int ran = (int)(Math.random()*100)+1;
		  
		  int x = 0;

		  do{
		  	x = check("x");
			System.out.println("あなたの回答: "+x);
				if(x < ran){
					System.out.println("私のカードはもっと大きいです。");
				}else if(x > ran){
					System.out.println("私のカードはもっと小さいです。");
				}
		  }while( ran != x);
		  
		  System.out.println("正解！暇つぶしになりましたか？");
		    }

	  public static int check(String moimoi) {

		  	boolean check = true;
			String str = null;
			int str_int = 0;

				do{
					  System.out.println("回答する数字を入力してください。");
					  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


						try {
							str = br.readLine();
						} catch (IOException e) {
							e.printStackTrace();
						}

						try {
							str_int = Integer.parseInt(str);
							check = false;

						} catch (NumberFormatException nfex) {
							check = true;
						}
				}
				while(check==true || str_int < 1  || 100< str_int);
		return str_int;

	  }
}