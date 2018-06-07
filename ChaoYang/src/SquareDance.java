import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * �㳡��
 * 
 * LQ�е�����㳡��һ������Σ��㳡�������˴���ʯ�ĵذ�ש��
 * 
 * �ذ�ש�̵÷�������������������ֽһ����
 * ��ĳ�Ŀ�ש��ӵĵ�Ϊԭ�㣬�ذ�ש��������Ϊ����������һ��ש�ı߳�Ϊ��������ĵ�λ���ȣ������к������궼Ϊ�����ĵ㶼���Ŀ�ש�Ľ��㣨����ڹ㳡�ڣ���
 * 
 * �㳡��ש������Ȥ��ȴ�����㳡����������ṩ�˾��ѵĲ����ÿ����������д�������ǰ�����衣
 * ����ÿ�ζ���ѡһ��������ש�����裬�����˲���ѡ��ͬһ��ש�����һ��ש�ڹ㳡���ϵ���ȱ�ǻ��߲߱���������û�˻�ѡ���ש��
 * ���㳡��״�����Ӳο���ͼ1.png����
 * 
 * ���ڣ�������㳡����״�����LQ�е��г�����һ�£�ͬһʱ������ж�����������ڹ㳡���衣
 * 
 * 
 * 
 * �������ʽ�� ����ĵ�һ�а���һ������n����ʾ�㳡��n���εģ������n�����㣩��
 * ������n�У�ÿ���������������α�ʾn����ÿ����������꣨Ҳ����˵�㳡��Ե����ĵط�����ש�Ķ����ϡ����ݱ�֤�㳡��һ���򵥶���Ρ�
 * 
 * �������ʽ�� ���һ����������ʾ����ж�����������ڹ㳡���衣
 * 
 * ���������롿 5 3 3 6 4 4 1 1 -1 0 4
 * 
 * ����������� 7
 * 
 * ������˵���� �㳡��ͼ1.png��ʾ��һ����7�������ĵذ�ש������������7λ����һ�����衣
 * 
 * @param args
 * @throws FileNotFoundException
 */
public class SquareDance {

	public static int all_sum = 0;

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("1.txt");
		Scanner scanner = new Scanner(fis);
		int n = scanner.nextInt();
		int[][] points = new int[n][2];
		int max_x = Integer.MIN_VALUE, max_y = Integer.MIN_VALUE;
		int min_x = Integer.MAX_VALUE, min_y = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			points[i][0] = scanner.nextInt(); // [i][0] is x
			points[i][1] = scanner.nextInt(); // [i][1] is y
			if (points[i][0] > max_x)
				max_x = points[i][0];
			if (points[i][0] < min_x)
				min_x = points[i][0];
			if (points[i][1] > max_y)
				max_y = points[i][1];
			if (points[i][1] < min_y)
				min_y = points[i][1];
		}
		scanner.close();
		for (int i = min_x; i < max_x; i++) {
			for (int j = min_y; j < max_y; j++) {
				if (judge_point_is_in(points, i, j) && judge_point_is_in(points, i + 1, j)
						&& judge_point_is_in(points, i, j + 1) && judge_point_is_in(points, i + 1, j + 1)) {
					all_sum++;
				}
			}
		}
		System.out.println(all_sum);

	}

	public static boolean judge_point_is_in(int[][] points, int x, int y) {
		boolean result = false;
		int i = 0, j = points.length - 1;
		for (; i < points.length; i++) {
			// yi, < y < yn
			// xi + (y - yi)* (xi - xn)
			// yi - yn
			// ��һ������ һ�� һС
			if (Math.min(points[i][1], points[j][1]) < y && Math.max(points[i][1], points[j][1]) >= y) {
				double temp = (double) points[i][0]
						+ (double) (((double) (y - points[i][1]) / (double) (points[i][1] - points[j][1]))
								* ((double) (points[i][0] - points[j][0])));
				if (temp < x) {
					result = !result;
				}
			}
			j = i;
		}
		return result;
	}

}