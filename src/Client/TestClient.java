package Client;

import Account.Account;

public class TestClient {
    public static void main(String[] args) {
        Account account = new Account("25479858968688", 15000);
        Account commercialAccount = new Account("25741295616564", 250365);
        Client client = new Client("Guy Cherubin", "12254125458654",
                "Dokki Gizah", "01228331194", account);

        CommercialClient commercialClient = new CommercialClient(
                "Mike Irakoze",
                "56451565951524",
                "Mohandeseen",
                "01225601524",
                commercialAccount
        );

        // Display accounts information
        System.out.println(client);
        System.out.println(commercialClient);
    }
}
