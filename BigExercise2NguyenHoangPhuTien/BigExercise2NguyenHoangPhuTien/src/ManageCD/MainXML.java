package ManageCD;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainXML {

	/*
	 * Write all cd from list into file xml
	 */
	public static void writeFileXML(List<CD> list){
		
		Path path = Paths.get("src/ManageCD/cd.xml");
		if(!Files.exists(path)){
			File file = new File("src/ManageCD/cd.xml");
		}
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			
			//create root elements
			Document doc = builder.newDocument();
			Element rootElement = doc.createElement("CDs");
			doc.appendChild(rootElement);
			
			for(int i = 0; i < list.size(); i++){
				CD c = list.get(i);
				
				//cd element
				Element cd = doc.createElement("CD");
				rootElement.appendChild(cd);
				
				//id element
				Element id = doc.createElement("id");
				String id1 = String.valueOf(c.getId());
				id.appendChild(doc.createTextNode(id1));
				cd.appendChild(id);
				
				//name element
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.getName()));
				cd.appendChild(name);
				
				//singer element
				Element singer = doc.createElement("singer");
				singer.appendChild(doc.createTextNode(c.getSinger()));
				cd.appendChild(singer);
				
				//number of songs element
				Element numberSongs = doc.createElement("numbersongs");
				String number = String.valueOf(c.getNumberSongs());
				numberSongs.appendChild(doc.createTextNode(number));
				cd.appendChild(numberSongs);
				
				//price element
				Element price = doc.createElement("price");
				String prices = String.valueOf(c.getPrice());
				price.appendChild(doc.createTextNode(prices));
				cd.appendChild(price);
				
			}
			//Write the content into file contact.xml
			TransformerFactory tranformer = TransformerFactory.newInstance();
			Transformer tf = tranformer.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("src/ManageCD/cd.xml"));
			tf.transform(source, result);
			
		} catch (ParserConfigurationException | TransformerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/*
	 * Get node list by tag name
	 * param: path , name of tag
	 * Return node list
	 */
	public static NodeList readListNode(String path, String name){
		
		File fXmlFile = new File(path);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		NodeList nList = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			nList = doc.getElementsByTagName(name);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(e.getMessage());
		}
		return nList;
	}
	
	
	/*
	 * Read file cd.xml and add cd into list
	 * Return result as a list
	 */
	public static List<CD> readFileXML(){
		
		List<CD> list = new ArrayList<CD>();
		NodeList nList = readListNode("src/ManageCD/cd.xml", "CD");
		if(nList != null){
			for(int i = 0; i < nList.getLength(); i++){
				Node node = nList.item(i);
				Element element = (Element) node;
				String name = element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
				int id = Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent());
				String singer =  element.getElementsByTagName("singer").item(0).getChildNodes().item(0).getNodeValue();
				int number = Integer.parseInt(element.getElementsByTagName("numbersongs").item(0).getChildNodes().item(0).getNodeValue());
				double price = Double.parseDouble(element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue());
				CD cd = new CD(id, name, singer, number, price);
				list.add(cd);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CDController control = new CDController();
		List<CD> list = control.findAllCD();
	
		writeFileXML(list);
		List<CD> list1 = readFileXML();
		list1.forEach(e -> System.out.println(e.displayInformation()));
	}

}
