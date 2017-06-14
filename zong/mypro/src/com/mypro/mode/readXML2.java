package com.mypro.mode;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class readXML2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File xmlFile = new File("D:\\jenny\\info.xml");
			DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(xmlFile);
			NodeList ma = doc.getElementsByTagName("login");
			System.out.println(ma.item(0).getAttributes().getNamedItem("username"));
			System.out.println(ma.item(0).getAttributes().getNamedItem("passwd"));
		
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
