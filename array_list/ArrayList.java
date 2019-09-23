package array_list;

public class ArrayList {
	
	Object []list;
	
	public ArrayList()
	{
		list=new Object[0];
	}
	// add a new item at the end of the list
	
	public int add(Object item)
	{
		// create new list with size=size of old list +1
		Object newlist[]=new Object[list.length+1];
		//copy the items in the new list
		for(int i=0;i<list.length;i++) {
			newlist[i]=list[i];
		}
		newlist[newlist.length-1]=item;
		list=newlist;
		
		return list.length-1;
	}
	// Insert new item in specefic index 
	
	public void insert(int index,Object item) {
		Object newlist[]=new Object[list.length+1];
		newlist[index]=item;
		for(int i=0;i<list.length;i++) {
			if(newlist[i]==null) {
				newlist[i]=list[i];
			}else
			{
				newlist[i+1]=list[i];
			}
		}
		list=newlist;
	}
	// Remove Iterm from specefic index
	public void remove(int index) {
		int n=0;
		Object newlist[]=new Object[list.length-1];
		for(int i=0;i<list.length;i++) {
			if(i!=index) {
				newlist[n]=list[i];
				++n;
			}
		}
		list=newlist;
		
	}
	// the size of the list
	public int getlenth()
	{
		return list.length;
	}
	// Print the items 
	public void print()
	{
		for (int i=0;i<list.length;i++) {
			System.out.print(list[i]+"  . ");
		}
	}
	
	public static void main(String[] args) {

		ArrayList ar=new ArrayList();
		System.out.println(ar.getlenth());
		ar.add(3);
		ar.add(4);
		ar.add("java");
		ar.insert(1, 6);
		ar.print();
		ar.remove(1);
		ar.print();
		System.out.println(ar.getlenth());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
