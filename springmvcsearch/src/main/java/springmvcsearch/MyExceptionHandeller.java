package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class MyExceptionHandeller {
	// Handling exception in our spring MVC
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = NullPointerException.class)
		public String exceptionHandelarNull(Model m) {
			m.addAttribute("msg", "Null pointer exception has occured");
			return "null_page";
		}

		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = NumberFormatException.class)
		public String numberFormatException(Model m) {
			m.addAttribute("msg", "Number Format exception has occured");
			return "null_page";
		}

		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = Exception.class)
		public String exceptionHandellerGeneric(Model m) {
			m.addAttribute("msg", "Exception has occured");
			return "null_page";
		}
}
