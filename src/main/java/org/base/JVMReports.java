package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {

	public static void generateJVMReport(String json) {
//1.File loc.where need to store the reports
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		
//2.Configuration .....give some details about project
		Configuration con=new Configuration(loc, "FaceBook");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser version", "106");
		con.addClassifications("OS name", "Windows 11");
		con.addClassifications("Environmental", "QA");
		con.addClassifications("sprint ", "20");
		//3. ReportBuilder.....generate the reports
		List<String> jsonFiles=new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
		
		

		
		
		
	}
	
	
	
	
	
	
	
}
