package ass3.storage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import ass3.classes.ContactImpl;

public class IdGenerator
{
	// get list of current IDs, stick into a set,
	// iterate on set until you find one that doesn't exit
	// send it back


	public static int getID(ArrayList<ContactImpl> list) {

		int randomInt;
		Random randomGenerator = new Random();

		if (list == null) {
			randomInt = randomGenerator.nextInt();
		} 
		else
		{
			Set<Integer> setOfIds = new HashSet<Integer>();
			Set<Integer> setOfNum = new HashSet<Integer>();
			
			for (ContactImpl contact : list) 
			{
				setOfIds.add(contact.getId());
				setOfNum.add(contact.getId());	
			}
			
			do {
				randomInt = randomGenerator.nextInt();
				setOfNum.add(randomInt);
			} while (setOfNum.size() == setOfIds.size());
		}

		return randomInt;

	}


}
