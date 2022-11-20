

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class App {

	private static final String QUEUE = "products_queue";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();		
		
		channel.queueDeclare(QUEUE, false, false, false, null);		
		List.of("Xbox Series X", "Playstation 5", "Nintendo Switch").stream().forEach(item -> {
			try {
				channel.basicPublish("", QUEUE, null, item.getBytes());
				Thread.sleep(1000);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		channel.close();
		connection.close();

	}

}
