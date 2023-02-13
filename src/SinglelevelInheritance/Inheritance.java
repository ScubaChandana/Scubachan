package SinglelevelInheritance;

public class Inheritance {

		void Call1(){
			System.out.println("call cow...");}  
			}  
			class singleinheritance extends Inheritance{  
			void Call2(){System.out.println("call goat...");}  
			}  
			class TestInheritance{  
			public static void main(String args[]){  
				singleinheritance d=new singleinheritance();  
			d.Call2();  
			d.Call1();  
			} 
	}


