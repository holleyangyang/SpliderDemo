package com.cp;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
public static void main(String[] args) {
	String url ="http://www.panduoduo.net/bd/2";
	Connection conn = Jsoup.connect(url);
	try {
		String f="e:/txt.txt";
 		
		Document dc=conn.get();
		Elements els=dc.getAllElements();
		
		for (Element element : els) {
			//System.out.println(element.html());
			AppendToFile.appendMethodA(f,element.html());
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
