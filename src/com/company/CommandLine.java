package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Runtime;
public class CommandLine {
    public void ExcuteCMD() {

        //String cmd = "chcp 65001 && python C:\\Users\\kddc\\PycharmProjects\\python_STT\\STT_Controller.py";

        try {
            Process process = Runtime.getRuntime().exec("cmd /c start C:\\Users\\kddc\\PycharmProjects\\python_STT\\STT_Controller.py");
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


