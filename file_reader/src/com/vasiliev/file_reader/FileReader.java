package com.vasiliev.file_reader;

import com.Vasiliev.clients.Clients;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReader {

    public static void main(String[] args) throws IOException {
        ArrayList<Clients> clients = new ArrayList<>();

        try{


            FileInputStream fis = new FileInputStream("ClientList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

             clients = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }


        for (Clients client : clients) {
            System.out.println(client);
        }
    }
}
