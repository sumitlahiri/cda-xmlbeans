/*
 * XML Type:  POCD_MT000040.Section
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Section
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.Section(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040SectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040Section
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040SectionImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName TEXT$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "text");
    private static final javax.xml.namespace.QName TEXTPOC$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "text_POC");
    private static final javax.xml.namespace.QName CONFIDENTIALITYCODE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "confidentialityCode");
    private static final javax.xml.namespace.QName LANGUAGECODE$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "languageCode");
    private static final javax.xml.namespace.QName SUBJECT$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "subject");
    private static final javax.xml.namespace.QName AUTHOR$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName INFORMANT$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName ENTRY$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "entry");
    private static final javax.xml.namespace.QName COMPONENT$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "component");
    private static final javax.xml.namespace.QName ID$30 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName NULLFLAVOR$32 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$34 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$36 = 
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
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$6) != 0;
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
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$6, 0);
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
     * Gets the "text" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocText getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocText target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocText)get_store().find_element_user(TEXT$12, 0);
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
            return get_store().count_elements(TEXT$12) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(com.walgreens.rxit.ch.cda.StrucDocText text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocText target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocText)get_store().find_element_user(TEXT$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocText)get_store().add_element_user(TEXT$12);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocText addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocText target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocText)get_store().add_element_user(TEXT$12);
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
            get_store().remove_element(TEXT$12, 0);
        }
    }
    
    /**
     * Gets the "text_POC" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTextPOC getTextPOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTextPOC target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTextPOC)get_store().find_element_user(TEXTPOC$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text_POC" element
     */
    public boolean isSetTextPOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTPOC$14) != 0;
        }
    }
    
    /**
     * Sets the "text_POC" element
     */
    public void setTextPOC(com.walgreens.rxit.ch.cda.StrucDocTextPOC textPOC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTextPOC target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTextPOC)get_store().find_element_user(TEXTPOC$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocTextPOC)get_store().add_element_user(TEXTPOC$14);
            }
            target.set(textPOC);
        }
    }
    
    /**
     * Appends and returns a new empty "text_POC" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTextPOC addNewTextPOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTextPOC target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTextPOC)get_store().add_element_user(TEXTPOC$14);
            return target;
        }
    }
    
    /**
     * Unsets the "text_POC" element
     */
    public void unsetTextPOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTPOC$14, 0);
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
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CONFIDENTIALITYCODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "confidentialityCode" element
     */
    public boolean isSetConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIDENTIALITYCODE$16) != 0;
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
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CONFIDENTIALITYCODE$16, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CONFIDENTIALITYCODE$16);
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
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CONFIDENTIALITYCODE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "confidentialityCode" element
     */
    public void unsetConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIDENTIALITYCODE$16, 0);
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
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(LANGUAGECODE$18, 0);
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
            return get_store().count_elements(LANGUAGECODE$18) != 0;
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
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(LANGUAGECODE$18, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(LANGUAGECODE$18);
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
            target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(LANGUAGECODE$18);
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
            get_store().remove_element(LANGUAGECODE$18, 0);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().find_element_user(SUBJECT$20, 0);
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
            return get_store().count_elements(SUBJECT$20) != 0;
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().find_element_user(SUBJECT$20, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().add_element_user(SUBJECT$20);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().add_element_user(SUBJECT$20);
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
            get_store().remove_element(SUBJECT$20, 0);
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
            get_store().find_all_element_users(AUTHOR$22, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$22, i);
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
            return get_store().count_elements(AUTHOR$22);
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
            arraySetterHelper(authorArray, AUTHOR$22);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$22, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().insert_element_user(AUTHOR$22, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().add_element_user(AUTHOR$22);
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
            get_store().remove_element(AUTHOR$22, i);
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
            get_store().find_all_element_users(INFORMANT$24, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$24, i);
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
            return get_store().count_elements(INFORMANT$24);
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
            arraySetterHelper(informantArray, INFORMANT$24);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$24, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().insert_element_user(INFORMANT$24, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().add_element_user(INFORMANT$24);
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
            get_store().remove_element(INFORMANT$24, i);
        }
    }
    
    /**
     * Gets array of all "entry" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Entry[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRY$26, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Entry[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Entry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Entry getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Entry target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Entry)get_store().find_element_user(ENTRY$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$26);
        }
    }
    
    /**
     * Sets array of all "entry" element
     */
    public void setEntryArray(com.walgreens.rxit.ch.cda.POCDMT000040Entry[] entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$26);
        }
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Entry entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Entry target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Entry)get_store().find_element_user(ENTRY$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Entry insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Entry target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Entry)get_store().insert_element_user(ENTRY$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Entry addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Entry target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Entry)get_store().add_element_user(ENTRY$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$26, i);
        }
    }
    
    /**
     * Gets array of all "component" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component5[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$28, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Component5[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Component5[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component5 getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component5 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component5)get_store().find_element_user(COMPONENT$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$28);
        }
    }
    
    /**
     * Sets array of all "component" element
     */
    public void setComponentArray(com.walgreens.rxit.ch.cda.POCDMT000040Component5[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$28);
        }
    }
    
    /**
     * Sets ith "component" element
     */
    public void setComponentArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Component5 component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component5 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component5)get_store().find_element_user(COMPONENT$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component5 insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component5 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component5)get_store().insert_element_user(COMPONENT$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component5 addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component5 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component5)get_store().add_element_user(COMPONENT$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$28, i);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$30);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$30) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$30);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$30);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$32);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$32);
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
            return get_store().find_attribute_user(NULLFLAVOR$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$32);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$32);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$32);
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
            get_store().remove_attribute(NULLFLAVOR$32);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public java.lang.String getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$34);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.ActClass xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActClass target = null;
            target = (com.walgreens.rxit.ch.cda.ActClass)get_store().find_attribute_user(CLASSCODE$34);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClass)get_default_attribute_value(CLASSCODE$34);
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
            return get_store().find_attribute_user(CLASSCODE$34) != null;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(java.lang.String classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$34);
            }
            target.setStringValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(com.walgreens.rxit.ch.cda.ActClass classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ActClass target = null;
            target = (com.walgreens.rxit.ch.cda.ActClass)get_store().find_attribute_user(CLASSCODE$34);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClass)get_store().add_attribute_user(CLASSCODE$34);
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
            get_store().remove_attribute(CLASSCODE$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$36);
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
            target = (com.walgreens.rxit.ch.cda.ActMood)get_store().find_attribute_user(MOODCODE$36);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActMood)get_default_attribute_value(MOODCODE$36);
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
            return get_store().find_attribute_user(MOODCODE$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$36);
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
            target = (com.walgreens.rxit.ch.cda.ActMood)get_store().find_attribute_user(MOODCODE$36);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActMood)get_store().add_attribute_user(MOODCODE$36);
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
            get_store().remove_attribute(MOODCODE$36);
        }
    }
}
