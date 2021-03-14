import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;
import java.lang.IndexOutOfBoundsException;

public class Teste{

	public static void main(String[] args){

		if(args.length != 2){
			System.out.println("Exemplo:java Teste entrada.txt saida.txt");
			System.exit(0);
		}

		try{

			Reader reader = new Reader(args[0]);
			Writer writer = new Writer(args[1]);

			reader.read();

			writer.setForms(reader.getForms());

			writer.writes();

			System.out.println("foi criado o arquivo " + args[1] + " com as formas");

		}catch(FileNotFoundException e){
			System.err.printf("Erro no arquivo de entrada\n");

		}catch(IOException e){
			System.err.printf("Erro na leitura do arquivo de entrada\n");

		}catch(NumberFormatException e){
			System.err.printf("Erro de tipo\n");
		}
		catch(NullPointerException e){
			System.err.printf("Erro na leitura de linha do arquivo\n");
		}
		catch(IndexOutOfBoundsException e){
			System.out.printf("Erro na cordenada da forma\n");
		}
	}
}