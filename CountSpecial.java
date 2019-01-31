import java.io.*;
 public static void CountSpecial(String userInput)
 {
   if (userInput == null || userInput.trim().isEmpty()) 
   {
     return ;
   }
    int countSpecial = 0;
      for (int i = 0; i < userInput.length(); i++)
      {
        if (userInput.substring(i, i+1).matches("[^A-Za-z0-9]")) 
        {
          countSpecial++;
        }

      }
      System.out.println(+ countSpecial);
 }
