package Utilitypackage;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLUtilities {
	
	public void readXML() throws JAXBException
	{
		File f=new File("Testdata.xml");
		JAXBContext j = JAXBContext.newInstance(RegData.class);
		Unmarshaller u=j.createUnmarshaller();
		
		RegData r=(RegData)u.unmarshal(f);
		List<Data> mydata =r.getuserdata();
		System.out.println(r.getuserdata());
		for(Data d :mydata)
		{
			System.out.println("FirstName"+d.getFirstname());
			System.out.println("LastName"+d.getLastname());
		}
		
	}
	public static void main(String args[]) throws JAXBException
	{
		XMLUtilities x=new XMLUtilities();
		x.readXML();
	}

}
