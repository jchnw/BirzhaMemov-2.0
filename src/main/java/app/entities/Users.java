package app.entities;

public class Users {
    private String login;
    private String password;
    private Integer user_id;
    private Integer user_likes;

    public Users(){}

    public Users(String login, String password, Integer user_likes, Integer user_id){
        this.login = login;
        this.password = password;
        this.user_likes = user_likes;
        this.user_id = user_id;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_likes()
    {
        return user_likes;
    }

    public void setUser_likes(Integer user_likes) {
        this.user_likes = user_likes;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (login != null ? !login.equals(users.login) : users.login != null) return false;
        return password != null ? password.equals(users.password) : users.password == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
