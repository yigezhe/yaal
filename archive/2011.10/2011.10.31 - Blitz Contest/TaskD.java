package net.egork;

import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

public class TaskD {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		out.print(in.readCharacter());
		in.readCharacter();
		out.printLine(in.readCharacter());
	}
}
