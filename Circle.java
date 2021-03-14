import static java.lang.Math.PI;

public class Circle implements Form{
	
	private Point center;
	private int radius;
	private Rgb color;

	public Circle(int x, int y, int radius){
		this.center = new Point(x, y);
		this.radius = radius;
		this.color = new Rgb();
	}

	public Circle(int x, int y, int radius, int r, int g, int b){
		this.center = new Point(x, y);
		this.radius = radius;
		this.color = new Rgb(r, g, b);
	}
	
	@Override
	public float area(){
		return (float) PI * this.radius * this.radius; 
	}

	@Override
	public Point centralPoint(){
		return this.center;
	}

	@Override
	public float perimeter(){
		return (float) PI * this.radius * 2;
 	}

 	@Override
 	public Rgb getRgb(){
 		return this.color;
 	}

 	@Override
 	public String toString(){
 		
 		return
 		"Círculo\n" +
		"ponto central: " + this.centralPoint() + "\n" +
		"raio: " + this.getRadius() + "\n" +
		"área: " + this.area() + "\n" +
		"perimetro: " + this.perimeter() + "\n" +
		"diametro: " + this.diameter() + "\n" +
		"cor: " + this.getRgb() + "\n" +
		"----------------------------" + "\n";
 	}

 	public int diameter(){
 		return 2 * this.radius;
 	}

 	public int getRadius(){
 		return this.radius;
 	}



}