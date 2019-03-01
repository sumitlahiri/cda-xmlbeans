/*
 * XML Type:  POCD_MT000040.Section
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Section
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.Section(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040Section extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040Section.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040section0a66type");
    
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
     * Gets the "text" element
     */
    com.walgreens.rxit.ch.cda.StrucDocText getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(com.walgreens.rxit.ch.cda.StrucDocText text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    com.walgreens.rxit.ch.cda.StrucDocText addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * Gets the "text_POC" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTextPOC getTextPOC();
    
    /**
     * True if has "text_POC" element
     */
    boolean isSetTextPOC();
    
    /**
     * Sets the "text_POC" element
     */
    void setTextPOC(com.walgreens.rxit.ch.cda.StrucDocTextPOC textPOC);
    
    /**
     * Appends and returns a new empty "text_POC" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTextPOC addNewTextPOC();
    
    /**
     * Unsets the "text_POC" element
     */
    void unsetTextPOC();
    
    /**
     * Gets the "confidentialityCode" element
     */
    com.walgreens.rxit.ch.cda.CE getConfidentialityCode();
    
    /**
     * True if has "confidentialityCode" element
     */
    boolean isSetConfidentialityCode();
    
    /**
     * Sets the "confidentialityCode" element
     */
    void setConfidentialityCode(com.walgreens.rxit.ch.cda.CE confidentialityCode);
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewConfidentialityCode();
    
    /**
     * Unsets the "confidentialityCode" element
     */
    void unsetConfidentialityCode();
    
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
     * Gets array of all "entry" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Entry[] getEntryArray();
    
    /**
     * Gets ith "entry" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Entry getEntryArray(int i);
    
    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();
    
    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(com.walgreens.rxit.ch.cda.POCDMT000040Entry[] entryArray);
    
    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Entry entry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Entry insertNewEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Entry addNewEntry();
    
    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);
    
    /**
     * Gets array of all "component" elements
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component5[] getComponentArray();
    
    /**
     * Gets ith "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component5 getComponentArray(int i);
    
    /**
     * Returns number of "component" element
     */
    int sizeOfComponentArray();
    
    /**
     * Sets array of all "component" element
     */
    void setComponentArray(com.walgreens.rxit.ch.cda.POCDMT000040Component5[] componentArray);
    
    /**
     * Sets ith "component" element
     */
    void setComponentArray(int i, com.walgreens.rxit.ch.cda.POCDMT000040Component5 component);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component5 insertNewComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Component5 addNewComponent();
    
    /**
     * Removes the ith "component" element
     */
    void removeComponent(int i);
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlID xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
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
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Section parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
