public class MainClass {

    public static void main(String[] args){
        BinarySearchTree<String, String> dictionary = new BinarySearchTree<>();
        dictionary.put("Prosper", "To be prosperous");
        dictionary.put("Precious", "To be highly valuable");

        System.out.println(dictionary.get("Precious"));
    }
}
