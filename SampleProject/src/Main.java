import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("동물농장에 오신것을 환영 합니다!");
         System.out.println("1을 입력하면 추가, 2를 입력하면 조회,3을 입력하면 수정, 4를 입력하면 삭제 입니다. : ");
         Scanner sc = new Scanner(System.in);
         int command = sc.nextInt();
         
         if(command == 1) {
        	 
         }else if (command == 2) {
             System.out.println("조회할 동물의 종류를 말씁해주세요(1: 닭, 2: 돼지");
             int species = sc.nextInt();
         }else if
     }
} 


     private static class Chicken {
    	 String name;
    	 int age;
    	 boolean isAlive
     }