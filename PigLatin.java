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
                s = s.substring(0, 1);
                s += "ay";
            }
            
        // }
        s.toLowerCase();
        return s;
    }
}
