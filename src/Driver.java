
public class DriverforHW 
{
	public static void main(String[] args)
	{
		VowelCheck("Matthew");
		
	}

	public static void VowelCheck(String s)
	{
		char[] vowellist = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i < s.length(); i++)
		{
			char check = s.charAt(i);
			for (int e = 0; e < vowellist.length(); e++)
			{
				if (vowellist[e] == check)
				{
					System.out.println("Found"+vowellist[e]+"Vowels!");
				}
			}
		}
			
		
		
		
	}
	


}
