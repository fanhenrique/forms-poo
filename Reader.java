import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.io.File;
import java.lang.IndexOutOfBoundsException;

public class Reader {

	private FileReader file;
	private BufferedReader bFile;
	private ArrayList <Form> forms;
	private ArrayList <Integer> points;
	private ArrayList <Integer> color;

	public Reader(String file) throws FileNotFoundException{

		this.file = new FileReader(new File(file));
		this.bFile = new BufferedReader(this.file);
		this.forms = new ArrayList <Form>();
	}

	private ArrayList <Integer> readNumbers() throws IOException, NumberFormatException{

		String input = this.bFile.readLine();
	
		String[] numbers = input.split(" "); 

		ArrayList <Integer> n = new ArrayList <Integer>();

		for(int i = 0; i < numbers.length; i++){
			n.add(Integer.valueOf(numbers[i]));
		}

		return n;
	} 
	
	public void read() throws IOException, NullPointerException, IndexOutOfBoundsException{
	
		String line = null;

		do{

			line = this.bFile.readLine();

			if(line != null){
				
				if(line.equals("q")){

					this.points = this.readNumbers();
					this.color = this.readNumbers();

					Form q = new Quadrilateral(points.get(0), points.get(1), points.get(2), points.get(3), points.get(4), points.get(5), points.get(6), points.get(7), color.get(0), color.get(1), color.get(2));

					this.forms.add(q);
				}
				
				
				if(line.equals("c")){
					
					this.points = this.readNumbers();
					this.color = this.readNumbers();

					Form c = new Circle(points.get(0), points.get(1), points.get(2), color.get(0), color.get(1), color.get(2));

					this.forms.add(c);
				}
				
				if(line.equals("t")){

					this.points = this.readNumbers();
					this.color = this.readNumbers();

					Form t = new Triangle(points.get(0), points.get(1), points.get(2), points.get(3), points.get(4), points.get(5), color.get(0), color.get(1), color.get(2));

					this.forms.add(t);
				}
			}
		}while(line != null);

		file.close();
		bFile.close();	
	}

	public ArrayList <Form> getForms(){
		return this.forms;
	}
}