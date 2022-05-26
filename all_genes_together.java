
/**
 * Write a description of all_genes_together here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class all_genes_together {
    
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

public void find_all_genes(String check_dna)
{
    
    String gene="temporary";
    int give_me_start=0;int counter=-1;
    while(gene!="")
    {
        gene=intermediate_test(check_dna,give_me_start);
        System.out.println(gene);
       
        give_me_start=min_1+3;
        counter=counter+1;
    }
    System.out.println("no of genes"+counter);
}

    
public void testonfile()
{
    FileResource fr=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\GRch38dnapart.fa");// always define new variable for FileResource class as one variabe can work only once
    String dnafromfile=fr.asString();
    find_all_genes(dnafromfile);
     System.out.println("                NEW             DNA                 FILE                ");
    FileResource fr1=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\mansmall.fa"); // double \ used because \ is an excape character so to represent it we have to use one extra \ character
    dnafromfile=fr1.asString();
    find_all_genes(dnafromfile);
    System.out.println("                NEW                 DNA             FILE            ");
    FileResource fr2=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\brca1line.fa");
    dnafromfile=fr2.asString();
    find_all_genes(dnafromfile);
    System.out.println("                NEW                 DNA             FILE            ");
    FileResource fr3=new FileResource("C:\\Users\\varda\\Downloads\\JAVA DUKE AND SD\\dna\\dna\\Axl2p.fa");
    dnafromfile=fr3.asString();
    find_all_genes(dnafromfile); 
  
    
}
}
   
                
            
              
                   
         
     

