package org.example.SteamAPI;

import org.example.StreamAPI.StreamAPI;
import org.junit.jupiter.api.Test;

public class StreamAPITest {

    @Test
    void getStreamAPIResults(){
        StreamAPI sapi = new StreamAPI();
        sapi.streamAPIQuestions();
    }
}
