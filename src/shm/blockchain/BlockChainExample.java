package shm.blockchain;

import com.fasterxml.jackson.core.JsonProcessingException;

public class BlockChainExample {
	
	
	public static void main(String[] args) {
		
		try {
			new NoobChain().secondAttempt();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
