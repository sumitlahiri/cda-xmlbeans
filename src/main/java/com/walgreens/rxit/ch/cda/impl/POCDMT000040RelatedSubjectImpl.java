/*
 * XML Type:  POCD_MT000040.RelatedSubject
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040RelatedSubject
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.RelatedSubject(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040RelatedSubjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040RelatedSubject
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040RelatedSubjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMCODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "realmCode");
    private static final javax.xml.namespace.QName TYPEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName CODE$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName ADDR$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "addr");
    private static final javax.xml.namespace.QName TELECOM$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "telecom");
    private static final javax.xml.namespace.QName SUBJECT$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "subject");
    private static final javax.xml.namespace.QName NULLFLAVOR$14 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$16 = 
        new javax.xml.namespace.QName("", "classCode");
    
    
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
     * Gets the "code" element
     */
    public com.walgreens.rxit.ch.cda.CE getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CODE$6, 0);
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
            return get_store().count_elements(CODE$6) != 0;
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
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(CODE$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CODE$6);
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
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(CODE$6);
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
            get_store().remove_element(CODE$6, 0);
        }
    }
    
    /**
     * Gets array of all "addr" elements
     */
    public com.walgreens.rxit.ch.cda.AD[] getAddrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDR$8, targetList);
            com.walgreens.rxit.ch.cda.AD[] result = new com.walgreens.rxit.ch.cda.AD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addr" element
     */
    public com.walgreens.rxit.ch.cda.AD getAddrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AD target = null;
            target = (com.walgreens.rxit.ch.cda.AD)get_store().find_element_user(ADDR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "addr" element
     */
    public int sizeOfAddrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDR$8);
        }
    }
    
    /**
     * Sets array of all "addr" element
     */
    public void setAddrArray(com.walgreens.rxit.ch.cda.AD[] addrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addrArray, ADDR$8);
        }
    }
    
    /**
     * Sets ith "addr" element
     */
    public void setAddrArray(int i, com.walgreens.rxit.ch.cda.AD addr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AD target = null;
            target = (com.walgreens.rxit.ch.cda.AD)get_store().find_element_user(ADDR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addr" element
     */
    public com.walgreens.rxit.ch.cda.AD insertNewAddr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AD target = null;
            target = (com.walgreens.rxit.ch.cda.AD)get_store().insert_element_user(ADDR$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addr" element
     */
    public com.walgreens.rxit.ch.cda.AD addNewAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AD target = null;
            target = (com.walgreens.rxit.ch.cda.AD)get_store().add_element_user(ADDR$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "addr" element
     */
    public void removeAddr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDR$8, i);
        }
    }
    
    /**
     * Gets array of all "telecom" elements
     */
    public com.walgreens.rxit.ch.cda.TEL[] getTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELECOM$10, targetList);
            com.walgreens.rxit.ch.cda.TEL[] result = new com.walgreens.rxit.ch.cda.TEL[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "telecom" element
     */
    public com.walgreens.rxit.ch.cda.TEL getTelecomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().find_element_user(TELECOM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "telecom" element
     */
    public int sizeOfTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELECOM$10);
        }
    }
    
    /**
     * Sets array of all "telecom" element
     */
    public void setTelecomArray(com.walgreens.rxit.ch.cda.TEL[] telecomArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telecomArray, TELECOM$10);
        }
    }
    
    /**
     * Sets ith "telecom" element
     */
    public void setTelecomArray(int i, com.walgreens.rxit.ch.cda.TEL telecom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().find_element_user(TELECOM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telecom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    public com.walgreens.rxit.ch.cda.TEL insertNewTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().insert_element_user(TELECOM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    public com.walgreens.rxit.ch.cda.TEL addNewTelecom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().add_element_user(TELECOM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "telecom" element
     */
    public void removeTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELECOM$10, i);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson)get_store().find_element_user(SUBJECT$12, 0);
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
            return get_store().count_elements(SUBJECT$12) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson)get_store().find_element_user(SUBJECT$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson)get_store().add_element_user(SUBJECT$12);
            }
            target.set(subject);
        }
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040SubjectPerson)get_store().add_element_user(SUBJECT$12);
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
            get_store().remove_element(SUBJECT$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$14);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$14);
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
            return get_store().find_attribute_user(NULLFLAVOR$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$14);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$14);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$14);
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
            get_store().remove_attribute(NULLFLAVOR$14);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XDocumentSubject.Enum getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$16);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.XDocumentSubject.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XDocumentSubject xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XDocumentSubject target = null;
            target = (com.walgreens.rxit.ch.cda.XDocumentSubject)get_store().find_attribute_user(CLASSCODE$16);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XDocumentSubject)get_default_attribute_value(CLASSCODE$16);
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
            return get_store().find_attribute_user(CLASSCODE$16) != null;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(com.walgreens.rxit.ch.cda.XDocumentSubject.Enum classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$16);
            }
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(com.walgreens.rxit.ch.cda.XDocumentSubject classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XDocumentSubject target = null;
            target = (com.walgreens.rxit.ch.cda.XDocumentSubject)get_store().find_attribute_user(CLASSCODE$16);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XDocumentSubject)get_store().add_attribute_user(CLASSCODE$16);
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
            get_store().remove_attribute(CLASSCODE$16);
        }
    }
}
