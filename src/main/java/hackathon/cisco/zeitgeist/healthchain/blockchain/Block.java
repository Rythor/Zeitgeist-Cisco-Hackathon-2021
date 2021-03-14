package hackathon.cisco.zeitgeist.healthchain.blockchain;
<<<<<<< HEAD
=======
// package cisco_Project;
>>>>>>> ryan-blockchain

import java.util.*;

public class Block {
private int	previousHash;
<<<<<<< HEAD
private List<Report> PatientReport; // linked list


 public Block(int previousHash,List<Report> PatientReport)
 {
	 this.previousHash=previousHash;
	 this.PatientReport=PatientReport;
=======
private int blockHash;
private List<Report> Report; 


 public Block(int previousHash,List<Report> Report)
 {
	 this.previousHash=previousHash;
	 this.Report=Report;
	 
	 //List<Report> contents= {Arrays.hashCode(Report),previousHash};
	 this.blockHash=this.hashCode();
 }
 public int getHash()
 {
	 return blockHash;
 }
 public void setHash(int blockHash)
 {
	this.blockHash = blockHash; 
>>>>>>> ryan-blockchain
 }
 public int getPreviousHash()
 {
	 return previousHash;
 }
 public void setPreviousHash(int previousHash)
 {
	this.previousHash=previousHash; 
 }
 public List<Report> getPatientReport()
 {
<<<<<<< HEAD
	 return PatientReport;
 }
 public void setPatientReport(List<Report> PatientReport)
 {
	 this.PatientReport=PatientReport;
=======
	 return Report;
 }
 public void setPatientReport(List<Report> Report)
 {
	 this.Report=Report;
>>>>>>> ryan-blockchain
 }
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;

     Block block = (Block) o;

     if (previousHash != block.previousHash) return false;
<<<<<<< HEAD
     return PatientReport != null ? PatientReport.equals(block.PatientReport) : block.PatientReport == null;
 }
// refernce
 @Override
 public int hashCode() {
     int result = previousHash;
     result = 31 * result + (PatientReport != null ? PatientReport.hashCode() : 0);
=======
     return Report != null ? Report.equals(block.Report) : block.Report == null;
 }
 @Override
 public int hashCode() {
     int result = previousHash;
     result = 31 * result + (Report != null ? Report.hashCode() : 0);
>>>>>>> ryan-blockchain
     return result;
 }

 
}
