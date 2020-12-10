package chap05.obj;

import java.util.Random;

import chap05.constructor.Person;

public class ObjArray {

	public static void main(String[] args) {
		int[] myarr = new int[]{1,2,3,4,5};
		
		Random[] rand = new Random[3];
		
		Person[] personArr = new Person[3];
		personArr[0] = new Person("장동건",50,"서울");
		personArr[1] = new Person("이덩",10,"인천");
		personArr[2] = new Person("크아",30,"경기");
		
		for(int i=0; i<personArr.length;i++) {
			System.out.println(personArr[i].getName());
		}
	}
}
