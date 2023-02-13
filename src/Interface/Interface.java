package Interface;

interface Readable{  
		void Read();  
		}  
		class Book1 implements Readable
		{  
		public void Read()
		{
			System.out.println("Writting Book1");}  
		}  
		class  Book2 implements Readable
		{  
		public void Read()
		{
			System.out.println("Reading Book2");}  
		}  
		  
		class TestInterface1
		{  
		public static void main(String args[]){  
			Readable d=new Book1();  
			Readable a=new Book2();
		d.Read(); 
		a.Read();
		}
		}  

