package pojo;

public class VoutItem{
	private String scriptpubkey;
	private String scriptpubkeyAsm;
	private String scriptpubkeyType;
	private int value;
	private String scriptpubkeyAddress;

	public void setScriptpubkey(String scriptpubkey){
		this.scriptpubkey = scriptpubkey;
	}

	public String getScriptpubkey(){
		return scriptpubkey;
	}

	public void setScriptpubkeyAsm(String scriptpubkeyAsm){
		this.scriptpubkeyAsm = scriptpubkeyAsm;
	}

	public String getScriptpubkeyAsm(){
		return scriptpubkeyAsm;
	}

	public void setScriptpubkeyType(String scriptpubkeyType){
		this.scriptpubkeyType = scriptpubkeyType;
	}

	public String getScriptpubkeyType(){
		return scriptpubkeyType;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public void setScriptpubkeyAddress(String scriptpubkeyAddress){
		this.scriptpubkeyAddress = scriptpubkeyAddress;
	}

	public String getScriptpubkeyAddress(){
		return scriptpubkeyAddress;
	}
}
