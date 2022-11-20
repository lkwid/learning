

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class App {

	private static final String QUEUE = "products_queue";

	public static void main(String[] args) throws IOException, TimeoutException {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE, false, false, false, null);
		
		DefaultConsumer consumer = new DefaultConsumer(channel) {
			@Override
		     public void handleDelivery(
		        String consumerTag,
		        Envelope envelope, 
		        AMQP.BasicProperties properties, 
		        byte[] body) throws IOException {		 
		            String message = new String(body, "UTF-8");
		            System.out.println(message);
		     }
		}; 
		channel.basicConsume(QUEUE, true, consumer);

	}

}
