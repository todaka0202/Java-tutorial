import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("簡単な計算機へようこそ！");

    System.out.print("最初の数値を入力してください");
    double num1 = scanner.nextDouble();

    System.out.print("演算子を入力してください (+, -, *, /):");
    char operator = scanner.next().charAt(0);

    System.out.print("二番目の数値を入力してください");
    double num2 = scanner.nextDouble();

    double result = 0.0;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if(num2 != 0){
          result = num1 / num2;
        } else {
          System.out.println("0で割ることはできません");
          scanner.close();
          return;
        }
        break;
    
      default:
        System.out.println("エラー：無効な演算子です");
        scanner.close();
        break;
    }

    System.out.println(num1 + "" + operator + "" + num2 + "=" + result);

    scanner.close();
  }
}