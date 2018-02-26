package shm.blockchain;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class NoobChain {

	public void firstAttempt() {
		
		Block genesisBlock = new Block("Hi im the first block", "0");
		System.out.println("Hash for block 1 : " + genesisBlock.hash);
		
		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
		System.out.println("Hash for block 2 : " + secondBlock.hash);
		
		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
		System.out.println("Hash for block 3 : " + thirdBlock.hash);
		

	}
	
	public static ArrayList<Block> blockchain = new ArrayList<Block>(); 

	
	public void secondAttempt() throws JsonProcessingException {

			blockchain.add(new Block("Hi im the first block", "0"));		
			blockchain.add(new Block("Yo im the second block",blockchain.get(blockchain.size()-1).hash)); 
			blockchain.add(new Block("Hey im the third block",blockchain.get(blockchain.size()-1).hash));
			
		String blockchainJson = new ObjectMapper().writeValueAsString(blockchain);
		System.out.println(blockchainJson);
	}
}