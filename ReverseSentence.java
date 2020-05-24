package niuke;

public class ReverseSentence {

    public static void main(String[] args) {
        String str = " ";
        System.out.println(reverseSentence(str));
    }

    public static String reverseSentence(String str) {
        if(str.length()<=1)
            return str;
        if(str==null)
            return null;
        if(str.trim().equals(""))
            return str;

        char[] swap = swap(str, 0, str.length() - 1);
        str = new String(swap);

        String[] slist = str.split(" ");
        String ret = "";
        String res = "";
        for (int i = 0; i < slist.length; i++) {
            char[] chs = swap(slist[i], 0, slist[i].length()-1);
            if(i!=slist.length-1)
                res = new String(chs)+" ";
            else
                res = new String(chs);
            ret += res;
        }
        return ret;
    }

    public static char[] swap(String string, int i, int j){
        char[] chs = string.toCharArray();
        while(i<j){
            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
            i++;
            j--;
        }
        return chs;

    }
}
