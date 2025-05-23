package com.java.java18features.copy;

import java.util.random.RandomGeneratorFactory;
import java.util.random.RandomGenerator;

public class RandomGeneratorPractice {

	public static void main(String[] args) {

		
		RandomGenerator randomGenerator = RandomGeneratorFactory.of("L128X128MixRandom").create();
				//RandomGeneratorFactory.getDefault().create();
		System.out.println(randomGenerator.getClass());
		
		RandomGeneratorFactory.all().map(factory->factory.group()+" : "+factory.name()).forEach(System.out::println);	
		
		int i=0;
		
		while(i<=10)
		{
			int num=randomGenerator.nextInt();
			System.out.println(num);
			i++;
		}
	}

}
