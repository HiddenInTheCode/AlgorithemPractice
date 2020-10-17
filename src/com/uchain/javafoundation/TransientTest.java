package com.uchain.javafoundation;

import java.io.*;

/**
 * 关键字transient的使用
 *
 */
public class TransientTest{
    public static void main(String[] args) throws Exception {
        User user=new User();
        user.setUsername("Damon");
        user.setPassword("123456");

        System.out.println("Before Transient UserName: "+user.getUsername()+"\n"+"Before Transient Password: "+user.getPassword());

        //对象内容存入txt  序列化
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:/Users/EmiYk/Desktop/test.txt"));
            out.writeObject(user);
            out.flush();
            out.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        //读取序列化后保存的文件内容
        try{
            ObjectInputStream  in=new ObjectInputStream(new FileInputStream("C:/Users/EmiYk/Desktop/test.txt"));
            user=(User)in.readObject();
            in.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("After Transient UserName: "+user.getUsername()+"\n"+"After Transient Password: "+user.getPassword());

    }
}
