package Exercise7_1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class main {

	/*
	 * Create new file xml
	 */
	public static void createNewContacts(List<Contact> list){
		
		Path path = Paths.get("src/Exercise7_1/contact.xml");
		if(!Files.exists(path)){
			File file = new File("src/Exercise7_1/contact.xml");
		}
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			
			//create root elements
			Document doc = builder.newDocument();
			Element rootElement = doc.createElement("contacts");
			doc.appendChild(rootElement);
			
			for(int i = 0; i < list.size(); i++){
				Contact c = list.get(i);
				//contact element
				Element contact = doc.createElement("contact");
				rootElement.appendChild(contact);
				
				//name element
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.name));
				contact.appendChild(name);
				
				//phone element
				Element phone = doc.createElement("phone");
				phone.appendChild(doc.createTextNode(c.phone));
				contact.appendChild(phone);
			}
			//Write the content into file contact.xml
			TransformerFactory tranformer = TransformerFactory.newInstance();
			Transformer tf = tranformer.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("src/Exercise7_1/contact.xml"));
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
	 * Read file contact.xml and add contact into list
	 * Return result as a list
	 */
	public static List<Contact> readFileXML(){
		
		List<Contact> list = new ArrayList<Contact>();
		NodeList nList = readListNode("src/Exercise7_1/contact.xml", "contact");
		if(nList != null){
			for(int i = 0; i < nList.getLength(); i++){
				Node node = nList.item(i);
				Element element = (Element) node;
				String name = element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
				String phone = element.getElementsByTagName("phone").item(0).getTextContent();
				Contact contact = new Contact(name, phone);
				list.add(contact);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<Contact> list = readFileXML();
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println("1.Print all element");
				System.out.println("2.Search by name");
				System.out.println("3.Search by phone");
				System.out.println("4.Delete by name");
				System.out.println("5.Delete by phone");
				System.out.println("6.Update contact by name");
				System.out.println("7.Update contact by phone");
				System.out.println("8.Add new contact");
				System.out.println("Please choice option");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
					case 1:
						list.forEach((Contact c) -> System.out.println(c.displayInformation()));
						break;
					case 2:
						System.out.println("Input name want to search: ");
						String name = input.readLine();
						List<Contact> list1 = list.stream().filter((Contact e) -> e.name.equals(name)).collect(Collectors.toList());
						list1.forEach((Contact e) -> System.out.println(e.displayInformation()));
						break;
					case 3:
						System.out.println("Input phone want to search: ");
						String phone = input.readLine();
						List<Contact> list2 = list.stream().filter((Contact e) -> e.phone.equals(phone)).collect(Collectors.toList());
						list2.forEach((Contact e) -> System.out.println(e.displayInformation()));
						break;
					case 4:
						System.out.println("Input name want to delete: ");
						String name1 = input.readLine();
						List<Contact> list3 = list.stream().filter((Contact e) -> e.name.equals(name1)).collect(Collectors.toList());
						list.removeAll(list3);
						break;
					case 5:
						System.out.println("Input phone want to delete: ");
						String phone1 = input.readLine();
						List<Contact> list4 = list.stream().filter((Contact e) -> e.phone.equals(phone1)).collect(Collectors.toList());
						list.removeAll(list4);
						break;
					case 6:
						System.out.println("Input name want to update: ");
						String name2 = input.readLine();
						boolean flag1 = true;
						for(int i = 0; i < list.size(); i++){
							Contact e = list.get(i);
							if(e.getName().equals(name2)){
								System.out.println("Input name want to update: ");
								String nameUpdate = input.readLine();
								System.out.println("Input phone want to update: ");
								String phoneUpdate = input.readLine();
								e.setName(nameUpdate);
								e.setPhone(phoneUpdate);
								flag1 = false;
								break;
							}
						}
						if(flag1 == true)
							System.out.println("Can not find contact want to delete");
						else
							System.out.println("Delete success!");
						break;
					case 7:
						System.out.println("Input phone want to update: ");
						String phone2 = input.readLine();
						boolean flag = true;
						for(int i = 0; i < list.size(); i++){
							Contact e = list.get(i);
							if(e.getPhone().equals(phone2)){
								System.out.println("Input name want to update: ");
								String nameUpdate1 = input.readLine();
								System.out.println("Input phone want to update: ");
								String phoneUpdate1 = input.readLine();
								e.setName(nameUpdate1);
								e.setPhone(phoneUpdate1);
								flag = false;
								break;
							}
						}
						if(flag == true)
							System.out.println("Can not find contact want to delete");
						else
							System.out.println("Delete success!");
						break;
					case 8:
						System.out.println("Input name: ");
						String name4 = input.readLine();
						System.out.println("Input phone: ");
						String phone4 = input.readLine();
						Contact c = new Contact(name4, phone4);
						boolean flag2 = true;
						for(int i = 0; i < list.size(); i++){
							if(list.get(i).equals(c)){
								flag2 = false;
								break;
							}
						}
						if(flag2 == false)
							System.out.println("Contact has already exists");
						else
							list.add(c);
						break;
					default:
						createNewContacts(list);
						break;
				}
			}	
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
