import java.util.ArrayList;
import java.util.Random;


public class LineList {
	
	private ArrayList<String> strings;
	
	public LineList()
	{
		strings = new ArrayList<String>();
	}
	
	public int size()
	{
		return strings.size();
	}
	
	public String get(int k)
	{
		return strings.get(k);
	}
	
	public void add(String line)
	{
		strings.add(line);
	}
	
	public String remove(int k)
	{
		return strings.remove(k);
	}
	
	public void move(int index, int newIndex)
	{
		String indexLine = strings.remove(index);
		strings.add(newIndex,indexLine);
	}
	
	private void swap(int i, int i2)
	{
		String temp = strings.get(i);
		strings.set(i,strings.get(i2));
		strings.set(i2,temp);
	}
	
	public void shuffle()
	{
		Random r = new Random();
		for(int i = strings.size();i>=2;i--)
		{
			int index1 = r.nextInt(i);
			int index2 = r.nextInt(i);
			swap(index1,index2);
		}
	}
	
	public String toString()
	{
		return strings.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineList tester = new LineList();
		tester.add("Hello");
		tester.add("World");
		tester.add("Test");
		tester.add("123");
		tester.add("a");
		tester.add("b");
		tester.add("c");
		tester.add("d");
		for(int x=0;x<=20;x++)
		{
			tester.shuffle();
			System.out.println("Shuffle #"+x+": "+tester);
		}
		
		

	}

}
