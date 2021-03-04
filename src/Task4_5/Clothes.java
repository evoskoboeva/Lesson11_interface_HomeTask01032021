package Task4_5;

import java.util.Objects;

public abstract class Clothes {
 Size size;
 double price;
 Color color;

 @Override
 public String toString() {
  return "Clothes(" +
          "size=" + size +
          ", price=" + price +
          ", color='" + color + '\'' +
          ')';
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Clothes)) return false;
  Clothes clothes = (Clothes) o;
  return Double.compare(clothes.getPrice(), getPrice()) == 0 && getSize() == clothes.getSize() && Objects.equals(getColor(), clothes.getColor());
 }

 @Override
 public int hashCode() {
  return Objects.hash(getSize(), getPrice(), getColor());
 }

 public Size getSize() {
  return size;
 }

 public void setSize(Size size) {
  this.size = size;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }


 public Color getColor() {
  return color;
 }

 public void setColor(Color color) {
  this.color = color;
 }

 public Clothes(Size size, double price, Color color) {
  this.size = size;
  this.price = price;
  this.color = color;
 }
}
