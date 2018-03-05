/*
Created by Bio Owens and Orshi Kozek
*/

import java.util.*;
import java.lang.*;
class MyIntArrayList{

	
	private Num[] list = new Num[10];
	private int listSize = 0;

	public MyIntArrayList(){
		for(int index = 0; index < list.length; index++){
			Num newNum = new Num(0);
			list[index] = newNum;
		}
	}

	public MyIntArrayList(int listSize){
		this.listSize = listSize;
		list = new Num[listSize];
	}

	public String toString() {
		String tempReturnString = "[";

		for(int index = 0; index < list.length; index++) {
			if(index < list.length-1){
			tempReturnString += list[index] + ", ";
			}
			else{
				tempReturnString += list[index];
			}
		}

		tempReturnString += "]";
		return tempReturnString;
	}

	public void addInteger(int i2){
		Num newNum = new Num(i2);
		for(int i = 0; i < list.length-1; i++) {
			list[i] = list[i+1];
		}
		list[list.length-1] = newNum;
	}
		
	public void addInteger(int index, int number){
		Num newNum = new Num(number);
		if (checkIndex(index) == true) {
			for(int i = list.length-1; i > index; i--) {
				list[i] = list[i-1];
			}
			list[index] = newNum;
		}
	}
	

	public void removeInteger(int index){
		if (checkIndex(index) == true) {
			list[index].setValue(0);
		}
	}

	public void setInteger(int index, int newNumber){
		Num newNum = new Num(newNumber);
		if (checkIndex(index) == true) {
			list[index] = newNum;
		}
	}

	public int getNumAtPos(int index){
		if (checkIndex(index) == true) {
			return list[index].getValue();
		}
		return -1;
	}

	private boolean checkIndex(int index) {
		if (index >= list.length || index < 0) {
			System.out.println("That is an invalid index");
			return false;
		}
		else {
			return true;
		}
	}
	
}
