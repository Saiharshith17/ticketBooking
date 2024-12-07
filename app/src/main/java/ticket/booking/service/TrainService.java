package ticket.booking.service;
import java.io.IOException;
import java.util.*;
import ticket.booking.entities.Train;
import java.util.stream.Collectors;
public class TrainService {
    List<Train> trainList;
    public List<Train> searchTrains(String source,String destination) throws IOException {
        return trainList.stream().filter(train->validTrain(train,source,destination)).collect(Collectors.toList());
    }

    public void addTrain(Train newTrain) {

    }


    public Boolean validTrain(Train train,String source,String  destination){
        List<String> stationOrder=train.getStations();
        int sourceIndex=stationOrder.indexOf(source.toLowerCase());
        int destinationIndex=stationOrder.indexOf(destination.toLowerCase());
        return sourceIndex!=-1&&destinationIndex!=-1&&sourceIndex<destinationIndex;
    }
}
