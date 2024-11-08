package pojo;

import java.util.List;

public class VinItem{
	private String scriptsig;
	private List<String> witness;
	private long sequence;
	private String scriptsigAsm;
	private Object prevout;
	private boolean isCoinbase;
	private String txid;
	private long vout;

	public void setScriptsig(String scriptsig){
		this.scriptsig = scriptsig;
	}

	public String getScriptsig(){
		return scriptsig;
	}

	public void setWitness(List<String> witness){
		this.witness = witness;
	}

	public List<String> getWitness(){
		return witness;
	}

	public void setSequence(long sequence){
		this.sequence = sequence;
	}

	public long getSequence(){
		return sequence;
	}

	public void setScriptsigAsm(String scriptsigAsm){
		this.scriptsigAsm = scriptsigAsm;
	}

	public String getScriptsigAsm(){
		return scriptsigAsm;
	}

	public void setPrevout(Object prevout){
		this.prevout = prevout;
	}

	public Object getPrevout(){
		return prevout;
	}

	public void setIsCoinbase(boolean isCoinbase){
		this.isCoinbase = isCoinbase;
	}

	public boolean isIsCoinbase(){
		return isCoinbase;
	}

	public void setTxid(String txid){
		this.txid = txid;
	}

	public String getTxid(){
		return txid;
	}

	public void setVout(long vout){
		this.vout = vout;
	}

	public long getVout(){
		return vout;
	}
}