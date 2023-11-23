package src;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Labas!");
        System.out.println();

        MobilePhone mobilePhone = new MobilePhone();
        System.out.println(mobilePhone.dial("+37060013245"));
        MyPhone myPhone = new MyPhone();
        //System.out.println(myPhone.dial("123"));
        System.out.println();
        System.out.println(AutomaticDialer.dial(new MyPhone()));
        System.out.println();
        System.out.println(AutomaticDialer.dial(new MobilePhoneAdapter(mobilePhone)));

    }
}
