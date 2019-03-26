
public class Age {
	
	public String ValidAge(int age)
	{
		if(age>=18)
		{
			return "valid";
		}
		else
		{
			return "invalid";
		}
	}
	
	public String ValidParty(String party)
	{
		if(party.equals("tdp"))
		{
			return "cbn";
		}
		else
		{
			return "ysr";
		}
	}
}
