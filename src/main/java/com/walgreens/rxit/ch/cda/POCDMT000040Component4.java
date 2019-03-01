/*
 * XML Type:  POCD_MT000040.Component4
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Component4
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.Component4(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040Component4 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040Component4.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040component4786atype");
    
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
     * Gets the "sequenceNumber" element
     */
    com.walgreens.rxit.ch.cda.INT getSequenceNumber();
    
    /**
     * True if has "sequenceNumber" element
     */
    boolean isSetSequenceNumber();
    
    /**
     * Sets the "sequenceNumber" element
     */
    void setSequenceNumber(com.walgreens.rxit.ch.cda.INT sequenceNumber);
    
    /**
     * Appends and returns a new empty "sequenceNumber" element
     */
    com.walgreens.rxit.ch.cda.INT addNewSequenceNumber();
    
    /**
     * Unsets the "sequenceNumber" element
     */
    void unsetSequenceNumber();
    
    /**
     * Gets the "seperatableInd" element
     */
    com.walgreens.rxit.ch.cda.BL getSeperatableInd();
    
    /**
     * True if has "seperatableInd" element
     */
    boolean isSetSeperatableInd();
    
    /**
     * Sets the "seperatableInd" element
     */
    void setSeperatableInd(com.walgreens.rxit.ch.cda.BL seperatableInd);
    
    /**
     * Appends and returns a new empty "seperatableInd" element
     */
    com.walgreens.rxit.ch.cda.BL addNewSeperatableInd();
    
    /**
     * Unsets the "seperatableInd" element
     */
    void unsetSeperatableInd();
    
    /**
     * Gets the "act" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Act getAct();
    
    /**
     * True if has "act" element
     */
    boolean isSetAct();
    
    /**
     * Sets the "act" element
     */
    void setAct(com.walgreens.rxit.ch.cda.POCDMT000040Act act);
    
    /**
     * Appends and returns a new empty "act" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Act addNewAct();
    
    /**
     * Unsets the "act" element
     */
    void unsetAct();
    
    /**
     * Gets the "encounter" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Encounter getEncounter();
    
    /**
     * True if has "encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "encounter" element
     */
    void setEncounter(com.walgreens.rxit.ch.cda.POCDMT000040Encounter encounter);
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Encounter addNewEncounter();
    
    /**
     * Unsets the "encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets the "observation" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Observation getObservation();
    
    /**
     * True if has "observation" element
     */
    boolean isSetObservation();
    
    /**
     * Sets the "observation" element
     */
    void setObservation(com.walgreens.rxit.ch.cda.POCDMT000040Observation observation);
    
    /**
     * Appends and returns a new empty "observation" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Observation addNewObservation();
    
    /**
     * Unsets the "observation" element
     */
    void unsetObservation();
    
    /**
     * Gets the "observationMedia" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia getObservationMedia();
    
    /**
     * True if has "observationMedia" element
     */
    boolean isSetObservationMedia();
    
    /**
     * Sets the "observationMedia" element
     */
    void setObservationMedia(com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia observationMedia);
    
    /**
     * Appends and returns a new empty "observationMedia" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040ObservationMedia addNewObservationMedia();
    
    /**
     * Unsets the "observationMedia" element
     */
    void unsetObservationMedia();
    
    /**
     * Gets the "organizer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Organizer getOrganizer();
    
    /**
     * True if has "organizer" element
     */
    boolean isSetOrganizer();
    
    /**
     * Sets the "organizer" element
     */
    void setOrganizer(com.walgreens.rxit.ch.cda.POCDMT000040Organizer organizer);
    
    /**
     * Appends and returns a new empty "organizer" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Organizer addNewOrganizer();
    
    /**
     * Unsets the "organizer" element
     */
    void unsetOrganizer();
    
    /**
     * Gets the "procedure" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Procedure getProcedure();
    
    /**
     * True if has "procedure" element
     */
    boolean isSetProcedure();
    
    /**
     * Sets the "procedure" element
     */
    void setProcedure(com.walgreens.rxit.ch.cda.POCDMT000040Procedure procedure);
    
    /**
     * Appends and returns a new empty "procedure" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Procedure addNewProcedure();
    
    /**
     * Unsets the "procedure" element
     */
    void unsetProcedure();
    
    /**
     * Gets the "regionOfInterest" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest getRegionOfInterest();
    
    /**
     * True if has "regionOfInterest" element
     */
    boolean isSetRegionOfInterest();
    
    /**
     * Sets the "regionOfInterest" element
     */
    void setRegionOfInterest(com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest regionOfInterest);
    
    /**
     * Appends and returns a new empty "regionOfInterest" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterest addNewRegionOfInterest();
    
    /**
     * Unsets the "regionOfInterest" element
     */
    void unsetRegionOfInterest();
    
    /**
     * Gets the "substanceAdministration" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration getSubstanceAdministration();
    
    /**
     * True if has "substanceAdministration" element
     */
    boolean isSetSubstanceAdministration();
    
    /**
     * Sets the "substanceAdministration" element
     */
    void setSubstanceAdministration(com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration substanceAdministration);
    
    /**
     * Appends and returns a new empty "substanceAdministration" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040SubstanceAdministration addNewSubstanceAdministration();
    
    /**
     * Unsets the "substanceAdministration" element
     */
    void unsetSubstanceAdministration();
    
    /**
     * Gets the "supply" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Supply getSupply();
    
    /**
     * True if has "supply" element
     */
    boolean isSetSupply();
    
    /**
     * Sets the "supply" element
     */
    void setSupply(com.walgreens.rxit.ch.cda.POCDMT000040Supply supply);
    
    /**
     * Appends and returns a new empty "supply" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040Supply addNewSupply();
    
    /**
     * Unsets the "supply" element
     */
    void unsetSupply();
    
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
     * Gets the "typeCode" attribute
     */
    com.walgreens.rxit.ch.cda.ActRelationshipHasComponent.Enum getTypeCode();
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    com.walgreens.rxit.ch.cda.ActRelationshipHasComponent xgetTypeCode();
    
    /**
     * True if has "typeCode" attribute
     */
    boolean isSetTypeCode();
    
    /**
     * Sets the "typeCode" attribute
     */
    void setTypeCode(com.walgreens.rxit.ch.cda.ActRelationshipHasComponent.Enum typeCode);
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    void xsetTypeCode(com.walgreens.rxit.ch.cda.ActRelationshipHasComponent typeCode);
    
    /**
     * Unsets the "typeCode" attribute
     */
    void unsetTypeCode();
    
    /**
     * Gets the "contextConductionInd" attribute
     */
    boolean getContextConductionInd();
    
    /**
     * Gets (as xml) the "contextConductionInd" attribute
     */
    com.walgreens.rxit.ch.cda.Bl2 xgetContextConductionInd();
    
    /**
     * True if has "contextConductionInd" attribute
     */
    boolean isSetContextConductionInd();
    
    /**
     * Sets the "contextConductionInd" attribute
     */
    void setContextConductionInd(boolean contextConductionInd);
    
    /**
     * Sets (as xml) the "contextConductionInd" attribute
     */
    void xsetContextConductionInd(com.walgreens.rxit.ch.cda.Bl2 contextConductionInd);
    
    /**
     * Unsets the "contextConductionInd" attribute
     */
    void unsetContextConductionInd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Component4 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Component4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
