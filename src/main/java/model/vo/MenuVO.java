package model.vo;

//식단추천 
public class MenuVO {

 // 식단 코드 
 private String menuCd;

 // 식단 이름 
 private String menuName;

 // 식단 소개 
 private String menuContent;

 public String getMenuCd() {
     return menuCd;
 }

 public void setMenuCd(String menuCd) {
     this.menuCd = menuCd;
 }

 public String getMenuName() {
     return menuName;
 }

 public void setMenuName(String menuName) {
     this.menuName = menuName;
 }

 public String getMenuContent() {
     return menuContent;
 }

 public void setMenuContent(String menuContent) {
     this.menuContent = menuContent;
 }

 // Menu 모델 복사
 public void CopyData(MenuVO param)
 {
     this.menuCd = param.getMenuCd();
     this.menuName = param.getMenuName();
     this.menuContent = param.getMenuContent();
 }
}