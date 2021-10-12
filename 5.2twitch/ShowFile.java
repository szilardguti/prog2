import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		
		int i;

		try {
		if(args.length != 2) {
			//System.out.println("Usage: ShowFile filename");
			throw new Exception("Usage: ShowFile inputFilename output Filename");
			//return;
			}
		}catch (Exception e) {
			System.out.println(e);
			return;
		}

		try (FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1])){
			
			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while(i != -1);

			fin.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found " + e);
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
	}
}