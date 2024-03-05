package com.amarchuk.springcourse;


import java.text.DecimalFormat;

public class TestSpring {
    public static void main(String[] args) {
//
//        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Computer computer=context.getBean("computer", Computer.class);
//        System.out.println(computer.toString(MusicGendre.CLASSICAL));
//
//        context.close();

//        System.out.println (System.getProperty ("java.classpath"));
//        System.out.println (System.getProperty ("java.class.path"));
//
//        String usedCurrency="GPH";
//
//        String quickPriceAD="1,250.255 GPH";
//        String str=quickPriceAD.replaceAll(usedCurrency, "").replaceAll("USD", "").replaceAll(",", "").trim();
//        Double d=Double.valueOf(str);
//
//
//
//        // 2 decimal points
//        System.out.println(String.format("%,.2f", Double.valueOf(quickPriceAD.replaceAll(usedCurrency, "").replaceAll("USD", "").replaceAll(",", "").trim())));
//        System.out.println(String.format("%,.2f", Double.valueOf(quickPriceAD.replaceAll(usedCurrency, "").replaceAll("USD", "").replaceAll(",", "").trim())*2));
//        String fjfj=String.format("%,.2f", Double.valueOf(quickPriceAD.replaceAll(usedCurrency, "").replaceAll("USD", "").replaceAll(",", "").trim())*2)+" "+usedCurrency;
//
//        String dva=fjfj+ usedCurrency;
//        System.out.println("fjf - "+fjfj);
//        System.out.println(dva);
//
//        System.out.println("----------------------");
//
        String usedCurrency="JPY";
//        String qp="1,256.254 JPY";
//        String s=qp.replaceAll(usedCurrency2, "").replaceAll(",", "").trim();
//        Double da=Double.valueOf(s);
//        System.out.println("Format 2F:"+String.format("%,.2f",da));
//        System.out.println("Format 0F:"+String.format("%,.0f", da));
//        System.out.println("Format D:"+String.format("%,d",da));
//
//
////        String.format("%,.2f", Double.valueOf(qp.replaceAll(usedCurrency, "").replaceAll("USD", "").replaceAll(",", "").trim()));
//        System.out.println(String.format("%,.2f", Double.valueOf(qp.replaceAll(usedCurrency2, "").replaceAll(",", "").trim()))+" "+usedCurrency2);
//        System.out.println(String.format("%,d", Double.valueOf(qp.replaceAll(usedCurrency2, "").replaceAll(",", "").trim()))+" "+usedCurrency2);
//        boolean t=qp.equals(String.format("%,.2f", Double.valueOf(qp.replaceAll(usedCurrency2, "").replaceAll(",", "").trim()))+" "+usedCurrency2);
//        System.out.println(t);


        String savedDiscount="38,556.00";
        String s=savedDiscount.replace(" " + usedCurrency, "");
        System.out.println(s);

        System.out.println(String.format("%,.0f", Double.valueOf(savedDiscount.replaceAll(usedCurrency, "").replaceAll(",", "").trim()))+" "+usedCurrency);
    }
}
