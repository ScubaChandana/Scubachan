package multilevelInheritance;

public class multilevel 
{
			void call1()
			{
				System.out.println("calling goat ...");}  
			}  
			class inherit extends multilevel
			{  
			void call2()
			{
				System.out.println("calling Tiger...");}  
			}  
			class inheritance1 extends inherit{  
			void call3()
			{
				
				System.out.println("calling donkey...");}  
			}  
			class TestInheritance2{  
			public static void main(String args[])
			{  
				inheritance1 a=new inheritance1();  
			a.call3();  
			a.call2();  
			a.call1();  
			}  

	}


