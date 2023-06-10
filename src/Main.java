import Controlers.UserControler;
import Models.User;
import Views.UserView;

public class Main {
    public static void main(String[] args) {
        User model = new User();
        UserView view = new UserView();
        UserControler controler = new UserControler(model, view);

        controler.SetUserName("Hiroku");
        controler.SetUserSurname("Namatsuda");
        controler.SetMail("sjtokio@ayax.com");
        controler.Setphonenumber(88005553535L);

        controler.UpdateUserView();
    }

}