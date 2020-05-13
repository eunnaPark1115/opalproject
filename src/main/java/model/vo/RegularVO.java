package model.vo;

//정기구독 
public class RegularVO {

 // 상품 코드 
 private String productCd;

 // 패키지 코드 
 private String packCd;

 // 구독 날짜 
 private String regularDate;

 // 구독 코드 
 private String regularCd;

 public String getProductCd() {
     return productCd;
 }

 public void setProductCd(String productCd) {
     this.productCd = productCd;
 }

 public String getPackCd() {
     return packCd;
 }

 public void setPackCd(String packCd) {
     this.packCd = packCd;
 }

 public String getRegularDate() {
     return regularDate;
 }

 public void setRegularDate(String regularDate) {
     this.regularDate = regularDate;
 }

 public String getRegularCd() {
     return regularCd;
 }

 public void setRegularCd(String regularCd) {
     this.regularCd = regularCd;
 }

 // Regular 모델 복사
 public void CopyData(RegularVO param)
 {
     this.productCd = param.getProductCd();
     this.packCd = param.getPackCd();
     this.regularDate = param.getRegularDate();
     this.regularCd = param.getRegularCd();
 }
}