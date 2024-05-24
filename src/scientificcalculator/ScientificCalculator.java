package scientificcalculator;
import java.util.Scanner;

abstract class Calculator {
    protected double result;

    public abstract void calculate();
}

class ArithmeticCalculator extends Calculator {
    private double num1, num2;

    public ArithmeticCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        
    }

    public double getnum1() {
        return num1;
    }

    public void setnum1(double num1) {
        this.num1 = num1;
    }

    public double getnum2() {
        return num2;
    }

    public void setnum2(double num2) {
        this.num2 = num2;
    }
}

class AdditionCalculator extends ArithmeticCalculator {
    public AdditionCalculator(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void calculate() {
        result = getnum1() + getnum2();
    }
}

class SubtractionCalculator extends ArithmeticCalculator {
    public SubtractionCalculator(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void calculate() {
        result = getnum1() - getnum2();
    }
}
class MultiplyCalculator extends ArithmeticCalculator {
    public MultiplyCalculator(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void calculate() {
        result = getnum1() * getnum2();
    }
}
class DivideCalculator extends ArithmeticCalculator{
    public DivideCalculator(double num1, double num2){
        super(num1, num2);
    }
    @Override
    public void calculate(){
        result = getnum1()/getnum2();
    }
}



class LogarithmCalculator extends Calculator {
    private double num3;

    public LogarithmCalculator(double num3) {
        this.num3 = num3;
    }

    @Override
    public void calculate() {
        
    }

    
    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }
}

class LogarithmBase10Calculator extends LogarithmCalculator {
    public LogarithmBase10Calculator(double num3) {
        super(num3);
    }

    @Override
    public void calculate() {
        result = Math.log10(getNum3());
    }
}

class LogarithmNaturalCalculator extends LogarithmCalculator {
    public LogarithmNaturalCalculator(double num3) {
        super(num3);
    }

    @Override
    public void calculate() {
        result = Math.log(getNum3());
    }
}

abstract class Trigonometric{
    public double angle;
    public double result;
    public abstract void calculation();
}

class Sin extends Trigonometric{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle.");
        angle=in.nextDouble();
        result=Math.sin(angle*3.14/180);
        System.out.println("Sin:"+result);
    }
}
class Cos extends Trigonometric{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle.");
        angle=in.nextDouble();
        result=Math.cos(angle*3.14/180);
        System.out.println("Cos:"+result);
    }
}
class Tan extends Trigonometric{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle.");
        angle=in.nextDouble();
        result=Math.tan(angle*3.14/180);
        if(result>10)
        {
            System.out.println("Tan:Infinite");
	}
	else
	{
            System.out.println("Tan: "+result);
	}
    }
}
class Cosec extends Trigonometric{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle.");
        angle=in.nextDouble();
        result=1/Math.sin(angle*3.14/180);
        if(result>10)
        {
            System.out.println("Cosec:Infinite");
	}
	else
	{
            System.out.println("Cosec: "+result);
	}
    }
}
class Sec extends Trigonometric{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle.");
        angle=in.nextDouble();
        result=1/Math.cos(angle*3.14/180);
        if(result>5||result<-5)
        {
            System.out.println("Sec:Infinite");
	}
	else
	{
            System.out.println("Sec: "+result);
	}
    }
}
class Cot extends Trigonometric{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the angle.");
        angle=in.nextDouble();
        result=1/Math.tan(angle*3.14/180);
        if(result>5||result<-5)
        {
            System.out.println("Cot:Infinite");
	}
	else
	{
            System.out.println("Cot: "+result);
	}
    }
}
interface Factorial{
    public abstract void calculation();
}
class Fac implements Factorial{
    @Override
    public void calculation(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find its Factorial");
        int num=in.nextInt();
        long fac=1;
        if(num<0){
            System.out.println("Negative number have no Factorial.");
        }
        else{
            for (int i=1;i<=num;i++){
                fac*=i;
            }
            System.out.println("Factorial of "+num+" is: "+fac);
        }
    }
}
abstract class Conversion{
    Scanner in=new Scanner(System.in);
    public double cm, inches, meters, calsius, fahrenheit;
    public abstract void convert();
}
class CmToInches extends Conversion{
    @Override
    public void convert(){
        System.out.println("Enter Lenght in centimeters.");
        cm=in.nextDouble();
        inches=cm/2.54;
        System.out.println(cm+" cm is equals to "+inches+" inches.");
    }
}
class InchesToMeter extends Conversion{
    @Override
    public void convert(){
        System.out.println("Enter Lenght in inches.");
        inches=in.nextDouble();
        meters=inches*0.0254;
        System.out.println(inches+" inches is equals to "+meters+" m.");
    }
}
class FahToCal extends Conversion{
    @Override
    public void convert(){
        System.out.println("Enter Temperature in Fahrenheit.");
        fahrenheit=in.nextDouble();
        calsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+" degrees Fahrenheit is equals to "+calsius+" degrees Calsius.");
    }
}
class CalToFah extends Conversion{
    @Override
    public void convert(){
        System.out.println("Enter Temperature in Calsius.");
        calsius=in.nextDouble();
        fahrenheit=(calsius*9/5)+32;
        System.out.println(calsius+" degrees Calsius is equals to "+fahrenheit+" degrees fahrenheit.");
    }
}
abstract class Average{
    public abstract void calculate();
}
 class Av extends Average{
@Override

     public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values you want to find the average of:");
        int numberofvalues = sc.nextInt();
        
        if (numberofvalues < 2) {
            System.out.println("Enter at least 2 numbers.");
            return;
        }
        
        double sum = 0;
        for (int i = 1; i <= numberofvalues; i++) {
            System.out.println("Enter value " + i + ":");
            double a = sc.nextDouble();
            sum += a;
        }
        
        double result = sum / numberofvalues;
        System.out.println("The average is: " + result);
    }
}

 abstract class Percentage {
    public abstract void calculate();
 }
 class Percent extends Percentage{
    @Override 
    public  void calculate(){
         
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter part value.");
    double a=sc.nextDouble();
    System.out.println("Enter total value.");
    double b=sc.nextDouble();
    if(b==0){
        System.out.println("Total value cannot be zero.");
    }
    else {
        double result=(a/b)*100;
        System.out.println("Percentage of given number is : "+result);
    }
    }   
}

abstract class Squareroot {
    public abstract void calculate();
        
    }
class Sqrt extends Squareroot{
@Override
public void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to perform its square root.");
        double a=sc.nextDouble();
        if(a<1){
            System.out.println("No square root of negative number enter positive number.");
        }
        else {
           double result=Math.sqrt(a);
            System.out.println("Square root of " + a + " is: " + result);
        }
}
    
}      

abstract class Power {
   
    public abstract void calculate();
        }

class Po extends Power{

@Override
    public void calculate(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base number." );
        double a=sc.nextDouble();
        System.out.println("Enter a exponent number.");
        double b=sc.nextDouble();
         double result=Math.pow(a,b);
        System.out.println("Power of "+a +" is : "+result);
    }}

abstract class Square{
    abstract void calculatesqr();
}

class sqr extends Square{
    @Override
    void calculatesqr(){
       double num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number to find its Square: ");
       num = sc.nextDouble();
       double result = num*num;
       System.out.println("Square of "+num+" is: "+result);
   }
}

abstract class Cube{
   abstract void calculatecube();
}
class Cb extends Cube{
    @Override
    void calculatecube(){
       double num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number to find its Cube: ");
       num = sc.nextDouble();
       double result = num*num*num;
       System.out.println("Cube of "+num+" is: "+result);
   }
}

abstract class CubeRoot{
   abstract void calculatecbrt();
}
class Cbrt extends CubeRoot{
    @Override
    void calculatecbrt(){
       double num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number to find its Cube Root: ");
       num = sc.nextDouble();
       double result = Math.cbrt(num);
       System.out.println("Cube Root of "+num+" is: "+result);
   }
}
public class ScientificCalculator {
    public static void main(String[] args) {
        System.out.println(" ______________________________________________________");
        System.out.println("|                                                      |");
        System.out.println("|            Scientific Calculator Created by          |");
        System.out.println("|       Mir Ahmad Shah, Subhan Ahmed and M.Zeeshan     |");
        System.out.println("|______________________________________________________|");
        Scanner scanner = new Scanner(System.in);
        Scanner in=new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter 'A' for Arithmetic calculations.");
            System.out.println("Enter 'L' for Logarithmic calculations.");
            System.out.println("Enter 'T' for Trignometric calculations.");
            System.out.println("Enter 'F' for Factorial.");
            System.out.println("Enter 'C' for Conversions.");
 	    System.out.println("Enter 'M' to perform Average of values");
            System.out.println("Enter 'P' to perform Percentage");
            System.out.println("Enter 'S' to perform Square root");
	    System.out.println("Enter 'V' to perform Cube Root");
            System.out.println("Enter 'O' to perform Power");
	    System.out.println("Enter 'W' to perform Square");
	    System.out.println("Enter 'B' to perform Cube");
            System.out.println("Enter 'E' to Exit.");
            
            System.out.println("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (Character.toUpperCase(choice)) {
                case 'A':
                    System.out.println("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Enter operation (+, -, *, /): ");
                    char operation = scanner.next().charAt(0);

                    ArithmeticCalculator calculator = null;
                    switch (operation) {
                        case '+':
                            calculator = new AdditionCalculator(num1, num2);
                            break;
                        case '-':
                            calculator = new SubtractionCalculator(num1, num2);
                            break;
                        
                        case '*':
                            calculator = new MultiplyCalculator(num1, num2);
                            break;
                        case '/':
                            calculator = new DivideCalculator(num1, num2);
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }

                    if (calculator != null) {
                        calculator.calculate();
                        System.out.println("Result: " + calculator.result);
                    }
                    break;
                case 'T':
                    
                    System.out.println("Enter 1 for Sine.");
                    System.out.println("Enter 2 for Cos.");
                    System.out.println("Enter 3 for Tan.");
                    System.out.println("Enter 4 for Cosec.");
                    System.out.println("Enter 5 for Sec.");
                    System.out.println("Enter 6 for Cotan.");
                   
                    int cho=in.nextInt();
                    switch(cho){
                        case 1:
                            Sin s=new Sin();
                            s.calculation();
                            break;
                        case 2:
                            Cos c=new Cos();
                            c.calculation();
                            break;
                        case 3:
                            Tan t=new Tan();
                            t.calculation();
                            break;
                        case 4:
                            Cosec o=new Cosec();
                            o.calculation();
                            break;
                        case 5:
                            Sec e=new Sec();
                            e.calculation();
                            break;
                        case 6:
                            Cot n=new Cot();
                            n.calculation();
                            break;
                        default:
                            System.out.println("Invalid Input.");
                    }
                    break;
                case 'C':
                    //Scanner =new Scanner(System.in);
                    System.out.println("Enter 1 for cm to inches.");
                    System.out.println("Enter 2 for inches to meters.");
                    System.out.println("Enter 3 for Celsius to Fahrenheit.");
                    System.out.println("Enter 4 for Fahrenheit to Celsius.");
                    int choise=in.nextInt();
                    switch(choise){
                        case 1:
                            CmToInches c=new CmToInches();
                            c.convert();
                            break;
                        case 2:
                            InchesToMeter i=new InchesToMeter();
                            i.convert();
                            break;
                        case 3:
                            CalToFah t=new CalToFah();
                            t.convert();
                            break;
                        case 4:
                            FahToCal f=new FahToCal();
                            f.convert();
                            break;
                        default:
                            System.out.println("Invalid Input.");
                    }
                    break;
                    
                case 'L':
                    System.out.println("Enter 'N' for Natural logarithm (ln).");
                    System.out.println("Enter 'T' for Base 10 logarithm (log).");
                    char logChoice = scanner.next().charAt(0);
                    System.out.print("Enter number: ");
                    double number = scanner.nextDouble();

                    LogarithmCalculator logCalculator = null;
                    switch (Character.toUpperCase(logChoice)) {
                        case 'N':
                            logCalculator = new LogarithmNaturalCalculator(number);
                            break;
                        case 'T':
                            logCalculator = new LogarithmBase10Calculator(number);
                            break;
                        
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }

                    if (logCalculator != null) {
                        logCalculator.calculate();
                        System.out.println("Result: " + logCalculator.result);
                    }
                    break;
                case 'F':
                    Fac f=new Fac();
                    f.calculation();
                    break;
                case 'M':
                    Av a=new Av();
                    a.calculate();
                    break;
                    
               
                case 'P':
                    Percent p=new Percent();
                    p.calculate();
                    break;
                
                case 'S':
                Sqrt sq=new Sqrt();
                sq.calculate();
                break;
                
                case 'O':
                    Po u=new Po();
                    u.calculate();
               break;
               
                case 'V':
                    Cbrt cb=new Cbrt();
                    cb.calculatecbrt();
                    break;
                   
                case 'W':
                    sqr s=new sqr();
                    s.calculatesqr();
                    break;
                    
                 case 'B':
                    Cb c=new Cb();
                    c.calculatecube();
                    break;
                    
                case 'E':
                    System.out.println("Exiting the calculator.");
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
