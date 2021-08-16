import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Scrabble {

        char[] ar;

    Scrabble(String word) {
        this.ar = word.toLowerCase().toCharArray();

    }

    int getScore() {
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("aeioulnrst", 1);
        hs.put("dg", 2);
        hs.put("bcmp", 3);
        hs.put("fhvwy", 4);
        hs.put("k", 5);
        hs.put("jx", 8);
        hs.put("qz", 10);
        int num = 0;

        for(int i = 0; i < ar.length; i++){
            for(Map.Entry mapElement : hs.entrySet()){
                if(mapElement.getKey().toString().contains(String.valueOf(ar[i]))){
                    num += Integer.valueOf((Integer) mapElement.getValue());

                }
            }
        }
        return num;
    }



}
