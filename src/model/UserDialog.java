package model;
import java.util.Scanner;

/*
*
* Opretter bruger dialog med Scanner klassen til forskellige data typer.
*
 */

public class UserDialog {
    Scanner input = new Scanner(System.in);

    protected String stringDialog(String question){
        System.out.print(question+": ");
        return input.nextLine();
    }


    protected double doubleDialog(String question){
        System.out.print(question+": ");
        return input.nextDouble();
    }

    protected boolean booleanDialog(String question){
        System.out.print(question+": ");
        String str = input.nextLine().toLowerCase();
        return str.contains("yes") || str.contains("y") || str.contains("ja") || str.contains("true");
    }
}
