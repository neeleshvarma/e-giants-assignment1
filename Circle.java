public class Circle { 
	
   private double radius;
 
   public Circle() {
      
      }
   public Circle(double r) {
      radius = r;
      
   }
   public double getRadius() {
     return radius; 
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
   public double getDiameter()
   {
	   return radius*2;
   }
}