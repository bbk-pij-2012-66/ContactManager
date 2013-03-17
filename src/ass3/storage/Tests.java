package ass3.storage;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import ass3.classes.ContactImpl;
import ass3.classes.ContactManagerImpl;
import ass3.interfaces.Contact;
import ass3.interfaces.ContactManager;

/**
 * This Java Class will be used to test the functionality of Contact Manager
 * assignment.  
 * 
 * In order to run all the tests just highlight the "Tests" class
 * name below, right click on it, then select "Run As", and "JUnit Test"
 * 
 * @author Baz M
 *
 */
public class Tests {

	ArrayList<ContactImpl> contacts = new ArrayList<ContactImpl>();
	ContactList listOfContacts = new ContactList();

	@Before
	public void init()
	{
		ContactImpl aContact = new ContactImpl();
		aContact.setName("Baz Maj");
		aContact.setId(1);
		aContact.addNotes("junior java programmer");
		contacts.add(aContact);
		ContactImpl bContact = new ContactImpl();
		bContact.setName("Matt Ross");
		bContact.setId(2);
		bContact.addNotes("junior c++ programmer");
		contacts.add(bContact);
		ContactImpl cContact = new ContactImpl("Pete Axe", "java programmer");
		contacts.add(cContact);
		ContactImpl dContact = new ContactImpl();
		dContact.setName("Pete Mas");
		dContact.setId(4);
		dContact.addNotes("senior java programmer");
		contacts.add(dContact);

		listOfContacts.setContactList(contacts);

	}

	@Test
	public void add_New_Contact()
	{
		ContactManager sut = new ContactManagerImpl();

		sut.addNewContact("James Wingnut", "Special Ops");

		for (ContactImpl contact : contacts) 
		{
			System.out.println("[id=" + contact.getId() + ", name=" + contact.getName() + ", notes=" + contact.getNotes() + "]");	
		}
	}


	@Test
	public void flush_command_saves_to_file()
	{

		//ContactManager testFlush = new ContactManagerImpl();

		//testFlush.flush();
		ObjectToXML flusher = new ObjectToXML();

		flusher.pushToFile(listOfContacts);

		String home = System.getProperty("user.home"); 
		File aFolder = new File(home + "/tmp");
		File aFile = new File(aFolder + "/contacts.txt");

		assertThat(aFile.exists(), is(true));

	}



	@Test
	public void ensure_contactIds_are_unique()
	{
		Set<Integer> setOfIds = new HashSet<Integer>();
		List<Integer> listOfIds = new ArrayList<Integer>();

		for (int i=0; i < 4; i++)
		{
			setOfIds.add(contacts.get(i).getId());
			listOfIds.add(contacts.get(i).getId());
			//			System.out.println(contacts.get(i).getId());
		}

		assertThat(setOfIds.size(), is(listOfIds.size()));
	}

	/*	@Test
	public void generated_numbers_must_be_between_1_and_49 ()
	{
		LotteryNumberGenerator sut = new LotteryNumberGenerator();

		int lowest=49;
		int highest=1;

		for (int i=0; i<100000; i++)
		{
			Set<Integer> lotteryNumbers = sut.generateLotteryNumbers();
			for (Integer num : lotteryNumbers)
			{
				if (num < lowest)
				{
					lowest = num;
				}
				if (num > highest)
				{
					highest = num;
				}
			}
		}

		assertThat(highest, is(49));
		assertThat(lowest, is(1));
	}

	@Test
	public void should_match_numbers_properly ()
	{
		PlayLottery lottery = new PlayLottery();
		Set<Integer> lotteryNumbers = new HashSet<Integer>(6);
		Set<Integer> userNumbers = new HashSet<Integer>(6);

		lotteryNumbers.add(1);lotteryNumbers.add(6);lotteryNumbers.add(8);lotteryNumbers.add(24);lotteryNumbers.add(35);lotteryNumbers.add(49);
		userNumbers.add(2);userNumbers.add(4);userNumbers.add(24);userNumbers.add(34);userNumbers.add(35);userNumbers.add(45);
		Set<Integer> matchedNumbers = lottery.playLottery(lotteryNumbers, userNumbers);

		assertThat(matchedNumbers.size(), is(2));
		assertThat(matchedNumbers.contains(24), is(true));
		assertThat(matchedNumbers.contains(35), is(true));

	}*/
}
