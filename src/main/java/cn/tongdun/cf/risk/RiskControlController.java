/**
 * 
 */
package cn.tongdun.cf.risk;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kk
 *
 */
@RestController
public class RiskControlController {
	
	public static String[] rcResults = new String[] {"Accepted","Rejected","Reviewed"};
	@RequestMapping("/riskControl")
	public String riskControl() {
		
		Random r = new Random();
		int i = r.nextInt(3);
		return rcResults[i];
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "<html><body><h1>Risk Control Platform - mock</h1><a href=\"" + "/riskControl" + "\">riskControl</a> <p/> </body></html>";
	}
}
