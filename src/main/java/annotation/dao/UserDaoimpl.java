package annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoimpl implements  UserDao{
    public void add() {
        System.out.println("dao add........");
    }
}
