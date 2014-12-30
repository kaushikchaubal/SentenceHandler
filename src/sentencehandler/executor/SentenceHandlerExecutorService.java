package sentencehandler.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import sentencehandler.input.InputSentence;
import sentencehandler.threads.SentenceHandlerRunnable;


public class SentenceHandlerExecutorService {
	
	public void useExectuor(InputSentence input) {
		 ExecutorService executor = Executors.newFixedThreadPool(10);
		 executor.execute(new SentenceHandlerRunnable(input.getInputString()));
	}
}
