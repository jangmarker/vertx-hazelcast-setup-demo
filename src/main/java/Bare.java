import io.vertx.core.Launcher;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.spi.cluster.hazelcast.HazelcastClusterManager;

/**
 * Just start a bare instance of vert.x .
 * It will receive the Server verticle when the process is killed.
 *
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class Bare{

  public static void main(String[] args) {
    Launcher.main(new String[]{"bare"});
    
    //"--cluster-host 127.0.0.1", "--cluster-port 5701"
   
  }
}