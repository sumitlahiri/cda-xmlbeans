/*
 * XML Type:  POCD_MT000040.ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.ClinicalDocument(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040ClinicalDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040ClinicalDocument1Impl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName TITLE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "title");
    private static final javax.xml.namespace.QName EFFECTIVETIME$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "effectiveTime");
    private static final javax.xml.namespace.QName CONFIDENTIALITYCODE$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "confidentialityCode");
    private static final javax.xml.namespace.QName LANGUAGECODE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "languageCode");
    private static final javax.xml.namespace.QName SETID$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "setId");
    private static final javax.xml.namespace.QName VERSIONNUMBER$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "versionNumber");
    private static final javax.xml.namespace.QName COPYTIME$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "copyTime");
    private static final javax.xml.namespace.QName RECORDTARGET$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "recordTarget");
    private static final javax.xml.namespace.QName AUTHOR$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName DATAENTERER$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "dataEnterer");
    private static final javax.xml.namespace.QName INFORMANT$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName CUSTODIAN$32 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "custodian");
    private static final javax.xml.namespace.QName INFORMATIONRECIPIENT$34 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informationRecipient");
    private static final javax.xml.namespace.QName LEGALAUTHENTICATOR$36 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "legalAuthenticator");
    private static final javax.xml.namespace.QName AUTHENTICATOR$38 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "authenticator");
    private static final javax.xml.namespace.QName PARTICIPANT$40 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "participant");
    private static final javax.xml.namespace.QName INFULFILLMENTOF$42 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "inFulfillmentOf");
    private static final javax.xml.namespace.QName DOCUMENTATIONOF$44 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "documentationOf");
    private static final javax.xml.namespace.QName RELATEDDOCUMENT$46 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "relatedDocument");
    private static final javax.xml.namespace.QName AUTHORIZATION$48 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "authorization");
    private static final javax.xml.namespace.QName COMPONENTOF$50 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "componentOf");
    private static final javax.xml.namespace.QName COMPONENT$52 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "component");
    private static final javax.xml.namespace.QName NULLFLAVOR$54 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$56 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$58 = 
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
     * Gets the "id" element
     */
    public com.walgreens.rxit.ch.cda.II getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(com.walgreens.rxit.ch.cda.II id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.II)get_store().add_element_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Appends and returns a new empty "id" element
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
     * Gets the "code" element
     */
    public com.walgreens.rxit.ch.cda.CE getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(com.walgreens.rxit.ch.cda.CE code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CODE$8);
            }
            target.set(code);
        }
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CODE$8);
            return target;
        }
    }
    
    /**
     * Gets the "title" element
     */
    public com.walgreens.rxit.ch.cda.ST getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ST target = null;
            target = (com.walgreens.rxit.ch.cda.ST)get_store().find_element_user(TITLE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$10) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(com.walgreens.rxit.ch.cda.ST title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ST target = null;
            target = (com.walgreens.rxit.ch.cda.ST)get_store().find_element_user(TITLE$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ST)get_store().add_element_user(TITLE$10);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public com.walgreens.rxit.ch.cda.ST addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ST target = null;
            target = (com.walgreens.rxit.ch.cda.ST)get_store().add_element_user(TITLE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$10, 0);
        }
    }
    
    /**
     * Gets the "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.TS getEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(EFFECTIVETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "effectiveTime" element
     */
    public void setEffectiveTime(com.walgreens.rxit.ch.cda.TS effectiveTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(EFFECTIVETIME$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(EFFECTIVETIME$12);
            }
            target.set(effectiveTime);
        }
    }
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.TS addNewEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(EFFECTIVETIME$12);
            return target;
        }
    }
    
    /**
     * Gets the "confidentialityCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CONFIDENTIALITYCODE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "confidentialityCode" element
     */
    public void setConfidentialityCode(com.walgreens.rxit.ch.cda.CE confidentialityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CONFIDENTIALITYCODE$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CONFIDENTIALITYCODE$14);
            }
            target.set(confidentialityCode);
        }
    }
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CONFIDENTIALITYCODE$14);
            return target;
        }
    }
    
    /**
     * Gets the "languageCode" element
     */
    public com.walgreens.rxit.ch.cda.CS getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(LANGUAGECODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "languageCode" element
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECODE$16) != 0;
        }
    }
    
    /**
     * Sets the "languageCode" element
     */
    public void setLanguageCode(com.walgreens.rxit.ch.cda.CS languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(LANGUAGECODE$16, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(LANGUAGECODE$16);
            }
            target.set(languageCode);
        }
    }
    
    /**
     * Appends and returns a new empty "languageCode" element
     */
    public com.walgreens.rxit.ch.cda.CS addNewLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(LANGUAGECODE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "languageCode" element
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECODE$16, 0);
        }
    }
    
    /**
     * Gets the "setId" element
     */
    public com.walgreens.rxit.ch.cda.II getSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(SETID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "setId" element
     */
    public boolean isSetSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETID$18) != 0;
        }
    }
    
    /**
     * Sets the "setId" element
     */
    public void setSetId(com.walgreens.rxit.ch.cda.II setId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().find_element_user(SETID$18, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.II)get_store().add_element_user(SETID$18);
            }
            target.set(setId);
        }
    }
    
    /**
     * Appends and returns a new empty "setId" element
     */
    public com.walgreens.rxit.ch.cda.II addNewSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.II target = null;
            target = (com.walgreens.rxit.ch.cda.II)get_store().add_element_user(SETID$18);
            return target;
        }
    }
    
    /**
     * Unsets the "setId" element
     */
    public void unsetSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETID$18, 0);
        }
    }
    
    /**
     * Gets the "versionNumber" element
     */
    public com.walgreens.rxit.ch.cda.INT getVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.INT target = null;
            target = (com.walgreens.rxit.ch.cda.INT)get_store().find_element_user(VERSIONNUMBER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "versionNumber" element
     */
    public boolean isSetVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONNUMBER$20) != 0;
        }
    }
    
    /**
     * Sets the "versionNumber" element
     */
    public void setVersionNumber(com.walgreens.rxit.ch.cda.INT versionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.INT target = null;
            target = (com.walgreens.rxit.ch.cda.INT)get_store().find_element_user(VERSIONNUMBER$20, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.INT)get_store().add_element_user(VERSIONNUMBER$20);
            }
            target.set(versionNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "versionNumber" element
     */
    public com.walgreens.rxit.ch.cda.INT addNewVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.INT target = null;
            target = (com.walgreens.rxit.ch.cda.INT)get_store().add_element_user(VERSIONNUMBER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "versionNumber" element
     */
    public void unsetVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONNUMBER$20, 0);
        }
    }
    
    /**
     * Gets the "copyTime" element
     */
    public com.walgreens.rxit.ch.cda.TS getCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(COPYTIME$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "copyTime" element
     */
    public boolean isSetCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COPYTIME$22) != 0;
        }
    }
    
    /**
     * Sets the "copyTime" element
     */
    public void setCopyTime(com.walgreens.rxit.ch.cda.TS copyTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(COPYTIME$22, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(COPYTIME$22);
            }
            target.set(copyTime);
        }
    }
    
    /**
     * Appends and returns a new empty "copyTime" element
     */
    public com.walgreens.rxit.ch.cda.TS addNewCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(COPYTIME$22);
            return target;
        }
    }
    
    /**
     * Unsets the "copyTime" element
     */
    public void unsetCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COPYTIME$22, 0);
        }
    }
    
    /**
     * Gets array of all "recordTarget" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget[] getRecordTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECORDTARGET$24, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget[] result = new com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recordTarget" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget getRecordTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget)get_store().find_element_user(RECORDTARGET$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recordTarget" element
     */
    public int sizeOfRecordTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDTARGET$24);
        }
    }
    
    /**
     * Sets array of all "recordTarget" element
     */
    public void setRecordTargetArray(com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget[] recordTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recordTargetArray, RECORDTARGET$24);
        }
    }
    
    /**
     * Sets ith "recordTarget" element
     */
    public void setRecordTargetArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget recordTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget)get_store().find_element_user(RECORDTARGET$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recordTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordTarget" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget insertNewRecordTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget)get_store().insert_element_user(RECORDTARGET$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordTarget" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget addNewRecordTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget)get_store().add_element_user(RECORDTARGET$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "recordTarget" element
     */
    public void removeRecordTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDTARGET$24, i);
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
            get_store().find_all_element_users(AUTHOR$26, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$26, i);
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
            return get_store().count_elements(AUTHOR$26);
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
            arraySetterHelper(authorArray, AUTHOR$26);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$26, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().insert_element_user(AUTHOR$26, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().add_element_user(AUTHOR$26);
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
            get_store().remove_element(AUTHOR$26, i);
        }
    }
    
    /**
     * Gets the "dataEnterer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer getDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer)get_store().find_element_user(DATAENTERER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataEnterer" element
     */
    public boolean isSetDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAENTERER$28) != 0;
        }
    }
    
    /**
     * Sets the "dataEnterer" element
     */
    public void setDataEnterer(com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer dataEnterer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer)get_store().find_element_user(DATAENTERER$28, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer)get_store().add_element_user(DATAENTERER$28);
            }
            target.set(dataEnterer);
        }
    }
    
    /**
     * Appends and returns a new empty "dataEnterer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer addNewDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer)get_store().add_element_user(DATAENTERER$28);
            return target;
        }
    }
    
    /**
     * Unsets the "dataEnterer" element
     */
    public void unsetDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAENTERER$28, 0);
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
            get_store().find_all_element_users(INFORMANT$30, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$30, i);
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
            return get_store().count_elements(INFORMANT$30);
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
            arraySetterHelper(informantArray, INFORMANT$30);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$30, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().insert_element_user(INFORMANT$30, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().add_element_user(INFORMANT$30);
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
            get_store().remove_element(INFORMANT$30, i);
        }
    }
    
    /**
     * Gets the "custodian" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Custodian getCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Custodian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Custodian)get_store().find_element_user(CUSTODIAN$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "custodian" element
     */
    public void setCustodian(com.walgreens.rxit.ch.cda.POCDMT000040Custodian custodian)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Custodian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Custodian)get_store().find_element_user(CUSTODIAN$32, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Custodian)get_store().add_element_user(CUSTODIAN$32);
            }
            target.set(custodian);
        }
    }
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Custodian addNewCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Custodian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Custodian)get_store().add_element_user(CUSTODIAN$32);
            return target;
        }
    }
    
    /**
     * Gets array of all "informationRecipient" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient[] getInformationRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMATIONRECIPIENT$34, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient[] result = new com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "informationRecipient" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient getInformationRecipientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient)get_store().find_element_user(INFORMATIONRECIPIENT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "informationRecipient" element
     */
    public int sizeOfInformationRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMATIONRECIPIENT$34);
        }
    }
    
    /**
     * Sets array of all "informationRecipient" element
     */
    public void setInformationRecipientArray(com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient[] informationRecipientArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(informationRecipientArray, INFORMATIONRECIPIENT$34);
        }
    }
    
    /**
     * Sets ith "informationRecipient" element
     */
    public void setInformationRecipientArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient informationRecipient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient)get_store().find_element_user(INFORMATIONRECIPIENT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(informationRecipient);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationRecipient" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient insertNewInformationRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient)get_store().insert_element_user(INFORMATIONRECIPIENT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informationRecipient" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient addNewInformationRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient)get_store().add_element_user(INFORMATIONRECIPIENT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "informationRecipient" element
     */
    public void removeInformationRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMATIONRECIPIENT$34, i);
        }
    }
    
    /**
     * Gets the "legalAuthenticator" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator getLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator)get_store().find_element_user(LEGALAUTHENTICATOR$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legalAuthenticator" element
     */
    public boolean isSetLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALAUTHENTICATOR$36) != 0;
        }
    }
    
    /**
     * Sets the "legalAuthenticator" element
     */
    public void setLegalAuthenticator(com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator legalAuthenticator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator)get_store().find_element_user(LEGALAUTHENTICATOR$36, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator)get_store().add_element_user(LEGALAUTHENTICATOR$36);
            }
            target.set(legalAuthenticator);
        }
    }
    
    /**
     * Appends and returns a new empty "legalAuthenticator" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator addNewLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator)get_store().add_element_user(LEGALAUTHENTICATOR$36);
            return target;
        }
    }
    
    /**
     * Unsets the "legalAuthenticator" element
     */
    public void unsetLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALAUTHENTICATOR$36, 0);
        }
    }
    
    /**
     * Gets array of all "authenticator" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authenticator[] getAuthenticatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHENTICATOR$38, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Authenticator[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Authenticator[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "authenticator" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authenticator getAuthenticatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authenticator)get_store().find_element_user(AUTHENTICATOR$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "authenticator" element
     */
    public int sizeOfAuthenticatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATOR$38);
        }
    }
    
    /**
     * Sets array of all "authenticator" element
     */
    public void setAuthenticatorArray(com.walgreens.rxit.ch.cda.POCDMT000040Authenticator[] authenticatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authenticatorArray, AUTHENTICATOR$38);
        }
    }
    
    /**
     * Sets ith "authenticator" element
     */
    public void setAuthenticatorArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Authenticator authenticator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authenticator)get_store().find_element_user(AUTHENTICATOR$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(authenticator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authenticator" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authenticator insertNewAuthenticator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authenticator)get_store().insert_element_user(AUTHENTICATOR$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authenticator" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authenticator addNewAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authenticator target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authenticator)get_store().add_element_user(AUTHENTICATOR$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "authenticator" element
     */
    public void removeAuthenticator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATOR$38, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant1[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$40, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Participant1[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Participant1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant1 getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant1)get_store().find_element_user(PARTICIPANT$40, i);
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
            return get_store().count_elements(PARTICIPANT$40);
        }
    }
    
    /**
     * Sets array of all "participant" element
     */
    public void setParticipantArray(com.walgreens.rxit.ch.cda.POCDMT000040Participant1[] participantArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(participantArray, PARTICIPANT$40);
        }
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Participant1 participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant1)get_store().find_element_user(PARTICIPANT$40, i);
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
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant1 insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant1)get_store().insert_element_user(PARTICIPANT$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Participant1 addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Participant1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant1)get_store().add_element_user(PARTICIPANT$40);
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
            get_store().remove_element(PARTICIPANT$40, i);
        }
    }
    
    /**
     * Gets array of all "inFulfillmentOf" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf[] getInFulfillmentOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFULFILLMENTOF$42, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf[] result = new com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inFulfillmentOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf getInFulfillmentOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf)get_store().find_element_user(INFULFILLMENTOF$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inFulfillmentOf" element
     */
    public int sizeOfInFulfillmentOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFULFILLMENTOF$42);
        }
    }
    
    /**
     * Sets array of all "inFulfillmentOf" element
     */
    public void setInFulfillmentOfArray(com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf[] inFulfillmentOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inFulfillmentOfArray, INFULFILLMENTOF$42);
        }
    }
    
    /**
     * Sets ith "inFulfillmentOf" element
     */
    public void setInFulfillmentOfArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf inFulfillmentOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf)get_store().find_element_user(INFULFILLMENTOF$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inFulfillmentOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inFulfillmentOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf insertNewInFulfillmentOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf)get_store().insert_element_user(INFULFILLMENTOF$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inFulfillmentOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf addNewInFulfillmentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf)get_store().add_element_user(INFULFILLMENTOF$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "inFulfillmentOf" element
     */
    public void removeInFulfillmentOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFULFILLMENTOF$42, i);
        }
    }
    
    /**
     * Gets array of all "documentationOf" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf[] getDocumentationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTATIONOF$44, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf[] result = new com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentationOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf getDocumentationOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf)get_store().find_element_user(DOCUMENTATIONOF$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentationOf" element
     */
    public int sizeOfDocumentationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATIONOF$44);
        }
    }
    
    /**
     * Sets array of all "documentationOf" element
     */
    public void setDocumentationOfArray(com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf[] documentationOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentationOfArray, DOCUMENTATIONOF$44);
        }
    }
    
    /**
     * Sets ith "documentationOf" element
     */
    public void setDocumentationOfArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf documentationOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf)get_store().find_element_user(DOCUMENTATIONOF$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentationOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf insertNewDocumentationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf)get_store().insert_element_user(DOCUMENTATIONOF$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf addNewDocumentationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf)get_store().add_element_user(DOCUMENTATIONOF$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentationOf" element
     */
    public void removeDocumentationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATIONOF$44, i);
        }
    }
    
    /**
     * Gets array of all "relatedDocument" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1[] getRelatedDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDDOCUMENT$46, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1[] result = new com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 getRelatedDocumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1)get_store().find_element_user(RELATEDDOCUMENT$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedDocument" element
     */
    public int sizeOfRelatedDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDDOCUMENT$46);
        }
    }
    
    /**
     * Sets array of all "relatedDocument" element
     */
    public void setRelatedDocumentArray(com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1[] relatedDocumentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relatedDocumentArray, RELATEDDOCUMENT$46);
        }
    }
    
    /**
     * Sets ith "relatedDocument" element
     */
    public void setRelatedDocumentArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 relatedDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1)get_store().find_element_user(RELATEDDOCUMENT$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedDocument);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 insertNewRelatedDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1)get_store().insert_element_user(RELATEDDOCUMENT$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 addNewRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1)get_store().add_element_user(RELATEDDOCUMENT$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedDocument" element
     */
    public void removeRelatedDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDDOCUMENT$46, i);
        }
    }
    
    /**
     * Gets array of all "authorization" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authorization[] getAuthorizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHORIZATION$48, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Authorization[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Authorization[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "authorization" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authorization getAuthorizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authorization target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authorization)get_store().find_element_user(AUTHORIZATION$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "authorization" element
     */
    public int sizeOfAuthorizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORIZATION$48);
        }
    }
    
    /**
     * Sets array of all "authorization" element
     */
    public void setAuthorizationArray(com.walgreens.rxit.ch.cda.POCDMT000040Authorization[] authorizationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorizationArray, AUTHORIZATION$48);
        }
    }
    
    /**
     * Sets ith "authorization" element
     */
    public void setAuthorizationArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Authorization authorization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authorization target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authorization)get_store().find_element_user(AUTHORIZATION$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(authorization);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorization" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authorization insertNewAuthorization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authorization target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authorization)get_store().insert_element_user(AUTHORIZATION$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorization" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Authorization addNewAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Authorization target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Authorization)get_store().add_element_user(AUTHORIZATION$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "authorization" element
     */
    public void removeAuthorization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORIZATION$48, i);
        }
    }
    
    /**
     * Gets the "componentOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component1 getComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component1)get_store().find_element_user(COMPONENTOF$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "componentOf" element
     */
    public boolean isSetComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTOF$50) != 0;
        }
    }
    
    /**
     * Sets the "componentOf" element
     */
    public void setComponentOf(com.walgreens.rxit.ch.cda.POCDMT000040Component1 componentOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component1)get_store().find_element_user(COMPONENTOF$50, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Component1)get_store().add_element_user(COMPONENTOF$50);
            }
            target.set(componentOf);
        }
    }
    
    /**
     * Appends and returns a new empty "componentOf" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component1 addNewComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component1)get_store().add_element_user(COMPONENTOF$50);
            return target;
        }
    }
    
    /**
     * Unsets the "componentOf" element
     */
    public void unsetComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTOF$50, 0);
        }
    }
    
    /**
     * Gets the "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component2 getComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component2)get_store().find_element_user(COMPONENT$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "component" element
     */
    public void setComponent(com.walgreens.rxit.ch.cda.POCDMT000040Component2 component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component2)get_store().find_element_user(COMPONENT$52, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Component2)get_store().add_element_user(COMPONENT$52);
            }
            target.set(component);
        }
    }
    
    /**
     * Appends and returns a new empty "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component2 addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component2 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component2)get_store().add_element_user(COMPONENT$52);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$54);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$54);
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
            return get_store().find_attribute_user(NULLFLAVOR$54) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$54);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$54);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$54);
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
            get_store().remove_attribute(NULLFLAVOR$54);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.ActClinicalDocument1.Enum getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$56);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.ActClinicalDocument1.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.ActClinicalDocument1 xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActClinicalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.ActClinicalDocument1)get_store().find_attribute_user(CLASSCODE$56);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClinicalDocument1)get_default_attribute_value(CLASSCODE$56);
            }
            return target;
        }
    }
    
    /**
     * True if has "classCode" attribute
     */
    public boolean isSetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSCODE$56) != null;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(com.walgreens.rxit.ch.cda.ActClinicalDocument1.Enum classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$56);
            }
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(com.walgreens.rxit.ch.cda.ActClinicalDocument1 classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActClinicalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.ActClinicalDocument1)get_store().find_attribute_user(CLASSCODE$56);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClinicalDocument1)get_store().add_attribute_user(CLASSCODE$56);
            }
            target.set(classCode);
        }
    }
    
    /**
     * Unsets the "classCode" attribute
     */
    public void unsetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSCODE$56);
        }
    }
    
    /**
     * Gets the "moodCode" attribute
     */
    public java.lang.String getMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$58);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    public com.walgreens.rxit.ch.cda.ActMood xgetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActMood target = null;
            target = (com.walgreens.rxit.ch.cda.ActMood)get_store().find_attribute_user(MOODCODE$58);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActMood)get_default_attribute_value(MOODCODE$58);
            }
            return target;
        }
    }
    
    /**
     * True if has "moodCode" attribute
     */
    public boolean isSetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOODCODE$58) != null;
        }
    }
    
    /**
     * Sets the "moodCode" attribute
     */
    public void setMoodCode(java.lang.String moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$58);
            }
            target.setStringValue(moodCode);
        }
    }
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    public void xsetMoodCode(com.walgreens.rxit.ch.cda.ActMood moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActMood target = null;
            target = (com.walgreens.rxit.ch.cda.ActMood)get_store().find_attribute_user(MOODCODE$58);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActMood)get_store().add_attribute_user(MOODCODE$58);
            }
            target.set(moodCode);
        }
    }
    
    /**
     * Unsets the "moodCode" attribute
     */
    public void unsetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOODCODE$58);
        }
    }
}
