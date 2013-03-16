package ass3.classes;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ass3.interfaces.Contact;



/**
 * Implements the Contact interface
 *
 * Contacts have an ID (unique), a name (probably unique, but maybe
 * not), and notes that the user may want to save about them.
 */

@XmlRootElement
public class ContactImpl implements Contact
{

	private int contactID;
	private String name;
	private String notes = "";
	
	
	/**
	 * Constructor for pre-populating objects on startup from txt file
	 * 
	 * @param contactID
	 * @param name
	 * @param notes
	 */
	public ContactImpl(int contactID, String name, String notes)
	{
		this.contactID = contactID;// need to check this id is unique
		this.name = name;
		this.notes = notes;
	}
	
	/**
	 * Constructor for pre-populating objects on startup from txt file
	 * 
	 * @param contactID
	 * @param name
	 * @param notes
	 */
	public ContactImpl(String name, String notes)
	{
		this.contactID = setId();// need to check this id is unique
		this.name = name;
		this.notes = notes;
	}

	public ContactImpl()
	{
		//empty constructor
	} 

	/**
	 * Returns the ID of the contact.
	 *
	 * @return the ID of the contact.
	 */
	@Override
	@XmlAttribute
	public int getId()
	{
		return this.contactID;
	}

	/**
	 * Create an ID for the contact.
	 *
	 * Must be unique!
	 * @return 
	 */	
	public int setId()
	{
		// use set type t
		contactID = contactID + 1;
		return contactID;
	
	}
	
	/**
	 * Setter for unit tests
	 * 
	 * @param passedId
	 */
	public void setId(int passedId)
	{
		this.contactID = passedId;
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
	@XmlElement
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
