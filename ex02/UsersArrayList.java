package ex02;

public class UsersArrayList implements UsersList {

    private static final Integer DEFAULT_CAPACITY = 10;
    private Integer capacity;
    private User[] userArr;
    private Integer newUserIndex;

    UsersArrayList() {
        capacity = DEFAULT_CAPACITY;
        userArr = new User[capacity];
        newUserIndex = 0;
    }
    @Override
    public void addUser(User newUser) {
        if (newUserIndex.equals(capacity)) {
            Integer newCapacity = capacity + capacity / 2;
            User[] newArr = new User[newCapacity];
            for (int i = 0; i < capacity; i++) {
                newArr[i] = userArr[i];
            }
            userArr = newArr;
            capacity = newCapacity;
        }
        userArr[newUserIndex] = newUser;
        newUserIndex++;
    }

    @Override
    public User getById(Integer id) throws Exception {
        for (User user: userArr) {
            if (id.equals(user.getId())) {
                return user;
            }
        }
        throw new Exception("UserNotFoundException");
    }

    @Override
    public User getByIndex(Integer index) {
        return null;
    }

    @Override
    public Integer getUserCount() {
        return null;
    }
}
