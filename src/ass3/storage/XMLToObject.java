package ass3.storage;


import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ass3.classes.ContactImpl;

public class XMLToObject 
{
	public static void main(String[] args) {

		String home = System.getProperty("user.home"); 
		File aFile = new File(home + "/tmp/contacts.txt");

		if (aFile.exists()) {

			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(ContactImpl.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				ContactImpl pullContact = (ContactImpl) jaxbUnmarshaller.unmarshal(aFile);
				System.out.println("[id=" + pullContact.getId() + ", name=" + pullContact.getName() + ", notes=" + pullContact.getNotes() + "]");
				
			} catch (JAXBException e) {
				e.printStackTrace();
			}

		}


	}



}