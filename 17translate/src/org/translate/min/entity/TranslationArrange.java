package org.translate.min.entity;



/**
 * TranslationArrange entity. @author MyEclipse Persistence Tools
 */

public class TranslationArrange  implements java.io.Serializable {


    // Fields    

     private Integer tranArrangeId;
     private LiveinTranslator liveinTranslator;
     private Order order;
     private String translateStatus;


    // Constructors

    /** default constructor */
    public TranslationArrange() {
    }

    
    /** full constructor */
    public TranslationArrange(LiveinTranslator liveinTranslator, Order order, String translateStatus) {
        this.liveinTranslator = liveinTranslator;
        this.order = order;
        this.translateStatus = translateStatus;
    }

   
    // Property accessors

    public Integer getTranArrangeId() {
        return this.tranArrangeId;
    }
    
    public void setTranArrangeId(Integer tranArrangeId) {
        this.tranArrangeId = tranArrangeId;
    }

    public LiveinTranslator getLiveinTranslator() {
        return this.liveinTranslator;
    }
    
    public void setLiveinTranslator(LiveinTranslator liveinTranslator) {
        this.liveinTranslator = liveinTranslator;
    }

    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }

    public String getTranslateStatus() {
        return this.translateStatus;
    }
    
    public void setTranslateStatus(String translateStatus) {
        this.translateStatus = translateStatus;
    }
   








}