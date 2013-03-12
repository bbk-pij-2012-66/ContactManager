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
	
	
	/**
	 * Returns the ID of the contact.
	 *
	 * @return the ID of the contact.
	 */
	@Override
	public int getId()
	{
		return this.ContactID;
	}

	/**
	 * Create an ID for the contact.
	 *
	 * Must be unique!
	 */	
	public void setId()
	{
		
	}
	
	/**
	 * Returns the name of the contact.
	 *
	 * @return the name of the contact.
	 */
	@Override
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Set the name of the contact.
	 * 
	 * @param a string holding the contact, may not be empty
	 */
	public void setName(String name)
	{
		if (name == null || name.equals(""))
		{
			throw new IllegalArgumentException("This is not a valid name!");
		}
		else
		{
			this.name = name;
		}
	}
	
	/**
	 * Returns our notes about the contact, if any.
	 *
	 * If we have not written anything about the contact, the empty
	 * string is returned.
	 *
	 * @return a string with notes about the contact, maybe empty.
	 */
	@Override
	public String getNotes() 
	{
		return this.notes;
	}

	/**
	 * Add notes about the contact.
	 *
	 * @param note the notes to be added
	 */
	@Override
	public void addNotes(String note) 
	{
		// add notes to this contacts object.
		// currently set to append.
		this.notes = this.notes + note;
	}

}
