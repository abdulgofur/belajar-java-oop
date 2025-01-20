public class Shape {
  int getCorner() {
    return 0;
  }
}

class Rectangle extends Shape {
  int getCorner() {
    super.getCorner();
    return 4;
  }

  int getParrentCorner() {
    return super.getCorner();
  }
}


