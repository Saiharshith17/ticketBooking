package ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.Ticket;
import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserBookingService {
    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper=new ObjectMapper();

    private static final String USERS_PATH="app/src/main/java/ticket/booking/localDb/users.json";

   public UserBookingService() throws IOException{
      loadUsers();
   }

    public UserBookingService(User user1) throws IOException {
        this.user=user1;
       loadUsers();
   }

    public List<User> loadUsers() throws IOException{
        File users=new File(USERS_PATH);
       return userList=objectMapper.readValue(users,new TypeReference<List<User>>(){});
    }
    public Boolean loginUser(){
        Optional<User> foundUser=userList.stream().filter(user1->{
            return user1.getName().equals(user.getName())&& UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedPassword());}).findFirst();
        return foundUser.isPresent();

    }
    public  Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch(IOException ex){
            return Boolean.FALSE;
        }
    }
    private void saveUserListToFile() throws IOException{
        File usersFile=new File(USERS_PATH);
            objectMapper.writeValue(usersFile,userList);
        
    }

    public void fetchBooking(){
        Optional<User> userFetched=userList.stream().filter(user1-> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        if(userFetched.isPresent()) userFetched.get().printTickets();
    }

    public Boolean cancelBooking(String ticketId){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the ticketId to cancel");
       ticketId=s.next();
       if(ticketId==null||ticketId.isEmpty()){
           System.out.println("TicketID cannot be Empty");
           return Boolean.FALSE;
       }
       String finalTicketId=ticketId;
       boolean removed=user.getTicketBooked().removeIf(ticket->ticket.getTicketId().equals(finalTicketId));
       if(removed){
           System.out.println("Ticket with ID "+ticketId+"has been Canceled");
           return Boolean.TRUE;
       }else{
           System.out.println("No ticket found with ID " + ticketId);
           return Boolean.FALSE;
       }

    }
    public List<Train> getTrains(String source, String destination) {
        try{
            TrainService trainService = new TrainService();
            return trainService.searchTrains(source, destination);
        }catch(IOException ex){
            return new ArrayList<>();
        }
    }
    public List<List<Integer>> fetchSeats(Train trainSelectedForBooking){
       return trainSelectedForBooking.getSeats();
    }

}
