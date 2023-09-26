package org.example;

public class Document {
    private int docNo;
    private String docDescription;
    private double transactionAmount;
    //Methods
    public int getdocNo() {
        return docNo;
    }
    public void setdocNo(int dNo) {
        this.docNo= dNo;
    }
    public String getDocDescription() {
        return docDescription;
    }
    public void setDocDescription(String desc){
        this.docDescription = desc;
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(int tAmt) {
        this.docNo= tAmt;
    }
}
