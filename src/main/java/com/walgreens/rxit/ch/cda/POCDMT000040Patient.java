/*
 * XML Type:  POCD_MT000040.Patient
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Patient
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.Patient(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040Patient extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040Patient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040patientda46type");
    
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
     * Gets the "id" element
     */
    com.walgreens.rxit.ch.cda.II getId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(com.walgreens.rxit.ch.cda.II id);
    
    /**
     * Appends and returns a new empty "id" element
     */
    com.walgreens.rxit.ch.cda.II addNewId();
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * Gets array of all "name" elements
     */
    com.walgreens.rxit.ch.cda.PN[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    com.walgreens.rxit.ch.cda.PN getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(com.walgreens.rxit.ch.cda.PN[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, com.walgreens.rxit.ch.cda.PN name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    com.walgreens.rxit.ch.cda.PN insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    com.walgreens.rxit.ch.cda.PN addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
    /**
     * Gets the "administrativeGenderCode" element
     */
    com.walgreens.rxit.ch.cda.CE getAdministrativeGenderCode();
    
    /**
     * True if has "administrativeGenderCode" element
     */
    boolean isSetAdministrativeGenderCode();
    
    /**
     * Sets the "administrativeGenderCode" element
     */
    void setAdministrativeGenderCode(com.walgreens.rxit.ch.cda.CE administrativeGenderCode);
    
    /**
     * Appends and returns a new empty "administrativeGenderCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewAdministrativeGenderCode();
    
    /**
     * Unsets the "administrativeGenderCode" element
     */
    void unsetAdministrativeGenderCode();
    
    /**
     * Gets the "birthTime" element
     */
    com.walgreens.rxit.ch.cda.TS getBirthTime();
    
    /**
     * True if has "birthTime" element
     */
    boolean isSetBirthTime();
    
    /**
     * Sets the "birthTime" element
     */
    void setBirthTime(com.walgreens.rxit.ch.cda.TS birthTime);
    
    /**
     * Appends and returns a new empty "birthTime" element
     */
    com.walgreens.rxit.ch.cda.TS addNewBirthTime();
    
    /**
     * Unsets the "birthTime" element
     */
    void unsetBirthTime();
    
    /**
     * Gets the "maritalStatusCode" element
     */
    com.walgreens.rxit.ch.cda.CE getMaritalStatusCode();
    
    /**
     * True if has "maritalStatusCode" element
     */
    boolean isSetMaritalStatusCode();
    
    /**
     * Sets the "maritalStatusCode" element
     */
    void setMaritalStatusCode(com.walgreens.rxit.ch.cda.CE maritalStatusCode);
    
    /**
     * Appends and returns a new empty "maritalStatusCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewMaritalStatusCode();
    
    /**
     * Unsets the "maritalStatusCode" element
     */
    void unsetMaritalStatusCode();
    
    /**
     * Gets the "religiousAffiliationCode" element
     */
    com.walgreens.rxit.ch.cda.CE getReligiousAffiliationCode();
    
    /**
     * True if has "religiousAffiliationCode" element
     */
    boolean isSetReligiousAffiliationCode();
    
    /**
     * Sets the "religiousAffiliationCode" element
     */
    void setReligiousAffiliationCode(com.walgreens.rxit.ch.cda.CE religiousAffiliationCode);
    
    /**
     * Appends and returns a new empty "religiousAffiliationCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewReligiousAffiliationCode();
    
    /**
     * Unsets the "religiousAffiliationCode" element
     */
    void unsetReligiousAffiliationCode();
    
    /**
     * Gets the "raceCode" element
     */
    com.walgreens.rxit.ch.cda.CE getRaceCode();
    
    /**
     * True if has "raceCode" element
     */
    boolean isSetRaceCode();
    
    /**
     * Sets the "raceCode" element
     */
    void setRaceCode(com.walgreens.rxit.ch.cda.CE raceCode);
    
    /**
     * Appends and returns a new empty "raceCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewRaceCode();
    
    /**
     * Unsets the "raceCode" element
     */
    void unsetRaceCode();
    
    /**
     * Gets the "ethnicGroupCode" element
     */
    com.walgreens.rxit.ch.cda.CE getEthnicGroupCode();
    
    /**
     * True if has "ethnicGroupCode" element
     */
    boolean isSetEthnicGroupCode();
    
    /**
     * Sets the "ethnicGroupCode" element
     */
    void setEthnicGroupCode(com.walgreens.rxit.ch.cda.CE ethnicGroupCode);
    
    /**
     * Appends and returns a new empty "ethnicGroupCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewEthnicGroupCode();
    
    /**
     * Unsets the "ethnicGroupCode" element
     */
    void unsetEthnicGroupCode();
    
    /**
     * Gets array of all "guardian" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Guardian[] getGuardianArray();
    
    /**
     * Gets ith "guardian" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Guardian getGuardianArray(int i);
    
    /**
     * Returns number of "guardian" element
     */
    int sizeOfGuardianArray();
    
    /**
     * Sets array of all "guardian" element
     */
    void setGuardianArray(com.walgreens.rxit.ch.cda.POCDMT000040Guardian[] guardianArray);
    
    /**
     * Sets ith "guardian" element
     */
    void setGuardianArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Guardian guardian);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guardian" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Guardian insertNewGuardian(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guardian" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Guardian addNewGuardian();
    
    /**
     * Removes the ith "guardian" element
     */
    void removeGuardian(int i);
    
    /**
     * Gets the "birthplace" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Birthplace getBirthplace();
    
    /**
     * True if has "birthplace" element
     */
    boolean isSetBirthplace();
    
    /**
     * Sets the "birthplace" element
     */
    void setBirthplace(com.walgreens.rxit.ch.cda.POCDMT000040Birthplace birthplace);
    
    /**
     * Appends and returns a new empty "birthplace" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Birthplace addNewBirthplace();
    
    /**
     * Unsets the "birthplace" element
     */
    void unsetBirthplace();
    
    /**
     * Gets array of all "languageCommunication" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication[] getLanguageCommunicationArray();
    
    /**
     * Gets ith "languageCommunication" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication getLanguageCommunicationArray(int i);
    
    /**
     * Returns number of "languageCommunication" element
     */
    int sizeOfLanguageCommunicationArray();
    
    /**
     * Sets array of all "languageCommunication" element
     */
    void setLanguageCommunicationArray(com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication[] languageCommunicationArray);
    
    /**
     * Sets ith "languageCommunication" element
     */
    void setLanguageCommunicationArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication languageCommunication);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageCommunication" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication insertNewLanguageCommunication(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "languageCommunication" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040LanguageCommunication addNewLanguageCommunication();
    
    /**
     * Removes the ith "languageCommunication" element
     */
    void removeLanguageCommunication(int i);
    
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
    com.walgreens.rxit.ch.cda.EntityClass xgetClassCode();
    
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
    void xsetClassCode(com.walgreens.rxit.ch.cda.EntityClass classCode);
    
    /**
     * Unsets the "classCode" attribute
     */
    void unsetClassCode();
    
    /**
     * Gets the "determinerCode" attribute
     */
    java.lang.String getDeterminerCode();
    
    /**
     * Gets (as xml) the "determinerCode" attribute
     */
    com.walgreens.rxit.ch.cda.EntityDeterminer xgetDeterminerCode();
    
    /**
     * True if has "determinerCode" attribute
     */
    boolean isSetDeterminerCode();
    
    /**
     * Sets the "determinerCode" attribute
     */
    void setDeterminerCode(java.lang.String determinerCode);
    
    /**
     * Sets (as xml) the "determinerCode" attribute
     */
    void xsetDeterminerCode(com.walgreens.rxit.ch.cda.EntityDeterminer determinerCode);
    
    /**
     * Unsets the "determinerCode" attribute
     */
    void unsetDeterminerCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
