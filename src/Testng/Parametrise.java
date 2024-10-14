package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrise {
@Parameters
@Test
public void test(String v)
{
	System.out.println(v);
	}
}
