/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 4;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
       // Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
       // String tweeterName = keyboard.nextLine();
       newTweet(tweets);
        getCurrentTimeStamp(tweets);
    }
    
    
   public static String getCurrentTimeStamp(String [] tweets){
 
     String  date="";
    
               
           
           String pattern = "EEEEE dd MMMMM yyyy hh:mm:ss.SSSZ";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

 date = simpleDateFormat.format(new Date());
//System.out.println(date);
           
           
                
            

        
        
        
       return date;
    }
   
   public static void newTweet(String []tweets){  
      
       Scanner keyboard = new Scanner(System.in);
        String tweeterName = keyboard.nextLine();
         System.out.println("Nice to meet you " + tweeterName + "!");
         System.out.println("Enter your tweets and I will add them to your timeline!");
       int numTweets = 0;
        String [] allTimeFrames=new String[MAX_NUMBER_TWEETS];
        
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            tweets[numTweets] = keyboard.nextLine();
            allTimeFrames[numTweets]=getCurrentTimeStamp(tweets);
            System.out.println(allTimeFrames[numTweets]);
            numTweets++;
           
        }    
        System.out.println(numTweets);
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i]+ "  "+allTimeFrames[i]);
                
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1)){
                System.out.println("Enter your next tweet:");
        
        }
        System.out.println("Your twitter feed is full");
       
       
       
       
       
       
   }
   
   
   
   
   
   
}


