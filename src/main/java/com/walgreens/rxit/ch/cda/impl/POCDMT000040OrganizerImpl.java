/*
 * XML Type:  POCD_MT000040.Organizer
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Organizer
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.Organizer(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040OrganizerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040Organizer
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040OrganizerImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName STATUSCODE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "statusCode");
    private static final javax.xml.namespace.QName EFFECTIVETIME$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "effectiveTime");
    private static final javax.xml.namespace.QName SUBJECT$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "subject");
    private static final javax.xml.namespace.QName SPECIMEN$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "specimen");
    private static final javax.xml.namespace.QName PERFORMER$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "performer");
    private static final javax.xml.namespace.QName AUTHOR$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName INFORMANT$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName PARTICIPANT$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "participant");
    private static final javax.xml.namespace.QName REFERENCE$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "reference");
    private static final javax.xml.namespace.QName PRECONDITION$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "precondition");
    private static final javax.xml.namespace.QName COMPONENT$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "component");
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
     * Gets the "statusCode" element
     */
    public com.walgreens.rxit.ch.cda.CS getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CS target = null;
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(STATUSCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.walgreens.rxit.ch.cda.CS)get_store().find_element_user(STATUSCODE$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(STATUSCODE$10);
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
            target = (com.walgreens.rxit.ch.cda.CS)get_store().add_element_user(STATUSCODE$10);
            return target;
        }
    }
    
    /**
     * Gets the "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS getEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(EFFECTIVETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectiveTime" element
     */
    public boolean isSetEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "effectiveTime" element
     */
    public void setEffectiveTime(com.walgreens.rxit.ch.cda.IVLTS effectiveTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(EFFECTIVETIME$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(EFFECTIVETIME$12);
            }
            target.set(effectiveTime);
        }
    }
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS addNewEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(EFFECTIVETIME$12);
            return target;
        }
    }
    
    /**
     * Unsets the "effectiveTime" element
     */
    public void unsetEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVETIME$12, 0);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().find_element_user(SUBJECT$14, 0);
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
            return get_store().count_elements(SUBJECT$14) != 0;
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().find_element_user(SUBJECT$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().add_element_user(SUBJECT$14);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Subject)get_store().add_element_user(SUBJECT$14);
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
            get_store().remove_element(SUBJECT$14, 0);
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
            get_store().find_all_element_users(SPECIMEN$16, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().find_element_user(SPECIMEN$16, i);
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
            return get_store().count_elements(SPECIMEN$16);
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
            arraySetterHelper(specimenArray, SPECIMEN$16);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().find_element_user(SPECIMEN$16, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().insert_element_user(SPECIMEN$16, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Specimen)get_store().add_element_user(SPECIMEN$16);
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
            get_store().remove_element(SPECIMEN$16, i);
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
            get_store().find_all_element_users(PERFORMER$18, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().find_element_user(PERFORMER$18, i);
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
            return get_store().count_elements(PERFORMER$18);
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
            arraySetterHelper(performerArray, PERFORMER$18);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().find_element_user(PERFORMER$18, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().insert_element_user(PERFORMER$18, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Performer2)get_store().add_element_user(PERFORMER$18);
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
            get_store().remove_element(PERFORMER$18, i);
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
            get_store().find_all_element_users(AUTHOR$20, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$20, i);
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
            return get_store().count_elements(AUTHOR$20);
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
            arraySetterHelper(authorArray, AUTHOR$20);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().find_element_user(AUTHOR$20, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().insert_element_user(AUTHOR$20, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Author)get_store().add_element_user(AUTHOR$20);
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
            get_store().remove_element(AUTHOR$20, i);
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
            get_store().find_all_element_users(INFORMANT$22, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$22, i);
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
            return get_store().count_elements(INFORMANT$22);
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
            arraySetterHelper(informantArray, INFORMANT$22);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().find_element_user(INFORMANT$22, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().insert_element_user(INFORMANT$22, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Informant12)get_store().add_element_user(INFORMANT$22);
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
            get_store().remove_element(INFORMANT$22, i);
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
            get_store().find_all_element_users(PARTICIPANT$24, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().find_element_user(PARTICIPANT$24, i);
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
            return get_store().count_elements(PARTICIPANT$24);
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
            arraySetterHelper(participantArray, PARTICIPANT$24);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().find_element_user(PARTICIPANT$24, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().insert_element_user(PARTICIPANT$24, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Participant2)get_store().add_element_user(PARTICIPANT$24);
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
            get_store().remove_element(PARTICIPANT$24, i);
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
            get_store().find_all_element_users(REFERENCE$26, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().find_element_user(REFERENCE$26, i);
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
            return get_store().count_elements(REFERENCE$26);
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
            arraySetterHelper(referenceArray, REFERENCE$26);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().find_element_user(REFERENCE$26, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().insert_element_user(REFERENCE$26, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Reference)get_store().add_element_user(REFERENCE$26);
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
            get_store().remove_element(REFERENCE$26, i);
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
            get_store().find_all_element_users(PRECONDITION$28, targetList);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().find_element_user(PRECONDITION$28, i);
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
            return get_store().count_elements(PRECONDITION$28);
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
            arraySetterHelper(preconditionArray, PRECONDITION$28);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().find_element_user(PRECONDITION$28, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().insert_element_user(PRECONDITION$28, i);
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
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Precondition)get_store().add_element_user(PRECONDITION$28);
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
            get_store().remove_element(PRECONDITION$28, i);
        }
    }
    
    /**
     * Gets array of all "component" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component4[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$30, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040Component4[] result = new com.walgreens.rxit.ch.cda.POCDMT000040Component4[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component4 getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component4 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component4)get_store().find_element_user(COMPONENT$30, i);
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
            return get_store().count_elements(COMPONENT$30);
        }
    }
    
    /**
     * Sets array of all "component" element
     */
    public void setComponentArray(com.walgreens.rxit.ch.cda.POCDMT000040Component4[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$30);
        }
    }
    
    /**
     * Sets ith "component" element
     */
    public void setComponentArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Component4 component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component4 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component4)get_store().find_element_user(COMPONENT$30, i);
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
    public com.walgreens.rxit.ch.cda.POCDMT000040Component4 insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component4 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component4)get_store().insert_element_user(COMPONENT$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Component4 addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Component4 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Component4)get_store().add_element_user(COMPONENT$30);
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
            get_store().remove_element(COMPONENT$30, i);
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
    public com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer.Enum getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$34);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer target = null;
            target = (com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer)get_store().find_attribute_user(CLASSCODE$34);
            return target;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer.Enum classCode)
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
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer target = null;
            target = (com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer)get_store().find_attribute_user(CLASSCODE$34);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer)get_store().add_attribute_user(CLASSCODE$34);
            }
            target.set(classCode);
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
            return target;
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
}
