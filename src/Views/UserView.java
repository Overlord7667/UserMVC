package Views;

import Models.User;

public class UserView {
    public void DisplayUser (User user){
        System.out.println("User details");
        System.out.println("User Name : " + user.getName() +"\n"+ "User Surname : " + user.getSurname() +"\n"+ "User Mail : " + user.getMail() +"\n"+ "User Phonenumber : " + user.getPhonenumber());
    }
}
