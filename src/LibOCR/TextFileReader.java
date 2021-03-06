// Software: Handwriting Recognition Software in Java

package LibOCR;

import java.io.*;

public class TextFileReader {

    BufferedReader file;

    public void open(String FileName) throws IOException {
        file = new BufferedReader(new FileReader(FileName));
    }

    public String ReadLine() throws IOException {
        return file.readLine();
    }

    public void close() throws IOException {
        file.close();
    }

}
