package com.generic.code;

public class StringRotation {
	String country ="United State Of America"; //can you reverse this

	void getValue(){
		//code
		
		for(int i=(country.length()-1);i>=0;i--) {
			System.out.print(country.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		StringRotation obj = new StringRotation();
		obj.getValue();
	}

}