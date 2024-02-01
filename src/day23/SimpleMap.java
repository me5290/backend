package day23;

import java.util.Set;

public class SimpleMap <K,V> {
    // 1. 필드
    private MapValue[] map;
    private int size;

    // 2. 생성자
    public SimpleMap(){
        map = new MapValue[0];
    }

    // 3. 메소드
        // 1. 삽입 메소드
    int lol = 1;
    public boolean put(K key , V value){
        this.size++;

        // 중복체크
        for(int i = 0; i < this.map.length; i++){
            if(key.equals(map[i].getKey())){
                size--;
                map[i].setValue(value);
                lol = 2;
            }
        }

        MapValue[] newMap = new MapValue[size];

        for(int i = 0; i < this.map.length; i++){
            newMap[i] = map[i];
        }

        map = newMap;

        if(lol == 1){
            map[this.size-1] = new MapValue(key , value);
        }else if(lol == 2){
            for(int i = 0; i < this.map.length; i++){
                if(key.equals(map[i].getKey())){
                    map[i] = new MapValue(key , value);
                }
            }
        }


        return true;
    }
        // 2. 호출 메소드
    public V get(K key){
        for(int i = 0 ; i < map.length; i++){
            if(key.equals(map[i].getKey())){
                return (V) map[i].getValue();
            }
        }
        return null;
    }
        // 3. 삭제 메소드
    public boolean remove(K key){
        this.size--;

        MapValue[] newMap = new MapValue[size];

        int j = 0;
        for(int i = 0; i < this.map.length; i++){
            newMap[j] = map[i];
            if(!key.equals(map[i].getKey())){
                j++;
            }
        }
        map = newMap;
        return true;
    }
        // 4. 길이 출력 메소드
    public int size(){
        return this.size;
    }
        // 5. toString 메소드
    @Override
    public String toString(){
        String str = "";
        for(int i = 0; i < this.map.length; i++){
            str += map[i].toString()+"\n";
        }
        return str;
    }
}
