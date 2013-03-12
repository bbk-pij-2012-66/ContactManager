package Ass3.classes;

import Ass3.interfaces.Contact;

/**
 * Implements the Contact interface
 *
 * Contacts have an ID (unique), a name (probably unique, but maybe
 * not), and notes that the user may want to save about them.
 */
public class ContactImpl implements Contact
{

	private int ContactID;
	private String name;
	private String notes;
	
	@Override
	public int getId()
	{
		return this.ContactID;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public String getNotes() 
	{
		return this.notes;
	}

	@Override
	public void addNotes(String note) 
	{
		// add notes to this contacts object.
		// currently set to append.
		this.notes = this.notes + note;
	}

}
