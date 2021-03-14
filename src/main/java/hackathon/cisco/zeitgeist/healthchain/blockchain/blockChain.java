package hackathon.cisco.zeitgeist.healthchain.blockchain;

import java.util.Arrays;

public class blockChain {
	public static void main(String[] args)
	{
		
		/*
		 * Block Chain-
		 * Block - hash of previous block + transaction 
		 * chained together
		 */
		
		Report report0= new Report("A","B","C","con");
		Report report1= new Report("D","E","F","conf");
		Block firstBlock= new Block(0, Arrays.asList(report0,report1));
		System.out.println(firstBlock.hashCode());
	}

}
