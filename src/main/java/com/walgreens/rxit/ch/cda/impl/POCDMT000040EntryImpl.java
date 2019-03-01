/*
 * XML Type:  POCD_MT000040.Entry
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Entry
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.Entry(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040EntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.POCDMT000040Entry
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040EntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMCODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "realmCode");
    private static final javax.xml.namespace.QName TYPEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName ACT$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "act");
    private static final javax.xml.namespace.QName ENCOUNTER$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "encounter");
    private static final javax.xml.namespace.QName OBSERVATION$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "observation");
    private static final javax.xml.namespace.QName OBSERVATIONMEDIA$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "observationMedia");
    private static final javax.xml.namespace.QName ORGANIZER$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "organizer");
    private static final javax.xml.namespace.QName PROCEDURE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "procedure");
    private static final javax.xml.namespace.QName REGIONOFINTEREST$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "regionOfInterest");
    private static final javax.xml.namespace.QName SUBSTANCEADMINISTRATION$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "substanceAdministration");
    private static final javax.xml.namespace.QName SUPPLY$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "supply");
    private static final javax.xml.namespace.QName NULLFLAVOR$24 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName TYPECODE$26 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONDUCTIONIND$28 = 
        new javax.xml.namespace.QName("", "contextConductionInd");
    
    
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
     * Gets the "act" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Act getAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Act target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Act)get_store().find_element_user(ACT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "act" element
     */
    public boolean isSetAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACT$6) != 0;
        }
    }
    
    /**
     * Sets the "act" element
     */
    public void setAct(com.walgreens.rxit.ch.cda.POCDMT000040Act act)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Act target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Act)get_store().find_element_user(ACT$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Act)get_store().add_element_user(ACT$6);
            }
            target.set(act);
        }
    }
    
    /**
     * Appends and returns a new empty "act" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Act addNewAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Act target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Act)get_store().add_element_user(ACT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "act" element
     */
    public void unsetAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACT$6, 0);
        }
    }
    
    /**
     * Gets the "encounter" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Encounter getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Encounter target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Encounter)get_store().find_element_user(ENCOUNTER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$8) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(com.walgreens.rxit.ch.cda.POCDMT000040Encounter encounter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Encounter target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Encounter)get_store().find_element_user(ENCOUNTER$8, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Encounter)get_store().add_element_user(ENCOUNTER$8);
            }
            target.set(encounter);
        }
    }
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Encounter addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Encounter target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Encounter)get_store().add_element_user(ENCOUNTER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$8, 0);
        }
    }
    
    /**
     * Gets the "observation" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Observation getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Observation target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Observation)get_store().find_element_user(OBSERVATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "observation" element
     */
    public boolean isSetObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBSERVATION$10) != 0;
        }
    }
    
    /**
     * Sets the "observation" element
     */
    public void setObservation(com.walgreens.rxit.ch.cda.POCDMT000040Observation observation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Observation target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Observation)get_store().find_element_user(OBSERVATION$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Observation)get_store().add_element_user(OBSERVATION$10);
            }
            target.set(observation);
        }
    }
    
    /**
     * Appends and returns a new empty "observation" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Observation addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Observation target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Observation)get_store().add_element_user(OBSERVATION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "observation" element
     */
    public void unsetObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBSERVATION$10, 0);
        }
    }
    
    /**
     * Gets the "observationMedia" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia getObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia)get_store().find_element_user(OBSERVATIONMEDIA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "observationMedia" element
     */
    public boolean isSetObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBSERVATIONMEDIA$12) != 0;
        }
    }
    
    /**
     * Sets the "observationMedia" element
     */
    public void setObservationMedia(com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia observationMedia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia)get_store().find_element_user(OBSERVATIONMEDIA$12, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia)get_store().add_element_user(OBSERVATIONMEDIA$12);
            }
            target.set(observationMedia);
        }
    }
    
    /**
     * Appends and returns a new empty "observationMedia" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia addNewObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia)get_store().add_element_user(OBSERVATIONMEDIA$12);
            return target;
        }
    }
    
    /**
     * Unsets the "observationMedia" element
     */
    public void unsetObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBSERVATIONMEDIA$12, 0);
        }
    }
    
    /**
     * Gets the "organizer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Organizer getOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Organizer target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Organizer)get_store().find_element_user(ORGANIZER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizer" element
     */
    public boolean isSetOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZER$14) != 0;
        }
    }
    
    /**
     * Sets the "organizer" element
     */
    public void setOrganizer(com.walgreens.rxit.ch.cda.POCDMT000040Organizer organizer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Organizer target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Organizer)get_store().find_element_user(ORGANIZER$14, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Organizer)get_store().add_element_user(ORGANIZER$14);
            }
            target.set(organizer);
        }
    }
    
    /**
     * Appends and returns a new empty "organizer" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Organizer addNewOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Organizer target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Organizer)get_store().add_element_user(ORGANIZER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "organizer" element
     */
    public void unsetOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZER$14, 0);
        }
    }
    
    /**
     * Gets the "procedure" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Procedure getProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Procedure target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Procedure)get_store().find_element_user(PROCEDURE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "procedure" element
     */
    public boolean isSetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCEDURE$16) != 0;
        }
    }
    
    /**
     * Sets the "procedure" element
     */
    public void setProcedure(com.walgreens.rxit.ch.cda.POCDMT000040Procedure procedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Procedure target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Procedure)get_store().find_element_user(PROCEDURE$16, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Procedure)get_store().add_element_user(PROCEDURE$16);
            }
            target.set(procedure);
        }
    }
    
    /**
     * Appends and returns a new empty "procedure" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Procedure addNewProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Procedure target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Procedure)get_store().add_element_user(PROCEDURE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "procedure" element
     */
    public void unsetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCEDURE$16, 0);
        }
    }
    
    /**
     * Gets the "regionOfInterest" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest getRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest)get_store().find_element_user(REGIONOFINTEREST$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regionOfInterest" element
     */
    public boolean isSetRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGIONOFINTEREST$18) != 0;
        }
    }
    
    /**
     * Sets the "regionOfInterest" element
     */
    public void setRegionOfInterest(com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest regionOfInterest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest)get_store().find_element_user(REGIONOFINTEREST$18, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest)get_store().add_element_user(REGIONOFINTEREST$18);
            }
            target.set(regionOfInterest);
        }
    }
    
    /**
     * Appends and returns a new empty "regionOfInterest" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest addNewRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest)get_store().add_element_user(REGIONOFINTEREST$18);
            return target;
        }
    }
    
    /**
     * Unsets the "regionOfInterest" element
     */
    public void unsetRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGIONOFINTEREST$18, 0);
        }
    }
    
    /**
     * Gets the "substanceAdministration" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration getSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration)get_store().find_element_user(SUBSTANCEADMINISTRATION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "substanceAdministration" element
     */
    public boolean isSetSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSTANCEADMINISTRATION$20) != 0;
        }
    }
    
    /**
     * Sets the "substanceAdministration" element
     */
    public void setSubstanceAdministration(com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration substanceAdministration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration)get_store().find_element_user(SUBSTANCEADMINISTRATION$20, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration)get_store().add_element_user(SUBSTANCEADMINISTRATION$20);
            }
            target.set(substanceAdministration);
        }
    }
    
    /**
     * Appends and returns a new empty "substanceAdministration" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration addNewSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration)get_store().add_element_user(SUBSTANCEADMINISTRATION$20);
            return target;
        }
    }
    
    /**
     * Unsets the "substanceAdministration" element
     */
    public void unsetSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSTANCEADMINISTRATION$20, 0);
        }
    }
    
    /**
     * Gets the "supply" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Supply getSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Supply target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Supply)get_store().find_element_user(SUPPLY$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supply" element
     */
    public boolean isSetSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLY$22) != 0;
        }
    }
    
    /**
     * Sets the "supply" element
     */
    public void setSupply(com.walgreens.rxit.ch.cda.POCDMT000040Supply supply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Supply target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Supply)get_store().find_element_user(SUPPLY$22, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040Supply)get_store().add_element_user(SUPPLY$22);
            }
            target.set(supply);
        }
    }
    
    /**
     * Appends and returns a new empty "supply" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040Supply addNewSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040Supply target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040Supply)get_store().add_element_user(SUPPLY$22);
            return target;
        }
    }
    
    /**
     * Unsets the "supply" element
     */
    public void unsetSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLY$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$24);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$24);
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
            return get_store().find_attribute_user(NULLFLAVOR$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$24);
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
            target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$24);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$24);
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
            get_store().remove_attribute(NULLFLAVOR$24);
        }
    }
    
    /**
     * Gets the "typeCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XActRelationshipEntry.Enum getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$26);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.XActRelationshipEntry.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public com.walgreens.rxit.ch.cda.XActRelationshipEntry xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XActRelationshipEntry target = null;
            target = (com.walgreens.rxit.ch.cda.XActRelationshipEntry)get_store().find_attribute_user(TYPECODE$26);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XActRelationshipEntry)get_default_attribute_value(TYPECODE$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "typeCode" attribute
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPECODE$26) != null;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(com.walgreens.rxit.ch.cda.XActRelationshipEntry.Enum typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$26);
            }
            target.setEnumValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(com.walgreens.rxit.ch.cda.XActRelationshipEntry typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.XActRelationshipEntry target = null;
            target = (com.walgreens.rxit.ch.cda.XActRelationshipEntry)get_store().find_attribute_user(TYPECODE$26);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.XActRelationshipEntry)get_store().add_attribute_user(TYPECODE$26);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Unsets the "typeCode" attribute
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPECODE$26);
        }
    }
    
    /**
     * Gets the "contextConductionInd" attribute
     */
    public boolean getContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONDUCTIONIND$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "contextConductionInd" attribute
     */
    public com.walgreens.rxit.ch.cda.Bl2 xgetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$28);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_default_attribute_value(CONTEXTCONDUCTIONIND$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "contextConductionInd" attribute
     */
    public boolean isSetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTEXTCONDUCTIONIND$28) != null;
        }
    }
    
    /**
     * Sets the "contextConductionInd" attribute
     */
    public void setContextConductionInd(boolean contextConductionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$28);
            }
            target.setBooleanValue(contextConductionInd);
        }
    }
    
    /**
     * Sets (as xml) the "contextConductionInd" attribute
     */
    public void xsetContextConductionInd(com.walgreens.rxit.ch.cda.Bl2 contextConductionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$28);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$28);
            }
            target.set(contextConductionInd);
        }
    }
    
    /**
     * Unsets the "contextConductionInd" attribute
     */
    public void unsetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTEXTCONDUCTIONIND$28);
        }
    }
}
