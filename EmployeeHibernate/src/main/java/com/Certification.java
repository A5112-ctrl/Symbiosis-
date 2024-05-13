package com;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certification {

	private String certName;
	
	private String tech;
	
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certification(String certName, String tech) {
		super();
		this.certName = certName;
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Certification [certName=" + certName + ", tech=" + tech + "]";
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}


}
