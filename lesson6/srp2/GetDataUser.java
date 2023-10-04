package Study_2.ООП.homework.lesson6.srp2;

import java.util.Scanner;

public class GetDataUser {
    
    private Scanner scanner = new Scanner(System.in);

    public String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

}
