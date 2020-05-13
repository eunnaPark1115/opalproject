package model.vo;

//레시피 상품 
public class PRecipeVO {

 // 상품 코드 
 private String productCd;

 // 레시피 코드 
 private String recipeCd;

 // 레시피 업데이트일 
 private String recipeUpdate;

 public String getProductCd() {
     return productCd;
 }

 public void setProductCd(String productCd) {
     this.productCd = productCd;
 }

 public String getRecipeCd() {
     return recipeCd;
 }

 public void setRecipeCd(String recipeCd) {
     this.recipeCd = recipeCd;
 }

 public String getRecipeUpdate() {
     return recipeUpdate;
 }

 public void setRecipeUpdate(String recipeUpdate) {
     this.recipeUpdate = recipeUpdate;
 }

 // PRecipe 모델 복사
 public void CopyData(PRecipeVO param)
 {
     this.productCd = param.getProductCd();
     this.recipeCd = param.getRecipeCd();
     this.recipeUpdate = param.getRecipeUpdate();
 }
}