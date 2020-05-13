package model.vo;

//파트너 
public class PartnerVO {

 // 파트너 코드 
 private String partCd;

 // 파트너 이름 
 private String partName;

 // 파트너 아이디 
 private String partId;

 // 파트너 비밀번호 
 private String partPw;

 // 파트너 성별 
 private String partGender;

 // 파트너 이메일 
 private String partEmail;

 // 파트너 전화번호 
 private String partPnum;

 // 파트너 주소 
 private String partAddress;

 // 추천인 파트너 아이디 
 private String recoPartId;

 public String getPartCd() {
     return partCd;
 }

 public void setPartCd(String partCd) {
     this.partCd = partCd;
 }

 public String getPartName() {
     return partName;
 }

 public void setPartName(String partName) {
     this.partName = partName;
 }

 public String getPartId() {
     return partId;
 }

 public void setPartId(String partId) {
     this.partId = partId;
 }

 public String getPartPw() {
     return partPw;
 }

 public void setPartPw(String partPw) {
     this.partPw = partPw;
 }

 public String getPartGender() {
     return partGender;
 }

 public void setPartGender(String partGender) {
     this.partGender = partGender;
 }

 public String getPartEmail() {
     return partEmail;
 }

 public void setPartEmail(String partEmail) {
     this.partEmail = partEmail;
 }

 public String getPartPnum() {
     return partPnum;
 }

 public void setPartPnum(String partPnum) {
     this.partPnum = partPnum;
 }

 public String getPartAddress() {
     return partAddress;
 }

 public void setPartAddress(String partAddress) {
     this.partAddress = partAddress;
 }

 public String getRecoPartId() {
     return recoPartId;
 }

 public void setRecoPartId(String recoPartId) {
     this.recoPartId = recoPartId;
 }

 // Partner 모델 복사
 public void CopyData(PartnerVO param)
 {
     this.partCd = param.getPartCd();
     this.partName = param.getPartName();
     this.partId = param.getPartId();
     this.partPw = param.getPartPw();
     this.partGender = param.getPartGender();
     this.partEmail = param.getPartEmail();
     this.partPnum = param.getPartPnum();
     this.partAddress = param.getPartAddress();
     this.recoPartId = param.getRecoPartId();
 }
}