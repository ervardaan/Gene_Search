
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class Part4 {
public void readHTML()
{
    URLResource ur=new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
    for (String collect:ur.words())
    {
        collect.toLowerCase();
        // note that whole address of a webpage is a single word-a word is defined by spaces and so until a space is encountered,even a paragraph is one word.
       int p1=collect.indexOf("youtube.com");
      if(p1!=-1)
      {
          int q1=collect.indexOf("\"");
          int q2=collect.lastIndexOf("\"");
          String link=collect.substring(q1,q2+1);
          System.out.println(link);}
          
     
}
}
}
