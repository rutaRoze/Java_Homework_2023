package src;

import itaphones.phone.Phone;

public class MyPhone implements Phone {

    private String number;

    private String response = "KUKU";

    public MyPhone() {
    }

    @Override
    public void dial(String s) {
        this.number = number;
    }

    @Override
    public String getReponse() {
        return response;
    }
}
