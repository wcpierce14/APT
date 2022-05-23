/*
Write code to find which of the strands representing DNA in an array String[] strand representing strands of DNA has the 
most occurrences of the nucleotide represented by parameter nuc.
If more than one strand has the same maximal number of the specified nucleotide you should return the longest strand with 
the maximal number. All DNA strands have different lengths in this problem so the maximal strand will be unique when length 
is accounted for. Return this uniquely maximal strand.
Each String representing a DNA strand will contain only cytosine, guanine, thymine, and adenine, represented by the 
characters 'c', 'g', 't', and 'a', respectively. If no strand in the array contains the specified nucleotide return the 
empty string "".
*/

public class DNAMaxNucleotide {
 public String max(String[] strands, String nuc) {

    int i;
    int k;
    String hold = new String();
    int [] tempIndex = new int[strands.length];
    String [] tempIndexWords = new String[strands.length];

    // Create a temporary index with the count of nuc in each strand
    for(i = 0; i < strands.length; i++) {
        for(k = 0; k < strands[i].length(); k++) {
            hold = String.valueOf(strands[i].charAt(k));
            if(hold.equals(nuc)) {
                tempIndex[i] += 1;
            } 
            else {
                tempIndex[i] += 0;
            }
        }
     }
     // Find the max value in tempIndex
     int maxVal = tempIndex[0];
     for(i = 1; i < tempIndex.length; i++) {
         if(tempIndex[i] > maxVal) {
             maxVal = tempIndex[i];
         }
     } 
     // Replace all strings that do not have the maxVal of nuc with ""
     for(i = 0; i < tempIndex.length; i++) {
        if(tempIndex[i] != maxVal) {
            tempIndexWords[i] = "";
        }
        else {
            tempIndexWords[i] = strands[i];
        }
    }
    // If no words contain nuc, make every string ""
     for(i = 0; i < tempIndexWords.length; i++) {
         if(maxVal == 0) {
             tempIndexWords[i] = "";
         }
     }

     // Find the output by iterating to find the longest string
     int index = 0;
     int maxLength = tempIndexWords[index].length(); 
     for(i = 0; i < tempIndexWords.length; i++) {
         if(tempIndexWords[i].length() > maxLength) {
             maxLength = tempIndexWords[i].length();
             index = i;
         }
        }
    return tempIndexWords[index];
    }
}


 