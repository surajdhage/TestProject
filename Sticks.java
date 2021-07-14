package Test;


	import java.util.*;
	import java.lang.*;
	import java.io.*;
	import java.util.Map.Entry;
	public class Sticks
	{
		public static void main (String[] args) throws java.lang.Exception
		{
	        HashMap<Integer, Integer> hm;
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- > 0)
	        {
	            hm = new HashMap<Integer, Integer>();
	            int n = sc.nextInt();
	            for(int i = 0; i < n; i++)
	            {
	                int a = sc.nextInt();
	                if(hm.get(a) != null)
	                    hm.put(a, hm.get(a)+1);
	                else
	                    hm.put(a, 1);
	            }
	            ArrayList<Integer> al = new ArrayList<Integer>();
	            Iterator<Entry<Integer, Integer>> itr  =  hm.entrySet().iterator();
	            while(itr.hasNext())
	            {
	                Map.Entry<Integer, Integer> ent = (Entry<Integer, Integer>) itr.next();
	                if(ent.getValue() >= 2)
	                    al.add(ent.getKey());
	            }
	            if(al.size() >= 2)
	            {
	                Collections.sort(al, new MyComparator());
	                if(hm.get(al.get(0)) >= 4)
	                    System.out.println(al.get(0)*al.get(0));
	                else
	                {
	                    int out = al.get(0)*al.get(1);
	                    System.out.println(out);
	                }
	            }
	            else
	            {
	                if(hm.get(al.get(0)) >= 4)
	                    System.out.println(al.get(0)*al.get(0));
	                else
	                    System.out.println(-1);
	                    
	            }
	        }
	        sc.close();
	    }
	}
	class MyComparator implements Comparator<Integer>
	{
	    public int compare(Integer i1, Integer i2) 
	    {
	        if(i1 > i2)
	            return -1;
	        else if(i1 < i2)
	            return 1;
	        else 
	            return 0;
	    }
	}



