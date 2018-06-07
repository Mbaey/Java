import java.util.ArrayList;
import java.util.Arrays;

public class KMPDemo {
	
	private  int[] Next;
	/**
	 * Ä£Ê½´®
	 */
	private  String P;
	private  String T;	



	public KMPDemo(String p, String t) {
		super();
		P = p;
		T = t;
	}
	
	public KMPDemo() {
		super();
		Next = new int[10];
	}


	public int[] KmpNext(String p){
		int len = p.length();
		Next[0]=-1;
		for (int i = 1; i < len; i++) {
			int j=i;
			while(Next[j] != -1 && p.charAt(j) != p.charAt(j+1) ){
				j=Next[j];
			}
			Next[i] = j+1;
		}
		return Next;
	}
	
	public static int getIndex(){
		return 0;		
	}
	
	public static void main(String[] args) {
		String T = "ctcabcatcaatcatbcadtcaabcabcadat";
		String P = "caatcat";
//		int indexOf = T.indexOf(P);
//		System.out.println(indexOf);
		KMPDemo demo = new KMPDemo();
		int[] kmpNext = demo.KmpNext(P);
		System.out.println(Arrays.toString(kmpNext));
	}

}
