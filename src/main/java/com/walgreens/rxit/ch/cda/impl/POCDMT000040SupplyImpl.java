/*
 * XML Type:  POCD_MT000040.Supply
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Supply
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.Supply(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040SupplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040Supply
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040SupplyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMCODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "realmCode");
    private static final javax.xml.namespace.QName TYPEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName CODE$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName TEXT$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "text");
    private static final javax.xml.namespace.QName STATUSCODE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "statusCode");
    private static final javax.xml.namespace.QName EFFECTIVETIME$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "effectiveTime");
    private static final javax.xml.namespace.QName PRIORITYCODE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "priorityCode");
    private static final javax.xml.namespace.QName REPEATNUMBER$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "repeatNumber");
    private static final javax.xml.namespace.QName INDEPENDENTIND$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "independentInd");
    private static final javax.xml.namespace.QName QUANTITY$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "quantity");
    private static final javax.xml.namespace.QName EXPECTEDUSETIME$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "expectedUseTime");
    private static final javax.xml.namespace.QName SUBJECT$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "subject");
    private static final javax.xml.namespace.QName SPECIMEN$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "specimen");
    private static final javax.xml.namespace.QName PRODUCT$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "product");
    private static final javax.xml.namespace.QName PERFORMER$32 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "performer");
    private static final javax.xml.namespace.QName AUTHOR$34 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName INFORMANT$36 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName PARTICIPANT$38 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "participant");
    private static final javax.xml.namespace.QName ENTRYRELATIONSHIP$40 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "entryRelationship");
    private static final javax.xml.namespace.QName REFERENCE$42 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "reference");
    private static final javax.xml.namespace.QName PRECONDITION$44 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "precondition");
    private static final javax.xml.namespace.QName NULLFLAVOR$46 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$48 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$50 = 
        new javax.xml.namespace.QName("", "moodCode");
    
    
    /**
     * Gets array of all "realmCode" elements
     */
    public com.walgreens.rxit.ch.cda.CS[] getRealmCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALMCODE$0, targetList);
            com.walgreens.rxit.ch.cda.CS[] result = new com.walgreens.rxit.ch.cda.CS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "realmCode" element
     */
    public com.walgreens.rxit.ch.cda.CS getRealmCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(REALMCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "realmCode" element
     */
    public int sizeOfRealmCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMCODE$0);
        }
    }
    
    /**
     * Sets array of all "realmCode" element
     */
    public void setRealmCodeArray(com.walgreens.rxit.ch.cda.CS[] realmCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(realmCodeArray, REALMCODE$0);
        }
    }
    
    /**
     * Sets ith "realmCode" element
     */
    public void setRealmCodeArray(int i, com.walgreens.rxit.ch.cda.CS realmCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(REALMCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(realmCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realmCode" element
     */
    public com.walgreens.rxit.ch.cda.CS insertNewRealmCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().insert_element_user(REALMCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realmCode" element
     */
    public com.walgreens.rxit.ch.cda.CS addNewRealmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(REALMCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "realmCode" element
     */
    public void removeRealmCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMCODE$0, i);
        }
    }
    
    /**
     * Gets the "typeId" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId getTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId)get_store().find_element_user(TYPEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "typeId" element
     */
    public boolean isSetTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEID$2) != 0;
        }
    }
    
    /**
     * Sets the "typeId" element
     */
    public void setTypeId(com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId typeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId)get_store().find_element_user(TYPEID$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId)get_store().add_element_user(TYPEID$2);
            }
            target.set(typeId);
        }
    }
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId addNewTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId)get_store().add_element_user(TYPEID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "typeId" element
     */
    public void unsetTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEID$2, 0);
        }
    }
    
    /**
     * Gets array of all "templateId" elements
     */
    public com.walgreens.rxit.ch.cda.II[] getTemplateIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEMPLATEID$4, targetList);
            com.walgreens.rxit.ch.cda.II[] result = new com.walgreens.rxit.ch.cda.II[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "templateId" element
     */
    public com.walgreens.rxit.ch.cda.II getTemplateIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(TEMPLATEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "templateId" element
     */
    public int sizeOfTemplateIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATEID$4);
        }
    }
    
    /**
     * Sets array of all "templateId" element
     */
    public void setTemplateIdArray(com.walgreens.rxit.ch.cda.II[] templateIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(templateIdArray, TEMPLATEID$4);
        }
    }
    
    /**
     * Sets ith "templateId" element
     */
    public void setTemplateIdArray(int i, com.walgreens.rxit.ch.cda.II templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(TEMPLATEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(templateId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "templateId" element
     */
    public com.walgreens.rxit.ch.cda.II insertNewTemplateId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().insert_element_user(TEMPLATEID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "templateId" element
     */
    public com.walgreens.rxit.ch.cda.II addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().add_element_user(TEMPLATEID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "templateId" element
     */
    public void removeTemplateId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATEID$4, i);
        }
    }
    
    /**
     * Gets array of all "id" elements
     */
    public com.walgreens.rxit.ch.cda.II[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$6, targetList);
            com.walgreens.rxit.ch.cda.II[] result = new com.walgreens.rxit.ch.cda.II[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public com.walgreens.rxit.ch.cda.II getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(ID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$6);
        }
    }
    
    /**
     * Sets array of all "id" element
     */
    public void setIdArray(com.walgreens.rxit.ch.cda.II[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$6);
        }
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, com.walgreens.rxit.ch.cda.II id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(ID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public com.walgreens.rxit.ch.cda.II insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().insert_element_user(ID$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public com.walgreens.rxit.ch.cda.II addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().add_element_user(ID$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$6, i);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public com.walgreens.rxit.ch.cda.CD getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$8) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(com.walgreens.rxit.ch.cda.CD code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CD)get_store().add_element_user(CODE$8);
            }
            target.set(code);
        }
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public com.walgreens.rxit.ch.cda.CD addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().add_element_user(CODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$8, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public com.walgreens.rxit.ch.cda.ED getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ED target = null;
            target = (com.walgreens.rxit.ch.cda.ED)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$10) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(com.walgreens.rxit.ch.cda.ED text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ED target = null;
            target = (com.walgreens.rxit.ch.cda.ED)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ED)get_store().add_element_user(TEXT$10);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public com.walgreens.rxit.ch.cda.ED addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ED target = null;
            target = (com.walgreens.rxit.ch.cda.ED)get_store().add_element_user(TEXT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$10, 0);
        }
    }
    
    /**
     * Gets the "statusCode" element
     */
    public com.walgreens.rxit.ch.cda.CS getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(STATUSCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statusCode" element
     */
    public boolean isSetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "statusCode" element
     */
    public void setStatusCode(com.walgreens.rxit.ch.cda.CS statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(STATUSCODE$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(STATUSCODE$12);
            }
            target.set(statusCode);
        }
    }
    
    /**
     * Appends and returns a new empty "statusCode" element
     */
    public com.walgreens.rxit.ch.cda.CS addNewStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(STATUSCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "statusCode" element
     */
    public void unsetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$12, 0);
        }
    }
    
    /**
     * Gets array of all "effectiveTime" elements
     */
    public com.walgreens.rxit.ch.cda.SXCMTS[] getEffectiveTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EFFECTIVETIME$14, targetList);
            com.walgreens.rxit.ch.cda.SXCMTS[] result = new com.walgreens.rxit.ch.cda.SXCMTS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS getEffectiveTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(EFFECTIVETIME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "effectiveTime" element
     */
    public int sizeOfEffectiveTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVETIME$14);
        }
    }
    
    /**
     * Sets array of all "effectiveTime" element
     */
    public void setEffectiveTimeArray(com.walgreens.rxit.ch.cda.SXCMTS[] effectiveTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(effectiveTimeArray, EFFECTIVETIME$14);
        }
    }
    
    /**
     * Sets ith "effectiveTime" element
     */
    public void setEffectiveTimeArray(int i, com.walgreens.rxit.ch.cda.SXCMTS effectiveTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(EFFECTIVETIME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(effectiveTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS insertNewEffectiveTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().insert_element_user(EFFECTIVETIME$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS addNewEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().add_element_user(EFFECTIVETIME$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "effectiveTime" element
     */
    public void removeEffectiveTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVETIME$14, i);
        }
    }
    
    /**
     * Gets array of all "priorityCode" elements
     */
    public com.walgreens.rxit.ch.cda.CE[] getPriorityCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIORITYCODE$16, targetList);
            com.walgreens.rxit.ch.cda.CE[] result = new com.walgreens.rxit.ch.cda.CE[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "priorityCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getPriorityCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(PRIORITYCODE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "priorityCode" element
     */
    public int sizeOfPriorityCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITYCODE$16);
        }
    }
    
    /**
     * Sets array of all "priorityCode" element
     */
    public void setPriorityCodeArray(com.walgreens.rxit.ch.cda.CE[] priorityCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(priorityCodeArray, PRIORITYCODE$16);
        }
    }
    
    /**
     * Sets ith "priorityCode" element
     */
    public void setPriorityCodeArray(int i, com.walgreens.rxit.ch.cda.CE priorityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(PRIORITYCODE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(priorityCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "priorityCode" element
     */
    public com.walgreens.rxit.ch.cda.CE insertNewPriorityCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().insert_element_user(PRIORITYCODE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "priorityCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewPriorityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(PRIORITYCODE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "priorityCode" element
     */
    public void removePriorityCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITYCODE$16, i);
        }
    }
    
    /**
     * Gets the "repeatNumber" element
     */
    public com.walgreens.rxit.ch.cda.IVLINT getRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLINT target = null;
            target = (com.walgreens.rxit.ch.cda.IVLINT)get_store().find_element_user(REPEATNUMBER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "repeatNumber" element
     */
    public boolean isSetRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPEATNUMBER$18) != 0;
        }
    }
    
    /**
     * Sets the "repeatNumber" element
     */
    public void setRepeatNumber(com.walgreens.rxit.ch.cda.IVLINT repeatNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLINT target = null;
            target = (com.walgreens.rxit.ch.cda.IVLINT)get_store().find_element_user(REPEATNUMBER$18, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLINT)get_store().add_element_user(REPEATNUMBER$18);
            }
            target.set(repeatNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "repeatNumber" element
     */
    public com.walgreens.rxit.ch.cda.IVLINT addNewRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLINT target = null;
            target = (com.walgreens.rxit.ch.cda.IVLINT)get_store().add_element_user(REPEATNUMBER$18);
            return target;
        }
    }
    
    /**
     * Unsets the "repeatNumber" element
     */
    public void unsetRepeatNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPEATNUMBER$18, 0);
        }
    }
    
    /**
     * Gets the "independentInd" element
     */
    public com.walgreens.rxit.ch.cda.BL getIndependentInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BL target = null;
            target = (com.walgreens.rxit.ch.cda.BL)get_store().find_element_user(INDEPENDENTIND$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "independentInd" element
     */
    public boolean isSetIndependentInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDEPENDENTIND$20) != 0;
        }
    }
    
    /**
     * Sets the "independentInd" element
     */
    public void setIndependentInd(com.walgreens.rxit.ch.cda.BL independentInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BL target = null;
            target = (com.walgreens.rxit.ch.cda.BL)get_store().find_element_user(INDEPENDENTIND$20, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.BL)get_store().add_element_user(INDEPENDENTIND$20);
            }
            target.set(independentInd);
        }
    }
    
    /**
     * Appends and returns a new empty "independentInd" element
     */
    public com.walgreens.rxit.ch.cda.BL addNewIndependentInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BL target = null;
            target = (com.walgreens.rxit.ch.cda.BL)get_store().add_element_user(INDEPENDENTIND$20);
            return target;
        }
    }
    
    /**
     * Unsets the "independentInd" element
     */
    public void unsetIndependentInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDEPENDENTIND$20, 0);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public com.walgreens.rxit.ch.cda.PQ getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(QUANTITY$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$22) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(com.walgreens.rxit.ch.cda.PQ quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(QUANTITY$22, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(QUANTITY$22);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(QUANTITY$22);
            return target;
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$22, 0);
        }
    }
    
    /**
     * Gets the "expectedUseTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS getExpectedUseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(EXPECTEDUSETIME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expectedUseTime" element
     */
    public boolean isSetExpectedUseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDUSETIME$24) != 0;
        }
    }
    
    /**
     * Sets the "expectedUseTime" element
     */
    public void setExpectedUseTime(com.walgreens.rxit.ch.cda.IVLTS expectedUseTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(EXPECTEDUSETIME$24, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(EXPECTEDUSETIME$24);
            }
            target.set(expectedUseTime);
        }
    }
    
    /**
     * Appends and returns a new empty "expectedUseTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS addNewExpectedUseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(EXPECTEDUSETIME$24);
            return target;
        }
    }
    
    /**
     * Unsets the "expectedUseTime" element
     */
    public void unsetExpectedUseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDUSETIME$24, 0);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Subject getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Subject target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$26) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(com.walgreens.rxit.ch.cda.POCDMT000040Subject subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Subject target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().add_element_user(SUBJECT$26);
            }
            target.set(subject);
        }
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Subject addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Subject target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().add_element_user(SUBJECT$26);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$26, 0);
        }
    }
    
    /**
     * Gets array of all "specimen" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Specimen[] getSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIMEN$28, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Specimen[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Specimen[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specimen" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Specimen getSpecimenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Specimen target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().find_element_user(SPECIMEN$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specimen" element
     */
    public int sizeOfSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$28);
        }
    }
    
    /**
     * Sets array of all "specimen" element
     */
    public void setSpecimenArray(com.walgreens.rxit.ch.cda.POCDMT000040Specimen[] specimenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(specimenArray, SPECIMEN$28);
        }
    }
    
    /**
     * Sets ith "specimen" element
     */
    public void setSpecimenArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Specimen specimen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Specimen target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().find_element_user(SPECIMEN$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specimen);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Specimen insertNewSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Specimen target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().insert_element_user(SPECIMEN$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Specimen addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Specimen target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().add_element_user(SPECIMEN$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "specimen" element
     */
    public void removeSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$28, i);
        }
    }
    
    /**
     * Gets the "product" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Product getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Product target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Product)get_store().find_element_user(PRODUCT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "product" element
     */
    public boolean isSetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$30) != 0;
        }
    }
    
    /**
     * Sets the "product" element
     */
    public void setProduct(com.walgreens.rxit.ch.cda.POCDMT000040Product product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Product target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Product)get_store().find_element_user(PRODUCT$30, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Product)get_store().add_element_user(PRODUCT$30);
            }
            target.set(product);
        }
    }
    
    /**
     * Appends and returns a new empty "product" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Product target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Product)get_store().add_element_user(PRODUCT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "product" element
     */
    public void unsetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$30, 0);
        }
    }
    
    /**
     * Gets array of all "performer" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Performer2[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$32, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Performer2[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Performer2[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "performer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Performer2 getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Performer2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().find_element_user(PERFORMER$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "performer" element
     */
    public int sizeOfPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$32);
        }
    }
    
    /**
     * Sets array of all "performer" element
     */
    public void setPerformerArray(com.walgreens.rxit.ch.cda.POCDMT000040Performer2[] performerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(performerArray, PERFORMER$32);
        }
    }
    
    /**
     * Sets ith "performer" element
     */
    public void setPerformerArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Performer2 performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Performer2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().find_element_user(PERFORMER$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(performer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Performer2 insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Performer2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().insert_element_user(PERFORMER$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Performer2 addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Performer2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().add_element_user(PERFORMER$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "performer" element
     */
    public void removePerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$32, i);
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Author[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$34, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Author[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Author[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Author getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Author target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$34);
        }
    }
    
    /**
     * Sets array of all "author" element
     */
    public void setAuthorArray(com.walgreens.rxit.ch.cda.POCDMT000040Author[] authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$34);
        }
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Author author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Author target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Author insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Author target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().insert_element_user(AUTHOR$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Author target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().add_element_user(AUTHOR$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$34, i);
        }
    }
    
    /**
     * Gets array of all "informant" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Informant12[] getInformantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMANT$36, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Informant12[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Informant12[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "informant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Informant12 getInformantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Informant12 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "informant" element
     */
    public int sizeOfInformantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMANT$36);
        }
    }
    
    /**
     * Sets array of all "informant" element
     */
    public void setInformantArray(com.walgreens.rxit.ch.cda.POCDMT000040Informant12[] informantArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(informantArray, INFORMANT$36);
        }
    }
    
    /**
     * Sets ith "informant" element
     */
    public void setInformantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Informant12 informant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Informant12 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(informant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Informant12 insertNewInformant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Informant12 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().insert_element_user(INFORMANT$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Informant12 addNewInformant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Informant12 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().add_element_user(INFORMANT$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "informant" element
     */
    public void removeInformant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMANT$36, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant2[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$38, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Participant2[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Participant2[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant2 getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().find_element_user(PARTICIPANT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$38);
        }
    }
    
    /**
     * Sets array of all "participant" element
     */
    public void setParticipantArray(com.walgreens.rxit.ch.cda.POCDMT000040Participant2[] participantArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantArray, PARTICIPANT$38);
        }
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Participant2 participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().find_element_user(PARTICIPANT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant2 insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().insert_element_user(PARTICIPANT$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant2 addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().add_element_user(PARTICIPANT$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$38, i);
        }
    }
    
    /**
     * Gets array of all "entryRelationship" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship[] getEntryRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRYRELATIONSHIP$40, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship[] result = new com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entryRelationship" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship getEntryRelationshipArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship)get_store().find_element_user(ENTRYRELATIONSHIP$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entryRelationship" element
     */
    public int sizeOfEntryRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRYRELATIONSHIP$40);
        }
    }
    
    /**
     * Sets array of all "entryRelationship" element
     */
    public void setEntryRelationshipArray(com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship[] entryRelationshipArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryRelationshipArray, ENTRYRELATIONSHIP$40);
        }
    }
    
    /**
     * Sets ith "entryRelationship" element
     */
    public void setEntryRelationshipArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship entryRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship)get_store().find_element_user(ENTRYRELATIONSHIP$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entryRelationship);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryRelationship" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship insertNewEntryRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship)get_store().insert_element_user(ENTRYRELATIONSHIP$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entryRelationship" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship addNewEntryRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship)get_store().add_element_user(ENTRYRELATIONSHIP$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "entryRelationship" element
     */
    public void removeEntryRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRYRELATIONSHIP$40, i);
        }
    }
    
    /**
     * Gets array of all "reference" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Reference[] getReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCE$42, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Reference[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Reference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reference" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Reference getReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Reference target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().find_element_user(REFERENCE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reference" element
     */
    public int sizeOfReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$42);
        }
    }
    
    /**
     * Sets array of all "reference" element
     */
    public void setReferenceArray(com.walgreens.rxit.ch.cda.POCDMT000040Reference[] referenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(referenceArray, REFERENCE$42);
        }
    }
    
    /**
     * Sets ith "reference" element
     */
    public void setReferenceArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Reference reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Reference target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().find_element_user(REFERENCE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Reference insertNewReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Reference target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().insert_element_user(REFERENCE$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Reference addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Reference target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().add_element_user(REFERENCE$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "reference" element
     */
    public void removeReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$42, i);
        }
    }
    
    /**
     * Gets array of all "precondition" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Precondition[] getPreconditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRECONDITION$44, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Precondition[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Precondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "precondition" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Precondition getPreconditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Precondition target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().find_element_user(PRECONDITION$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "precondition" element
     */
    public int sizeOfPreconditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECONDITION$44);
        }
    }
    
    /**
     * Sets array of all "precondition" element
     */
    public void setPreconditionArray(com.walgreens.rxit.ch.cda.POCDMT000040Precondition[] preconditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(preconditionArray, PRECONDITION$44);
        }
    }
    
    /**
     * Sets ith "precondition" element
     */
    public void setPreconditionArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Precondition precondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Precondition target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().find_element_user(PRECONDITION$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(precondition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "precondition" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Precondition insertNewPrecondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Precondition target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().insert_element_user(PRECONDITION$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "precondition" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Precondition addNewPrecondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Precondition target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().add_element_user(PRECONDITION$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "precondition" element
     */
    public void removePrecondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECONDITION$44, i);
        }
    }
    
    /**
     * Gets the "nullFlavor" attribute
     */
    public java.lang.String getNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    public com.walgreens.rxit.ch.cda.NullFlavor xgetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.NullFlavor target = null;
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$46);
            return target;
        }
    }
    
    /**
     * True if has "nullFlavor" attribute
     */
    public boolean isSetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NULLFLAVOR$46) != null;
        }
    }
    
    /**
     * Sets the "nullFlavor" attribute
     */
    public void setNullFlavor(java.lang.String nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$46);
            }
            target.setStringValue(nullFlavor);
        }
    }
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    public void xsetNullFlavor(com.walgreens.rxit.ch.cda.NullFlavor nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.NullFlavor target = null;
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$46);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$46);
            }
            target.set(nullFlavor);
        }
    }
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    public void unsetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NULLFLAVOR$46);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.ActClassSupply.Enum getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$48);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.ActClassSupply.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.ActClassSupply xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActClassSupply target = null;
            target = (com.walgreens.rxit.ch.cda.ActClassSupply)get_store().find_attribute_user(CLASSCODE$48);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClassSupply)get_default_attribute_value(CLASSCODE$48);
            }
            return target;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(com.walgreens.rxit.ch.cda.ActClassSupply.Enum classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$48);
            }
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(com.walgreens.rxit.ch.cda.ActClassSupply classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActClassSupply target = null;
            target = (com.walgreens.rxit.ch.cda.ActClassSupply)get_store().find_attribute_user(CLASSCODE$48);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClassSupply)get_store().add_attribute_user(CLASSCODE$48);
            }
            target.set(classCode);
        }
    }
    
    /**
     * Gets the "moodCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XDocumentSubstanceMood.Enum getMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$50);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.XDocumentSubstanceMood.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XDocumentSubstanceMood xgetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XDocumentSubstanceMood target = null;
            target = (com.walgreens.rxit.ch.cda.XDocumentSubstanceMood)get_store().find_attribute_user(MOODCODE$50);
            return target;
        }
    }
    
    /**
     * Sets the "moodCode" attribute
     */
    public void setMoodCode(com.walgreens.rxit.ch.cda.XDocumentSubstanceMood.Enum moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$50);
            }
            target.setEnumValue(moodCode);
        }
    }
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    public void xsetMoodCode(com.walgreens.rxit.ch.cda.XDocumentSubstanceMood moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XDocumentSubstanceMood target = null;
            target = (com.walgreens.rxit.ch.cda.XDocumentSubstanceMood)get_store().find_attribute_user(MOODCODE$50);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XDocumentSubstanceMood)get_store().add_attribute_user(MOODCODE$50);
            }
            target.set(moodCode);
        }
    }
}
