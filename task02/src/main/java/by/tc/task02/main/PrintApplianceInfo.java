package by.tc.task02.main;

import java.io.PrintStream;
import java.util.List;
import by.tc.task02.entity.Appliance;

public class PrintApplianceInfo {
	private static PrintStream outputStream = System.out;
	public static void print(List<Appliance> appliances) {
		outputStream.println("Output:");
		for(Appliance appliance : appliances){
			outputStream.println(appliance.toString());
		}
	}
	public static PrintStream getOutputStream() {
		return outputStream;
	}

	public static void setOutputStream(PrintStream outputStream) {
		PrintApplianceInfo.outputStream = outputStream;
	}
}
