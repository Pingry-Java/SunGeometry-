public class Circle{
 private Point center;
 private double radius; 
 private String name; 
 
 public Circle(){
  Point center = new Point(); 
  radius = 1;
 }
 
 public Circle(double radius){
  Point center = new Point();
  this.radius = radius;
 }
 
 public Circle(Point center){
  center = new Point();
  this.center = center;
  radius = 1; 
 }
 
 public Circle(double radius, Point center){
  center = new Point();
  this.center = center;
  this.radius = radius; 
 } 
 
 public double diameter(){
  return radius * 2; 
 }
 public double circumference(){
  return ((radius * 2) * 3.1415); 
 }
 
 public double area(){
  return 3.1415 * Math.pow(radius, 2); 
 }
 
 public String toString(){
  return center.name; 
 }
 
 
}