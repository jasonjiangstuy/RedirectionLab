public class Tester {
    public static void main(String[] args) {
        String[] simple1 = {"mock", "pie", "david", "aaron", "a"};
        String[] simple2 = {"ockmay", "iepay", "avidday","aaronhay", "ahay"};
        for (int i = 0; i < simple1.length; i ++){
            System.out.println(PigLatin.pigLatinSimple(simple1[i]).equals(simple2[i]));
        }
        
        String[] ok1 = {"the", "check", "skee", "emu", "grade", "th", "a"};
        String[] ok2 = {"ethay", "eckchay", "eeskay","emuhay", "adegray", "thay", "ahay"};
        for (int i = 0; i < ok1.length; i ++){
            if (PigLatin.pigLatin(ok1[i]).equals(ok2[i])){
                System.out.println("true");    
            }
            else{
                System.out.println("false" + PigLatin.pigLatin(ok1[i]));
            }
        }
        String[] final1 = {"*emu", "4chan", "fish!", "fish", "the.", "cat!", "amazing?", "apple%", "Science!", "poet's"};
        String[] final2 = {"*emu", "4chan", "ishfay!","ishfay", "ethay.", "atcay!", "amazinghay?", "applehay%", "iencescay!", "oet'spay"};
        for (int i = 0; i < final1.length; i ++){
            if (PigLatin.pigLatinBest(final1[i]).equals(final2[i])){
                System.out.println("true");    
            }
            else{
                System.out.println("false" + final1[i]+ PigLatin.pigLatinBest(final1[i]));
            }
        }
    }
}
