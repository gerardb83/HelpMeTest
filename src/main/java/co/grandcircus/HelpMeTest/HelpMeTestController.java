package co.grandcircus.HelpMeTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelpMeTestController {

	@Value("${HOST}")
	private String host;
	
	@RequestMapping("/")
	public ModelAndView showHome() throws Exception {
		ModelAndView mv = new ModelAndView("index", "host", host);
		return mv;
	}
}
