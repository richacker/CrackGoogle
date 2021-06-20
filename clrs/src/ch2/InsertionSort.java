package ch2;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
	public static void main(String[] args) {
        //5 2 4 6 1 3
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        
        for(int i = 0;i<list.size();i++){
            int key = list.get(i);
            int j = i-1;
            
            while (j >=0 && key < list.get(j)){
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, key);  
        }
        System.out.println(list.toString());
    }
}
