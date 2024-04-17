public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        Secret[] secret = Secret.values();
        for (int i = 0; i < secret.length; i++) {
            if(secret[i].name().startsWith("STAR") || secret[i].name().endsWith("STAR")){
                counter++;
            }
        }

        System.out.println(counter);
    }
}