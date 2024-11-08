package pojo;

public class Status{
	private int blockTime;
	private String blockHash;
	private int blockHeight;
	private boolean confirmed;

	public void setBlockTime(int blockTime){
		this.blockTime = blockTime;
	}

	public int getBlockTime(){
		return blockTime;
	}

	public void setBlockHash(String blockHash){
		this.blockHash = blockHash;
	}

	public String getBlockHash(){
		return blockHash;
	}

	public void setBlockHeight(int blockHeight){
		this.blockHeight = blockHeight;
	}

	public int getBlockHeight(){
		return blockHeight;
	}

	public void setConfirmed(boolean confirmed){
		this.confirmed = confirmed;
	}

	public boolean isConfirmed(){
		return confirmed;
	}
}
