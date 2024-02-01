package day23;

public class Step2 {
    public static void main(String[] args) {
        SimpleMap<String,Integer> simpleMap = new SimpleMap<>();

        simpleMap.put("이민형" , 80);
        simpleMap.put("유재석" , 70);
        simpleMap.put("강호동" , 95);
        simpleMap.put("이민형" , 90);

        System.out.println(simpleMap);
        System.out.println(simpleMap.size());
        System.out.println(simpleMap.get("유재석"));
        simpleMap.remove("유재석");
        System.out.println(simpleMap);
    }
}
