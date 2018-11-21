package test.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestViewBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String testString;

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
	
	public void submit() {
		
	}
	
	

}
