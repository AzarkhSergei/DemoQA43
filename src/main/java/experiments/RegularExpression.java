package experiments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
  public static void main(String[] args) {
 /*   String text = "Regular expression";
    Pattern pattern = Pattern.compile("Regular");
    Matcher matcher = pattern.matcher(text);
    while(matcher.find()){
      System.out.println(matcher.group());
    }

    String text1 = "В списке файлов есть file1.img, File2.txt, " +
        "а также еще один файл filenew.txt И еще другие файлы, например sait.html";

    Pattern pattern1 = Pattern.compile("[a-zA-Z\\d]+\\.[a-z]{3,4}");
    Matcher matcher1 = pattern1.matcher(text1);
    while (matcher1.find()){
      System.out.println(matcher1.group());
    }*/

    task1();


  }

  static void task1() { //Иванов Иван Иванович
    String text = "Иванов Иван Иванович, Петров Петр Петрович, слово1 Слово2 слово3, " +
        "Фамилия Имя Отчество, Имянов Имя Имянович ";
    Pattern pattern = Pattern.compile("([А-Я]{1}[а-я]{1,} ){2}[А-Я][а-я]{1,}");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()){
      System.out.println(matcher.group());
    }
  }


}
