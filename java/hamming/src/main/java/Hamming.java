public class Hamming {
    String leftStrand;
    String rightStrand;

    int hammingDistance = 0;
    
    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
       
        if (leftStrand.length() == 0 && rightStrand.length() != 0){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if (rightStrand.length() == 0 && leftStrand.length() != 0){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        else{
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        }
    }

    public int getHammingDistance() {
        for (int i = 0; i < this.leftStrand.length(); i++){
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)){
                this.hammingDistance ++;
            }
        }

        return this.hammingDistance;
    }
}
