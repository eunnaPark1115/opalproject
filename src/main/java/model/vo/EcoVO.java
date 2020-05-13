package model.vo;

//친환경 
public class EcoVO {

 // 친환경 코드 
 private String ecoCd;

 // 친환경 이름 
 private String ecoName;

 public String getEcoCd() {
     return ecoCd;
 }

 public void setEcoCd(String ecoCd) {
     this.ecoCd = ecoCd;
 }

 public String getEcoName() {
     return ecoName;
 }

 public void setEcoName(String ecoName) {
     this.ecoName = ecoName;
 }

 // Eco 모델 복사
 public void CopyData(EcoVO param)
 {
     this.ecoCd = param.getEcoCd();
     this.ecoName = param.getEcoName();
 }
}