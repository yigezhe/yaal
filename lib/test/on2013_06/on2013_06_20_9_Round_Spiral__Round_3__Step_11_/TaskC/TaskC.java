package on2013_06.on2013_06_20_9_Round_Spiral__Round_3__Step_11_.TaskC;



import net.egork.geometry.Point;
import net.egork.geometry.Polygon;
import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		Point[] points = new Point[count];
		for (int i = 0; i < count; i++)
			points[i] = Point.readPoint(in);
		out.printFormat("%.1f\n", new Polygon(points).square());
    }
}
