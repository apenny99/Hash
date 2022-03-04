public class HashTable {
    private String[] table;
    private int key;
    private int numVals=0;
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

    private int hash(double val, int key){
        double inp=Math.pow(val,3.0);
        int output=(int)inp % key;
        return output;
    }

    public boolean put(String key, String value){
        if((double)table.length/(double)numVals>=.75){
            String[] temp=new String[table.length*2];
            for(int i=0;i<numVals;i++){
                temp[i]=table[i];
            }
            table=temp;
        }
        int index=hash((double)keyToInt(value), keyToInt(key));
        if(table[index].isEmpty()==false){
            return false;
        }
        table[index]=value;
        return true;
    }

    public static void main(String[] args) {
        HashTable test=new HashTable(99);
        System.out.println(test.hash(992.0,103));
    }

}
