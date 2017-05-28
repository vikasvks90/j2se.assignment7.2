/**
* <h1>StringDemo2</h1>
* This program demonstrates how we can find if a substring is present in
* a given string or not using string class inbuilt method
* @author  Vikas
* @version 1.0
* @since   2017-05-27 
*/
package assignment7.session2;

public class StringDemo2 {

	public static void main(String[] args) {
		String a = "Good Morning Everyone";
		String b = "Good";
		String c = "Hello";
		boolean d;//it will hold the value returned by contains method true/false
		System.out.println("The given string is: "+a);
		d = a.contains(b);//if substring found then true will be returned
		if(d){
			System.out.println("'Good' is present in the given string");
		}else{
			System.out.println("'Good' is not present in the given string");
		}
		
		d = a.contains(c);
		if(d){
			System.out.println("'Hello' is present in the given string");
		}else{
			System.out.println("'Hello' is not present in the given string");
		}

	}

}
