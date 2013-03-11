package Ass3.classes;

import Ass3.interfaces.Contact;

public class ContactImpl implements Contact
{

	private int Id;
	private String name;
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNotes(String note) {
		// TODO Auto-generated method stub

	}

}
