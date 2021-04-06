package com.adrianlearning.com.adrianlearning.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExplainingMaps {

    /**
     * Given a List<String> that is filled with Names please retrieve the value if the CC of Each Name.
     *
     * @param args
     */
    static Map<String, Integer> nameToId = new HashMap<>();


    public static void main(String[] args) {
        nameToId.put("Adrian", 11);
        nameToId.put("Camila", 22);
        nameToId.put("Andres", 33);
        nameToId.put("Carlos", 44);
        nameToId.put("Juan", 55);
        nameToId.put("Manuel", 66);
        List<String> names = Arrays.asList("Adrian", "Camila", "Andres", "Carlos", "Juan", "Manuel" );
        List<Integer> ccs = retrieveCCByNames(names);
        System.out.println(ccs);
    }


    public static List<Integer> retrieveCCByNames(List<String> names) {
        List<Integer> cc = new ArrayList<>();
        for(int i=0; i < names.size(); i++ ){
            Integer name= nameToId.get(names.get(i));
            cc.add(name);
        }
        return cc;
    }

    public String explainingReturnStatement(String name) {
        switch (name) {
            case "Andres" :
                return " Andrew";
            case "Felipe" :
                return " Philip";
            case "Jorge" :
                return " George";
        }
        return "Default";
    }
}
