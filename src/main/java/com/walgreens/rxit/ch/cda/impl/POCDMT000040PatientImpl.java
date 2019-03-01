/*
 * XML Type:  POCD_MT000040.Patient
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Patient
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.Patient(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040PatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040Patient
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040PatientImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "name");
    private static final javax.xml.namespace.QName ADMINISTRATIVEGENDERCODE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "administrativeGenderCode");
    private static final javax.xml.namespace.QName BIRTHTIME$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "birthTime");
    private static final javax.xml.namespace.QName MARITALSTATUSCODE$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "maritalStatusCode");
    private static final javax.xml.namespace.QName RELIGIOUSAFFILIATIONCODE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "religiousAffiliationCode");
    private static final javax.xml.namespace.QName RACECODE$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "raceCode");
    private static final javax.xml.namespace.QName ETHNICGROUPCODE$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "ethnicGroupCode");
    private static final javax.xml.namespace.QName GUARDIAN$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "guardian");
    private static final javax.xml.namespace.QName BIRTHPLACE$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "birthplace");
    private static final javax.xml.namespace.QName LANGUAGECOMMUNICATION$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "languageCommunication");
    private static final javax.xml.namespace.QName NULLFLAVOR$28 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$30 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName DETERMINERCODE$32 = 
        new javax.xml.namespace.QName("", "determinerCode");
    
    
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
     * Gets array of all "name" elements
     */
    public com.walgreens.rxit.ch.cda.PN[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$8, targetList);
            com.walgreens.rxit.ch.cda.PN[] result = new com.walgreens.rxit.ch.cda.PN[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public com.walgreens.rxit.ch.cda.PN getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PN target = null;
            target = (com.walgreens.rxit.ch.cda.PN)get_store().find_element_user(NAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$8);
        }
    }
    
    /**
     * Sets array of all "name" element
     */
    public void setNameArray(com.walgreens.rxit.ch.cda.PN[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$8);
        }
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, com.walgreens.rxit.ch.cda.PN name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PN target = null;
            target = (com.walgreens.rxit.ch.cda.PN)get_store().find_element_user(NAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public com.walgreens.rxit.ch.cda.PN insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PN target = null;
            target = (com.walgreens.rxit.ch.cda.PN)get_store().insert_element_user(NAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public com.walgreens.rxit.ch.cda.PN addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PN target = null;
            target = (com.walgreens.rxit.ch.cda.PN)get_store().add_element_user(NAME$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$8, i);
        }
    }
    
    /**
     * Gets the "administrativeGenderCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(ADMINISTRATIVEGENDERCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "administrativeGenderCode" element
     */
    public boolean isSetAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINISTRATIVEGENDERCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "administrativeGenderCode" element
     */
    public void setAdministrativeGenderCode(com.walgreens.rxit.ch.cda.CE administrativeGenderCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(ADMINISTRATIVEGENDERCODE$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(ADMINISTRATIVEGENDERCODE$10);
            }
            target.set(administrativeGenderCode);
        }
    }
    
    /**
     * Appends and returns a new empty "administrativeGenderCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(ADMINISTRATIVEGENDERCODE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "administrativeGenderCode" element
     */
    public void unsetAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINISTRATIVEGENDERCODE$10, 0);
        }
    }
    
    /**
     * Gets the "birthTime" element
     */
    public com.walgreens.rxit.ch.cda.TS getBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(BIRTHTIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthTime" element
     */
    public boolean isSetBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHTIME$12) != 0;
        }
    }
    
    /**
     * Sets the "birthTime" element
     */
    public void setBirthTime(com.walgreens.rxit.ch.cda.TS birthTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(BIRTHTIME$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(BIRTHTIME$12);
            }
            target.set(birthTime);
        }
    }
    
    /**
     * Appends and returns a new empty "birthTime" element
     */
    public com.walgreens.rxit.ch.cda.TS addNewBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(BIRTHTIME$12);
            return target;
        }
    }
    
    /**
     * Unsets the "birthTime" element
     */
    public void unsetBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHTIME$12, 0);
        }
    }
    
    /**
     * Gets the "maritalStatusCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(MARITALSTATUSCODE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maritalStatusCode" element
     */
    public boolean isSetMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARITALSTATUSCODE$14) != 0;
        }
    }
    
    /**
     * Sets the "maritalStatusCode" element
     */
    public void setMaritalStatusCode(com.walgreens.rxit.ch.cda.CE maritalStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(MARITALSTATUSCODE$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(MARITALSTATUSCODE$14);
            }
            target.set(maritalStatusCode);
        }
    }
    
    /**
     * Appends and returns a new empty "maritalStatusCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(MARITALSTATUSCODE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "maritalStatusCode" element
     */
    public void unsetMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARITALSTATUSCODE$14, 0);
        }
    }
    
    /**
     * Gets the "religiousAffiliationCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(RELIGIOUSAFFILIATIONCODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "religiousAffiliationCode" element
     */
    public boolean isSetReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELIGIOUSAFFILIATIONCODE$16) != 0;
        }
    }
    
    /**
     * Sets the "religiousAffiliationCode" element
     */
    public void setReligiousAffiliationCode(com.walgreens.rxit.ch.cda.CE religiousAffiliationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(RELIGIOUSAFFILIATIONCODE$16, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(RELIGIOUSAFFILIATIONCODE$16);
            }
            target.set(religiousAffiliationCode);
        }
    }
    
    /**
     * Appends and returns a new empty "religiousAffiliationCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(RELIGIOUSAFFILIATIONCODE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "religiousAffiliationCode" element
     */
    public void unsetReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELIGIOUSAFFILIATIONCODE$16, 0);
        }
    }
    
    /**
     * Gets the "raceCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(RACECODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "raceCode" element
     */
    public boolean isSetRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACECODE$18) != 0;
        }
    }
    
    /**
     * Sets the "raceCode" element
     */
    public void setRaceCode(com.walgreens.rxit.ch.cda.CE raceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(RACECODE$18, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(RACECODE$18);
            }
            target.set(raceCode);
        }
    }
    
    /**
     * Appends and returns a new empty "raceCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(RACECODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "raceCode" element
     */
    public void unsetRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACECODE$18, 0);
        }
    }
    
    /**
     * Gets the "ethnicGroupCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(ETHNICGROUPCODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ethnicGroupCode" element
     */
    public boolean isSetEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ETHNICGROUPCODE$20) != 0;
        }
    }
    
    /**
     * Sets the "ethnicGroupCode" element
     */
    public void setEthnicGroupCode(com.walgreens.rxit.ch.cda.CE ethnicGroupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(ETHNICGROUPCODE$20, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(ETHNICGROUPCODE$20);
            }
            target.set(ethnicGroupCode);
        }
    }
    
    /**
     * Appends and returns a new empty "ethnicGroupCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(ETHNICGROUPCODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "ethnicGroupCode" element
     */
    public void unsetEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ETHNICGROUPCODE$20, 0);
        }
    }
    
    /**
     * Gets array of all "guardian" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Guardian[] getGuardianArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUARDIAN$22, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Guardian[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Guardian[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "guardian" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Guardian getGuardianArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Guardian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Guardian)get_store().find_element_user(GUARDIAN$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "guardian" element
     */
    public int sizeOfGuardianArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUARDIAN$22);
        }
    }
    
    /**
     * Sets array of all "guardian" element
     */
    public void setGuardianArray(com.walgreens.rxit.ch.cda.POCDMT000040Guardian[] guardianArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guardianArray, GUARDIAN$22);
        }
    }
    
    /**
     * Sets ith "guardian" element
     */
    public void setGuardianArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Guardian guardian)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Guardian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Guardian)get_store().find_element_user(GUARDIAN$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(guardian);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guardian" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Guardian insertNewGuardian(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Guardian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Guardian)get_store().insert_element_user(GUARDIAN$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guardian" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Guardian addNewGuardian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Guardian target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Guardian)get_store().add_element_user(GUARDIAN$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "guardian" element
     */
    public void removeGuardian(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUARDIAN$22, i);
        }
    }
    
    /**
     * Gets the "birthplace" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Birthplace getBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Birthplace target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Birthplace)get_store().find_element_user(BIRTHPLACE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthplace" element
     */
    public boolean isSetBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHPLACE$24) != 0;
        }
    }
    
    /**
     * Sets the "birthplace" element
     */
    public void setBirthplace(com.walgreens.rxit.ch.cda.POCDMT000040Birthplace birthplace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Birthplace target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Birthplace)get_store().find_element_user(BIRTHPLACE$24, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Birthplace)get_store().add_element_user(BIRTHPLACE$24);
            }
            target.set(birthplace);
        }
    }
    
    /**
     * Appends and returns a new empty "birthplace" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Birthplace addNewBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Birthplace target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Birthplace)get_store().add_element_user(BIRTHPLACE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "birthplace" element
     */
    public void unsetBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHPLACE$24, 0);
        }
    }
    
    /**
     * Gets array of all "languageCommunication" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication[] getLanguageCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANGUAGECOMMUNICATION$26, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication[] result = new com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "languageCommunication" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication getLanguageCommunicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication)get_store().find_element_user(LANGUAGECOMMUNICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "languageCommunication" element
     */
    public int sizeOfLanguageCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECOMMUNICATION$26);
        }
    }
    
    /**
     * Sets array of all "languageCommunication" element
     */
    public void setLanguageCommunicationArray(com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication[] languageCommunicationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(languageCommunicationArray, LANGUAGECOMMUNICATION$26);
        }
    }
    
    /**
     * Sets ith "languageCommunication" element
     */
    public void setLanguageCommunicationArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication languageCommunication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication)get_store().find_element_user(LANGUAGECOMMUNICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(languageCommunication);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageCommunication" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication insertNewLanguageCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication)get_store().insert_element_user(LANGUAGECOMMUNICATION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "languageCommunication" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication addNewLanguageCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication)get_store().add_element_user(LANGUAGECOMMUNICATION$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "languageCommunication" element
     */
    public void removeLanguageCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECOMMUNICATION$26, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$28);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$28);
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
            return get_store().find_attribute_user(NULLFLAVOR$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$28);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$28);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$28);
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
            get_store().remove_attribute(NULLFLAVOR$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$30);
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
    public com.walgreens.rxit.ch.cda.EntityClass xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EntityClass target = null;
            target = (com.walgreens.rxit.ch.cda.EntityClass)get_store().find_attribute_user(CLASSCODE$30);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EntityClass)get_default_attribute_value(CLASSCODE$30);
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
            return get_store().find_attribute_user(CLASSCODE$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$30);
            }
            target.setStringValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(com.walgreens.rxit.ch.cda.EntityClass classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EntityClass target = null;
            target = (com.walgreens.rxit.ch.cda.EntityClass)get_store().find_attribute_user(CLASSCODE$30);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EntityClass)get_store().add_attribute_user(CLASSCODE$30);
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
            get_store().remove_attribute(CLASSCODE$30);
        }
    }
    
    /**
     * Gets the "determinerCode" attribute
     */
    public java.lang.String getDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINERCODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DETERMINERCODE$32);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "determinerCode" attribute
     */
    public com.walgreens.rxit.ch.cda.EntityDeterminer xgetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EntityDeterminer target = null;
            target = (com.walgreens.rxit.ch.cda.EntityDeterminer)get_store().find_attribute_user(DETERMINERCODE$32);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EntityDeterminer)get_default_attribute_value(DETERMINERCODE$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "determinerCode" attribute
     */
    public boolean isSetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETERMINERCODE$32) != null;
        }
    }
    
    /**
     * Sets the "determinerCode" attribute
     */
    public void setDeterminerCode(java.lang.String determinerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINERCODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETERMINERCODE$32);
            }
            target.setStringValue(determinerCode);
        }
    }
    
    /**
     * Sets (as xml) the "determinerCode" attribute
     */
    public void xsetDeterminerCode(com.walgreens.rxit.ch.cda.EntityDeterminer determinerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EntityDeterminer target = null;
            target = (com.walgreens.rxit.ch.cda.EntityDeterminer)get_store().find_attribute_user(DETERMINERCODE$32);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EntityDeterminer)get_store().add_attribute_user(DETERMINERCODE$32);
            }
            target.set(determinerCode);
        }
    }
    
    /**
     * Unsets the "determinerCode" attribute
     */
    public void unsetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETERMINERCODE$32);
        }
    }
}
