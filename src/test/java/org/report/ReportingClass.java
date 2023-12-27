package org.report;


import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	public static void generateReport(String json) {
		File file = new File("C:\\Users\\Sudhagar\\eclipse-workspace\\DecCucum");
		
		Configuration con = new Configuration(file, "Luma Webpage Product Add to Cart");
		con.addClassifications("UserId", "1000");
		con.addClassifications("UserStoryNumber", "13000");
		con.addClassifications("Platform", "Eclipse-Photon");
		con.addClassifications("FunctionName", "LoginFunction");
		
		List<String>li = new LinkedList<String>();
		li.add(json);
		
		ReportBuilder report = new ReportBuilder(li, con);
		report.generateReports();

	}
}
