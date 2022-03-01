package com.vasiliev.file_writer;

import com.Vasiliev.clients.Clients;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        try
        {
            FileOutputStream fos = new FileOutputStream("ClientList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Clients.getList());
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}

