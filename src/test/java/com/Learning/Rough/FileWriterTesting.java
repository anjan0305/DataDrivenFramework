package com.Learning.Rough;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;

public class FileWriterTesting {

	public static void main(String[] args) throws IOException {
		
		//connection
		File f =new File ("C:\\Learning\\Learning\\Anjan.csv");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bf1 = new BufferedWriter (fw);
		
	
		for (int i=0;i<=5;i++) {
		bf1.write(((Double)(Math.random()*100)).toString());	
	 	bf1.write(",");
		
		}
		
		//close#
		bf1.close();
		System.out.println("Writing completed");
		

	}

}
