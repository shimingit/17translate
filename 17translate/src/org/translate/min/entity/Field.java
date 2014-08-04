package org.translate.min.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Field entity. @author MyEclipse Persistence Tools
 */

public class Field  implements java.io.Serializable {


    // Fields    

     private Integer fieldId;
     private String fieldName;
     private Set goodAtFields = new HashSet(0);


    // Constructors

    /** default constructor */
    public Field() {
    }

    
    /** full constructor */
    public Field(String fieldName, Set goodAtFields) {
        this.fieldName = fieldName;
        this.goodAtFields = goodAtFields;
    }

   
    // Property accessors

    public Integer getFieldId() {
        return this.fieldId;
    }
    
    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return this.fieldName;
    }
    
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Set getGoodAtFields() {
        return this.goodAtFields;
    }
    
    public void setGoodAtFields(Set goodAtFields) {
        this.goodAtFields = goodAtFields;
    }
   








}