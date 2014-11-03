package zookeeper;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ZooKeeper zk = new ZooKeeper("localhost:2181", 50000, new Watcher() {
			@Override
			public void process(WatchedEvent arg0) {
				System.out.println(arg0.toString());
			}
		});
		// 创建一个节点root，数据是mydata,不进行ACL权限控制，节点为永久性的(即客户端shutdown了也不会消失)
		// zk.create("/root", "mydata".getBytes(),Ids.OPEN_ACL_UNSAFE,
		// CreateMode.PERSISTENT);
		zk.create("/root/root", "这个是我自己创建的adfasdfasdfasdf".getBytes("utf-8"), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
		List<String> strings = zk.getChildren("/", true);
		for (String string : strings) {
			System.out.println(string);
		}
		zk.setData("/root/root", "abc.efg@#$@!#$%$^".getBytes(), -1);
		zk.delete("/root/root", -1);
		zk.close();
	}

}
