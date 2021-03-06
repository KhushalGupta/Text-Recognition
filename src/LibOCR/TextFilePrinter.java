// Software: Handwriting Recognition Software in Java

package LibOCR;

import java.io.*;

public class TextFilePrinter {

    FileWriter file;
    PrintWriter writer;

    public void Rewrite(String name) throws IOException {
        file = new FileWriter(name);
        writer = new PrintWriter(file);
    }

    public void Append(String name) throws IOException {
        file = new FileWriter(name, true);
        writer = new PrintWriter(file);
    }

    public void print(double num) throws IOException {
        writer.print(Double.toString(num));
    }

    public void println(double num) throws IOException {
        writer.println(Double.toString(num));
    }

    public void print(int num) throws IOException {
        writer.print(Integer.toString(num));
    }

    public void println(int num) throws IOException {
        writer.println(Integer.toString(num));
    }

    public void print(String s) throws IOException {
        writer.print(s);
    }

    public void print() throws IOException {
        writer.print("");
    }

    public void println(String s) throws IOException {
        writer.println(s);
    }

    public void println() throws IOException {
        writer.println("");
    }

    public void close() throws IOException {
        writer.close();
        file.close();
    }

}
