package on2012_11.on2012_11_10_.TaskD;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2012_11/on2012_11_10_/TaskD/TaskD.task"))
			Assert.fail();
	}
}
