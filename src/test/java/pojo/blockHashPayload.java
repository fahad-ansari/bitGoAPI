package pojo;

public class blockHashPayload {
	private int tx_count;
	private int mediantime;
	private String previousblockhash;
	private int bits;
	private int weight;
	private String merkle_root;
	private int version;
	private int nonce;
	private Object difficulty;
	private int size;
	private String id;
	private int height;
	private int timestamp;

	public void settx_count(int tx_count){
		this.tx_count = tx_count;
	}

	public int gettx_count(){
		return tx_count;
	}

	public void setMediantime(int mediantime){
		this.mediantime = mediantime;
	}

	public int getMediantime(){
		return mediantime;
	}

	public void setPreviousblockhash(String previousblockhash){
		this.previousblockhash = previousblockhash;
	}

	public String getPreviousblockhash(){
		return previousblockhash;
	}

	public void setBits(int bits){
		this.bits = bits;
	}

	public int getBits(){
		return bits;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setMerkle_root(String merkle_root){
		this.merkle_root = merkle_root;
	}

	public String getMerkle_root(){
		return merkle_root;
	}

	public void setVersion(int version){
		this.version = version;
	}

	public int getVersion(){
		return version;
	}

	public void setNonce(int nonce){
		this.nonce = nonce;
	}

	public int getNonce(){
		return nonce;
	}

	public void setDifficulty(Object difficulty){
		this.difficulty = difficulty;
	}

	public Object getDifficulty(){
		return difficulty;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setTimestamp(int timestamp){
		this.timestamp = timestamp;
	}

	public int getTimestamp(){
		return timestamp;
	}
}
