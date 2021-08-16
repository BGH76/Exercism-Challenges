import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        int seqStart = 0;
        int seqEnd = 3;
        ArrayList<String> myList = new ArrayList();
        ArrayList<String> inputList = new ArrayList();
        HashMap<String, String> data = new HashMap<>();

        data.put("AUG", "Methionine");
        data.put("UUU", "Phenylalanine");
        data.put("UUC", "Phenylalanine");
        data.put("UUA", "Leucine");
        data.put("UUG", "Leucine");
        data.put("UCU", "Serine");
        data.put("UCC", "Serine");
        data.put("UCA", "Serine");
        data.put("UCG", "Serine");
        data.put("UAU", "Tyrosine");
        data.put("UAC", "Tyrosine");
        data.put("UGU", "Cysteine");
        data.put("UGC", "Cysteine");
        data.put("UGG", "Tryptophan");
        data.put("UAA", "STOP");
        data.put("UAG", "STOP");
        data.put("UGA", "STOP");

        for(int i=0; i<rnaSequence.length(); i+=3){
            inputList.add(rnaSequence.substring(seqStart, seqEnd));
            seqStart += 3;
            seqEnd +=3;
        }
        for(String rna : inputList){
            if(data.get(rna) == "STOP"){
                break;
            }else{
                myList.add(data.get(rna));
            }
        }
        return myList;
    }
}





