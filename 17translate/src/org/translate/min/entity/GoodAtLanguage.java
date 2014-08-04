package org.translate.min.entity;



/**
 * GoodAtLanguage entity. @author MyEclipse Persistence Tools
 */

public class GoodAtLanguage  implements java.io.Serializable {


    // Fields    

     private Integer gatLanguageId;
     private LiveinTranslator liveinTranslator;
     private Language language;


    // Constructors

    /** default constructor */
    public GoodAtLanguage() {
    }

    
    /** full constructor */
    public GoodAtLanguage(LiveinTranslator liveinTranslator, Language language) {
        this.liveinTranslator = liveinTranslator;
        this.language = language;
    }

   
    // Property accessors

    public Integer getGatLanguageId() {
        return this.gatLanguageId;
    }
    
    public void setGatLanguageId(Integer gatLanguageId) {
        this.gatLanguageId = gatLanguageId;
    }

    public LiveinTranslator getLiveinTranslator() {
        return this.liveinTranslator;
    }
    
    public void setLiveinTranslator(LiveinTranslator liveinTranslator) {
        this.liveinTranslator = liveinTranslator;
    }

    public Language getLanguage() {
        return this.language;
    }
    
    public void setLanguage(Language language) {
        this.language = language;
    }
   








}