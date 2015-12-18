public class Goods {
	String name;
	int cost;
	static double rate;
	
	public Goods(String n){
		this.name = n;
		this.cost = 0;
	}
	
	public Goods(String n, int c){
		this.name = n;
		this.cost = c;
	}

	public String getName() {
		return name;
	}
	
	public static double getRate(){
		return rate;
	}
	
	public int getCost(){
		return cost;
	}
	
	public int getPrice(){
		return (int)(cost*( 1 + rate ));
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public void setCost(int c){
		this.cost = c;
	}
	
	public static void setRate(double r){
		rate = r;
	} 
	
	public void show(){
		System.out.println("商品名："+ name);
		System.out.println("税抜価格："+ cost);
		System.out.println("消費税率："+ rate);
		System.out.println("税込価格："+ getPrice());
	}
}
