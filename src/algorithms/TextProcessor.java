package algorithms;

public class TextProcessor {
    public static void main (String [] args){
        //countWords("I Love Test Automation University");
        //reverseSettence("I Love Test Automation University");

        addSpaces("HeyWorld!It´sMeAngie");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numWords = words.length;

        String message = String.format("Your text contains %d words:", numWords);

        System.out.println(message);

        for (String i : words ){
            System.out.println(i);
        }
    }

    public static void reverseSettence(String text){

        for(int i =text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for(int i =0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
