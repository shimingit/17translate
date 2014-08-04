package org.translate.min.entity;



/**
 * GoodAtField entity. @author MyEclipse Persistence Tools
 */

public class GoodAtField  implements java.io.Serializable {


    // Fields    

     private Integer gatFieldId;
     private LiveinTranslator liveinTranslator;
     private Field field;


    // Constructors

    /** default constructor */
    public GoodAtField() {
    }

    
    /** full constructor */
    public GoodAtField(LiveinTranslator liveinTranslator, Field field) {
        this.liveinTranslator = liveinTranslator;
        this.field = field;
    }

   
    // Property accessors

    public Integer getGatFieldId() {
        return this.gatFieldId;
    }
    
    public void setGatFieldId(Integer gatFieldId) {
        this.gatFieldId = gatFieldId;
    }

    public LiveinTranslator getLiveinTranslator() {
        return this.liveinTranslator;
    }
    
    public void setLiveinTranslator(LiveinTranslator liveinTranslator) {
        this.liveinTranslator = liveinTranslator;
    }

    public Field getField() {
        return this.field;
    }
    
    public void setField(Field field) {
        this.field = field;
    }
   








}