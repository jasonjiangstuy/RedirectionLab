import java.util.*;
public class PigLatin {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in );
        while(n.hasNextLine()){
            String x = n.nextLine();
            String output = "";
            for (String i : x.trim().split("\\s+")){
                
                output += pigLatinBest(i) + " ";
            }
            if (output.length() > 0){
                output = output.substring(0, output.length() - 1);
            }
            System.out.println(output);
        }
        n.close();
    }

    public static String pigLatinSimple(String s){//Given a single word of at least 1 character:
        s = s.toLowerCase();
        if (s.length() >= 1){ 

            if (s.charAt(0) == 'a'|| s.charAt(0) == 'e'|| s.charAt(0) == 'i'|| s.charAt(0) == 'o'|| s.charAt(0) == 'u'){
                s += "hay";
            }
            else{
                s += s.charAt(0);
                s = s.substring(1, s.length());
                s += "ay";
            }
            
        }else{
            s += s.charAt(0);
            s = s.substring(1, s.length());
            s += "ay";
        }

        return s;
    }
    public static String pigLatin(String s){

        s = s.toLowerCase();
        //Words that start with any digraph (list included for your convenience) move the first two letters to the end, and add 'ay'
        String[] Digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        boolean wasEdited = false;
        if (s.length() >= 2){
            for (String i : Digraph){
                
                if (s.substring(0, 2).equals(i)){
                    s += s.substring(0, 2);
                    s = s.substring(2, s.length());
                    s += "ay";
                    wasEdited = true;
                    break;
                }
                                
            }
        }
        if (!wasEdited){
            s = pigLatinSimple(s);
        }
        return s;
    }

    public static String pigLatinBest(String s){
        s = s.toLowerCase();
        if (97 <= (int)s.charAt(0) && (int)s.charAt(0) <= 122){ // if first char is a letter
            if (!((97 <= (int)s.charAt(s.length() - 1) && (int)s.charAt(s.length() - 1) <= 122) || (48 <= (int)s.charAt(s.length() - 1) && (int)s.charAt(s.length() - 1) <= 57))){
                //not a letter or number
                char hold = s.charAt(s.length() - 1);
                s = s.substring(0, s.length() - 1);
                s = pigLatin(s);
                s += hold;
            }
            else{
                s = pigLatin(s);
            }
        }
        // else do nothing
        return s;
            
    }
}
