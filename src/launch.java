import java.util.ArrayList;

import ass3.classes.ContactImpl;
import ass3.storage.XMLToObject;



public class launch {

	/**
	 * launch class
	 * 
	 * need to check if text file exists, if not we will create it
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// on start up read from text file called "contacts.txt"!
		ArrayList<ContactImpl> list = XMLToObject.loadFile();
		for (ContactImpl contact : list) {
			System.out.println("[id=" + contact.getId() + ", name=" + contact.getName() + ", notes=" + contact.getNotes() + "]");	
		}

	}

}
