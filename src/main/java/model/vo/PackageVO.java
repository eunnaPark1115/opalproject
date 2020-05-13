package model.vo;

//패키지 
public class PackageVO {

 // 패키지 코드 
 private String packCd;

 // 패키지 이름 
 private String packName;

 // 패키지 소개 
 private String packContent;

 // 패키지 가격 
 private Integer packPrice;

 public String getPackCd() {
     return packCd;
 }

 public void setPackCd(String packCd) {
     this.packCd = packCd;
 }

 public String getPackName() {
     return packName;
 }

 public void setPackName(String packName) {
     this.packName = packName;
 }

 public String getPackContent() {
     return packContent;
 }

 public void setPackContent(String packContent) {
     this.packContent = packContent;
 }

 public Integer getPackPrice() {
     return packPrice;
 }

 public void setPackPrice(Integer packPrice) {
     this.packPrice = packPrice;
 }

 // Package 모델 복사
 public void CopyData(PackageVO param)
 {
     this.packCd = param.getPackCd();
     this.packName = param.getPackName();
     this.packContent = param.getPackContent();
     this.packPrice = param.getPackPrice();
 }
}