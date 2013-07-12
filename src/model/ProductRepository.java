package model;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

	private List<Product> listProducts = new ArrayList<Product>();
	private int _nextId = 1;
	
	public ProductRepository(){
		
		add(new Product(1, "Computer","Electronics",443));
		add(new Product(2, "Laptop","Electronics",1213.3));
		add(new Product(3, "IPhone 4","Phone",531));
		
	}
	
	@Override
	public List<Product> getAll() {
		return listProducts;
	}

	@Override
	public Product get(int id) {
		
		Product productBase = null;
		for (Product p : listProducts) {
			if (p.id == id){productBase = p;}
		}
		return productBase;
	}

	@Override
	public Product add(Product item) {
		
		if(item==null){throw new NullPointerException("item");}
		
		item.id = _nextId++;
		listProducts.add(item);
	
		return item;
	}

	@Override
	public boolean update(Product item) {

		if(item==null){throw new NullPointerException("item");}
		
		int index = -1;
		
		for (Product p : listProducts) {
			if (p.id == item.id){index = p.id;}
		}
		
		if (index == -1){return false;}
		
		listProducts.remove(index);
		listProducts.add(index, item);
		
		return true;
	}

	@Override
	public boolean delete(Product item) {
		
		if(item==null){throw new NullPointerException("item");}
		
		int index = -1;
		
		for (Product p : listProducts) {
			if (p.id == item.id){index = p.id;}
		}
		
		if (index == -1){return false;}
		
		listProducts.remove(index);
				
		return true;
	}

}
