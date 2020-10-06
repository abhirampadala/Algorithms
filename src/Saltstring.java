import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Saltstring extends Thread{
	
	public static void main(String[] args) {
		Process p;
		try {

			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("/Abhiram/sample.bat");

			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				
				System.out.println(line);
				}
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	}