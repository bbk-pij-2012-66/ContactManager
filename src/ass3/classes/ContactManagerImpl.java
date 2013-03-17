package ass3.classes;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import ass3.interfaces.Contact;
import ass3.interfaces.ContactManager;
import ass3.interfaces.FutureMeeting;
import ass3.interfaces.Meeting;
import ass3.interfaces.PastMeeting;


public class ContactManagerImpl implements ContactManager
{
	
	// returns Meeting object if id passed
	@Override
	public Meeting getMeeting(int id)
	{
		return null;
	}
	
	// update an id with some notes
	@Override
	public void addMeetingNotes(int id, String text)
	{

	}
	
	// add new contact with name and some notes
	@Override
	public void addNewContact(String name, String notes)
	{

	}	
	
	// returns a set of contacts based on some(?) ids
	@Override
	public Set<Contact> getContacts(int... ids)
	{	
		return null;
	}

	// returns a set of contacts based on a Name
	@Override
	public Set<Contact> getContacts(String name)
	{
		return null;
	}
	
////////////////PAST MEETINGS
	// returns PastMeeting object if id passed
	@Override
	public PastMeeting getPastMeeting(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	// returns a list of PastMeetings objects if a contact object is passed
	@Override
	public List<PastMeeting> getPastMeetingList(Contact contact)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	// adds new 'old' meeting based on a set of contacts, a date, and a some text/notes
	@Override
	public void addNewPastMeeting(Set<Contact> contacts, Calendar date,	String text)
	{
		// TODO Auto-generated method stub

	}
	
//////////////// FUTURE MEETINGS
	/**
	* Add a new meeting to be held in the future.
	*
	* @param contacts a list of contacts that will participate in the meeting
	* @param date the date on which the meeting will take place
	* @return the ID for the meeting
	* @throws IllegalArgumentException if the meeting is set for a time in the past,
	* of if any contact is unknown / non-existent
	*/
	@Override
	public int addFutureMeeting(Set<Contact> contacts, Calendar date)
	{
		return 0;
	}

	// returns FutureMeeting object if id passed
	@Override
	public FutureMeeting getFutureMeeting(int id)
	{
		return null;
	}

	// returns list if contact parameter passed
	@Override
	public List<Meeting> getFutureMeetingList(Contact contact)
	{
		return null;
	}

	// returns list if date parameter passed
	@Override
	public List<Meeting> getFutureMeetingList(Calendar date)
	{
		return null;
	}

	/**
	* Save all data to disk. *
	* This method must be executed when the program is
	* closed and when/if the user requests it. */	
	@Override
	public void flush()
	{
//		ObjectToXML flusher = new ObjectToXML();
//		ContactList list = (ContactList) getContacts();
//		
//		flusher.pushToFile(list);

	}

}
