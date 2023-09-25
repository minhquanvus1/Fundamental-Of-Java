public class StringBufferAndStringBuilderExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
//        buffer.append("World");
//        System.out.println(buffer);
        for(int i = 0; i < 1000; i++) {
            buffer.append("World"); // append "World" to the end of "Hello " 1000 times
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime));

        //long startTime1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder.capacity());
//        builder.append("World");
//        System.out.println(builder);
        for(int i = 0; i < 1000; i++) {
            builder.append("World"); // append "World" to the end of "Hello " 1000 times
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime));


    }
}
