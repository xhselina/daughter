package designpatterns.facade;


public class Client {

	public static void main(String[] args) {
		//先把信的内容以及地址写好
		String context = "你妹啊，嫁我吧！";
		String address = "八一公园";
		//搞一个邮局出来
		PostOffer postOffer = new PostOffer();
		postOffer.send(context, address);
	}

}
