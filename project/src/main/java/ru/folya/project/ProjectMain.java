package ru.folya.project;
   import  java.util.Scanner;
public class practice {
    static Scanner scanner = new Scanner (System.in);
    public static void main (String [] args) {
    int num1 = getInt();
    int num2 = getInt();
    char operation = getOperation ();
    int result = calc (num1,num2,operation);
    System.out.println ("Operation result: " +result)}
}
    public static int getInt() {
    System.out.println("Enter number:");
    int num;
    if (scanner.hasNextInt ())){
    num=scanner.nextInt();
            }else{
    System.out.println ("Error! incorect number")}
            num = getInt();
}
            return num;
}

public static char getOperation (){
    System.out.println("Enter operation");
    char operation;
    if (scanner.hasNext()) }
        operation = getopertaion();
        }
        return operation;
        }
public static int cacl(int num1, int num2, char operation) {
     int result;
     switch (operation){
        case'+';
        result+num1+num2;
        break;
        case'-';
        result+num1-num2;
        break;
        case'*';
        result+num1*num2;
        break;
        case'/';
        break;
default:
        System.out.prinln("Operation not true. Enter number.");
        result=cacl(num1,num2,getOperation()); //recursion
        }
        return result:
        }
        }
        }
