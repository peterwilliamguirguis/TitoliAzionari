/**
 * 
 */
package titoliazionari.ing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author peter
 *
 */
public class MainTitoloAzionari {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	throws IOException,FileNotFoundException,ClassNotFoundException{
		File file = new File("E:\\peter.txt");
		if(!(file.exists()))
			{System.out.println("il c'e' qualcosa che e' stata salvata bisogna creare un nuovo porta foglio");
			
			
		
		
			}
	}

}
