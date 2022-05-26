package org.lang;

public class StateDetails {
public void southIndia(){

System.out.println("south india speaks tamil");
}
public void northIndia()
{
	System.out.println("north india speaks hindi");
}
public static void main(String[] args) {
	StateDetails s = new StateDetails();

			s.southIndia();
s.northIndia();
 LanguageInfo m = new  LanguageInfo();
m.englishLanguage();
m.tamilLanguage();
m.hindiLanguage();
}
}
