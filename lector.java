import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lector {

    public static int conversor (String string, int num){
        try{
            num = Integer.parseInt(string);
        }catch(NumberFormatException e){
            num = 0;
        }
        return num;
    }

  
}
