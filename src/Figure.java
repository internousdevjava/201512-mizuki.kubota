class Figure{
	//フィールド
	private int base;		//底辺フィールド
	private int height;		//高さフィールド
	//コンストラクタ
	public Figure(int base,int height){
		setBase(base);
		setHeight(height);
	}
	//表示用メソッド
	public void show(){
		System.out.println("底辺:" + base + " cm");
		System.out.println("高さ:" + height + " cm");
	}
	//面積を求めるメソッド
	public double getArea(){
		return 0.0;
	}
	//引数の値をbaseフィールドに設定する
	public void setBase(int base){
		if(base > 0){
			this.base = base;
		}
	}
	//引数の値をheightフィールドに設定する
	public void setHeight(int height){
		if(height > 0){
			this.height = height;
		}
	}
	//baseフィールドの値を取得する
	public int getBase(){
		return base;
	}
	//heightフィールドの値を取得する
	public int getHeight(){
		return height;
	}
}