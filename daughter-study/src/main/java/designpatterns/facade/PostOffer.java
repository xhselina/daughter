package designpatterns.facade;

import designpatterns.facade.impl.LetterImpl;

/**
 * 门面类
 * 邮局开了一个新业务
 * @author junhuiji
 *
 */
public class PostOffer {
	private ILetter letter = new LetterImpl();
	
	public PostOffer(){
		
	}
	
	public PostOffer(ILetter letter){
		this.letter = letter;
	}
	
	
	public void send(String context,String address){
		this.letter.writeContext(context);
		this.letter.writeEnvelope(address);
		this.letter.stickEnvelope();
		this.letter.sendLetter();
	}
}
