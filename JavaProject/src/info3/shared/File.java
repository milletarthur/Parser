package info3.shared;

import java.io.FileWriter;
import java.io.IOException;

public class File {

	public static void toFile(String path, String name, String ext, String content) {
		String filename = path + name + "." + ext;
		try {
			FileWriter myFileWriter = new FileWriter(filename);
			myFileWriter.write(content);
			myFileWriter.close();
			System.out.println("... exported to: " + filename);
		} catch (IOException e) {
			System.out.println("error in File.toFile trying to export to " + filename);
			e.printStackTrace();
		}
	}
}
