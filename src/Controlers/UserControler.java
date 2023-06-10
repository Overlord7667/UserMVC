package Controlers;

import Models.User;
import Views.UserView;

public class UserControler {
    User user;
    UserView userView;

    public UserControler(User user, UserView userView) {
        this.user = user;
        this.userView = userView;
    }
    public void SetUserName(String UserName){
        user.setName(UserName);
    }

    public void SetUserSurname(String UserSurname){
        user.setSurname(UserSurname);
    }
    public void SetMail(String UserMail){
        user.setMail(UserMail);
    }
    public void Setphonenumber(Long UserPhonenumber){
        user.setPhonenumber(UserPhonenumber);
    }
    public void UpdateUserView(){
        userView.DisplayUser(user);
    }
}
