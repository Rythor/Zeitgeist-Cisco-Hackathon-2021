package hackathon.cisco.zeitgeist.healthchain.blockchain;
<<<<<<< HEAD

import java.util.Arrays;

public class blockChain {
	public static void main(String[] args)
	{
		
=======
// package cisco_Project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.*;


public class blockChain {

	public static void main(String[] args)
	{
		Date date = new Date(2019,11,17);
		// https://www.livescience.com/first-case-coronavirus-found.html
		PatientInfo p=new PatientInfo("patient zero","Gender,address","55","insurance");
		hospitalInfo h=new hospitalInfo("Hubei Provincial Hospital","Wuhan");
		DiseaseInfo d=new DiseaseInfo("Covid-19","Symptons");
		
		String UserID = "Dr. Zhang Jixian";
		Date CaseOpended = date;

		Report R0=new Report(UserID,CaseOpended,p,d,h);
		
		List<Report> one =new ArrayList<Report>();
		one.add(R0);
>>>>>>> ryan-blockchain
		/*
		 * Block Chain-
		 * Block - hash of previous block + transaction 
		 * chained together
		 */
		
<<<<<<< HEAD
		Report report0= new Report("A","B","C","con");
		Report report1= new Report("D","E","F","conf");
		Block firstBlock= new Block(0, Arrays.asList(report0,report1));
		System.out.println(firstBlock.hashCode());
=======
		Block firstBlock = new Block(0,one);
		Stack<Block> s = new Stack<Block>();
		s.push(firstBlock);

		Block SecondBlock = new Block(s.peek().hashCode(),one);
		
		System.out.println(firstBlock.hashCode() + " " + firstBlock.getPreviousHash());
		System.out.println(SecondBlock.hashCode() + " " + SecondBlock.getPreviousHash());
>>>>>>> ryan-blockchain
	}

}
