<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//디벨랍
=======
//마스터
>>>>>>> 4e25ee4 (no message)
=======
//마스터
=======
//디벨랍
>>>>>>> a44afdc (no message)
>>>>>>> 0cb15c7 (而ㅻ컠)
=======
//디벨랍
>>>>>>> a44afdc (no message)
package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//#7
//#6
//#2
//#1
//#5
//#4
//#1
//#3
//#2 수정

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
