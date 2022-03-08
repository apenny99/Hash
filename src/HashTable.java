public class HashTable {
    private String[] table;
    private int key;
    private int numVals=0;
    private double loadFactor = .75;

    public HashTable(int capacity){
        table=new String[capacity];
    }

    private int hash(String inp){
        long fin=0;
        String end="";
       for(int i=0;i<inp.length();i++){
           Integer temp=(int)inp.charAt(i);
           temp=temp%31;
           end+=temp.toString();
       }
       fin=Long.parseLong(end);
       long ret=fin % 997;

       return (int)ret;
    }


    public boolean put(String key, String value){
        int index=hash(key);
        if(index<= table.length){
            if(table[index]!=null){
                return false;
            }
        }

        while(index>= table.length){
            String[] temp = new String[table.length*2];
            for(int i=0;i<table.length;i++){
                temp[i]=table[i];
            }
            table=temp;
        }
        table[index]=value;
        return true;

    }

    public String get(String key){
        int index=hash(key);
        if(index>= table.length){
            System.out.println("null");
            return null;
        }
        return table[index];
    }

    public static void main(String[] args) {
        HashTable test=new HashTable(999);
        System.out.println(test.put("August","Mareks"));
        System.out.println(test.put("August","Mareks"));
        System.out.println(test.get("August"));
    }

}
