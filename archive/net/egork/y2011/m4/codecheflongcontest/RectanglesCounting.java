package net.egork.y2011.m4.codecheflongcontest;

import net.egork.arrays.ArrayUtils;
import net.egork.collections.CPPMap;
import net.egork.collections.Pair;
import net.egork.misc.Factory;
import net.egork.utils.Exit;
import net.egork.utils.Solver;
import net.egork.utils.io.InputReader;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class RectanglesCounting implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int n = in.readInt();
		if (n == 0) {
			Exit.exit(in, out);
			return;
		}
		final int[] x = new int[n];
		int[] y = new int[n];
		in.readIntArrays(x, y);
		Integer[] order = ArrayUtils.generateOrder(n);
		Arrays.sort(order, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return x[o1] - x[o2];
			}
		});
		int lastX = Integer.MIN_VALUE;
		int lastY = 0;
		Map<Pair<Integer, Integer>, Integer> segments = new CPPMap<Pair<Integer, Integer>, Integer>(new Factory<Integer>() {
			public Integer create() {
				return 0;
			}
		});
		long result = 0;
		for (int i : order) {
			if (x[i] == lastX) {
				Pair<Integer, Integer> key = new Pair<Integer, Integer>(lastY, y[i]);
				int count = segments.get(key);
				result += count;
				segments.put(key, count + 1);
				segments.put(new Pair<Integer, Integer>(y[i], lastY), count + 1);
			}
			lastX = x[i];
			lastY = y[i];
		}
		out.println(result);
	}
}

