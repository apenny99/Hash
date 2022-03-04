public class HashTable {
    private String[] table;
    private int key;
    private int size=0;
    private double loadFactor = .75;

    public HashTable(int capacity){
        table=new String[capacity];
    }

    private int keyToInt(String inp){
        int ret=0;
        for(int i=0;i<inp.length();i++){
            ret+=(int)inp.charAt(i);
        }
        return ret;
    }

    private int hash(int val, int key){
        
    }

    public boolean put(String key, String value){


    }

    public static void main(String[] args) {
        HashTable test=new HashTable(99);
        System.out.println(test.keyToInt("test"));
    }

}
