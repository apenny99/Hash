/**
 * HashTest
 * tests hashTable class
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: 3/8/22
 **/

public class HashTest {
    public static void main(String[] args) {
        HashTable test=new HashTable(99);
        System.out.println("Testing put method 2 times");
        System.out.println(test.put("math","addition"));
        System.out.println(test.put("english","reading"));
        System.out.println("testing the get method");
        System.out.println(test.get("math"));
        System.out.println(test.get("english"));
        System.out.println(test.get("science"));
        System.out.println("putting something with same key");
        System.out.println(test.put("math","subtraction"));
    }
}
