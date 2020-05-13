package model.vo;

//레시피 
public class RecipeVO {

 // 레시피 코드 
 private String recipeCd;

 // 레시피 이름 
 private String recipeName;

 // 레시피 소개 
 private String recipeContent;

 public String getRecipeCd() {
     return recipeCd;
 }

 public void setRecipeCd(String recipeCd) {
     this.recipeCd = recipeCd;
 }

 public String getRecipeName() {
     return recipeName;
 }

 public void setRecipeName(String recipeName) {
     this.recipeName = recipeName;
 }

 public String getRecipeContent() {
     return recipeContent;
 }

 public void setRecipeContent(String recipeContent) {
     this.recipeContent = recipeContent;
 }

 // Recipe 모델 복사
 public void CopyData(RecipeVO param)
 {
     this.recipeCd = param.getRecipeCd();
     this.recipeName = param.getRecipeName();
     this.recipeContent = param.getRecipeContent();
 }
}