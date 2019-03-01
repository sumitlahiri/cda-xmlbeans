/*
 * XML Type:  POCD_MT000040.EncompassingEncounter
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.EncompassingEncounter(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040EncompassingEncounterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040EncompassingEncounterImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName EFFECTIVETIME$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "effectiveTime");
    private static final javax.xml.namespace.QName DISCHARGEDISPOSITIONCODE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "dischargeDispositionCode");
    private static final javax.xml.namespace.QName RESPONSIBLEPARTY$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "responsibleParty");
    private static final javax.xml.namespace.QName ENCOUNTERPARTICIPANT$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "encounterParticipant");
    private static final javax.xml.namespace.QName LOCATION$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "location");
    private static final javax.xml.namespace.QName NULLFLAVOR$20 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$22 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$24 = 
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
     * Gets the "effectiveTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS getEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(EFFECTIVETIME$10, 0);
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
    public void setEffectiveTime(com.walgreens.rxit.ch.cda.IVLTS effectiveTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(EFFECTIVETIME$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(EFFECTIVETIME$10);
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
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(EFFECTIVETIME$10);
            return target;
        }
    }
    
    /**
     * Gets the "dischargeDispositionCode" element
     */
    public com.walgreens.rxit.ch.cda.CE getDischargeDispositionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(DISCHARGEDISPOSITIONCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dischargeDispositionCode" element
     */
    public boolean isSetDischargeDispositionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCHARGEDISPOSITIONCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "dischargeDispositionCode" element
     */
    public void setDischargeDispositionCode(com.walgreens.rxit.ch.cda.CE dischargeDispositionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().find_element_user(DISCHARGEDISPOSITIONCODE$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(DISCHARGEDISPOSITIONCODE$12);
            }
            target.set(dischargeDispositionCode);
        }
    }
    
    /**
     * Appends and returns a new empty "dischargeDispositionCode" element
     */
    public com.walgreens.rxit.ch.cda.CE addNewDischargeDispositionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CE target = null;
            target = (com.walgreens.rxit.ch.cda.CE)get_store().add_element_user(DISCHARGEDISPOSITIONCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "dischargeDispositionCode" element
     */
    public void unsetDischargeDispositionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCHARGEDISPOSITIONCODE$12, 0);
        }
    }
    
    /**
     * Gets the "responsibleParty" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty getResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty)get_store().find_element_user(RESPONSIBLEPARTY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "responsibleParty" element
     */
    public boolean isSetResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSIBLEPARTY$14) != 0;
        }
    }
    
    /**
     * Sets the "responsibleParty" element
     */
    public void setResponsibleParty(com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty responsibleParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty)get_store().find_element_user(RESPONSIBLEPARTY$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty)get_store().add_element_user(RESPONSIBLEPARTY$14);
            }
            target.set(responsibleParty);
        }
    }
    
    /**
     * Appends and returns a new empty "responsibleParty" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty addNewResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty)get_store().add_element_user(RESPONSIBLEPARTY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "responsibleParty" element
     */
    public void unsetResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSIBLEPARTY$14, 0);
        }
    }
    
    /**
     * Gets array of all "encounterParticipant" elements
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant[] getEncounterParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENCOUNTERPARTICIPANT$16, targetList);
            com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant[] result = new com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "encounterParticipant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant getEncounterParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant)get_store().find_element_user(ENCOUNTERPARTICIPANT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "encounterParticipant" element
     */
    public int sizeOfEncounterParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTERPARTICIPANT$16);
        }
    }
    
    /**
     * Sets array of all "encounterParticipant" element
     */
    public void setEncounterParticipantArray(com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant[] encounterParticipantArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(encounterParticipantArray, ENCOUNTERPARTICIPANT$16);
        }
    }
    
    /**
     * Sets ith "encounterParticipant" element
     */
    public void setEncounterParticipantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant encounterParticipant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant)get_store().find_element_user(ENCOUNTERPARTICIPANT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(encounterParticipant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "encounterParticipant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant insertNewEncounterParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant)get_store().insert_element_user(ENCOUNTERPARTICIPANT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "encounterParticipant" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant addNewEncounterParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant)get_store().add_element_user(ENCOUNTERPARTICIPANT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "encounterParticipant" element
     */
    public void removeEncounterParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTERPARTICIPANT$16, i);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Location target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Location)get_store().find_element_user(LOCATION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$18) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(com.walgreens.rxit.ch.cda.POCDMT000040Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Location target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Location)get_store().find_element_user(LOCATION$18, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Location)get_store().add_element_user(LOCATION$18);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Location target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Location)get_store().add_element_user(LOCATION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$20);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$20);
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
            return get_store().find_attribute_user(NULLFLAVOR$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$20);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$20);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$20);
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
            get_store().remove_attribute(NULLFLAVOR$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$22);
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
            target = (com.walgreens.rxit.ch.cda.ActClass)get_store().find_attribute_user(CLASSCODE$22);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClass)get_default_attribute_value(CLASSCODE$22);
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
            return get_store().find_attribute_user(CLASSCODE$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$22);
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
            target = (com.walgreens.rxit.ch.cda.ActClass)get_store().find_attribute_user(CLASSCODE$22);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActClass)get_store().add_attribute_user(CLASSCODE$22);
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
            get_store().remove_attribute(CLASSCODE$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$24);
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
            target = (com.walgreens.rxit.ch.cda.ActMood)get_store().find_attribute_user(MOODCODE$24);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActMood)get_default_attribute_value(MOODCODE$24);
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
            return get_store().find_attribute_user(MOODCODE$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$24);
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
            target = (com.walgreens.rxit.ch.cda.ActMood)get_store().find_attribute_user(MOODCODE$24);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ActMood)get_store().add_attribute_user(MOODCODE$24);
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
            get_store().remove_attribute(MOODCODE$24);
        }
    }
}
