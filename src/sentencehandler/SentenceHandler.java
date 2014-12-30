package sentencehandler;

import sentencehandler.executor.SentenceHandlerExecutorService;
import sentencehandler.input.InputSentence;
import sentencehandler.threads.SentenceHandlerThreadService;

public class SentenceHandler {

	public static void main(String[] args) {
		InputSentence inputSentence = new InputSentence();
		SentenceHandlerThreadService threadService = new SentenceHandlerThreadService();
		SentenceHandlerExecutorService exectuorService = new SentenceHandlerExecutorService();
		
		while(true) {
			inputSentence.create();
			threadService.useThread(inputSentence);
			exectuorService.useExectuor(inputSentence);
		}
		
	}

}
