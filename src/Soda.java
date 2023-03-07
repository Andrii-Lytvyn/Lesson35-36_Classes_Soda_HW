//  Создайте класс Soda (для определения типа газированной воды).
//  У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка
// (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
//В этом классе реализуйте метод public String GetMyDrinkString(),
// возвращающий строку Газировка и {добавка} в случае наличия добавки.
////  Если добавки нет, нужно вернуть строку "Обычная газировка".


public class Soda {
  private String topping;

  public Soda() {
    this.topping = "Regular soda";
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

//  public String getTopping() {
//    return topping;
//  }

  public String GetMyDrinkString() {
     return topping;
  }


}