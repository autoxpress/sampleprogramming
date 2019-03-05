import org.testng.Assert;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InstantTimeFormat {

    public static void main(String[] args) {

        String firstDateStr = "2018-09-21 11:47:36";
        String secondDateStr = "2018-09-21 11:47:31";
        //Convert String to UTC time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss").withZone(ZoneOffset.UTC);
        Instant instant_firstDateStr = ZonedDateTime.parse(firstDateStr, formatter).toInstant();
        Instant instant_secondDateStr = ZonedDateTime.parse(secondDateStr, formatter).toInstant();
        Assert.assertTrue(((instant_firstDateStr.toEpochMilli() - instant_secondDateStr.toEpochMilli()) / 1000 > 0) 
                          && (instant_firstDateStr.toEpochMilli() - instant_secondDateStr.toEpochMilli()) / 1000 <= 3);

        firstDateStr = "2018-09-21 11:47:34";
        secondDateStr = "2018-09-21 11:47:36";

        instant_firstDateStr = ZonedDateTime.parse(firstDateStr, formatter).toInstant();
        instant_secondDateStr = ZonedDateTime.parse(secondDateStr, formatter).toInstant();
        Assert.assertTrue(((instant_firstDateStr.toEpochMilli() - instant_secondDateStr.toEpochMilli()) / 1000 > 0) 
                          && (instant_firstDateStr.toEpochMilli() - instant_secondDateStr.toEpochMilli()) / 1000 <= 5);


    }
}
