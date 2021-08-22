package com.company;

  public class Main {

    public static void main(String[] args) {
        int age = 32;
        int temp = 17;
      String rsult = getResult(age, temp);
        System.out.println(rsult);
        getResult(20,-43 );
        getResult(23, 52 );
        getResult(14, -33 );
        getResult(9, 13);
        getResult(35, 63 );

    }


    public static String getResult( int age, int temp) {
        if (age >= 20 && age < 45 && temp >= 20 && temp < 30) {
            return "Можно идти гулять";
        }else if (age > 0 && age < 20 && temp >= 0 && temp < 30){
            return "Можно идти гулять";
        }else if (age > 45 && temp >= -10 && temp <25){
            return "Можно идти гулять";
        }else {
            return " Оставайтесь дома";
        }






    }

 }