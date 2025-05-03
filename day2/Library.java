package week1day1.day2;

public class Library {
	//create method1
    String addBook(String booktitle)
	{
		
	System.out.println( "Book added successfully");
	return booktitle;
		
	}
    //method2
	 void issueBook()
	{
		 System.out.println("Book issued successfully");
		}
	
	public static void main(String[] args)
	{
		//create object using syntax 
		Library li=new Library();
		//calling Both methods
		System.out.println(li.addBook("githai"));
		li.issueBook();
			}
	}
