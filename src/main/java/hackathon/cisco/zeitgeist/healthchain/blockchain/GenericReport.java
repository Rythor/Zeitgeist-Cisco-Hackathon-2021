package cisco_Project;

interface GenericReport {
	 String getHospitalName();
	 String getPatientName();
	 String getDestinationName();
	 boolean equals(Object o);
	 int hashCode();
}
