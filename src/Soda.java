//  Создайте класс Soda (для определения типа газированной воды).
//  У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка
// (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
//В этом классе реализуйте метод public String GetMyDrinkString(),
// возвращающий строку Газировка и {добавка} в случае наличия добавки.
////  Если добавки нет, нужно вернуть строку "Обычная газировка".

public class Soda {
  private String typeSoda;
  public Soda() {
    typeSoda = "Regular soda";
  }
  private String topping;
  public Soda(String topping) {
    this.typeSoda = "Regular soda";
    this.topping = topping;
  }
  public String GetMyDrinkString() {
    if (topping == null) {
      return typeSoda;
    } else {
      return typeSoda + " " + topping;
    }
  }
}