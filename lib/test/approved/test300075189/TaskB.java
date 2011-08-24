package approved.test300075189;

import net.egork.collections.sequence.ArrayWrapper;
import net.egork.collections.sequence.SequenceUtils;
import net.egork.io.IOUtils;
import net.egork.utils.Solver;
import net.egork.utils.io.InputReader;

import java.io.PrintWriter;

public class TaskB implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int count = in.readInt();
		int[] speed = new int[count];
		int[] ram = new int[count];
		int[] hdd = new int[count];
		int[] cost = new int[count];
		IOUtils.readIntArrays(in, speed, ram, hdd, cost);
		Integer[] order = SequenceUtils.order(ArrayWrapper.wrap(cost));
		for (int i : order) {
			boolean old = false;
			for (int j = 0; j < count && !old; j++) {
				if (speed[i] < speed[j] && ram[i] < ram[j] && hdd[i] < hdd[j])
					old = true;
			}
			if (!old) {
				out.println(i + 1);
				return;
			}
		}
	}
}

