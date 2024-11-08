package pojo;

import java.util.List;

public class TxnID{
	private long locktime;
	private int size;
	private int fee;
	private String txid;
	private int weight;
	private List<VinItem> vin;
	private int version;
	private List<VoutItem> vout;
	private Status status;

	public void setLocktime(long locktime){
		this.locktime = locktime;
	}

	public long getLocktime(){
		return locktime;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setFee(int fee){
		this.fee = fee;
	}

	public int getFee(){
		return fee;
	}

	public void setTxid(String txid){
		this.txid = txid;
	}

	public String getTxid(){
		return txid;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setVin(List<VinItem> vin){
		this.vin = vin;
	}

	public List<VinItem> getVin(){
		return vin;
	}

	public void setVersion(int version){
		this.version = version;
	}

	public int getVersion(){
		return version;
	}

	public void setVout(List<VoutItem> vout){
		this.vout = vout;
	}

	public List<VoutItem> getVout(){
		return vout;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}
}