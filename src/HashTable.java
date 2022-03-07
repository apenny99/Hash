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
    private int stringToInt(String inp){
        int fin=0;
        int temp3=0;
        for(int i=0;i<inp.length();i++){
            int temp=0;
            temp=(int)inp.charAt(i);
            String temp2="" + temp;
            temp3=1;
            for(int u=0;u<temp2.length();u++){
                temp3=temp3*(int)temp2.charAt(u);
            }
            fin+=temp3;
        }
        return fin;
    }

    private int hash(double val, int key){ //make each seperate char in the string into an int value and then make that int value into a string. then, hash those strings and add the int values.
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

        int index=hash((double)stringToInt(value), stringToInt(key));
        System.out.println(index);

        while(index>= table.length){
            String[] temp=new String[table.length*2];
            for(int i=0;i<numVals;i++){
                temp[i]=table[i];
            }
            table=temp;
        }
        if(table[index]==null){
            return false;
        }

        table[index]=value;
        return true;


    }

    public static void main(String[] args) {
        HashTable test=new HashTable(999);
        System.out.println(test.put("t02","August"));
        System.out.println(test.put("t02","August"));
    }

}
