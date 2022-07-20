package ex02;

public class UserIdsGenerator {

    private static final UserIdsGenerator instance = new UserIdsGenerator();
    private Integer currentId;

    private UserIdsGenerator() {
        currentId = -1;
    }

    public static UserIdsGenerator getInstance() {
        return instance;
    }

    public Integer generateId() {
        currentId++;
        return currentId;
    }
}
