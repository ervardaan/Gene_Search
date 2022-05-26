
/**
 * Write a description of String_in_String here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class String_in_String {
public int howMany(String stringa,String stringb)
{
    
    int lena=0;
    int pos=0;
    int c=0;
    while(pos!=-1)
    {
        pos=stringb.indexOf(stringa,pos+lena);
        lena=stringa.length();
        c=c+1;
}
return c-1;// WE SUBSTRACT 1 BECAUSE THE LOOP RUNS AT LEAST ONCE AND EVEN IF POS BECOMES -1 IN THE FIRST RUNNING OF THE LOOP, C STILL BECOMES 1 WHEN IT SHOULD ACTUALLY BE 0-SO C IS ALWAYS GREATER THAN THE ACTUAL ANSWER BY 1
}}
