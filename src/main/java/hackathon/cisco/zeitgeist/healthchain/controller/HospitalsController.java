package hackathon.cisco.zeitgeist.healthchain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
