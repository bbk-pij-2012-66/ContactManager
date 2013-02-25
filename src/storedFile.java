import java.io.*;

/**
 * A text file that will hold the data.
 *
 * This will check if the file exists if it does we will load the data. Otherwise create it.
 */
public class storedFile {

	public void run() {  

		System.out.println("in here");
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("whereami.txt"));
			pw.println("hello");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
 		  
	}
}