package belajar.java.dasar;

public interface Car extends HasBrand, IsMaintenance{
  void drive();

  int getTier();

  default boolean isFuel() {
    return false;
  }
}
