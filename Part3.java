
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
public boolean twoOccurences(String stringa,String stringb) // return type is boolean
{
    boolean bool=false;
    int pos=stringb.indexOf(stringa);//check for 1st occurence
    if (pos!=-1)
    {
        int pos1=stringb.indexOf(stringa,pos+1); //check for 2nd occurence(note that pos+! is included in searching and not excluded)
        if (pos1!=-1)
        {
            bool=true;
        }
        else
        {
            bool=false;
        }
    }
    return bool;
}

public void testing()
{
    String b1="i am good boy am";
    String a1="am";
    boolean check1=twoOccurences(a1,b1);
    System.out.println(check1);
    String b2="how are you";
    String a2="how are";
    boolean check2=twoOccurences(a2,b2);
    System.out.println(check2);
    System.out.println("the part of the string after"+" "+a1+" "+"is "+lastPart(a1,b1));
    System.out.println("the part of the string after"+" "+a2+" "+"is "+lastPart(a2,b2));
}
public String lastPart(String stringa,String stringb)
{
    String word="";
    int len1=stringa.length();
    int len2=stringb.length();
    int pos=stringb.indexOf(stringa);
    if (pos==-1)
    {
        word=stringb;
    }
    else
    {
    word=stringb.substring(pos+len1);//if we don't add len1,then whole stringa excluding its first character will also be printed but we don't want the whole stringa
}
return word;
    
}
}
    
    