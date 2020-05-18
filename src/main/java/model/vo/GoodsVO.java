package model.vo;

public class GoodsVO {
	//20200513 Eunha GoodsVO
	
	private int post_id;
	private String productName;
	private String productContent;
	private Integer productPrice;
	private Integer productSu;
	private String productCd;
	private String farmCd;

	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductContent() {
		return productContent;
	}
	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductSu() {
		return productSu;
	}
	public void setProductSu(Integer productSu) {
		this.productSu = productSu;
	}
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getFarmCd() {
		return farmCd;
	}
	public void setFarmCd(String farmCd) {
		this.farmCd = farmCd;
	}
	
	
	@Override
	public String toString() {
		return "GoodsVO [post_id=" + post_id + ", productName=" + productName + ", productContent=" + productContent + ", productPrice=" + productPrice + ", productSu=" + productSu + ", productCd=" +  productCd + ", farmCd=" + farmCd + "]";
	}
	
}
