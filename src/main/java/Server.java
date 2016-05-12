import io.vertx.core.AbstractVerticle;
import io.vertx.core.Launcher;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.spi.cluster.hazelcast.HazelcastClusterManager;

import java.lang.management.ManagementFactory;

import com.hazelcast.config.Config;

public class Server extends AbstractVerticle {

	// Convenience method so you can run it in your IDE
	public static void main(String[] args) {

		Launcher.main(new String[] { "run", Server.class.getName(), "-ha"});
	}

	@Override
	public void start() throws Exception {
		vertx.createHttpServer().requestHandler(req -> {
			final String name = ManagementFactory.getRuntimeMXBean().getName();
			req.response().end("Happily served by " + name);
		}).listen(8080);
	}
}
