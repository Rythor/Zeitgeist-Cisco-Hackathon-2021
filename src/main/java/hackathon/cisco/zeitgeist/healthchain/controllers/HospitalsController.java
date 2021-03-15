package hackathon.cisco.zeitgeist.healthchain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import java.sql.Date; 

import hackathon.cisco.zeitgeist.healthchain.blockchain.Block;
import hackathon.cisco.zeitgeist.healthchain.blockchain.Blockchain; 
import hackathon.cisco.zeitgeist.healthchain.blockchain.Report;
import hackathon.cisco.zeitgeist.healthchain.blockchain.HospitalInfo;

@Controller
@RequestMapping("/hospitals")
public class HospitalsController {
	
	@RequestMapping("/hospitals/existing")
	public String goToExistingHospitalsPage() {
		return "Checking out records of existing hospitals"; 
	}
	
	@RequestMapping("/hospitals/hospitalCreator")
	public String goToHospitalCreatorPage() {
		return "You can now create records of new hospitals"; 
	}
	
	@RequestMapping("/hospitals/recordSubmitted")
	public String submitHospitalRecord(
			@RequestParam(value = "hospitalName", required = true) String hospitalName,
			@RequestParam(value = "hospitalLocation", required = true) String hospitalLocation) {
		
		HospitalInfo h = new HospitalInfo(hospitalName, hospitalLocation);
		List<Report> reports = new ArrayList<Report>(); 
		Date date = new Date(2019,11,17);
		Report r = new Report("Dr. Myeong Byung-cheol", date, null, null, h);
		reports.add(r); 
		Block newBlock = new Block(Blockchain.s.peek().hashCode(), reports);
		Blockchain.s.push(newBlock); 
		return "recordcreated"; 
	}
	
	@RequestMapping("/hospitals/recordCancelled")
	public String cancelHospitalRecord() {
		return "recordcancelled"; 
	}
}
