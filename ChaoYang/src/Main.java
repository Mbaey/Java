import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

//
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner s = new Scanner(new FileInputStream("1.txt"));
		HashMap<String, Integer> pos = new HashMap<String, Integer>();
		pos.put("s", 22);
		pos.put("s", 222);
		System.out.println(pos.get("s"));
	}

}
