public class Quadrilateral implements Form{

	private Triangle t1;
	private Triangle t2;
	private Rgb color;
	
	public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int r, int g, int b){
		
		this.t1 = new Triangle(x1, y1, x2, y2, x3, y3);
		this.t2 = new Triangle(x2, y2, x4, y4, x3, y3);

		this.color = new Rgb(r, g, b);
	}

	@Override
	public float area(){
		return this.t1.area() + this.t2.area();
	}

	@Override
	public Point centralPoint(){
		int t1p1x = this.t1.getE1().getP1().getX();
		int t1p1y = this.t1.getE1().getP1().getY();

		int t1p2x = this.t1.getE2().getP1().getX();
		int t1p2y = this.t1.getE2().getP1().getY();

		int t1p3x = this.t1.getE3().getP1().getX();
		int t1p3y = this.t1.getE3().getP1().getY();

		int t2p4x = this.t2.getE2().getP1().getX();
		int t2p4y = this.t2.getE2().getP1().getY();

		int x = t1p1x + t1p2x + t1p3x + t2p4x;
		int y = t1p1y + t1p2y + t1p3y + t2p4y;
		
		return new Point((int) x/4, (int) y/4);
	}

	@Override
	public float perimeter(){
		float l1 = this.t1.getE1().sizeEdge();
		float l2 = this.t2.getE1().sizeEdge();
		float l3 = this.t2.getE2().sizeEdge();
		float l4 = this.t1.getE3().sizeEdge();

		return l1+l2+l3+l4;
	}

	@Override
	public Rgb getRgb(){
		return this.color;
	}

	@Override
	public String toString(){

		return 
		"Quadrilátero\n"+
		"Pontos: " + this.t1.getE1().getP1() + ", " + this.t1.getE2().getP1() + ", " + this.t1.getE3().getP1() + ", " + this.t2.getE2().getP1() + "\n" +
		"Aresta 1: " + this.t1.getE1() + "\n" +
		"Aresta 2: " + this.t2.getE1() + "\n" +
		"Aresta 3: " + this.t2.getE2() + "\n" +
		"Aresta 4: " + this.t1.getE3() + "\n" +
		"ponto central: " + this.centralPoint() + "\n" +
		"área: " + this.area() + "\n" +
		"perimetro: " + this.perimeter() + "\n" +
		"cor: " + this.getRgb() + "\n" +
		"----------------------------" + "\n";
	}
}
