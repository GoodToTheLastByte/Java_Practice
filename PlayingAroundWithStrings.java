package Exercism;

public class PlayingAroundWithStrings {
    public static void main(String[] args){
        String c = "abc".substring(0,1);

        System.out.println(c); //should be 'bc'

        String message = "      This is my message line ...         ";
        
        System.out.println(message); 
        
        System.out.println(message.strip());

        String logMessage = "[INFO]: This is a line of information as a message ...      ";
        
        String splitLogMessage[] = logMessage.split(":");
        
        String logLevel = splitLogMessage[0];
        
        logLevel = logLevel.substring(1,logLevel.length()-1);
        logLevel = logLevel.toLowerCase(); 
        
        System.out.println(logLevel);
        System.out.println("============================"); 
        
        System.out.println(splitLogMessage.length);
        System.out.println(splitLogMessage[0]);
        System.out.println(splitLogMessage[1]);
        
        System.out.println("==========================");
        
        String newMessage = "";
        newMessage = newMessage.format("%s | %s",splitLogMessage[1],logLevel);
        
        System.out.println(newMessage); 
        
        System.out.printf("%s | (%s) ",splitLogMessage[1],logLevel);
        

    }
}
