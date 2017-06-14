package com.mypro.mode;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


public class readXML {

	/**
	 * @param args
	 * @throws Exception 
	 * 
	 */
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		try {
			File xmlFile = new File("D:\\jenny\\info.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc =  builder.parse(xmlFile);
			NodeList nl = doc.getElementsByTagName("catalog");
			System.out.println(nl.item(0).getNodeName());
			System.out.println(nl.item(0).getNodeType());
			System.out.println(nl.item(0).getNodeValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
