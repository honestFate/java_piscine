package ex02;

public interface UsersList {

    void addUser(User newUser);
    User getById(Integer id) throws Exception;
    User getByIndex(Integer index);
    Integer getUserCount();
}
