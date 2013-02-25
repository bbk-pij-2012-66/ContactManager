import java.io.*;


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
//			pw.println("hello");
//			pw.close();
			
		}
 		  
	}
}