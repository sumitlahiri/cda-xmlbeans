/*
 * XML Type:  POCD_MT000040.EncompassingEncounter
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.EncompassingEncounter(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040EncompassingEncounter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040EncompassingEncounter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040encompassingencounter21b1type");
    
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
    com.walgreens.rxit.ch.cda.CE getCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(com.walgreens.rxit.ch.cda.CE code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    com.walgreens.rxit.ch.cda.CE addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets the "effectiveTime" element
     */
    com.walgreens.rxit.ch.cda.IVLTS getEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(com.walgreens.rxit.ch.cda.IVLTS effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    com.walgreens.rxit.ch.cda.IVLTS addNewEffectiveTime();
    
    /**
     * Gets the "dischargeDispositionCode" element
     */
    com.walgreens.rxit.ch.cda.CE getDischargeDispositionCode();
    
    /**
     * True if has "dischargeDispositionCode" element
     */
    boolean isSetDischargeDispositionCode();
    
    /**
     * Sets the "dischargeDispositionCode" element
     */
    void setDischargeDispositionCode(com.walgreens.rxit.ch.cda.CE dischargeDispositionCode);
    
    /**
     * Appends and returns a new empty "dischargeDispositionCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewDischargeDispositionCode();
    
    /**
     * Unsets the "dischargeDispositionCode" element
     */
    void unsetDischargeDispositionCode();
    
    /**
     * Gets the "responsibleParty" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty getResponsibleParty();
    
    /**
     * True if has "responsibleParty" element
     */
    boolean isSetResponsibleParty();
    
    /**
     * Sets the "responsibleParty" element
     */
    void setResponsibleParty(com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty responsibleParty);
    
    /**
     * Appends and returns a new empty "responsibleParty" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ResponsibleParty addNewResponsibleParty();
    
    /**
     * Unsets the "responsibleParty" element
     */
    void unsetResponsibleParty();
    
    /**
     * Gets array of all "encounterParticipant" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant[] getEncounterParticipantArray();
    
    /**
     * Gets ith "encounterParticipant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant getEncounterParticipantArray(int i);
    
    /**
     * Returns number of "encounterParticipant" element
     */
    int sizeOfEncounterParticipantArray();
    
    /**
     * Sets array of all "encounterParticipant" element
     */
    void setEncounterParticipantArray(com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant[] encounterParticipantArray);
    
    /**
     * Sets ith "encounterParticipant" element
     */
    void setEncounterParticipantArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant encounterParticipant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "encounterParticipant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant insertNewEncounterParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "encounterParticipant" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040EncounterParticipant addNewEncounterParticipant();
    
    /**
     * Removes the ith "encounterParticipant" element
     */
    void removeEncounterParticipant(int i);
    
    /**
     * Gets the "location" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Location getLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(com.walgreens.rxit.ch.cda.POCDMT000040Location location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Location addNewLocation();
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
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
    com.walgreens.rxit.ch.cda.ActClass xgetClassCode();
    
    /**
     * True if has "classCode" attribute
     */
    boolean isSetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(com.walgreens.rxit.ch.cda.ActClass classCode);
    
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
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040EncompassingEncounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
