import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Triangle implements Form{

	private Edge e1;
	private Edge e2;
	private Edge e3;
	private Rgb color;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.e1 = new Edge(x1, y1, x2, y2);
		this.e2 = new Edge(x2, y2, x3, y3);
		this.e3 = new Edge(x3, y3, x1, y1);
		this.color = new Rgb();
	}

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int r, int g, int b){
		this.e1 = new Edge(x1, y1, x2, y2);
		this.e2 = new Edge(x2, y2, x3, y3);
		this.e3 = new Edge(x3, y3, x1, y1);
		this.color = new Rgb(r, g, b);
	}

	@Override
	public float area(){

		int xa = this.e1.getP1().getX();
		int xb = this.e2.getP1().getX();
		int xc = this.e3.getP1().getX();

		int ya = this.e1.getP1().getY();
		int yb = this.e2.getP1().getY();
		int yc = this.e3.getP1().getY();

		return (float) 0.5 * abs(((xb*yc)-(xc*yb)) - ((xa*yc)-(xc*ya)) + ((xa*yb)-(xb*ya)));
	}

	@Override
	public Point centralPoint(){
		
		int x = this.e1.getP1().getX() + this.e2.getP1().getX() + this.e3.getP1().getX();

		int y = this.e1.getP1().getY() + this.e2.getP1().getY() + this.e3.getP1().getY();		 
	
		return new Point((int) x/3, (int) y/3);
	}

	@Override
	public float perimeter(){
		return this.e1.sizeEdge() + this.e2.sizeEdge() + this.e3.sizeEdge();
	}

	@Override
	public Rgb getRgb(){
		return this.color;
	}
	
	@Override
	public String toString(){

		return 
		"Triângulo\n" +
		"Pontos: " + this.e1.getP1() + ", " + this.e2.getP1() + ", " + this.e3.getP1() + "\n" +
		"Aresta 1: " + this.e1 + "\n" +
		"Aresta 2: " + this.e2 + "\n" +
		"Aresta 3: " + this.e3 + "\n" + 
		"ponto central: " + this.centralPoint() + "\n" +
		"área: " + this.area() + "\n" +
		"perimetro: " + this.perimeter() + "\n" +
		"cor: " + this.getRgb() + "\n" +
		"----------------------------" + "\n";
	}

	public Edge getE1(){
		return this.e1;
	}
	public Edge getE2(){
		return this.e2;
	}
	public Edge getE3(){
		return this.e3;
	}



}