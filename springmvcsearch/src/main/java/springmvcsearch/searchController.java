package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class searchController {
	@RequestMapping("/user/{userId}/{uname}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("uname") String uname) {
		System.out.println(userId);
		System.out.println(uname);
		// Integer.parseInt(uname);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		String str = null;
		System.out.println(str.length());
		System.out.println("going to home view");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		String url = "https://www.google.com//search?q=" + query;
		RedirectView redirectView = new RedirectView();

		if (query.isEmpty()) {

			redirectView.setUrl("home");
		} else {
			redirectView.setUrl(url);
		}
		return redirectView;
	}

	/*
	 * // Handling exception in our spring MVC
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value = NullPointerException.class) public String
	 * exceptionHandelarNull(Model m) { m.addAttribute("msg",
	 * "Null pointer exception has occured"); return "null_page"; }
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value = NumberFormatException.class) public String
	 * numberFormatException(Model m) { m.addAttribute("msg",
	 * "Number Format exception has occured"); return "null_page"; }
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value = Exception.class) public String
	 * exceptionHandellerGeneric(Model m) { m.addAttribute("msg",
	 * "Exception has occured"); return "null_page"; }
	 */
}
