package sentencehandler.threads;

public class SentenceHandlerRunnable implements Runnable{
	private String theSentenceTyped;
	
	public SentenceHandlerRunnable(String newSentenceTyped) {
		theSentenceTyped = newSentenceTyped;
	}
	
	@Override
	public void run() {
		System.out.println("Sentence typed: " + theSentenceTyped + " by Thread: " + Thread.currentThread().getName());
		stayAlive();
	}

	private void stayAlive() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
