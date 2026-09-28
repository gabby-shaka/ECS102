public class MethodTracer
{
   public int calculate(int score)
   {
      score = score * 2;
      return score + 5;
   }
 
   public void displayResult(int finalValue)
   {
      System.out.println("Result: " + finalValue);
   }
 
   public int process(int points)
   {
      calculate(points);
      return points;
   }
   public class Main
{
public static void main(String[] args){
MethodTracer tracer = new MethodTracer();
int initial = 10;
int outcome = tracer.process(initial);
tracer.displayResult(outcome);
}
}
}