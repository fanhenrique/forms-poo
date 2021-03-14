import static java.lang.Math.sqrt;

public class Edge{

	private Point p1;
	private Point p2;

	public Edge(int x1, int y1, int x2, int y2){

		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	public float sizeEdge(){
		
		int x1 = this.p1.getX();
		int y1 = this.p1.getY();
		int x2 = this.p2.getX();
		int y2 = this.p2.getY();

		return (float) sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
	}

	public String toString(){
		return  this.p1.toString() + ", " + this.p2.toString();  
	}

	public Point getP1(){
		return this.p1;
	}

	public Point getP2(){
		return this.p2;
	}

}