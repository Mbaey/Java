import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ten2X {
	public static void main(String[] args) throws Exception {
		File file = new File("1.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		int d = 0, x = 16;
		for (int i = 0; i < 80; i++) {
			String a = Ten2XX(i, x);
			fw.write('P' + a +"\n" );
		}
		fw.flush();
		fw.close();
		System.out.println("1.10");

	}

	public static char forDigit(int d, int x) {
		if (d < 10) {
			return (char) (d + '0');
		} else {
			return (char) (d - 10 + 'A');
		}
	}

	public static String Ten2XX(int d, int x) {
		String ans = "";
		while (d >= x) {
			ans += forDigit(d % x, x);
			d /= x;
		}
		ans += forDigit(d, x);

		int len = ans.length();
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			result += ans.charAt(i);
		}
		return result;
	}
}
