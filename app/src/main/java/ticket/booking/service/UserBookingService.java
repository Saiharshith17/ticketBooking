package ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper=new ObjectMapper();

    private static final String USERS_PATH="app/src/main/java/ticket/booking/localDb/users.json";
    public UserBookingService(User user1) throws IOException {
        this.user=user1;
        File users=new File(USERS_PATH);
        userList=objectMapper.readValue(users,new TypeReference<List<User>>(){});
    }
    public Boolean loginUser(){
        Optional<User> foundUser=userList.stream().filter(user1->{
            return user1.getName().equals(user.getName())&& UserServiceUtil.checkPassword(user.getPassword(),user)}).findFirst();
        return foundUser.isPresent();
        })
    }
}
