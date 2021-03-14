import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Writer{

	private FileWriter file;
	private BufferedWriter bFile;
	private ArrayList <Form> forms;

	public Writer(String file) throws FileNotFoundException, IOException{

		this.file = new FileWriter(new File(file));
		this.bFile = new BufferedWriter(this.file);
	}

	public void setForms(ArrayList <Form> forms){
		this.forms = forms;
	}

	public void writes() throws IOException{

		for(int i = 0; i < forms.size(); i++){

			bFile.write(forms.get(i).toString());
		}

		bFile.close();
		file.close();
	}
}