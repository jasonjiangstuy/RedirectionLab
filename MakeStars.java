import java.util.*;
public class MakeStars{
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in );
        while(n.hasNextLine()){
            String x = n.nextLine();
            String output = "";
            for (String i : x.trim().split("\\s+")){
                for (int j = 0; j < i.length(); j++){
                    output += "*";    
                }
                output += " ";
            }
            if (output.length() > 0){
                output = output.substring(0, output.length() - 1);
            }
            System.out.println(output);
        }
    }
}