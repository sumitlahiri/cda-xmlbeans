/*
 * XML Type:  POCD_MT000040.ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.ClinicalDocument(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040ClinicalDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040ClinicalDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040clinicaldocumentf0d3type");
    
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
     * Sets the "typeId" element
     */
    void setTypeId(com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId typeId);
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId addNewTypeId();
    
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
     * Gets the "id" element
     */
    com.walgreens.rxit.ch.cda.II getId();
    
    /**
     * Sets the "id" element
     */
    void setId(com.walgreens.rxit.ch.cda.II id);
    
    /**
     * Appends and returns a new empty "id" element
     */
    com.walgreens.rxit.ch.cda.II addNewId();
    
    /**
     * Gets the "code" element
     */
    com.walgreens.rxit.ch.cda.CE getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(com.walgreens.rxit.ch.cda.CE code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    com.walgreens.rxit.ch.cda.CE addNewCode();
    
    /**
     * Gets the "title" element
     */
    com.walgreens.rxit.ch.cda.ST getTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(com.walgreens.rxit.ch.cda.ST title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    com.walgreens.rxit.ch.cda.ST addNewTitle();
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "effectiveTime" element
     */
    com.walgreens.rxit.ch.cda.TS getEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(com.walgreens.rxit.ch.cda.TS effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    com.walgreens.rxit.ch.cda.TS addNewEffectiveTime();
    
    /**
     * Gets the "confidentialityCode" element
     */
    com.walgreens.rxit.ch.cda.CE getConfidentialityCode();
    
    /**
     * Sets the "confidentialityCode" element
     */
    void setConfidentialityCode(com.walgreens.rxit.ch.cda.CE confidentialityCode);
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewConfidentialityCode();
    
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
     * Gets the "setId" element
     */
    com.walgreens.rxit.ch.cda.II getSetId();
    
    /**
     * True if has "setId" element
     */
    boolean isSetSetId();
    
    /**
     * Sets the "setId" element
     */
    void setSetId(com.walgreens.rxit.ch.cda.II setId);
    
    /**
     * Appends and returns a new empty "setId" element
     */
    com.walgreens.rxit.ch.cda.II addNewSetId();
    
    /**
     * Unsets the "setId" element
     */
    void unsetSetId();
    
    /**
     * Gets the "versionNumber" element
     */
    com.walgreens.rxit.ch.cda.INT getVersionNumber();
    
    /**
     * True if has "versionNumber" element
     */
    boolean isSetVersionNumber();
    
    /**
     * Sets the "versionNumber" element
     */
    void setVersionNumber(com.walgreens.rxit.ch.cda.INT versionNumber);
    
    /**
     * Appends and returns a new empty "versionNumber" element
     */
    com.walgreens.rxit.ch.cda.INT addNewVersionNumber();
    
    /**
     * Unsets the "versionNumber" element
     */
    void unsetVersionNumber();
    
    /**
     * Gets the "copyTime" element
     */
    com.walgreens.rxit.ch.cda.TS getCopyTime();
    
    /**
     * True if has "copyTime" element
     */
    boolean isSetCopyTime();
    
    /**
     * Sets the "copyTime" element
     */
    void setCopyTime(com.walgreens.rxit.ch.cda.TS copyTime);
    
    /**
     * Appends and returns a new empty "copyTime" element
     */
    com.walgreens.rxit.ch.cda.TS addNewCopyTime();
    
    /**
     * Unsets the "copyTime" element
     */
    void unsetCopyTime();
    
    /**
     * Gets array of all "recordTarget" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget[] getRecordTargetArray();
    
    /**
     * Gets ith "recordTarget" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget getRecordTargetArray(int i);
    
    /**
     * Returns number of "recordTarget" element
     */
    int sizeOfRecordTargetArray();
    
    /**
     * Sets array of all "recordTarget" element
     */
    void setRecordTargetArray(com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget[] recordTargetArray);
    
    /**
     * Sets ith "recordTarget" element
     */
    void setRecordTargetArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget recordTarget);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordTarget" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget insertNewRecordTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordTarget" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RecordTarget addNewRecordTarget();
    
    /**
     * Removes the ith "recordTarget" element
     */
    void removeRecordTarget(int i);
    
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
     * Gets the "dataEnterer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer getDataEnterer();
    
    /**
     * True if has "dataEnterer" element
     */
    boolean isSetDataEnterer();
    
    /**
     * Sets the "dataEnterer" element
     */
    void setDataEnterer(com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer dataEnterer);
    
    /**
     * Appends and returns a new empty "dataEnterer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040DataEnterer addNewDataEnterer();
    
    /**
     * Unsets the "dataEnterer" element
     */
    void unsetDataEnterer();
    
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
     * Gets the "custodian" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Custodian getCustodian();
    
    /**
     * Sets the "custodian" element
     */
    void setCustodian(com.walgreens.rxit.ch.cda.POCDMT000040Custodian custodian);
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Custodian addNewCustodian();
    
    /**
     * Gets array of all "informationRecipient" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient[] getInformationRecipientArray();
    
    /**
     * Gets ith "informationRecipient" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient getInformationRecipientArray(int i);
    
    /**
     * Returns number of "informationRecipient" element
     */
    int sizeOfInformationRecipientArray();
    
    /**
     * Sets array of all "informationRecipient" element
     */
    void setInformationRecipientArray(com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient[] informationRecipientArray);
    
    /**
     * Sets ith "informationRecipient" element
     */
    void setInformationRecipientArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient informationRecipient);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationRecipient" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient insertNewInformationRecipient(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informationRecipient" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InformationRecipient addNewInformationRecipient();
    
    /**
     * Removes the ith "informationRecipient" element
     */
    void removeInformationRecipient(int i);
    
    /**
     * Gets the "legalAuthenticator" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator getLegalAuthenticator();
    
    /**
     * True if has "legalAuthenticator" element
     */
    boolean isSetLegalAuthenticator();
    
    /**
     * Sets the "legalAuthenticator" element
     */
    void setLegalAuthenticator(com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator legalAuthenticator);
    
    /**
     * Appends and returns a new empty "legalAuthenticator" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040LegalAuthenticator addNewLegalAuthenticator();
    
    /**
     * Unsets the "legalAuthenticator" element
     */
    void unsetLegalAuthenticator();
    
    /**
     * Gets array of all "authenticator" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authenticator[] getAuthenticatorArray();
    
    /**
     * Gets ith "authenticator" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authenticator getAuthenticatorArray(int i);
    
    /**
     * Returns number of "authenticator" element
     */
    int sizeOfAuthenticatorArray();
    
    /**
     * Sets array of all "authenticator" element
     */
    void setAuthenticatorArray(com.walgreens.rxit.ch.cda.POCDMT000040Authenticator[] authenticatorArray);
    
    /**
     * Sets ith "authenticator" element
     */
    void setAuthenticatorArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Authenticator authenticator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authenticator" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authenticator insertNewAuthenticator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authenticator" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authenticator addNewAuthenticator();
    
    /**
     * Removes the ith "authenticator" element
     */
    void removeAuthenticator(int i);
    
    /**
     * Gets array of all "participant" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant1[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant1 getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(com.walgreens.rxit.ch.cda.POCDMT000040Participant1[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Participant1 participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant1 insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Participant1 addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "inFulfillmentOf" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf[] getInFulfillmentOfArray();
    
    /**
     * Gets ith "inFulfillmentOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf getInFulfillmentOfArray(int i);
    
    /**
     * Returns number of "inFulfillmentOf" element
     */
    int sizeOfInFulfillmentOfArray();
    
    /**
     * Sets array of all "inFulfillmentOf" element
     */
    void setInFulfillmentOfArray(com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf[] inFulfillmentOfArray);
    
    /**
     * Sets ith "inFulfillmentOf" element
     */
    void setInFulfillmentOfArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf inFulfillmentOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inFulfillmentOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf insertNewInFulfillmentOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inFulfillmentOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040InFulfillmentOf addNewInFulfillmentOf();
    
    /**
     * Removes the ith "inFulfillmentOf" element
     */
    void removeInFulfillmentOf(int i);
    
    /**
     * Gets array of all "documentationOf" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf[] getDocumentationOfArray();
    
    /**
     * Gets ith "documentationOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf getDocumentationOfArray(int i);
    
    /**
     * Returns number of "documentationOf" element
     */
    int sizeOfDocumentationOfArray();
    
    /**
     * Sets array of all "documentationOf" element
     */
    void setDocumentationOfArray(com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf[] documentationOfArray);
    
    /**
     * Sets ith "documentationOf" element
     */
    void setDocumentationOfArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf documentationOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf insertNewDocumentationOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040DocumentationOf addNewDocumentationOf();
    
    /**
     * Removes the ith "documentationOf" element
     */
    void removeDocumentationOf(int i);
    
    /**
     * Gets array of all "relatedDocument" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1[] getRelatedDocumentArray();
    
    /**
     * Gets ith "relatedDocument" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 getRelatedDocumentArray(int i);
    
    /**
     * Returns number of "relatedDocument" element
     */
    int sizeOfRelatedDocumentArray();
    
    /**
     * Sets array of all "relatedDocument" element
     */
    void setRelatedDocumentArray(com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1[] relatedDocumentArray);
    
    /**
     * Sets ith "relatedDocument" element
     */
    void setRelatedDocumentArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 relatedDocument);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedDocument" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 insertNewRelatedDocument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedDocument" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RelatedDocument1 addNewRelatedDocument();
    
    /**
     * Removes the ith "relatedDocument" element
     */
    void removeRelatedDocument(int i);
    
    /**
     * Gets array of all "authorization" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authorization[] getAuthorizationArray();
    
    /**
     * Gets ith "authorization" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authorization getAuthorizationArray(int i);
    
    /**
     * Returns number of "authorization" element
     */
    int sizeOfAuthorizationArray();
    
    /**
     * Sets array of all "authorization" element
     */
    void setAuthorizationArray(com.walgreens.rxit.ch.cda.POCDMT000040Authorization[] authorizationArray);
    
    /**
     * Sets ith "authorization" element
     */
    void setAuthorizationArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Authorization authorization);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorization" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authorization insertNewAuthorization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorization" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Authorization addNewAuthorization();
    
    /**
     * Removes the ith "authorization" element
     */
    void removeAuthorization(int i);
    
    /**
     * Gets the "componentOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component1 getComponentOf();
    
    /**
     * True if has "componentOf" element
     */
    boolean isSetComponentOf();
    
    /**
     * Sets the "componentOf" element
     */
    void setComponentOf(com.walgreens.rxit.ch.cda.POCDMT000040Component1 componentOf);
    
    /**
     * Appends and returns a new empty "componentOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component1 addNewComponentOf();
    
    /**
     * Unsets the "componentOf" element
     */
    void unsetComponentOf();
    
    /**
     * Gets the "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component2 getComponent();
    
    /**
     * Sets the "component" element
     */
    void setComponent(com.walgreens.rxit.ch.cda.POCDMT000040Component2 component);
    
    /**
     * Appends and returns a new empty "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component2 addNewComponent();
    
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
    com.walgreens.rxit.ch.cda.ActClinicalDocument1.Enum getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    com.walgreens.rxit.ch.cda.ActClinicalDocument1 xgetClassCode();
    
    /**
     * True if has "classCode" attribute
     */
    boolean isSetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(com.walgreens.rxit.ch.cda.ActClinicalDocument1.Enum classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(com.walgreens.rxit.ch.cda.ActClinicalDocument1 classCode);
    
    /**
     * Unsets the "classCode" attribute
     */
    void unsetClassCode();
    
    /**
     * Gets the "moodCode" attribute
     */
    java.lang.String getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    com.walgreens.rxit.ch.cda.ActMood xgetMoodCode();
    
    /**
     * True if has "moodCode" attribute
     */
    boolean isSetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(java.lang.String moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(com.walgreens.rxit.ch.cda.ActMood moodCode);
    
    /**
     * Unsets the "moodCode" attribute
     */
    void unsetMoodCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
