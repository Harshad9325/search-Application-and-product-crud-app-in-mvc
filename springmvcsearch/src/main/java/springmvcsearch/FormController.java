package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	@RequestMapping("/complexF")
	public String showForm() {

		return "complex";
	}

	@RequestMapping(path = "handleform", method = RequestMethod.POST)
	public String formHandaler(@ModelAttribute("student") student student, BindingResult result) {
		if(result.hasErrors()) {
			return "complex";
		}
		
		System.out.println(student);
System.out.println(student.getAddress()  );
		return "success";
	}
}
