package com.main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

/*
 Write a program that will read contents of a data file
 and display on screen.Prompt name of file 2b read. Allow
 modification. Write back 2 file
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner kbReader = new Scanner(System.in);
		String fileName = "tacos.txt";
		PrintWriter writerFile = new PrintWriter(fileName);
		System.out.println("Enter your favorite food");
		String food = kbReader.nextLine();
		System.out.println("Enter your favorite hot drink");
		String hotDrink = kbReader.nextLine();
		createFile(fileName);
		writeToFile(writerFile, food);
		writeToFile(writerFile, hotDrink);
		readFile(fileName);
		
	}
	//Not working. reads file name but not elements
	public static void readFile(String x){
		Scanner sc = new Scanner(x);
		while(sc.hasNext()){
			System.out.println("Hello");
			System.out.println(sc.nextLine());
		}
	}
	
	public static void createFile(String fileName) throws FileNotFoundException{
		Formatter fileFormat = new Formatter(fileName);
		System.out.println("File has been created");
	}
	//not writing to file
	public static void writeToFile(PrintWriter x, String y){
		x.println(y);
	}
	
	public static void closeFile(PrintWriter file){
		file.close();
	}
}
