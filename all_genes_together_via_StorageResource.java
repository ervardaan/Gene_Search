
/**
 * Write a description of all_genes_together_via_StorageResource here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class all_genes_together_via_StorageResource {


    
   int pos_start=0;int pos_end=0; 
   String dna2="";int check1=0;int check3=0;int check2=0;int min_1=0;
public int get_codon_position(String dna1,String start_c,String stop_c,int question2_start)
{
     pos_start=dna1.indexOf("ATG",question2_start);
       pos_end=pos_start;
      while(pos_end!=-1)
      {
          pos_end=dna1.indexOf(stop_c,pos_end+3);
          if((pos_end-pos_start)%3==0 && pos_end!=-1)
          {
              break;}
            }
            return pos_end;
        }
public String intermediate_test(String dna0,int question1_start)
{
    dna2=dna0;
    check1=get_codon_position(dna2,"ATG","TAA",question1_start);
    check2=get_codon_position(dna2,"ATG","TAG",question1_start);
    check3=get_codon_position(dna2,"ATG","TGA",question1_start);
   if (check1==-1){
       if(check2==-1){
           min_1=check3;}
        else{
           if(check3==-1){
               min_1=check2;}
           else{
               min_1=Math.min(check3,check2);}}}
    else{
        if(check2==-1){
            if(check3==-1){
                min_1=check1;}
            else{
                min_1=Math.min(check3,check1);}}
        else{
            if(check3==-1){
                min_1=Math.min(check1,check2);}
            else{
                min_1=Math.min(Math.min(check1,check2),check3);}}}
    if(min_1 !=-1){
        return dna2.substring(pos_start,min_1+3);}
        else{
            return "";}
}

public StorageResource find_all_genes(String check_dna)
{
    check_dna.toUpperCase();
    StorageResource sr=new StorageResource();
    String gene="temporary";
    int give_me_start=0;int counter=-1;
    while(gene!="")
    {
        gene=intermediate_test(check_dna,give_me_start);
        
        sr.add(gene);
        give_me_start=min_1+3;
        counter=counter+1;
    }
    return sr;
}
/* A METHOD DIRECTLY COPIED FROM CLASS STRING_IN_STRING WHICH FINDS THE NO OF INSTANCES OF A STRING A IN STRING B */
public int countCTG(String stringa,String stringb)
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
}
public int CGRATIO(String question_gene)
{
    question_gene.toLowerCase();
    int c_Count=countCTG("c",question_gene);
    return c_Count;}
public void testonfile()
{
    //trying to find all instances of CTG iin dna string
    FileResource fr=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\GRch38dnapart.fa");// always define new variable for FileResource class as one variabe can work only once
    String dnafromfile=fr.asString();
    StorageResource new_sr=find_all_genes(dnafromfile);
    
    for(String find:new_sr.data())
    {
        System.out.println(find);
    }
     System.out.println("                NEW             DNA                 FILE                ");
    FileResource fr1=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\mansmall.fa"); // double \ used because \ is an excape character so to represent it we have to use one extra \ character
    dnafromfile=fr1.asString();
    StorageResource new_sr2=find_all_genes(dnafromfile);
    
    for(String find2:new_sr2.data())
    {
        System.out.println(find2);}
    System.out.println("                NEW                 DNA             FILE            ");
    FileResource fr2=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\brca1line.fa");// doesn't produce any genes
    dnafromfile=fr2.asString();
    StorageResource new_sr3=find_all_genes(dnafromfile);
    
    for(String find3:new_sr3.data())
    {
        System.out.println(find3);}
    System.out.println("                NEW                 DNA             FILE            ");
    FileResource fr3=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\Axl2p.fa");// doesn't produce any genes
     dnafromfile=fr3.asString();
    
    StorageResource new_sr4=find_all_genes(dnafromfile); 
    
    for(String find4:new_sr4.data())
    {
        System.out.println(find4);}
    
    
}

}

