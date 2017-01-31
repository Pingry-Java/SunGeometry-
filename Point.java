public class Point{
 //Declare some instance fields 
 private int x; 
 private int y;
 public String name;
 
 //Declare a constructor to make a new instance of the class 
 //Constructors always have the same name as the class.
 public Point(){
  x = 0;
  y = 0;
  name = "No Name Given";
 }
 
 public Point(int a, int b){
  if (a < 0) {
   throw new IllegalArgumentException("x value cannot be negative");
  }
  else{
   x = a; 
  }
  if (b < 0) {
   throw new IllegalArgumentException("y value cannot be negative");
  }
  else{
   y = b;
  }
  name = "No Name Given"; 
 }
 public Point(int a, int b, String n){
  if (a < 0) {
   throw new IllegalArgumentException("x value cannot be negative");
  }
  else{
   x = a; 
  }
  if (b < 0) {
   throw new IllegalArgumentException("y value cannot be negative");
  }
  else{
   y = b;
  }
  name = n;
 }
 public int getX(){
  return x;
 }
 public int getY(){
  return y; 
 }
 public String getName(){
  return name; 
 }
 public void setX(int a){
  if (a < 0) {
   throw new IllegalArgumentException("x value cannot be negative");
  }
  else
   x = a; 
  
 }
 public void setY(int a){
  if (a < 0) {
   throw new IllegalArgumentException("y value cannot be negative");
  }
  else
   y = a;
  
 }
 //Declare some useful methods
 
 /**
  * Calculate sand returns this point's distance from the origin (0, 0)
  * @return The distance from (0, 0) as a real number 
  */
  public double distance(Point a){
   int x1 = a.getX();
   int y1 = a.getY();
   int x2 = getX();
   int y2 = getY();
   
   double answer = Math.sqrt(Math.pow(x1 - x2, 2) * 1.0 - Math.pow(y1 - y2, 2));
   return answer;
  }
  
  
  public static double distance(Point a, Point b){
   int x1 = a.getX();
   int y1 = a.getY();
   int x2 = b.getX();
   int y2 = b.getY();
   
   double answer = Math.sqrt(Math.pow(x1 - x2, 2) * 1.0 - Math.pow(y1 - y2, 2));
   return answer;
  }

  public double originDistance(){
   double answer = Math.hypot((double) x, y); 
   return answer;
  }
  public String toString(){
  
   return name + ": (" + this.x + ", " + this.y + ")";
  
  }
}