package org.atomlink;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huyiqing on 2017/2/17.
 */
public class Util {

    public HashMap<Integer, Character> mapper_itos;
    public HashMap<Character, Integer> mapper_stoi;
    private int counter;

    static double iniLinkStrength_forward = 20;
    static double iniLinkStrength_backward = 10;

    public Util()
    {
        int counter = 0;
        mapper_itos = new HashMap<Integer, Character>();
        mapper_stoi = new HashMap<Character, Integer>();

        set_demo();
        reverseMap();
    }

    private void reverseMap()
    {
        for (int i = 1; i <= mapper_itos.size(); ++ i) //todo 遍历可能溢出
        {
            mapper_stoi.put(mapper_itos.get(i), i);
        }
    }




    private void set_demo()
    {
        mapper_itos.put(1, '我');
        mapper_itos.put(2, '你');
        mapper_itos.put(3, '打');
        mapper_itos.put(4, '追');
        mapper_itos.put(5, '跑');
        mapper_itos.put(6, '路');
        mapper_itos.put(7, '不');
        mapper_itos.put(8, '上');
        counter = 8;

    }















}
