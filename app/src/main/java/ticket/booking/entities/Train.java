package ticket.booking.entities;

import java.sql.Time;
import java.util.*;
public class Train {
    private String trainNo;
    private String trainId;
    List<List<Boolean>> seats;
    private Map<String, Time> stationTimes;
    private List<String> stations;
}
