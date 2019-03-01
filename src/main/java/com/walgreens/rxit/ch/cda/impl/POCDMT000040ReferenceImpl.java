/*
 * XML Type:  POCD_MT000040.Reference
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Reference
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.Reference(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040ReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040Reference
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040ReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMCODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "realmCode");
    private static final javax.xml.namespace.QName TYPEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName SEPERATABLEIND$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "seperatableInd");
    private static final javax.xml.namespace.QName EXTERNALACT$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalAct");
    private static final javax.xml.namespace.QName EXTERNALOBSERVATION$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalObservation");
    private static final javax.xml.namespace.QName EXTERNALPROCEDURE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalProcedure");
    private static final javax.xml.namespace.QName EXTERNALDOCUMENT$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalDocument");
    private static final javax.xml.namespace.QName NULLFLAVOR$16 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName TYPECODE$18 = 
        new javax.xml.namespace.QName("", "typeCode");
    
    
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
     * Gets the "seperatableInd" element
     */
    public com.walgreens.rxit.ch.cda.BL getSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BL target = null;
            target = (com.walgreens.rxit.ch.cda.BL)get_store().find_element_user(SEPERATABLEIND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "seperatableInd" element
     */
    public boolean isSetSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEPERATABLEIND$6) != 0;
        }
    }
    
    /**
     * Sets the "seperatableInd" element
     */
    public void setSeperatableInd(com.walgreens.rxit.ch.cda.BL seperatableInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BL target = null;
            target = (com.walgreens.rxit.ch.cda.BL)get_store().find_element_user(SEPERATABLEIND$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.BL)get_store().add_element_user(SEPERATABLEIND$6);
            }
            target.set(seperatableInd);
        }
    }
    
    /**
     * Appends and returns a new empty "seperatableInd" element
     */
    public com.walgreens.rxit.ch.cda.BL addNewSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BL target = null;
            target = (com.walgreens.rxit.ch.cda.BL)get_store().add_element_user(SEPERATABLEIND$6);
            return target;
        }
    }
    
    /**
     * Unsets the "seperatableInd" element
     */
    public void unsetSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEPERATABLEIND$6, 0);
        }
    }
    
    /**
     * Gets the "externalAct" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct getExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct)get_store().find_element_user(EXTERNALACT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalAct" element
     */
    public boolean isSetExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALACT$8) != 0;
        }
    }
    
    /**
     * Sets the "externalAct" element
     */
    public void setExternalAct(com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct externalAct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct)get_store().find_element_user(EXTERNALACT$8, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct)get_store().add_element_user(EXTERNALACT$8);
            }
            target.set(externalAct);
        }
    }
    
    /**
     * Appends and returns a new empty "externalAct" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct addNewExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalAct)get_store().add_element_user(EXTERNALACT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "externalAct" element
     */
    public void unsetExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALACT$8, 0);
        }
    }
    
    /**
     * Gets the "externalObservation" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation getExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation)get_store().find_element_user(EXTERNALOBSERVATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalObservation" element
     */
    public boolean isSetExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALOBSERVATION$10) != 0;
        }
    }
    
    /**
     * Sets the "externalObservation" element
     */
    public void setExternalObservation(com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation externalObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation)get_store().find_element_user(EXTERNALOBSERVATION$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation)get_store().add_element_user(EXTERNALOBSERVATION$10);
            }
            target.set(externalObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "externalObservation" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation addNewExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalObservation)get_store().add_element_user(EXTERNALOBSERVATION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "externalObservation" element
     */
    public void unsetExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALOBSERVATION$10, 0);
        }
    }
    
    /**
     * Gets the "externalProcedure" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure getExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure)get_store().find_element_user(EXTERNALPROCEDURE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalProcedure" element
     */
    public boolean isSetExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALPROCEDURE$12) != 0;
        }
    }
    
    /**
     * Sets the "externalProcedure" element
     */
    public void setExternalProcedure(com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure externalProcedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure)get_store().find_element_user(EXTERNALPROCEDURE$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure)get_store().add_element_user(EXTERNALPROCEDURE$12);
            }
            target.set(externalProcedure);
        }
    }
    
    /**
     * Appends and returns a new empty "externalProcedure" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure addNewExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalProcedure)get_store().add_element_user(EXTERNALPROCEDURE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "externalProcedure" element
     */
    public void unsetExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALPROCEDURE$12, 0);
        }
    }
    
    /**
     * Gets the "externalDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1 getExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1)get_store().find_element_user(EXTERNALDOCUMENT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalDocument" element
     */
    public boolean isSetExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALDOCUMENT$14) != 0;
        }
    }
    
    /**
     * Sets the "externalDocument" element
     */
    public void setExternalDocument(com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1 externalDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1)get_store().find_element_user(EXTERNALDOCUMENT$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1)get_store().add_element_user(EXTERNALDOCUMENT$14);
            }
            target.set(externalDocument);
        }
    }
    
    /**
     * Appends and returns a new empty "externalDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1 addNewExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ExternalDocument1)get_store().add_element_user(EXTERNALDOCUMENT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "externalDocument" element
     */
    public void unsetExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALDOCUMENT$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
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
            return get_store().find_attribute_user(NULLFLAVOR$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$16);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$16);
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
            get_store().remove_attribute(NULLFLAVOR$16);
        }
    }
    
    /**
     * Gets the "typeCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XActRelationshipExternalReference.Enum getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$18);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.XActRelationshipExternalReference.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XActRelationshipExternalReference xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XActRelationshipExternalReference target = null;
            target = (com.walgreens.rxit.ch.cda.XActRelationshipExternalReference)get_store().find_attribute_user(TYPECODE$18);
            return target;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(com.walgreens.rxit.ch.cda.XActRelationshipExternalReference.Enum typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$18);
            }
            target.setEnumValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(com.walgreens.rxit.ch.cda.XActRelationshipExternalReference typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XActRelationshipExternalReference target = null;
            target = (com.walgreens.rxit.ch.cda.XActRelationshipExternalReference)get_store().find_attribute_user(TYPECODE$18);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XActRelationshipExternalReference)get_store().add_attribute_user(TYPECODE$18);
            }
            target.set(typeCode);
        }
    }
}
