public class Rgb{

	private int r;
	private int g;
	private int b;

	public Rgb(){
		this.r = -1;
		this.g = -1;
		this.b = -1;
	}

	public Rgb(int r, int g, int b){

		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	// SETs
	public void setRgb(int r, int g, int b){

		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void setRed(int r){
		this.r = r;
	}

	public void setGreen(int g){
		this.g = g;
	}

	public void setBlue(int b){
		this.b = b;
	}

	//GETs
	public int getRed(){
		return this.r;
	}

	public int getGreen(){
		return this.g;
	}

	public int getBlue(){
		return this.b;
	}
	
	public String toString(){
		return "R: " + this.r + " G: " + this.g + " B: " + this.b;
	}
	



}