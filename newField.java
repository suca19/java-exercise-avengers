
public class newField {
    public static void main() {
      
        int b =1;
        int maxNumber = 200;
        String fibonacci = "";
        
        for(int a=1; a<=maxNumber; a=b+a) {
            fibonacci = fibonacci + b + "," + a + ",";
            b=a+b;
        }
        
        fibonacci = b < maxNumber ? fibonacci + b : fibonacci;
        
        //Print
        System.out.println("Fibonacci: " + fibonacci);
    }
}