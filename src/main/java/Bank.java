import java.util.ArrayList;
import java.util.List;

public class Bank {

    String bankName = "RadekBank";
    int bankId = 1234;


    private List<Account> AccountList = new ArrayList<>();

    public List<Account> findAll() {
        return this.AccountList;
}
