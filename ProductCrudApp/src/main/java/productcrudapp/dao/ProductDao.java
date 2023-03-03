package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create product
	@Transactional
	public void createProduct(Product product) {
	

		this.hibernateTemplate.saveOrUpdate(product);

	}

	// GEt All Product
	public List<Product> getAllProduct() {

		List<Product> product = this.hibernateTemplate.loadAll(Product.class);
		product.size();
		return product;
	}

	// delete single product
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}

	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);

	}
}
