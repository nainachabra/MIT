package BufferReaderWritter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

class BufferedReaderDemo {
    public static void main(String args[]) throws Exception {
        Reader fr = new FileReader("dir/data.txt");
        BufferedReader br = new BufferedReader(fr);
        while (true) {
            String s = br.readLine();
            if (s == null) break;			//file is empty???
            System.out.println(s);
        }
        br.close();
        fr.close();

    }
}
