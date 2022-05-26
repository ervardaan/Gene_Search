import java.*;
/**
 * Write a description of three_Codon_gene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class three_Codon_gene {
public int findvalidgene(String dna,int position,String cod)
{
    
    int pos2=position;//share same values and not point to same object
    int pos=0;
    boolean check=false;
    while (pos!=-1 && check==false)
    {
        pos=dna.indexOf(cod,position+1);
        if ((pos-pos2)%3==0)
        {
            check=true;
            
}


    position=pos;
}
/* if (pos!=-1)
{
return pos;
}
else{
    return dna.length();//we did this so that when we compare three pos values,we don't take -1 value as the minimum  which will change our result and actually we will get a dna with no valid gene
}
*/
return pos;}
public void testmethod()
{
   String given_dna= "ATGCGATAAGCATAGACGTGACG";
    
    
    int getposition1=findvalidgene(given_dna,0,"TAA");
     int getposition2=findvalidgene(given_dna,0,"TAG");
      int getposition3=findvalidgene(given_dna,0,"TGA");
      
/* int min_position=Math.min(Math.min(getposition1,getposition2),getposition3);
System.out.println(given_dna.substring(0,min_position+3)); */
int min_index=0;
if(getposition1!=-1 && getposition2>getposition1)
{
    min_index=getposition1;}
    else{
        min_index=getposition2;}
if(min_index==-1 || (getposition3!=-1 && getposition3<min_index))
{
   min_index=getposition3;} 
if(min_index!=-1)
{
 System.out.println(given_dna.substring(0,min_index+3));}   
else{
    System.out.println(given_dna);}
    

}
}

