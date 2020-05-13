package model.vo;

//주문 
public class OrderVO {

 // 고객 코드 
 private String custCd;

 // 주문 코드 
 private String orderCd;

 // 주문 날짜 
 private String orderDate;

 // 상품 코드 
 private String productCd;

 public String getCustCd() {
     return custCd;
 }

 public void setCustCd(String custCd) {
     this.custCd = custCd;
 }

 public String getOrderCd() {
     return orderCd;
 }

 public void setOrderCd(String orderCd) {
     this.orderCd = orderCd;
 }

 public String getOrderDate() {
     return orderDate;
 }

 public void setOrderDate(String orderDate) {
     this.orderDate = orderDate;
 }

 public String getProductCd() {
     return productCd;
 }

 public void setProductCd(String productCd) {
     this.productCd = productCd;
 }

 // Order 모델 복사
 public void CopyData(OrderVO param)
 {
     this.custCd = param.getCustCd();
     this.orderCd = param.getOrderCd();
     this.orderDate = param.getOrderDate();
     this.productCd = param.getProductCd();
 }
}