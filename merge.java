public class StringMerge{
    public static String mergeStrings(String s1 , String s2)
    {
        StringBuilder mergeString = new StringBuilder();
        int i=0,j=0;
        while(i<s1.length() && j<s2.length() ){
            mergedString.append(s1.charAt(i)).append(s2.charAt(j)));
            i++;
            j++;
        }
        if(i<s1.length()){
            mergedString.append(s1.substring(i));
        }
        if(j<s2.length()){
            mergedString.append(s2.substring(j));
        }
        return mergedString.tostring();
    }
    public static void main(String[] args){
        String s1="abc";
        String s2="def";
        String mergedString = mergeString(s1,s2);
        System.out.println(mergedString);
    }
}
