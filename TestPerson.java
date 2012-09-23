public class TestPerson
{
	public static void main(String args[])
	{
		String result1[] = args[0].split("/");
		MyDate date1 = parseDate(result1[1]);
		Person p1 = new Person(result1[0], date1);

		String result2[] = args[1].split("/");
		MyDate date2 = parseDate(result2[1]);
		Person p2 = new Person(result2[0], date2);

		if (p1.equals(p2))
		{
			System.out.println("Both objects are identical");
		}
		else
		{
			System.out.println("NOT IDENTICAL");
		}

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

	public static MyDate parseDate(String s)
	{
		String result[] = s.split("-");
		int month = Integer.parseInt(result[0]);
		int day = Integer.parseInt(result[1]);
		int year = Integer.parseInt(result[2]);
		MyDate d = new MyDate(month, day, year);
		return d;
	}
}
