
public class Student{
	private String name ;
	private	int kokugo ;
	private int sansu ;
	
	Student(String name){
		this.name = name;
		this.kokugo = 0;
		this.sansu = 0;
	}
	
	Student(String name,int kokugo,int sansu){
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
	}

	public String getName(){
		return name ;
	}
	
	public int getKokugo(){
		return kokugo;
	}
	
	public int getSansu(){
		return sansu;
	}
	
	public void setName(String n){
		name = n ;
	}
	
	public void setKokugo(int k){
		kokugo = k ;
	}
	
	public void setSansu(int s){
		sansu = s ;
	}
	
	public void show(){
		System.out.println("氏名："+ name);
		System.out.println("国語："+ kokugo);
		System.out.println("算数："+ sansu);
	}
}
