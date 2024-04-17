public final class Primitive {
    public static boolean toPrimitive(Boolean b) {
        // write your code here
        if(b==null){
            b=false;
        }
        return b;
    }

    // This is a utility class,
    // and it is not meant to be instantiated.
    private Primitive() {
    }
}