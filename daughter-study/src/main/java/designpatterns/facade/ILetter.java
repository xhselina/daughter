package designpatterns.facade;

/**
 * 写信的接口
 * @author junhuiji
 *
 */
public interface ILetter {
	/**
	 * 写信的内容
	 */
	public void writeContext(String context);
	/**
	 * 写信封
	 */
	public void writeEnvelope(String address);
	
	/**
	 * 贴邮票，粘信封
	 */
	public void stickEnvelope();
	
	/**
	 * 送到邮局
	 */
	public void sendLetter();
}
