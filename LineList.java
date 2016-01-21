import java.util.ArrayList;


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
	
	public void shuffle()
	{
		for(int i = strings.size();i>=2;i--)
		{
			int index1 = (int)(Math.random()*(i-1));
			int index2 = (int)(Math.random()*(i-1));
			move(index1,index2);
		}
	}
	
	public String toString()
	{
		return strings.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineList tester = new LineList();
		//tester.add("Hello");
		//tester.add("World");
		//tester.add("Test");
		//tester.add("123");
		tester.add("a");
		tester.add("b");
		tester.add("c");
		tester.add("d");
		tester.move(2,2);
		System.out.println(tester);
		

	}

}
