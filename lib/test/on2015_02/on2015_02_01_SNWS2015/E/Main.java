package on2015_02.on2015_02_01_SNWS2015.E;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2015_02/on2015_02_01_SNWS2015/E/E.task"))
			Assert.fail();
	}
}
