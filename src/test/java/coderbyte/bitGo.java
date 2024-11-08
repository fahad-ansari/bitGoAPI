package coderbyte;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import pojo.TxnID;
import pojo.blockHashPayload;

public class bitGo {

    public int txncount = 2875 ;
    public String blockInfo;
    public String blockHash;

    @BeforeTest
    public  void fetchBlockHash(){

        blockHash = given().baseUri("https://blockstream.info").log().all().contentType(ContentType.ANY)
                .when().get("/api/block-height/680000").then().extract().asPrettyString();
        //System.out.println(blockHash);
    }

    @Test
    public void fetchBlockInfo(){

        blockHashPayload ra = given().baseUri("https://blockstream.info").log().all().contentType(ContentType.JSON)
                .when().get("/api/block/"+blockHash).then().extract().as(blockHashPayload.class);
        System.out.println(ra);
        int txcount = ra.gettx_count();
        Assert.assertEquals(txcount,txncount,"Expected value differs than provided value 2875");

    }

    @Test
    public void fetchTxnID(){
        int pagesIteration = 2875%25;
        String txID1 = "96d92f03000f625a38bf8cb91c01188a02b7972238cc6c4e0c6f334cf755004d";
        String txID2 = "6dd68336c085d5b7b694e2bf6f6c11bca589aea07b6f1c0232bd627c3d217074";
        //for(int i=0; i<pagesIteration;i++) {
            TxnID rb = given().log().all().baseUri("https://blockstream.info").when().get("/api/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732/txs/0").then().extract().response();
        System.out.println(rb);
//            boolean check1 = txID1.equals(rb.getTxid());
//            boolean check2 = txID2.equals(rb.getTxid());
//            if(check1==check2){
//                break;
//            }
        }
    }
//}
