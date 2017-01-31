public class Segment{ 
 private Point start;
 private Point end; 
 private static int numSegments = 0; 
 
 
 
 // Default constructor because it has no args
 // need to override the default constructor
 public Segment(Point start, Point end){
  this.start = start;
  this.end = end;
  
  numSegments++; 
 }
 
 public Segment() {
  this(new Point(), new Point()); 
  
  numSegments++; 
 }
 
 public double slope() {
  double y = start.getY() - end.getY();
  double x = start.getX() - end.getX(); 
  
  return y / x; 
  
 }
 public static int getNumSegments(){
  return numSegments; 
 }
 
 private double length(){
  double deltaX = start.getX() - end.getX();
  double deltaY = start.getY() - end.getY(); 
  
  return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)); 
 }

 public String toString(){
  return start.name + end.name; 
 }
 
}