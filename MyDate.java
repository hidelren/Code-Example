public class MyDate
{
	private int day;
	private int month;
	private int year;

	public MyDate(int month, int day, int year)
	{	
		this.month = month;
		this.day = day;
		this.year = year;
	}
	// setters
	public void setDay(int day)
	{
		this.day = day;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
	// getters
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}

	public boolean equals(Object o)
	{
		boolean result = false;
		if (o != null && o instanceof MyDate)
		{
			MyDate d = (MyDate) o;
			if (getDay() == d.getDay() 
			&&  getMonth() == d.getMonth()
			&&  getYear() == d.getYear() )
			{
				result = true;
			}
		}
		return result;
	}

	public int hashCode()
	{
		return getDay() ^ getMonth() ^ getYear();
	}

	public String toString()
	{
		return getMonth() + "-" + getDay() + "-" + getYear();
	}
}
