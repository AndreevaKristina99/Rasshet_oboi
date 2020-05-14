package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void getShirina() {
    }

    @Test
    public void getVisota() {
    }

    @Test
    public void getDlina() {
    }

    @Test
    public void setDlina() {
      //  Room room=new Room(70,30,15);

    }

    @Test
    public void setShirina() {
    }

    @Test
    public void setVisota() {

    }

    @Test
    public void result() {
        Room room=new Room(70,30,15);
        assertEquals("Вcе верно",240,room.result(),0.001);

    }
}