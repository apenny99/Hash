/**
 * Hash
 * Given hash string key and value, stores it in a string array at a calculated index
 * Author: August Penny
 * Collaborator(s): Mareks
 * Collaboration: Talked in class about ways to generate a large number
 * Date: 3/8/22
 **/

public class HashTable {
    private String[] table;

    public HashTable(int capacity){
        table=new String[capacity]; //makes new table with given capacity. constructor
    }

    private int hash(String inp){ //generates unique int based on a string input
        long fin=0;
        String end="";
       for(int i=0;i<inp.length();i++){//makes a string out of the int values of each char concattenated
           Integer temp=(int)inp.charAt(i);
           temp=temp%31;
           end+=temp.toString();
       }
       fin=Long.parseLong(end);//makes the string into a long
       long ret=fin % 997;//makes a long that is the previous long modded by a large prime number

       return (int)ret;//returns the final long casted to int
    }


    public boolean put(String key, String value){ //puts value in aarray at calculated integer place
        int index=hash(key);
        if(index<= table.length){//checks if the key has been used and returns null if it has
            if(table[index]!=null){
                return false;
            }
        }

        while(index>= table.length){ //doubles array length if the index it out of bounds
            String[] temp = new String[table.length*2];
            for(int i=0;i<table.length;i++){
                temp[i]=table[i];
            }
            table=temp;
        }
        table[index]=value; //sets the value at the index to the string value
        return true;

    }

    public String get(String key){//returns the value associated with the key
        int index=hash(key);
        if(index>= table.length){
            System.out.println("null");
            return null;
        }
        return table[index];
    }


}
