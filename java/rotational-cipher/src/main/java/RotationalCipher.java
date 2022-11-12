class RotationalCipher {
    int shiftKey;
    final int BASE = 26;
    final int lowBound = 65;
    final int highBound = 122;

    final int lowBoundUpper = 65;
    final int highBoundUpper = 90;

    final int lowBoundSymbols = 91;
    final int highBoundSymbols = 96;

    final int lowBoundLower = 97;
    final int highBoundLower = 122;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String result = "";
        int preShift;
        
        if (this.shiftKey == 0 || this.shiftKey == 26){
            return data;
        }

        for (int i = 0; i < data.length(); i++){
            if ((data.charAt(i) > this.highBound) || (data.charAt(i) < this.lowBound)){
                result += data.charAt(i);
            }
            else if (data.charAt(i) >= this.lowBoundSymbols && data.charAt(i) <= this.highBoundSymbols){
                result += data.charAt(i);
            }
            else if ((data.charAt(i) >= this.lowBoundUpper && data.charAt(i) <= this.highBoundUpper)){
                if ((data.charAt(i) + this.shiftKey) > this.highBoundUpper){
                    result += (char)((data.charAt(i) + this.shiftKey) - this.BASE);
                }
                else{
                    result += (char)(data.charAt(i) + this.shiftKey);
                }
            }
            else if ((data.charAt(i) >= this.lowBoundLower && data.charAt(i) <= this.highBoundLower)){
                if ((data.charAt(i) + this.shiftKey) > this.highBoundLower){
                    result += (char)((data.charAt(i) + this.shiftKey) - this.BASE);
                }
                else{
                    result += (char)(data.charAt(i) + this.shiftKey);
                }
                }
            }
 
        
        return result;

        
    }

}
