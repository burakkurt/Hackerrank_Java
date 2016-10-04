package algorithms.bit_manipulation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LonelyInteger {

	static int lonelyinteger(int[] a) {
        int result = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i : a) {
			int count = 0;
			if(hm.containsKey(i))
				count = hm.get(i);
			
			hm.put(i, count+1);
		}
        
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
        	Map.Entry<Integer, Integer> me = (Map.Entry<Integer, Integer>) i.next();
        	if(me.getValue() == 1){
        		result = me.getKey();
        	}
        }
        return result;
        
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
    
}


