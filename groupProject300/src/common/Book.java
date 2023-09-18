package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Book {
	static void Hello() throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream("books.csv");
        Scanner inFS = new Scanner(fileByteStream);
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        while (inFS.hasNextLine()) {
            arrayList.add(inFS.nextLine());
        }
        
        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        System.out.println(array);
	}
	

}
