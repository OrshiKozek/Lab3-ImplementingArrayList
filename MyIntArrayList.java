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
		for(int i = 0; i < list.length-1; i++) {
			list[i] = list[i+1];
			}
		list[list.length-1] = i2;
	}
		
	public void addInteger(int index, int number){
		if (checkIndex(index) == true) {
			for(int i = 0; i < index; i++) {
				list[i] = list[i+1];
				}
			list[index] = number;
		}
	}



	public void removeInteger(int index){
		if (checkIndex(index) == true) {
			list[index] = 0;
		}
	}

	public void setInteger(int index, int newNumber){
		if (checkIndex(index) == true) {
			list[index] = newNumber;
		}
	}

	public int getNumAtPos(int index){
		if (checkIndex(index) == true) {
			return list[index];
		}

		return -1;
	}

	public boolean checkIndex(int index) {
		if (index >= list.length || index < 0) {
			System.out.println("That is an invalid index");
			return false;
		}
		else {
			return true;
		}
	}

}
