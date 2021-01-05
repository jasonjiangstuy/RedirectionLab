public class PigLatin {
    public static void main(String[] args) {
        
    }

    public static String pigLatinSimple(String s){//Given a single word of at least 1 character:
        // if (s.length() >= 1){ 
            if (s.charAt(0) == 'a'|| s.charAt(0) == 'e'|| s.charAt(0) == 'i'|| s.charAt(0) == 'o'|| s.charAt(0) == 'u'){
                s += "hay";
            }
            else{
                s += s.charAt(0);
                s = s.substring(1, s.length());
                s += "ay";
            }
            
        // }
        s.toLowerCase();
        return s;
    }
    public static String pigLatin(String s){
        //Words that start with any digraph (list included for your convenience) move the first two letters to the end, and add 'ay'
        String[] Digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        boolean wasEdited = false;
        for (String i : Digraph){
            if (s.substring(0, 2).equals(i)){
                s += s.substring(0, 2);
                s = s.substring(2, s.length());
                s += "ay";
                wasEdited = true;
                break;
            }
        }

        if ((s.charAt(0) == 'a'|| s.charAt(0) == 'e'|| s.charAt(0) == 'i'|| s.charAt(0) == 'o'|| s.charAt(0) == 'u') && !wasEdited){
            s += "hay";
            wasEdited = true;
        }
        if (!wasEdited){
            s += s.charAt(0);
            s = s.substring(1, s.length());
            s += "ay";
        }
        return s;
    }
}
