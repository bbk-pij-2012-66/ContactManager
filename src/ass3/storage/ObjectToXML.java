package ass3.storage;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ass3.classes.ContactImpl;

public class ObjectToXML 
{
	public static void main(String[] args) {
		
		
		checkFolderExistsOtherwiseCreate();

		
//		try {

			String home = System.getProperty("user.home"); 
			File file = new File(home + "/tmp/" +"file.xml");
			
			//check file exists
			if (file.exists())
			{
				System.out.println("file exists");
			} else {
				System.out.println("file does not exist");
			}
			
//			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
//			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//			// output pretty printed
//			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//			jaxbMarshaller.marshal(customer, file);
//			jaxbMarshaller.marshal(customer, System.out);
//
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
	}
			

	public static void checkFolderExistsOtherwiseCreate()
	{
		ContactImpl aContact = new ContactImpl();
		
		// test data
		aContact.setName("Baz Maj");
		aContact.setId(1);
		aContact.addNotes("junior java programmer");
		
		
		
		
		
	}
		
			

}