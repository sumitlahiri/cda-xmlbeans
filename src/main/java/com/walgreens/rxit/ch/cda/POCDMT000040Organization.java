/*
 * XML Type:  POCD_MT000040.Organization
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040Organization
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML POCD_MT000040.Organization(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000040Organization extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000040Organization.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("pocdmt000040organizationb3cetype");
    
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
     * Gets array of all "name" elements
     */
    com.walgreens.rxit.ch.cda.ON[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    com.walgreens.rxit.ch.cda.ON getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(com.walgreens.rxit.ch.cda.ON[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, com.walgreens.rxit.ch.cda.ON name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    com.walgreens.rxit.ch.cda.ON insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    com.walgreens.rxit.ch.cda.ON addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
    /**
     * Gets array of all "telecom" elements
     */
    com.walgreens.rxit.ch.cda.TEL[] getTelecomArray();
    
    /**
     * Gets ith "telecom" element
     */
    com.walgreens.rxit.ch.cda.TEL getTelecomArray(int i);
    
    /**
     * Returns number of "telecom" element
     */
    int sizeOfTelecomArray();
    
    /**
     * Sets array of all "telecom" element
     */
    void setTelecomArray(com.walgreens.rxit.ch.cda.TEL[] telecomArray);
    
    /**
     * Sets ith "telecom" element
     */
    void setTelecomArray(int i, com.walgreens.rxit.ch.cda.TEL telecom);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    com.walgreens.rxit.ch.cda.TEL insertNewTelecom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    com.walgreens.rxit.ch.cda.TEL addNewTelecom();
    
    /**
     * Removes the ith "telecom" element
     */
    void removeTelecom(int i);
    
    /**
     * Gets array of all "addr" elements
     */
    com.walgreens.rxit.ch.cda.AD[] getAddrArray();
    
    /**
     * Gets ith "addr" element
     */
    com.walgreens.rxit.ch.cda.AD getAddrArray(int i);
    
    /**
     * Returns number of "addr" element
     */
    int sizeOfAddrArray();
    
    /**
     * Sets array of all "addr" element
     */
    void setAddrArray(com.walgreens.rxit.ch.cda.AD[] addrArray);
    
    /**
     * Sets ith "addr" element
     */
    void setAddrArray(int i, com.walgreens.rxit.ch.cda.AD addr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addr" element
     */
    com.walgreens.rxit.ch.cda.AD insertNewAddr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addr" element
     */
    com.walgreens.rxit.ch.cda.AD addNewAddr();
    
    /**
     * Removes the ith "addr" element
     */
    void removeAddr(int i);
    
    /**
     * Gets the "standardIndustryClassCode" element
     */
    com.walgreens.rxit.ch.cda.CE getStandardIndustryClassCode();
    
    /**
     * True if has "standardIndustryClassCode" element
     */
    boolean isSetStandardIndustryClassCode();
    
    /**
     * Sets the "standardIndustryClassCode" element
     */
    void setStandardIndustryClassCode(com.walgreens.rxit.ch.cda.CE standardIndustryClassCode);
    
    /**
     * Appends and returns a new empty "standardIndustryClassCode" element
     */
    com.walgreens.rxit.ch.cda.CE addNewStandardIndustryClassCode();
    
    /**
     * Unsets the "standardIndustryClassCode" element
     */
    void unsetStandardIndustryClassCode();
    
    /**
     * Gets the "asOrganizationPartOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040OrganizationPartOf getAsOrganizationPartOf();
    
    /**
     * True if has "asOrganizationPartOf" element
     */
    boolean isSetAsOrganizationPartOf();
    
    /**
     * Sets the "asOrganizationPartOf" element
     */
    void setAsOrganizationPartOf(com.walgreens.rxit.ch.cda.POCDMT000040OrganizationPartOf asOrganizationPartOf);
    
    /**
     * Appends and returns a new empty "asOrganizationPartOf" element
     */
    com.walgreens.rxit.ch.cda.POCDMT000040OrganizationPartOf addNewAsOrganizationPartOf();
    
    /**
     * Unsets the "asOrganizationPartOf" element
     */
    void unsetAsOrganizationPartOf();
    
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
    com.walgreens.rxit.ch.cda.EntityClassOrganization xgetClassCode();
    
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
    void xsetClassCode(com.walgreens.rxit.ch.cda.EntityClassOrganization classCode);
    
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
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization newInstance() {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.POCDMT000040Organization parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.POCDMT000040Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
