package model.vo;

//상품 
public class ProductVO {

 // 상품 코드 
 private String productCd;

 // 상품 이름 
 private String productName;

 // 상품 소개 
 private String productContent;

 // 상품 가격 
 private Integer productPrice;

 // 농가 코드 
 private String farmCd;

 // 상품 수 
 private Integer productSu;

 public String getProductCd() {
     return productCd;
 }

 public void setProductCd(String productCd) {
     this.productCd = productCd;
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

 public String getFarmCd() {
     return farmCd;
 }

 public void setFarmCd(String farmCd) {
     this.farmCd = farmCd;
 }

 public Integer getProductSu() {
     return productSu;
 }

 public void setProductSu(Integer productSu) {
     this.productSu = productSu;
 }

 // Product 모델 복사
 public void CopyData(ProductVO param)
 {
     this.productCd = param.getProductCd();
     this.productName = param.getProductName();
     this.productContent = param.getProductContent();
     this.productPrice = param.getProductPrice();
     this.farmCd = param.getFarmCd();
     this.productSu = param.getProductSu();
 }
}