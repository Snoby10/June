package junit1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import org.junit.Test;

public class Responsecode {

	
	String link="https://www.google.com";
	@Test
	public void test() throws IOException, Exception
	{
		
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		
		
		
	}
	
	
}
