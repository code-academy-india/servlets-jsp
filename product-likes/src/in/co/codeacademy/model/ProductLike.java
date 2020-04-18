package in.co.codeacademy.model;

public class ProductLike {

	private String productId;
	private String custName;

	public ProductLike() {

	}

	public ProductLike(String productId, String custName) {
		super();
		this.productId = productId;
		this.custName = custName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
