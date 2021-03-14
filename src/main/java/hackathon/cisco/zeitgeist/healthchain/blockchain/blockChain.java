package hackathon.cisco.zeitgeist.healthchain.blockchain;

import java.util.Arrays;
import java.sql.Date;

public class blockChain {
	public static void main(String[] args)
	{
		
		/*
		 * Block Chain-
		 * Block - hash of previous block + transaction 
		 * chained together
		 */
		
		Report report0= new Report("Test Block 1", Date.getTime());
		Report report1= new Report("Test Block 2", Date.getTime());
		Block firstBlock= new Block(0, Arrays.asList(report0,report1));
		System.out.println(firstBlock.hashCode());
	}

}
