public class Hamming {

    char[] left;
    char[] right;
    public Hamming(String leftStrand, String rightStrand) {

        if(leftStrand.isEmpty() && !rightStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if(!leftStrand.isEmpty() && rightStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        else {
            this.left = leftStrand.toCharArray();
            this.right = rightStrand.toCharArray();
        }
    }

    public int getHammingDistance() {
        int count = 0;
        for(int i = 0; i < left.length; i++){
            if(left[i] != right[i]){
                count += 1;
            }
        }
        return count;
    }
}


