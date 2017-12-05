import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InverseCaptchaTests {
	
	@Test
	public void test(){
		InverseCaptcha ic = new InverseCaptcha();
		assertEquals("3", ic.inverseCaptcha("1122"));
		assertEquals("4", ic.inverseCaptcha("1111"));
		assertEquals("0", ic.inverseCaptcha("1234"));
		assertEquals("9", ic.inverseCaptcha("91212129"));
	}
}
