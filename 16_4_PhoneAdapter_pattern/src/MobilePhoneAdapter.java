package src;

import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {

    private MobilePhone mobilePhone;
    private String response;


    public MobilePhoneAdapter(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void dial(String numberToDial) {
        response = mobilePhone.dial(numberToDial);

    }

    @Override
    public String getReponse() {
        return response;
    }

}
