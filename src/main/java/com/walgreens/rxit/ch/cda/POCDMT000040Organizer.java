/*
 * XML Type:  POCD_MT000040.Organizer
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Organizer
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.Organizer(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040Organizer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040Organizer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040organizerd79ctype");
    
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
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(com.walgreens.rxit.ch.cda.CD code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    com.walgreens.rxit.ch.cda.CD addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets the "statusCode" element
     */
    com.walgreens.rxit.ch.cda.CS getStatusCode();
    
    /**
     * Sets the "statusCode" element
     */
    void setStatusCode(com.walgreens.rxit.ch.cda.CS statusCode);
    
    /**
     * Appends and returns a new empty "statusCode" element
     */
    com.walgreens.rxit.ch.cda.CS addNewStatusCode();
    
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
     * Gets array of all "component" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component4[] getComponentArray();
    
    /**
     * Gets ith "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component4 getComponentArray(int i);
    
    /**
     * Returns number of "component" element
     */
    int sizeOfComponentArray();
    
    /**
     * Sets array of all "component" element
     */
    void setComponentArray(com.walgreens.rxit.ch.cda.POCDMT000040Component4[] componentArray);
    
    /**
     * Sets ith "component" element
     */
    void setComponentArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Component4 component);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component4 insertNewComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component4 addNewComponent();
    
    /**
     * Removes the ith "component" element
     */
    void removeComponent(int i);
    
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
    com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer.Enum getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer xgetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer.Enum classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer classCode);
    
    /**
     * Gets the "moodCode" attribute
     */
    java.lang.String getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    com.walgreens.rxit.ch.cda.ActMood xgetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(java.lang.String moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(com.walgreens.rxit.ch.cda.ActMood moodCode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organizer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organizer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
