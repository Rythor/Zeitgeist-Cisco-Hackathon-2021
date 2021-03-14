package cisco_Project;

import java.util.*;

public class Block {
private int	previousHash;
private List<Report> PatientReport; // linked list


 public Block(int previousHash,List<Report> PatientReport)
 {
	 this.previousHash=previousHash;
	 this.PatientReport=PatientReport;
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
	 return PatientReport;
 }
 public void setPatientReport(List<Report> PatientReport)
 {
	 this.PatientReport=PatientReport;
 }
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;

     Block block = (Block) o;

     if (previousHash != block.previousHash) return false;
     return PatientReport != null ? PatientReport.equals(block.PatientReport) : block.PatientReport == null;
 }
// refernce
 @Override
 public int hashCode() {
     int result = previousHash;
     result = 31 * result + (PatientReport != null ? PatientReport.hashCode() : 0);
     return result;
 }

 
}
