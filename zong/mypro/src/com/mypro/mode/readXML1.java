package com.mypro.mode;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class readXML1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long lasting = System.currentTimeMillis();
		try {
		File xmlFile = new File("D:\\jenny\\info.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlFile);
		NodeList ma = doc.getElementsByTagName("maxid");
		NodeList ca = doc.getElementsByTagName("caption");
		NodeList it = doc.getElementsByTagName("item");
		System.out.println(ma.item(0).getNodeName());
		System.out.println(ca.item(0).getNodeName());
		System.out.println(it.item(0).getNodeName());
		} catch(Exception e) {
		e.printStackTrace();
		}
		}

	

}
