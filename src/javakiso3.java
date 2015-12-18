import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;

class javakiso3{

	 static String Path = new File(".").getAbsoluteFile().getParent();;
	 static String FileName;
	 static String AllPath;
	 static String Dir;

  public static void main(String args[]){
	  int menu = 0;


	  do{
		  System.out.println();
		  System.out.println("テキストファイルエディタ　メニュー");
		  System.out.println("///現在選択しているパス: "+Path+"///");
		  System.out.println("///現在選択しているファイル: "+FileName+"///");
		  System.out.println("1: ディレクトリ閲覧と移動");
		  System.out.println("2: ディレクトリの作成");
		  System.out.println("3: .txt一覧と選択");
		  System.out.println("4: ファイルの新規作成");
		  System.out.println("5: ファイルの読み込み");
		  System.out.println("6: 追記する");
		  System.out.println("7: 上書きする");
		  System.out.println("8: 終了");
		  System.out.println("/////////////////////////////////////////");
		  System.out.println();
		  System.out.print("メニューを");

		  menu = input_select(1,8);
		  AllPath = Path+"//"+FileName ;

		  switch (menu){

		  /*
		  case 1:
		    System.out.println("パスを入力してください");
		    Path = input_string();
		    break;
		    */
		  case 1:
		    System.out.println("デイレクトリ一覧を表示します");
		    ShowDirList(Path);
		    break;
		  case 2:
		    System.out.println("デイレクトリを作成します");
		    System.out.println("ディレクトリ名前を入力してください");
		    Dir = Path +"//"+ input_string();
		    Makedirs(Dir);
		    break;
		  case 3:
		    System.out.println(".txtを表示します");
		    Showtxt(Path);
		    System.out.println("//////////////////////");
		    break;
		  case 4:
		    System.out.println("ファイルを作成します");
		    System.out.println("ファイル名を入力してください");
		    FileName = input_string()+".txt";
		    AllPath = Path+"//"+FileName;
		    MakeFile(AllPath);
		    break;
		  case 5:
		    System.out.println("ファイル読み込み中...");
		    ReadFile(AllPath);
		    break;
		  case 6:
		    System.out.println("ファイルに追記する内容を入力してください");
		    AddFile(AllPath);
		    break;
		  case 7:
		    System.out.println("ファイルに上書きする内容を入力してください");
		    SaveFile(AllPath);
		    break;
		  }

	  }while(menu !=8);
	  System.exit(0);

  	}

  public static void Makedirs(String path){
	  File newfile = new File(path);

	    if (newfile.mkdirs()){
	      System.out.println("ディレクトリの作成に成功しました");
	      Path = Dir;
	    }else{
	      System.out.println("ディレクトリの作成に失敗しました");
	    }
  }

  public static void SaveFile(String path){
	  try{
	      File file = new File(path);

	      if (checkfile(file)){
	        FileWriter filewriter = new FileWriter(file);
	        String input = input_string();
	        filewriter.write(input);

	        filewriter.close();
	      }else{
	        System.out.println("ファイルに書き込めません");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }
  }

  public static void AddFile(String path){
	  try{
	      File file = new File(path);

	      if (checkfile(file)){
	        FileWriter filewriter = new FileWriter(file, true);
	        String input = input_string();
	        filewriter.write(input);

	        filewriter.close();
	      }else{
	        System.out.println("ファイルに書き込めません");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }
}

  public static void Showtxt(String path) {
	  		System.out.println("///////////////////////////////////");
	  		File dir = new File(path);
	        String []files = dir.list(new MyFilter());
	          int n = 1;
	          for(int i=0; i<files.length; ++i){
	              System.out.println(n+" : "+files[i]);
	              n ++;
	          }
	       System.out.println("///////////////////////////////////");
	       System.out.println("0を入力するとキャンセルします");
	       System.out.print("移動先を");
	  	   int select = input_select(0,n)-1;
	  	   System.out.println();
	  	   if(select != -1){
	  	   FileName = files[select];
	  	   }
	      }

	public static String input_string(){
		  String str = null;
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return str;
	}

	public static void MakeFile(String path){
		  File newfile = new File(path);
		    try{
		      if (newfile.createNewFile()){
		        System.out.println("ファイルの作成に成功しました");
		      }else{
		        System.out.println("ファイルの作成に失敗しました");
		      }
		    }catch(IOException e){
		      System.out.println(e);
		    }
	}

	public static void ReadFile(String path){
		  try{
		      File file = new File(path);

		      if (checkfile(file)){
		        BufferedReader br = new BufferedReader(new FileReader(file));
		        String str;
		        while((str = br.readLine()) != null){
		          System.out.println(str);
		        }

		        br.close();
		      }else{
		        System.out.println("ファイルが見つからないか開けません");
		      }
		    }catch(FileNotFoundException e){
		      System.out.println(e);
		    }catch(IOException e){
		      System.out.println(e);
		    }
	}

  public static int input_select(int min,int max) {
	  	boolean check = true;
		String str = null;
		int str_int = -10;

			do{
				  System.out.println("選択してください");
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
			while(check==true || str_int < min  || max< str_int);
	return str_int;
}

  private static boolean checkfile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canWrite()){
	        return true;
	      }
	    }
	    return false;
	  }


	public static void ShowDirList(String path) {
File dir = new File(path);
	    File[] files = dir.listFiles();
	    File[] newfiles = new File[files.length];
	    int n = 1;
		    for (int i = 0; i < files.length; i++) {
		        File file = files[i];
		        if (files[i].isDirectory()){
		        System.out.println(n+" : "+file);
		        newfiles[n] =files[i];
		        n ++;
		        }
		    }
	    System.out.println("/////////////////////////////////////////");
	    System.out.println("0を入力するとC://に移動します");
	    System.out.print("移動先を");
	    int select = input_select(0,n);
		    if (select == 0 ){
		    	Path = "C://";
		    }else{
		    Path = newfiles[select].getAbsolutePath();
		    }
	}

}
class MyFilter implements FilenameFilter{

    public boolean accept(File dir, String name) {
        int index = name.lastIndexOf(".");
        String ext = name.substring(index+1).toLowerCase();
        if(ext.equals("txt") == true) {return true;}
        return false;
    }

}
