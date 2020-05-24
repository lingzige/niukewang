package niuke;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public ArrayList<String> permutation(String str) {
        if(str==null)
            return null;

        ArrayList<String> list = new ArrayList<>();
        char[] chs = str.toCharArray();
        pailie(list, chs,0);
        Collections.sort(list);
        return list;
    }

    public void pailie(ArrayList<String> list, char[] ss,int i){
        if(ss==null){
            return;
        }
        if(i==ss.length-1){
            if(list.contains(String.valueOf(ss))){
                return;
            }else
                list.add(String.valueOf(ss));
        }else {
            for(int j=i;j<ss.length;j++){
                char temp = ss[j];
                ss[j] = ss[i];
                ss[i] = temp;
                pailie(list, ss, i+1);
                temp = ss[j];
                ss[j] = ss[i];
                ss[i] = temp;
            }
        }
    }
}
