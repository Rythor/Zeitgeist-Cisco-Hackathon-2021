package hackathon.cisco.zeitgeist.healthchain.blockchain;
// package cisco_Project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.google.gson.GsonBuilder;



public class blockChain {

	public static Stack<Block> blockchain_stack = new Stack<Block>();

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
		/*
		 * Block Chain-
		 * Block - hash of previous block + transaction 
		 * chained together
		 */
		
		Block firstBlock = new Block(0,one);
		blockchain_stack.push(firstBlock);

		Block secondBlock = new Block(blockchain_stack.peek().hashCode(),one);
		blockchain_stack.push(secondBlock);

		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain_stack);
		
		System.out.println(firstBlock.hashCode() + " " + firstBlock.getPreviousHash());
		System.out.println(secondBlock.hashCode() + " " + secondBlock.getPreviousHash());
	}

}
