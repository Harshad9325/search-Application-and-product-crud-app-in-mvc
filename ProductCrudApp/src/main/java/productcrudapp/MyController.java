package productcrudapp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MyController {
	@Autowired
private ProductDao  productDao;
	@RequestMapping("/")
	public String home(Model m) {
List<Product> product = productDao.getAllProduct();	
int size = product.size();
for(int i=0;i<=size-1;i++) {
	Product product2 = product.get(i);
	product2.setSrno(i+1);

}
m.addAttribute("Product", product);


		return "index";
	}
	//show add product form
	@RequestMapping("/add-product")
	public String AddProduct(Model m) {
		m.addAttribute("title", "Add product");
		return "add_product_form";
	}
//handle add product form
   @RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
	   System.out.println(product);
	   this.productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
   //delete handler
   @RequestMapping("/delete/{ProductId}")
   public RedirectView deleteProduct(@PathVariable("ProductId") int ProductId, HttpServletRequest request) {
	   this.productDao.deleteProduct(ProductId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
   }
   
   //update handler
   @RequestMapping("/update/{productId}")
   public String updateForm(@PathVariable("productId")int productId ,Model m) {
	   Product product = this.productDao.getProduct(productId);
	   m.addAttribute("product", product);
	   return "update_form";
   }
}
