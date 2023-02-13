package Hierarchicalinheritance;

public class Inheritance 
{  
void call2()
{
	System.out.println("calling crocodial...");}  
}  
class inherit1 extends Inheritance{  
void call1()
{
	System.out.println("calling human...");}  
}  
class inherit2 extends Inheritance{  
void call0()
{
	System.out.println("calling monkey...");}  
}  
class TestInheritance3{  
public static void main(String args[])
{  
inherit2 i=new inherit2();  
inherit1 j = new inherit1();
i.call0();  
i.call2();  
j.call1();

}} 