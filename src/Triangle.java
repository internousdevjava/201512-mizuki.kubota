public class Triangle extends Figure{
	private final double HALF = 2.0 ;
	public Triangle(int b,int h) {
		super(b, h);
	}
	
	public double getArea(){
		double area = getBase() * getHeight() / HALF;
		return area;
	}
	
	public void show(){
		System.out.println("底辺:" + getBase()+ " cm");
		System.out.println("高さ:" + getHeight() + " cm");
		System.out.println("面積:" + getArea() + " 平方cm");
	}
	
}
