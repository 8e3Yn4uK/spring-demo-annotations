package com.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private List<String> list;
    private Random rnd = new Random();

    public FileFortuneService(){

        File myFile = new File("E:\\Sanya\\projects\\spring-demo-annotations\\src\\com\\fortune.txt");
        System.out.println("Reading " + myFile);
        System.out.println("File exist " + myFile.exists());
        list = new ArrayList<String>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))){
            String tmp;
            while((tmp = bufferedReader.readLine()) != null){
                list.add(tmp);
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }
    @Override
    public String getFortune() {
        int i = rnd.nextInt(list.size());
        return list.get(i);
    }
}
