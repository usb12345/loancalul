package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	      String gender;
        int age;
        String profession;
        int asset;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter gender");
        gender = input.nextLine();


        System.out.println("Enter age");
        age = input.nextInt();

        System.out.println("Enter profession");
        profession = input.nextLine();

        System.out.println("Enter personal asset");
        asset = input.nextInt();

        System.out.println(" Gender" +gender);
        System.out.println("age" +age);
        System.out.println("profession" +profession);
        System.out.println("personal asset" +asset);

        if(age<25 && age>=16 && asset>25000 ){
            if(profession.contains("p"))
            { System.out.println(" loan you get 10,000");}

            if(profession.contains("s"))
            { System.out.println("loan get 15,000");}

        }
        else if(age<40 && age>=26 && asset>40000){
            if(gender.contains("m"))
            {System.out.println("loan get 25,000");}
            if(gender.contains("f"))
            {System.out.println("loan get 30,000");}
        }
        else if(age<60 && age>=41 && asset>50000){
            System.out.println("loan get 40000");
        }
        else if(age>60 && asset>25000){
            if(profession.contains("s"))
            {
                int loanS= 35000-age*100;
                System.out.println("loan get is" +loanS);
            }
            if(profession.contains("r"))
            {
                int loanR= 25000-age*100;
                System.out.println("loan get is" +loanR);
            }
        }


    }
    }
}
