package edu.curtin.app.model.responders;
import java.util.*;
public interface ResponderComm
{
    List<String> poll();
    void send(String s);
}
