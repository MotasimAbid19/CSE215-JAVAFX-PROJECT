package com.example.sportsshopmanagement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner ;
public class Admin {
    Scanner sc ;
    public boolean Login(String regName , String regPass) throws IOException {

        String check = regName+" "+regPass ;
        ArrayList<String> forCheck = new ArrayList<String>();

        sc= new Scanner(DataFile.UserLogin);
        while (sc.hasNext()){
            String info = sc.next()+" "+sc.next() ;
            forCheck.add(info);
        }
        if(forCheck.contains(check)){
            return  true;
        }

            return false ;

    }
    public boolean Registration(String regName , String regPass)throws IOException{

        String check = regName+" "+regPass ;
        ArrayList<String> forCheck = new ArrayList<>();

        sc= new Scanner(DataFile.UserLogin);
        while (sc.hasNext()){
            String info = sc.next()+" "+sc.next() ;
            forCheck.add(info);
        }
        if(forCheck.contains(check)){
            return  true;
        }

        FileWriter fw = new FileWriter(DataFile.UserLogin,true);
        BufferedWriter b = new BufferedWriter(fw);
        String addData = "\n"+regName+" "+regPass;
        b.write(addData);
        b.close();
        fw.close();

        return true ;


    }

}
