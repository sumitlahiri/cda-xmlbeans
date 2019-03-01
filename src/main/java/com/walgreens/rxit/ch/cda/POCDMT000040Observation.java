/*
 * XML Type:  POCD_MT000040.Observation
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Observation
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.Observation(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040Observation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040Observation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040observation27bftype");
    
    /**
     * Gets array of all "realmCode" elements
     */
    com.walgreens.rxit.ch.cda.CS[] getRealmCodeArray();
    
    /**
     * Gets ith "realmCode" element
     */
    com.walgreens.rxit.ch.cda.CS getRealmCodeArray(int i);
    
    /**
     * Returns number of "realmCode" element
     */
    int sizeOfRealmCodeArray();
    
    /**
     * Sets array of all "realmCode" element
     */
    void setRealmCodeArray(com.walgreens.rxit.ch.cda.CS[] realmCodeArray);
    
    /**
     * Sets ith "realmCode" element
     */
    void setRealmCodeArray(int i, com.walgreens.rxit.ch.cda.CS realmCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realmCode" element
     */
    com.walgreens.rxit.ch.cda.CS insertNewRealmCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realmCode" element
     */
    com.walgreens.rxit.ch.cda.CS addNewRealmCode();
    
    /**
     * Removes the ith "realmCode" element
     */
    void removeRealmCode(int i);
    
    /**
     * Gets the "typeId" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId getTypeId();
    
    /**
     * True if has "typeId" element
     */
    boolean isSetTypeId();
    
    /**
     * Sets the "typeId" element
     */
    void setTypeId(com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId typeId);
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId addNewTypeId();
    
    /**
     * Unsets the "typeId" element
     */
    void unsetTypeId();
    
    /**
     * Gets array of all "templateId" elements
     */
    com.walgreens.rxit.ch.cda.II[] getTemplateIdArray();
    
    /**
     * Gets ith "templateId" element
     */
    com.walgreens.rxit.ch.cda.II getTemplateIdArray(int i);
    
    /**
     * Returns number of "templateId" element
     */
    int sizeOfTemplateIdArray();
    
    /**
     * Sets array of all "templateId" element
     */
    void setTemplateIdArray(com.walgreens.rxit.ch.cda.II[] templateIdArray);
    
    /**
     * Sets ith "templateId" element
     */
    void setTemplateIdArray(int i, com.walgreens.rxit.ch.cda.II templateId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "templateId" element
     */
    com.walgreens.rxit.ch.cda.II insertNewTemplateId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "templateId" element
     */
    com.walgreens.rxit.ch.cda.II addNewTemplateId();
    
    /**
     * Removes the ith "templateId" element
     */
    void removeTemplateId(int i);
    
    /**
     * Gets array of all "id" elements
     */
    com.walgreens.rxit.ch.cda.II[] getIdArray();
    
    /**
     * Gets ith "id" element
     */
    com.walgreens.rxit.ch.cda.II getIdArray(int i);
    
    /**
     * Returns number of "id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "id" element
     */
    void setIdArray(com.walgreens.rxit.ch.cda.II[] idArray);
    
    /**
     * Sets ith "id" element
     */
    void setIdArray(int i, com.walgreens.rxit.ch.cda.II id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    com.walgreens.rxit.ch.cda.II insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    com.walgreens.rxit.ch.cda.II addNewId();
    
    /**
     * Removes the ith "id" element
     */
    void removeId(int i);
    
    /**
     * Gets the "code" element
     */
    com.walgreens.rxit.ch.cda.CD getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(com.walgreens.rxit.ch.cda.CD code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    com.walgreens.rxit.ch.cda.CD addNewCode();
    
    /**
     * Gets the "derivationExpr" element
     */
    com.walgreens.rxit.ch.cda.ST getDerivationExpr();
    
    /**
     * True if has "derivationExpr" element
     */
    boolean isSetDerivationExpr();
    
    /**
     * Sets the "derivationExpr" element
     */
    void setDerivationExpr(com.walgreens.rxit.ch.cda.ST derivationExpr);
    
    /**
     * Appends and returns a new empty "derivationExpr" element
     */
    com.walgreens.rxit.ch.cda.ST addNewDerivationExpr();
    
    /**
     * Unsets the "derivationExpr" element
     */
    void unsetDerivationExpr();
    
    /**
     * Gets the "text" element
     */
    com.walgreens.rxit.ch.cda.ED getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(com.walgreens.rxit.ch.cda.ED text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    com.walgreens.rxit.ch.cda.ED addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * Gets the "statusCode" element
     */
    com.walgreens.rxit.ch.cda.CS getStatusCode();
    
    /**
     * True if has "statusCode" element
     */
    boolean isSetStatusCode();
    
    /**
     * Sets the "statusCode" element
     */
    void setStatusCode(com.walgreens.rxit.ch.cda.CS statusCode);
    
    /**
     * Appends and returns a new empty "statusCode" element
     */
    com.walgreens.rxit.ch.cda.CS addNewStatusCode();
    
    /**
     * Unsets the "statusCode" element
     */
    void unsetStatusCode();
    
    /**
     * Gets the "effectiveTime" element
     */
    com.walgreens.rxit.ch.cda.IVLTS getEffectiveTime();
    
    /**
     * True if has "effectiveTime" element
     */
    boolean isSetEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(com.walgreens.rxit.ch.cda.IVLTS effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    com.walgreens.rxit.ch.cda.IVLTS addNewEffectiveTime();
    
    /**
     * Unsets the "effectiveTime" element
     */
    void unsetEffectiveTime();
    
    /**
     * Gets the "priorityCode" element
     */
    com.walgreens.rxit.ch.cda.CE getPriorityCode();
    
    /**
     * True if has "priorityCode" element
     */
    boolean isSetPriorityCode();
    
    /**
     * Sets the "priorityCode" element
     */
    void setPriorityCode(com.walgreens.rxit.ch.cda.CE priorityCode);
    
    /**
     * Appends and returns a new empty "priorityCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewPriorityCode();
    
    /**
     * Unsets the "priorityCode" element
     */
    void unsetPriorityCode();
    
    /**
     * Gets the "repeatNumber" element
     */
    com.walgreens.rxit.ch.cda.IVLINT getRepeatNumber();
    
    /**
     * True if has "repeatNumber" element
     */
    boolean isSetRepeatNumber();
    
    /**
     * Sets the "repeatNumber" element
     */
    void setRepeatNumber(com.walgreens.rxit.ch.cda.IVLINT repeatNumber);
    
    /**
     * Appends and returns a new empty "repeatNumber" element
     */
    com.walgreens.rxit.ch.cda.IVLINT addNewRepeatNumber();
    
    /**
     * Unsets the "repeatNumber" element
     */
    void unsetRepeatNumber();
    
    /**
     * Gets the "languageCode" element
     */
    com.walgreens.rxit.ch.cda.CS getLanguageCode();
    
    /**
     * True if has "languageCode" element
     */
    boolean isSetLanguageCode();
    
    /**
     * Sets the "languageCode" element
     */
    void setLanguageCode(com.walgreens.rxit.ch.cda.CS languageCode);
    
    /**
     * Appends and returns a new empty "languageCode" element
     */
    com.walgreens.rxit.ch.cda.CS addNewLanguageCode();
    
    /**
     * Unsets the "languageCode" element
     */
    void unsetLanguageCode();
    
    /**
     * Gets array of all "value" elements
     */
    com.walgreens.rxit.ch.cda.ANY[] getValueArray();
    
    /**
     * Gets ith "value" element
     */
    com.walgreens.rxit.ch.cda.ANY getValueArray(int i);
    
    /**
     * Returns number of "value" element
     */
    int sizeOfValueArray();
    
    /**
     * Sets array of all "value" element
     */
    void setValueArray(com.walgreens.rxit.ch.cda.ANY[] valueArray);
    
    /**
     * Sets ith "value" element
     */
    void setValueArray(int i, com.walgreens.rxit.ch.cda.ANY value);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "value" element
     */
    com.walgreens.rxit.ch.cda.ANY insertNewValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "value" element
     */
    com.walgreens.rxit.ch.cda.ANY addNewValue();
    
    /**
     * Removes the ith "value" element
     */
    void removeValue(int i);
    
    /**
     * Gets array of all "interpretationCode" elements
     */
    com.walgreens.rxit.ch.cda.CE[] getInterpretationCodeArray();
    
    /**
     * Gets ith "interpretationCode" element
     */
    com.walgreens.rxit.ch.cda.CE getInterpretationCodeArray(int i);
    
    /**
     * Returns number of "interpretationCode" element
     */
    int sizeOfInterpretationCodeArray();
    
    /**
     * Sets array of all "interpretationCode" element
     */
    void setInterpretationCodeArray(com.walgreens.rxit.ch.cda.CE[] interpretationCodeArray);
    
    /**
     * Sets ith "interpretationCode" element
     */
    void setInterpretationCodeArray(int i, com.walgreens.rxit.ch.cda.CE interpretationCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interpretationCode" element
     */
    com.walgreens.rxit.ch.cda.CE insertNewInterpretationCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interpretationCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewInterpretationCode();
    
    /**
     * Removes the ith "interpretationCode" element
     */
    void removeInterpretationCode(int i);
    
    /**
     * Gets array of all "methodCode" elements
     */
    com.walgreens.rxit.ch.cda.CE[] getMethodCodeArray();
    
    /**
     * Gets ith "methodCode" element
     */
    com.walgreens.rxit.ch.cda.CE getMethodCodeArray(int i);
    
    /**
     * Returns number of "methodCode" element
     */
    int sizeOfMethodCodeArray();
    
    /**
     * Sets array of all "methodCode" element
     */
    void setMethodCodeArray(com.walgreens.rxit.ch.cda.CE[] methodCodeArray);
    
    /**
     * Sets ith "methodCode" element
     */
    void setMethodCodeArray(int i, com.walgreens.rxit.ch.cda.CE methodCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "methodCode" element
     */
    com.walgreens.rxit.ch.cda.CE insertNewMethodCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "methodCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewMethodCode();
    
    /**
     * Removes the ith "methodCode" element
     */
    void removeMethodCode(int i);
    
    /**
     * Gets array of all "targetSiteCode" elements
     */
    com.walgreens.rxit.ch.cda.CD[] getTargetSiteCodeArray();
    
    /**
     * Gets ith "targetSiteCode" element
     */
    com.walgreens.rxit.ch.cda.CD getTargetSiteCodeArray(int i);
    
    /**
     * Returns number of "targetSiteCode" element
     */
    int sizeOfTargetSiteCodeArray();
    
    /**
     * Sets array of all "targetSiteCode" element
     */
    void setTargetSiteCodeArray(com.walgreens.rxit.ch.cda.CD[] targetSiteCodeArray);
    
    /**
     * Sets ith "targetSiteCode" element
     */
    void setTargetSiteCodeArray(int i, com.walgreens.rxit.ch.cda.CD targetSiteCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "targetSiteCode" element
     */
    com.walgreens.rxit.ch.cda.CD insertNewTargetSiteCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "targetSiteCode" element
     */
    com.walgreens.rxit.ch.cda.CD addNewTargetSiteCode();
    
    /**
     * Removes the ith "targetSiteCode" element
     */
    void removeTargetSiteCode(int i);
    
    /**
     * Gets the "subject" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Subject getSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(com.walgreens.rxit.ch.cda.POCDMT000040Subject subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Subject addNewSubject();
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * Gets array of all "specimen" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Specimen[] getSpecimenArray();
    
    /**
     * Gets ith "specimen" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Specimen getSpecimenArray(int i);
    
    /**
     * Returns number of "specimen" element
     */
    int sizeOfSpecimenArray();
    
    /**
     * Sets array of all "specimen" element
     */
    void setSpecimenArray(com.walgreens.rxit.ch.cda.POCDMT000040Specimen[] specimenArray);
    
    /**
     * Sets ith "specimen" element
     */
    void setSpecimenArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Specimen specimen);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Specimen insertNewSpecimen(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Specimen addNewSpecimen();
    
    /**
     * Removes the ith "specimen" element
     */
    void removeSpecimen(int i);
    
    /**
     * Gets array of all "performer" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Performer2[] getPerformerArray();
    
    /**
     * Gets ith "performer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Performer2 getPerformerArray(int i);
    
    /**
     * Returns number of "performer" element
     */
    int sizeOfPerformerArray();
    
    /**
     * Sets array of all "performer" element
     */
    void setPerformerArray(com.walgreens.rxit.ch.cda.POCDMT000040Performer2[] performerArray);
    
    /**
     * Sets ith "performer" element
     */
    void setPerformerArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Performer2 performer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Performer2 insertNewPerformer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Performer2 addNewPerformer();
    
    /**
     * Removes the ith "performer" element
     */
    void removePerformer(int i);
    
    /**
     * Gets array of all "author" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Author[] getAuthorArray();
    
    /**
     * Gets ith "author" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Author getAuthorArray(int i);
    
    /**
     * Returns number of "author" element
     */
    int sizeOfAuthorArray();
    
    /**
     * Sets array of all "author" element
     */
    void setAuthorArray(com.walgreens.rxit.ch.cda.POCDMT000040Author[] authorArray);
    
    /**
     * Sets ith "author" element
     */
    void setAuthorArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Author author);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Author insertNewAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Author addNewAuthor();
    
    /**
     * Removes the ith "author" element
     */
    void removeAuthor(int i);
    
    /**
     * Gets array of all "informant" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Informant12[] getInformantArray();
    
    /**
     * Gets ith "informant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Informant12 getInformantArray(int i);
    
    /**
     * Returns number of "informant" element
     */
    int sizeOfInformantArray();
    
    /**
     * Sets array of all "informant" element
     */
    void setInformantArray(com.walgreens.rxit.ch.cda.POCDMT000040Informant12[] informantArray);
    
    /**
     * Sets ith "informant" element
     */
    void setInformantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Informant12 informant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Informant12 insertNewInformant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Informant12 addNewInformant();
    
    /**
     * Removes the ith "informant" element
     */
    void removeInformant(int i);
    
    /**
     * Gets array of all "participant" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant2[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant2 getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(com.walgreens.rxit.ch.cda.POCDMT000040Participant2[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Participant2 participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant2 insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant2 addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "entryRelationship" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship[] getEntryRelationshipArray();
    
    /**
     * Gets ith "entryRelationship" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship getEntryRelationshipArray(int i);
    
    /**
     * Returns number of "entryRelationship" element
     */
    int sizeOfEntryRelationshipArray();
    
    /**
     * Sets array of all "entryRelationship" element
     */
    void setEntryRelationshipArray(com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship[] entryRelationshipArray);
    
    /**
     * Sets ith "entryRelationship" element
     */
    void setEntryRelationshipArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship entryRelationship);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryRelationship" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship insertNewEntryRelationship(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entryRelationship" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EntryRelationship addNewEntryRelationship();
    
    /**
     * Removes the ith "entryRelationship" element
     */
    void removeEntryRelationship(int i);
    
    /**
     * Gets array of all "reference" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Reference[] getReferenceArray();
    
    /**
     * Gets ith "reference" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Reference getReferenceArray(int i);
    
    /**
     * Returns number of "reference" element
     */
    int sizeOfReferenceArray();
    
    /**
     * Sets array of all "reference" element
     */
    void setReferenceArray(com.walgreens.rxit.ch.cda.POCDMT000040Reference[] referenceArray);
    
    /**
     * Sets ith "reference" element
     */
    void setReferenceArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Reference reference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Reference insertNewReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Reference addNewReference();
    
    /**
     * Removes the ith "reference" element
     */
    void removeReference(int i);
    
    /**
     * Gets array of all "precondition" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Precondition[] getPreconditionArray();
    
    /**
     * Gets ith "precondition" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Precondition getPreconditionArray(int i);
    
    /**
     * Returns number of "precondition" element
     */
    int sizeOfPreconditionArray();
    
    /**
     * Sets array of all "precondition" element
     */
    void setPreconditionArray(com.walgreens.rxit.ch.cda.POCDMT000040Precondition[] preconditionArray);
    
    /**
     * Sets ith "precondition" element
     */
    void setPreconditionArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Precondition precondition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "precondition" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Precondition insertNewPrecondition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "precondition" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Precondition addNewPrecondition();
    
    /**
     * Removes the ith "precondition" element
     */
    void removePrecondition(int i);
    
    /**
     * Gets array of all "referenceRange" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ReferenceRange[] getReferenceRangeArray();
    
    /**
     * Gets ith "referenceRange" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ReferenceRange getReferenceRangeArray(int i);
    
    /**
     * Returns number of "referenceRange" element
     */
    int sizeOfReferenceRangeArray();
    
    /**
     * Sets array of all "referenceRange" element
     */
    void setReferenceRangeArray(com.walgreens.rxit.ch.cda.POCDMT000040ReferenceRange[] referenceRangeArray);
    
    /**
     * Sets ith "referenceRange" element
     */
    void setReferenceRangeArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040ReferenceRange referenceRange);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceRange" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ReferenceRange insertNewReferenceRange(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceRange" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ReferenceRange addNewReferenceRange();
    
    /**
     * Removes the ith "referenceRange" element
     */
    void removeReferenceRange(int i);
    
    /**
     * Gets the "nullFlavor" attribute
     */
    java.lang.String getNullFlavor();
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    com.walgreens.rxit.ch.cda.NullFlavor xgetNullFlavor();
    
    /**
     * True if has "nullFlavor" attribute
     */
    boolean isSetNullFlavor();
    
    /**
     * Sets the "nullFlavor" attribute
     */
    void setNullFlavor(java.lang.String nullFlavor);
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    void xsetNullFlavor(com.walgreens.rxit.ch.cda.NullFlavor nullFlavor);
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    void unsetNullFlavor();
    
    /**
     * Gets the "classCode" attribute
     */
    java.lang.String getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    com.walgreens.rxit.ch.cda.ActClassObservation xgetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(com.walgreens.rxit.ch.cda.ActClassObservation classCode);
    
    /**
     * Gets the "moodCode" attribute
     */
    com.walgreens.rxit.ch.cda.XActMoodDocumentObservation.Enum getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    com.walgreens.rxit.ch.cda.XActMoodDocumentObservation xgetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(com.walgreens.rxit.ch.cda.XActMoodDocumentObservation.Enum moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(com.walgreens.rxit.ch.cda.XActMoodDocumentObservation moodCode);
    
    /**
     * Gets the "negationInd" attribute
     */
    boolean getNegationInd();
    
    /**
     * Gets (as xml) the "negationInd" attribute
     */
    com.walgreens.rxit.ch.cda.Bl2 xgetNegationInd();
    
    /**
     * True if has "negationInd" attribute
     */
    boolean isSetNegationInd();
    
    /**
     * Sets the "negationInd" attribute
     */
    void setNegationInd(boolean negationInd);
    
    /**
     * Sets (as xml) the "negationInd" attribute
     */
    void xsetNegationInd(com.walgreens.rxit.ch.cda.Bl2 negationInd);
    
    /**
     * Unsets the "negationInd" attribute
     */
    void unsetNegationInd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Observation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
