package hackathon.cisco.zeitgeist.healthchain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthchainController {

	@RequestMapping("/")
	public String showHome() {
		return "index"; 
	}
	
	@RequestMapping("/patients")
	public String goToPatientsPage() {
		return "You're now in the Patients Page"; 
	}
	
	@RequestMapping("/diseases")
	public String goToDiseasesPage() {
		return "You're now in the Diseases Page"; 
	
	}
	
	@RequestMapping("/hospitals")
	public String goToHospitalsPage() {
		return "You're now in the Hospitals Page"; 
	
	}
	
	@RequestMapping(value = "/redirect")
	public String returnToIndex() {
		return "redirect:index"; 
	}
}
