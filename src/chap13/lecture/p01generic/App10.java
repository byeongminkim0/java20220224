package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.Animal;
import chap08.lecture.p01interface.example_class.Canine;
import chap08.lecture.p01interface.example_class.Cat;
import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Pet;
import chap08.lecture.p01interface.example_class.Retriever;

public class App10 {
	public static void main(String[] args) {
		ArrayList<Animal> list1 = new ArrayList<>();
		method(list1);
		
		ArrayList<Canine> list2 = new ArrayList<>();
		method(list2); 
	}
	
	public static void method(ArrayList<? super Canine> list) {
		list.add(new Chihuahua());
		list.add(new Retriever());
	}
}
