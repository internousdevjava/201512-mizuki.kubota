import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javakiso1{
	  public static void main(String args[]) {
		  System.out.println("x掛けるｙの計算表を算出します。");
		  System.out.println("x,ｙともに1以上100以下で指定してください。");


		  	int x = check("x");
			System.out.println("xの値は"+x);
			int y = check("y");
			System.out.println("yの値は"+y);

			//結果の表１
		    System.out.println(x+"×"+y+"の結果の表");
		    System.out.println("/////////////////////////////////////////");

		    int kuku[][] = new int[101][101];

		    for( int i=1; i<=y; i++ ) {
		      for( int j=1; j<=x; j++ ){
		    	  kuku[i][j] = i * j;
		      }
		    }
		    
		    
		    System.out.print("   ");
		    for(int i=1;i<=y; i ++){
		        System.out.print(i + " ");
		    }
		    System.out.println();
		    for(int i=1;i<=y+5; i ++){
		        System.out.print("☆");
		    }
		    System.out.println();
		    for( int i=1; i<=y; i++ ) {
		    	System.out.print(i+"★");
		      for( int j=1; j<=x; j++ ) {
		    	  System.out.print(kuku[i][j] + " ");
		      }
		      	  System.out.println();
		    }
	  }

	  public static int check(String moimoi) {

		  	boolean check = true;
			String str = null;
			int str_int = 0;

				do{
					  System.out.println(moimoi+"に代入する適正な数値を入力してください。");
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