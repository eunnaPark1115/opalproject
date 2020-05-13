package model.vo;

//식단추천 상품 
public class PMenuVO {

 // 식단 코드 
 private String menuCd;

 // 상품 코드 
 private String productCd;

 public String getMenuCd() {
     return menuCd;
 }

 public void setMenuCd(String menuCd) {
     this.menuCd = menuCd;
 }

 public String getProductCd() {
     return productCd;
 }

 public void setProductCd(String productCd) {
     this.productCd = productCd;
 }

 // PMenu 모델 복사
 public void CopyData(PMenuVO param)
 {
     this.menuCd = param.getMenuCd();
     this.productCd = param.getProductCd();
 }
}