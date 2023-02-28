package springmvcsearch;

import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/showUploadForm")
	public String showUploadForm() {
           String str=null;
           System.out.println(str.charAt(0));
		return "FileForm";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s,Model model) {
		System.out.println("file upload handeller");
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/") + file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file uploaded");
		model.addAttribute("msg", "uploaded sucussesfully");
		model.addAttribute("filename",file.getOriginalFilename());
		}catch (Exception e) {
		e.printStackTrace();
		System.out.println("uploading error");
		model.addAttribute("msg", "uploading error");
		}
		return "filesuccess";
	}
}
