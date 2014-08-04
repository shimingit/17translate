package org.translate.min.entity;



/**
 * FreeTranslator entity. @author MyEclipse Persistence Tools
 */

public class FreeTranslator  implements java.io.Serializable {


    // Fields    

     private Integer ftranslatorId;
     private String fuserName;
     private String fpassword;
     private String fmailBox;
     private String fphoneNumber;
     private byte[] fphoto;
     private String fselfDescription;
     private Integer ffans;
     private Integer ftranslationCoin;


    // Constructors

    /** default constructor */
    public FreeTranslator() {
    }

	/** minimal constructor */
    public FreeTranslator(String fuserName, String fpassword) {
        this.fuserName = fuserName;
        this.fpassword = fpassword;
    }
    
    /** full constructor */
    public FreeTranslator(String fuserName, String fpassword, String fmailBox, String fphoneNumber, byte[] fphoto, String fselfDescription, Integer ffans, Integer ftranslationCoin) {
        this.fuserName = fuserName;
        this.fpassword = fpassword;
        this.fmailBox = fmailBox;
        this.fphoneNumber = fphoneNumber;
        this.fphoto = fphoto;
        this.fselfDescription = fselfDescription;
        this.ffans = ffans;
        this.ftranslationCoin = ftranslationCoin;
    }

   
    // Property accessors

    public Integer getFtranslatorId() {
        return this.ftranslatorId;
    }
    
    public void setFtranslatorId(Integer ftranslatorId) {
        this.ftranslatorId = ftranslatorId;
    }

    public String getFuserName() {
        return this.fuserName;
    }
    
    public void setFuserName(String fuserName) {
        this.fuserName = fuserName;
    }

    public String getFpassword() {
        return this.fpassword;
    }
    
    public void setFpassword(String fpassword) {
        this.fpassword = fpassword;
    }

    public String getFmailBox() {
        return this.fmailBox;
    }
    
    public void setFmailBox(String fmailBox) {
        this.fmailBox = fmailBox;
    }

    public String getFphoneNumber() {
        return this.fphoneNumber;
    }
    
    public void setFphoneNumber(String fphoneNumber) {
        this.fphoneNumber = fphoneNumber;
    }

    public byte[] getFphoto() {
        return this.fphoto;
    }
    
    public void setFphoto(byte[] fphoto) {
        this.fphoto = fphoto;
    }

    public String getFselfDescription() {
        return this.fselfDescription;
    }
    
    public void setFselfDescription(String fselfDescription) {
        this.fselfDescription = fselfDescription;
    }

    public Integer getFfans() {
        return this.ffans;
    }
    
    public void setFfans(Integer ffans) {
        this.ffans = ffans;
    }

    public Integer getFtranslationCoin() {
        return this.ftranslationCoin;
    }
    
    public void setFtranslationCoin(Integer ftranslationCoin) {
        this.ftranslationCoin = ftranslationCoin;
    }
   








}