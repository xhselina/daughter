package designpatterns.facade.impl;

import designpatterns.facade.ILetter;

public class LetterImpl implements ILetter {

	@Override
	public void writeContext(String context) {
		System.out.println("写信的内容..." + context);

	}

	@Override
	public void writeEnvelope(String address) {
		System.out.println("写信封的内容..." + address);

	}

	@Override
	public void stickEnvelope() {
		System.out.println("粘住信封...");

	}

	@Override
	public void sendLetter() {
		System.out.println("送到邮局...");

	}

}
