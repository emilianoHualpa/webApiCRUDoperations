package model;

import java.util.List;

public interface IProductRepository {
	
	List<Product> getAll();
	Product get(int id);
	Product add(Product item);
	boolean update(Product item);
	boolean delete(Product item);
	
}
