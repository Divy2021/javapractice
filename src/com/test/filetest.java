package com.test;

import java.io.File;
import java.util.*;

public class filetest {

	int val=10;
	public static void main(String[] args) {

		filetest obj=new filetest();
		System.out.println(obj.val);
		
		var i="string";
		System.out.println(i);
		
		ClassA Aobj=new ClassB();
		ClassB bobj=new ClassB();
		bobj.MethodA(" new");
		System.err.println(Aobj.a);
		Aobj.MethodA(5);
		Aobj=new ClassB();
		
		System.out.println(Math.ceil(4.3));
		//Aobj.MethodA(2.3f);
		
		Queue<String> pq= new PriorityQueue<>();
		pq.add("hello");
		pq.add("hacker");
		
		String s1=pq.poll();
		pq.remove();
		System.out.println(s1);
	//	String s2=pq.remove();
		//System.out.println(s2);
		
	}

}
