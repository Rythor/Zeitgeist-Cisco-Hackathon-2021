package hackathon.cisco.zeitgeist.healthchain.controller;

import hackathon.cisco.zeitgeist.healthchain.blockchain.Block;
import hackathon.cisco.zeitgeist.healthchain.blockchain.blockChain; 
import hackathon.cisco.zeitgeist.healthchain.blockchain.Report;
import hackathon.cisco.zeitgeist.healthchain.blockchain.PatientInfo;

import java.util.ArrayList;
import java.util.List;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientsController {
	
	@RequestMapping("/patients/existing")
	public String goToExistingPatientsPage() {
		return "Checking out records of existing patients";
	}
	
	@RequestMapping("/patients/patientCreator")
	public String goToPatientCreatorPage() {
		return "You can create patient records now."; 
	}
	
	@RequestMapping("/patients/patientRecordSubmitted")
	public String submitPatientRecord(
			@RequestParam(value = "patientName", required = true) String patientName,
			@RequestParam(value = "patientAge", required = true) String patientAge,
			@RequestParam(value = "patientInfo", required = true) String patientInfo,
			@RequestParam(value = "insuranceId", required = true) String insuranceId) {
		
		PatientInfo p = new PatientInfo(patientName, patientAge, patientInfo, insuranceId);
		List<Report> reports = new ArrayList<Report>();
		Date date = new Date(2019,11,17);
		Report r = new Report("Dr. Oscar MacDougall", date, p, null, null);
		reports.add(r);
		Block newBlock = new Block(blockChain.s.peek().hashCode(), reports);
		blockChain.s.push(newBlock);
		return "New record created and put on the blockchain!"; 
	}

}
