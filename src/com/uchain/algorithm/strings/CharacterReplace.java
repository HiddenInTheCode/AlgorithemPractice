package com.uchain.algorithm.strings;

/**
 * 空格替代  输入一个带有空格的字符串，将里面的空格都替换为"%20"
 * StringBuffer的API
 */
public class CharacterReplace {
    public static void main(String[] args) {
        System.out.println(replace(new StringBuffer("We Are Happy")));
    }

    public static String replace(StringBuffer str){
        String result=str.toString();
        if(result.contains(" ")){
            while(str.indexOf(" ")!=str.lastIndexOf(" ")) {
                int index = str.indexOf(" ");
                str.replace(index, index + 1, "%20");
            }
            int index = str.indexOf(" ");
            str.replace(index,index+1,"%20");
            result = str.toString();
            return result;

        }else{
            return result;
        }

    }
}
