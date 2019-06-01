public class stringCompressDecompress {
    public static void main(String[] args) {
        // write your code in Java SE 8
        String str = compress("aabcdefghii");
        System.out.println(str);
        System.out.println(decompress(str));
    }
    
    public static String compress(String input){
        if(input == null)
        return "";
        
        int count = 1;
        StringBuilder res = new StringBuilder();
        char[] inArr = input.toCharArray();
        char curr = inArr[0];

        int i = 1;
        while(i<inArr.length){
            if(inArr[i] == curr)
            count++;
            else{
                if(count>1){
                    res.append(curr);
                    res.append(count);
                    count = 1;
                }else{
                    res.append(curr);
                }
                curr = inArr[i];
            }
            i++;
        }
        if(count>1){
            res.append(curr);
            res.append(count);
        }else
        res.append(curr);

        
        return res.toString();
        
    }
    
    
    public static String decompress(String input){
        if(input == null)
        return "";
        
        StringBuilder res = new StringBuilder();
        char[] str = input.toCharArray();
        int len = input.length();
        int num = 0;
        for(int i=0; i<input.length(); i++){
            if(str[i] > '0' && str[i] <= '9'){
                num = Character.getNumericValue(str[i]);
                while(num-->1)
                res.append(str[i-1]);
            }else
            res.append(str[i]);
        }
        
        return res.toString();
    }
    
}
