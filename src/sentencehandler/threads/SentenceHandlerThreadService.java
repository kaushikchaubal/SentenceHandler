package sentencehandler.threads;

import sentencehandler.input.InputSentence;

public class SentenceHandlerThreadService {
	private int count = 0;
	
	public void useThread(InputSentence input) {
		Thread thread = new Thread(new SentenceHandlerRunnable(input.getInputString()));
		thread.setName("SentenceHandlerThread-" + count++);
		thread.start();
	}

}
