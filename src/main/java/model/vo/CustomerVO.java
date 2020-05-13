package model.vo;

//고객 
public class CustomerVO {

 // 고객 코드 
 private String custCd;

 // 고객 이름 
 private String custName;

 // 고객 아이디 
 private String custId;

 // 고객 비밀번호 
 private String custPw;

 // 고객 성별 
 private String custGender;

 // 고객 이메일 
 private String custEmail;

 // 고객 전화번호 
 private String custPnum;

 // 고객 주소 
 private String custAddress;

 // 추천인 고객 아이디 
 private String recoCustId;

 public String getCustCd() {
     return custCd;
 }

 public void setCustCd(String custCd) {
     this.custCd = custCd;
 }

 public String getCustName() {
     return custName;
 }

 public void setCustName(String custName) {
     this.custName = custName;
 }

 public String getCustId() {
     return custId;
 }

 public void setCustId(String custId) {
     this.custId = custId;
 }

 public String getCustPw() {
     return custPw;
 }

 public void setCustPw(String custPw) {
     this.custPw = custPw;
 }

 public String getCustGender() {
     return custGender;
 }

 public void setCustGender(String custGender) {
     this.custGender = custGender;
 }

 public String getCustEmail() {
     return custEmail;
 }

 public void setCustEmail(String custEmail) {
     this.custEmail = custEmail;
 }

 public String getCustPnum() {
     return custPnum;
 }

 public void setCustPnum(String custPnum) {
     this.custPnum = custPnum;
 }

 public String getCustAddress() {
     return custAddress;
 }

 public void setCustAddress(String custAddress) {
     this.custAddress = custAddress;
 }

 public String getRecoCustId() {
     return recoCustId;
 }

 public void setRecoCustId(String recoCustId) {
     this.recoCustId = recoCustId;
 }

 // Customer 모델 복사
 public void CopyData(CustomerVO param)
 {
     this.custCd = param.getCustCd();
     this.custName = param.getCustName();
     this.custId = param.getCustId();
     this.custPw = param.getCustPw();
     this.custGender = param.getCustGender();
     this.custEmail = param.getCustEmail();
     this.custPnum = param.getCustPnum();
     this.custAddress = param.getCustAddress();
     this.recoCustId = param.getRecoCustId();
 }
}