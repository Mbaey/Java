import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 广场舞
 * 
 * LQ市的市民广场是一个多边形，广场上铺满了大理石的地板砖。
 * 
 * 地板砖铺得方方正正，就像坐标轴纸一样。
 * 以某四块砖相接的点为原点，地板砖的两条边为两个正方向，一块砖的边长为横纵坐标的单位长度，则所有横纵坐标都为整数的点都是四块砖的交点（如果在广场内）。
 * 
 * 广场的砖单调无趣，却给跳广场舞的市民们提供了绝佳的参照物。每天傍晚，都会有大批市民前来跳舞。
 * 舞者每次都会选一块完整的砖来跳舞，两个人不会选择同一块砖，如果一块砖在广场边上导致缺角或者边不完整，则没人会选这块砖。
 * （广场形状的例子参考【图1.png】）
 * 
 * 现在，告诉你广场的形状，请帮LQ市的市长计算一下，同一时刻最多有多少市民可以在广场跳舞。
 * 
 * 
 * 
 * 【输入格式】 输入的第一行包含一个整数n，表示广场是n边形的（因此有n个顶点）。
 * 接下来n行，每行两个整数，依次表示n边形每个顶点的坐标（也就是说广场边缘拐弯的地方都在砖的顶角上。数据保证广场是一个简单多边形。
 * 
 * 【输出格式】 输出一个整数，表示最多有多少市民可以在广场跳舞。
 * 
 * 【样例输入】 5 3 3 6 4 4 1 1 -1 0 4
 * 
 * 【样例输出】 7
 * 
 * 【样例说明】 广场如图1.png所示，一共有7块完整的地板砖，因此最多能有7位市民一起跳舞。
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
			// 在一个角上 一大 一小
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