class SqueakyClean {
    static String clean(String identifier){
        StringBuilder sb = new StringBuilder();

        if (identifier.contains("-")){
            identifier = toCamel(identifier);
        }

        char[] chars = identifier.toCharArray();

        for (int i = 0; i < chars.length; i++){
            if (Character.isISOControl(chars[i])){
                sb.append("CTRL");
                continue;
            }

            if (Character.isWhitespace(chars[i])){
                chars[i] = '_';
                sb.append(chars[i]);
                continue;
            }

            if((chars[i] > 'ά') && (chars[i] < 'ώ')){
                continue;
            }

            if((chars[i] >= 0) && (chars[i] <= 9)){
                continue;
            }

            if (Character.isLetter(chars[i])){
                sb.append(chars[i]);
                continue;
            }
        }

        return sb.toString();
    }

    static String toCamel(String identifier){
        StringBuilder sb = new StringBuilder();
        // if text is kebab case, split into two substrings on -, 
        if (identifier.contains("-")){
        String[] split = identifier.split("-");
        String[] split2 = new String[split.length];

        // convert to camel case
        for (int i = 0; i < split.length; i++){
            if (i == 0){
                split2[i] = split[i];
            }

        if (i > 0){
            split2[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
            }
        }

        // combine two substrings back into full string and send to preClean function
        for (int i = 0; i < split2.length; i++){
            sb.append(split2[i]);
        }
    }
        return sb.toString();
}
}