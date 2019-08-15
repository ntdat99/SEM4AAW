package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.Product;
import model.ProductModel;

public class ProductController extends ActionSupport implements ModelDriven<Product> {
    private Product product;
    private ProductModel productModel = new ProductModel();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public  String create(){
        this.product = Product.Builder.aProduct().build();
        return INPUT;
    }
    public String save(){
        productModel.save(product);
        return SUCCESS;
    }

    @Override
    public Product getModel() {
        return product;
    }
}
