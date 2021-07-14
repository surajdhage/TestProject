package Test;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int a=3;
		
		String[] c= {"aaaabccc","aabbcc","ppppmmnnoooopp"};
		for (int i = 0; i < c.length; i++) 
		{
			boolean flag=true;
			String z="";
			for (int j = 0; j < c[i].length(); j++) 
			{
				int cnt=0;
				for (int k = 0; k < z.length(); k++)
				{
					if(z.charAt(k)==c[i].charAt(j))
					{
						cnt++;
					}
				}
				if(cnt==0)
					z=z+c[i].charAt(j);
			}
			for (int j = 0; j < z.length(); j++)
			{
				int cnt=0;
				for (int k = 0; k < c[i].length(); k++) 
				{
					if(z.charAt(j)==c[i].charAt(k))
					{
						cnt++;
					}
				}
				if(cnt>=3)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("not");
			}
			else
			{
				System.out.println("dynamic");
			}
		}
	}

}
