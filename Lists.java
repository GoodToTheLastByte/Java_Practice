package Exercism;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    private final List<String>  languageListTwo= new ArrayList<>(List.of("Java","C","C++"));
    public static void main(String[] args){



        // Create an ArrayList of Characters
        List<Character> vowels = new ArrayList<>(List.of('a','e','i','o','i','e', 'a'));

        // List method for size
        int startingSize = vowels.size(); 

        // Create List of Strings to hold languages
        List<String> languageList = new ArrayList<>(List.of("Java", "Kotlin"));
        
        //System.out.println(languageList.get(1));


        // Is List Empty
       System.out.println((languageList));


       // Add two additional languages to out String Array
       addLanguage(languageList, "Python");
       addLanguage(languageList, "PHP");
       addLanguage(languageList, "Cobol");
       
       //System.out.println(languageList.size());

        // Removed PHP, and cobol
        removeLanguage(languageList,"Cobol");
        removeLanguage(languageList, "PHP");
        
        
        //System.out.println(languageList.size());

        // Displays first language
        String firstLanguage = languageList.get(0);
        System.out.println(firstLanguage);

        // Display count size
        System.out.println(count(languageList));

        // Contains Language
        System.out.println(languageList.contains("Java"));
        
        // isExciting
        System.out.println(isExciting(languageList)); 



    }
    
    public static boolean isListEmpty(List<String> languageList){return languageList.isEmpty();}

    public static void addLanguage(List<String> languageList, String language){languageList.add(language);}

    public static void removeLanguage(List<String> languageList, String language){languageList.remove(language);}

    public String firstLanguage(List<String> languageList){return languageList.get(0);}

    public static int count(List<String> languageList){return languageList.size();}

    public boolean containsLanguage(List<String> languageList, String language){return languageList.contains(language);}

    public static boolean isExciting(List<String> languageList){return languageList.contains("Java") && languageList.contains("Kotlin");}
}
