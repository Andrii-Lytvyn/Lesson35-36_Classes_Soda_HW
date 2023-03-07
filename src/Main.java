import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
//  Задача 1
//  Создайте класс Soda (для определения типа газированной воды).
//  У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка
// (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
//В этом классе реализуйте метод public String GetMyDrinkString(),
// возвращающий строку Газировка и {добавка} в случае наличия добавки.
////  Если добавки нет, нужно вернуть строку "Обычная газировка".

  public static void main(String[] args) throws IOException {
    Soda newSoda = new Soda();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1 - обычная содовая \n2 - c добавкой");
    int choose = Integer.parseInt(br.readLine());
    if (choose == 1) {
      System.out.print(newSoda.GetMyDrinkString());
    }
    else if (choose == 2) {
      System.out.print("Введите добавку: ");
      String adding = br.readLine();
      System.out.print(newSoda.GetMyDrinkString() + " и {");
      newSoda.setTopping(adding);
      System.out.println(newSoda.GetMyDrinkString()+"}");
    }
   else {
      System.out.println("Error");
    }
  }
}