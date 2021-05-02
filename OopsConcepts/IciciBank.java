package OopsConcepts;

public class IciciBank implements UkbankInter,Usbank,AusBank{ // mulltiple inheritance used - only with interface 

    //For uk
    @Override
    public void Freecashwithdraw() {
        System.out.println("free withdrwals £500 a day ");

    }

    @Override
    public void debitcard() {
        System.out.println("icici bank- debit card");

    }

    @Override
    public void creditcard() {
        System.out.println("icici bank- debit card");

    }

    @Override
    public void onlineBanking() {
        System.out.println("icici bank- Online banking");

    }

    @Override
    public void over18() {
        System.out.println("icici bank- over 18");

    }

    @Override
    public void chequebook() {
        System.out.println("icici bank-  checque book");

    }
}
