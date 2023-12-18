package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class FileCopyDemo {
    public static void main(String args[]) throws Exception {
        String source = "dir/data.txt";
        String destination = "dir/sample.txt";
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination);

        byte[] b = new byte[1024]; //more 1024
        int chunks = in.available() / b.length;
        for (int i = 0; i < chunks; i++) {
            in.read(b);
            out.write(b);
        }
        b = new byte[in.available()];
        in.read(b);
        out.write(b);

        in.close();
        out.close();
        System.out.println("Copy Completed...");
    }
}
