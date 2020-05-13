package model.vo;

//농가 
public class FarmVO {

 // 농가 코드 
 private String farmCd;

 // 농가 이름 
 private String farmName;

 // 농가 주소 
 private String farmAddress;

 // 농가 소개 
 private String farmContent;

 // 파트너 코드 
 private String partCd;

 // 친환경 코드 
 private String ecoCd;

 // 농가 전화번호 
 private String farmPnum;

 public String getFarmCd() {
     return farmCd;
 }

 public void setFarmCd(String farmCd) {
     this.farmCd = farmCd;
 }

 public String getFarmName() {
     return farmName;
 }

 public void setFarmName(String farmName) {
     this.farmName = farmName;
 }

 public String getFarmAddress() {
     return farmAddress;
 }

 public void setFarmAddress(String farmAddress) {
     this.farmAddress = farmAddress;
 }

 public String getFarmContent() {
     return farmContent;
 }

 public void setFarmContent(String farmContent) {
     this.farmContent = farmContent;
 }

 public String getPartCd() {
     return partCd;
 }

 public void setPartCd(String partCd) {
     this.partCd = partCd;
 }

 public String getEcoCd() {
     return ecoCd;
 }

 public void setEcoCd(String ecoCd) {
     this.ecoCd = ecoCd;
 }

 public String getFarmPnum() {
     return farmPnum;
 }

 public void setFarmPnum(String farmPnum) {
     this.farmPnum = farmPnum;
 }

 // Farm 모델 복사
 public void CopyData(FarmVO param)
 {
     this.farmCd = param.getFarmCd();
     this.farmName = param.getFarmName();
     this.farmAddress = param.getFarmAddress();
     this.farmContent = param.getFarmContent();
     this.partCd = param.getPartCd();
     this.ecoCd = param.getEcoCd();
     this.farmPnum = param.getFarmPnum();
 }
}