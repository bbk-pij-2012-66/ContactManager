package Ass3.classes;

import Ass3.interfaces.Contact;

public class ContactImpl implements Contact
{

	private int Id;
	private String name;
	private String notes;
	
	@Override
	public int getId()
	{
		return this.Id;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public String getNotes() {
		return this.notes;
	}

	@Override
	public void addNotes(String note) {
		// add notes to this contacts object.
		// currently set to append.
		this.notes = this.notes + note;
	}

}
