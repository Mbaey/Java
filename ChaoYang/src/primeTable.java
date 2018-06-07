import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//PATºÍjavaÓÐ³ð

public class primeTable {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new FileInputStream("1.txt"));
//		 Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();
		s.close();
		int c = 0;
		int count = 0;
		boolean vis[] = new boolean[100000];
		int pri[] = new int[10000];
		for (int i = 2; i <= m * m * 2 + 1; i++) {
			if (!vis[i] == true) {
				pri[++count] = i;
				for (int j = i * i; j <= m * m * 2 + 1; j += i) {
					vis[j] = true;
				}
			}
			if (count > m) {
				break;
			}
		}

		for (int i = n; i < m; i++) {
			if ((i - n + 1) % 10 == 0) {
				System.out.println(pri[i]);
			} else {
				System.out.print(pri[i] + " ");
			}
		}
		if((m-n+1)%10==0){
			System.out.println(pri[m]);
		}else {
			System.out.print(pri[m]);
		}
	}

}
