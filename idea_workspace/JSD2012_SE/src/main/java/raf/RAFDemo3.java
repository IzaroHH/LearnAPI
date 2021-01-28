package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author Izaro
 * @Date 2021/1/27 14:19
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
        System.out.println(raf.getFilePointer());
        int imax = Integer.MAX_VALUE;
        raf.write(imax >>> 24);
        System.out.println(raf.getFilePointer());
        raf.write(imax >>> 16);
        System.out.println(raf.getFilePointer());
        raf.write(imax >>> 8);
        System.out.println(raf.getFilePointer());
        raf.write(imax);
        System.out.println(raf.getFilePointer());
        raf.writeInt(imax);
        System.out.println(raf.getFilePointer());
        raf.writeLong(123L);
        System.out.println(raf.getFilePointer());
        raf.writeDouble(123.123);
        System.out.println(raf.getFilePointer());
        System.out.println("OVER!");
        raf.seek(8);
        raf.writeLong(400L);

        raf.seek(8);
        long a1=raf.readLong();
        System.out.println(a1);
        raf.close();
    }
}
