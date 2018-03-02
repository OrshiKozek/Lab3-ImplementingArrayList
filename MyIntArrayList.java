import java.util.*;
import java.lang.*;
class MyIntArrayList{

	private int[] list = new int[10];

	public MyIntArrayList(){
		for(int index = 0; index < list.length; index++){
			list[index] = 0;
		}
	}

	public String toString() {
		String tempReturnString = "[";

		for(int index = 0; index < list.length; index++) {
			tempReturnString += list[index] + ", ";
		}

		tempReturnString += "]";
		return tempReturnString;
	}

	public void addInteger(int i2){
		// This is what we had before
		// for(int i = list.length-1; i > 0; i--) {
		// 	 list[i] = list[i-1];
		// 	}
		// list[list.length-1] = i2;

		//this is what I changed- it works
		for(int i = 0; i < list.length-1; i++) {
			list[i] = list[i+1];
			}
		list[list.length-1] = i2;
	}
		
	public void addInteger(int index, int number){
		for(int i = 0; i < index; i++) {
			list[i] = list[i+1];
			}
		list[index] = number;
	}



	public void removeInteger(){

	}

	public void setInteger(){

	}

}