package roon.practice.springintegrationkata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

@SpringBootTest
class FileWriterIntegrationConfigTest {
    @Autowired
    private MessageChannel fileWriterChannel;

    @Test
    public void test() {
        Message<String> msg = new GenericMessage<>("message");

        fileWriterChannel.send(msg);
    }
}