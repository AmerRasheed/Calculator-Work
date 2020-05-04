package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * Calculator Assignment
 *
 **/
public class App {

    public static float  enterNum1() {
        System.out.println("\nEnter number 1");
        float  enternum=0;
        float  value1 = ScannerClassCalling.scannerInteger(enternum);
        return value1;
    }

    public static float  enterNum2()
    {
        System.out.println("Enter number 2 ");
        float  enternum=0;
        //int value2 = validateInteger();
        float  value2 = ScannerClassCalling.scannerInteger(enternum);
        return value2;
    }

    public static float  addNum(float  a, float  b)
    { return a+b; }

    public static float  mulNum(float  a, float  b)
    { return a*b; }

    public static float  subNum(float  a, float  b)
    { return a-b; }

    public static float  divNum(float  a, float  b)
    { return a/b; }

    public static void callMenu()
    {
        System.out.println("Addition +               Multiplication *       Subtraction -            Division /\n");
    }

    public static char startOperation()
    {
        System.out.println("Enter the operation from the following operators\n");
        callMenu();
        char s2=' ';
        char input = ScannerClassCalling.scannerCharacter(s2);
        return input;
    }

    public static char permitOperationContinue()
    {
        char s3=' ';
        char Op = ScannerClassCalling.scannerCharacter(s3);
        return Op;
    }

    public static void calculateOperation(char permitvalue)
    {
        float  firstfloat = enterNum1();
        char inputOper = startOperation();

        switch (permitvalue) {
            case 'y':
                float  result = 0;
            {
                switch (inputOper) {
                    case '+':
                        result = addNum(firstfloat, enterNum2()); // Calling Add method
                        break;
                    case '*':
                        result= mulNum(firstfloat, enterNum2());  // Calling Multiply method
                        break;
                    case '-':
                        result = subNum(firstfloat, enterNum2()); // Calling Subtract method
                        break;
                    case '/':
                        result = divNum(firstfloat, enterNum2());  // Calling Divide method
                        break;
                    default:
                        System.out.println("You entered wrong value");
                } //switch statement operation selection
                System.out.println("The result is " + result);
            }// while loop bracket
            //System.out.println("Do you want to enter more operation ? ");
            //permit = permitOperationContinue();
            break;
            case 'n': {
                //running = false;
                System.out.println("You exit the loop");
                break;
            }
            default:
                System.out.println("You have made a wrong input. Try + * / - instead ");
        } //switch statement EXIT operation
    }
    public static void main(String[] args) {
        char permit = 'y';
        float  hogia=1;
        System.out.println("Hello!! Wellcome !! Here is my Calculator Assignment work");
        boolean running = true;
        while(running) {
            System.out.println("Do you want to enter operation (Press y ) or you want to exit the program .....(Press n)  (y/n)");
            permit = permitOperationContinue();
            if (hogia>=1 || permit == 'y')
            {
                if ((permit == 'n') || (permit=='N'))
                    running = false;
                else {
                    hogia++;     //If user require input for the second time selection menu
                    calculateOperation(permit);
                }//if running walee
            } //controlling hogia IF
            else running = false;
        }//While EXIT operation
    } //Main method
}//Public class App