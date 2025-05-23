package com.practice.filehandling;


import java.io.*;

	public class FileHandler {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			
			File file=new File("C:/Users/sarav/Divya/eclipse-workspace/myFirstFile3.txt");
			
			boolean val = file.createNewFile();
			
					System.out.println("file created: "+ val);
					
					char[] charArray = new char[500];
					
					FileReader fr=new FileReader("C:/Users/sarav/Divya/eclipse-workspace/myFirstFile3.txt");
					FileInputStream fis=new FileInputStream(file);
					fr.read(charArray);
				System.out.println(charArray);
					fr.close();
					
					String s="gonna complete backend development";
					FileWriter fw=new FileWriter("C:/Users/sarav/Divya/eclipse-workspace/myFirstFile2.txt");
					fw.append(s);
					
				//	fr.read(charArray);
				//	System.out.println(charArray);
					
				//	fr.close();
					fw.close();
					
					
					
		}

	}

