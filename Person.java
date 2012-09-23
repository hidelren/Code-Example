public class Person
{
	private String name;
	private MyDate DoB;

	public Person(String name, MyDate DoB)
	{
		this.name = name;
		this.DoB = DoB;
	}
	// setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDoB(MyDate DoB)
	{
		this.DoB = DoB;
	}

	// getters
	public String getName()
	{
		return name;
	}
	public MyDate getDoB()
	{
		return DoB;
	}

	public boolean equals(Object o)
	{
		boolean result = false;
		if (o != null && o instanceof Person)
		{
			Person p = (Person)o;
			if (getName().equals(p.getName())
			&&  getDoB().equals(p.getDoB()) )
			{
				result = true;
			}
		}
		return result;
	}

	public int hashCode()
	{
		return getName().hashCode() ^ getDoB().hashCode();
	}

	public String toString()
	{
		return "Name: " + getName() + 
			"\nBirthDate: " + getDoB(); 
	}
}
