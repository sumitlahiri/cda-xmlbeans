/*
 * XML Type:  EN
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EN
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML EN(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface EN extends com.walgreens.rxit.ch.cda.ANY
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EN.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("en8504type");
    
    /**
     * Gets array of all "delimiter" elements
     */
    com.walgreens.rxit.ch.cda.EnDelimiter[] getDelimiterArray();
    
    /**
     * Gets ith "delimiter" element
     */
    com.walgreens.rxit.ch.cda.EnDelimiter getDelimiterArray(int i);
    
    /**
     * Returns number of "delimiter" element
     */
    int sizeOfDelimiterArray();
    
    /**
     * Sets array of all "delimiter" element
     */
    void setDelimiterArray(com.walgreens.rxit.ch.cda.EnDelimiter[] delimiterArray);
    
    /**
     * Sets ith "delimiter" element
     */
    void setDelimiterArray(int i, com.walgreens.rxit.ch.cda.EnDelimiter delimiter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delimiter" element
     */
    com.walgreens.rxit.ch.cda.EnDelimiter insertNewDelimiter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    com.walgreens.rxit.ch.cda.EnDelimiter addNewDelimiter();
    
    /**
     * Removes the ith "delimiter" element
     */
    void removeDelimiter(int i);
    
    /**
     * Gets array of all "family" elements
     */
    com.walgreens.rxit.ch.cda.EnFamily[] getFamilyArray();
    
    /**
     * Gets ith "family" element
     */
    com.walgreens.rxit.ch.cda.EnFamily getFamilyArray(int i);
    
    /**
     * Returns number of "family" element
     */
    int sizeOfFamilyArray();
    
    /**
     * Sets array of all "family" element
     */
    void setFamilyArray(com.walgreens.rxit.ch.cda.EnFamily[] familyArray);
    
    /**
     * Sets ith "family" element
     */
    void setFamilyArray(int i, com.walgreens.rxit.ch.cda.EnFamily family);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    com.walgreens.rxit.ch.cda.EnFamily insertNewFamily(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    com.walgreens.rxit.ch.cda.EnFamily addNewFamily();
    
    /**
     * Removes the ith "family" element
     */
    void removeFamily(int i);
    
    /**
     * Gets array of all "given" elements
     */
    com.walgreens.rxit.ch.cda.EnGiven[] getGivenArray();
    
    /**
     * Gets ith "given" element
     */
    com.walgreens.rxit.ch.cda.EnGiven getGivenArray(int i);
    
    /**
     * Returns number of "given" element
     */
    int sizeOfGivenArray();
    
    /**
     * Sets array of all "given" element
     */
    void setGivenArray(com.walgreens.rxit.ch.cda.EnGiven[] givenArray);
    
    /**
     * Sets ith "given" element
     */
    void setGivenArray(int i, com.walgreens.rxit.ch.cda.EnGiven given);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "given" element
     */
    com.walgreens.rxit.ch.cda.EnGiven insertNewGiven(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "given" element
     */
    com.walgreens.rxit.ch.cda.EnGiven addNewGiven();
    
    /**
     * Removes the ith "given" element
     */
    void removeGiven(int i);
    
    /**
     * Gets array of all "prefix" elements
     */
    com.walgreens.rxit.ch.cda.EnPrefix[] getPrefixArray();
    
    /**
     * Gets ith "prefix" element
     */
    com.walgreens.rxit.ch.cda.EnPrefix getPrefixArray(int i);
    
    /**
     * Returns number of "prefix" element
     */
    int sizeOfPrefixArray();
    
    /**
     * Sets array of all "prefix" element
     */
    void setPrefixArray(com.walgreens.rxit.ch.cda.EnPrefix[] prefixArray);
    
    /**
     * Sets ith "prefix" element
     */
    void setPrefixArray(int i, com.walgreens.rxit.ch.cda.EnPrefix prefix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    com.walgreens.rxit.ch.cda.EnPrefix insertNewPrefix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    com.walgreens.rxit.ch.cda.EnPrefix addNewPrefix();
    
    /**
     * Removes the ith "prefix" element
     */
    void removePrefix(int i);
    
    /**
     * Gets array of all "suffix" elements
     */
    com.walgreens.rxit.ch.cda.EnSuffix[] getSuffixArray();
    
    /**
     * Gets ith "suffix" element
     */
    com.walgreens.rxit.ch.cda.EnSuffix getSuffixArray(int i);
    
    /**
     * Returns number of "suffix" element
     */
    int sizeOfSuffixArray();
    
    /**
     * Sets array of all "suffix" element
     */
    void setSuffixArray(com.walgreens.rxit.ch.cda.EnSuffix[] suffixArray);
    
    /**
     * Sets ith "suffix" element
     */
    void setSuffixArray(int i, com.walgreens.rxit.ch.cda.EnSuffix suffix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suffix" element
     */
    com.walgreens.rxit.ch.cda.EnSuffix insertNewSuffix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suffix" element
     */
    com.walgreens.rxit.ch.cda.EnSuffix addNewSuffix();
    
    /**
     * Removes the ith "suffix" element
     */
    void removeSuffix(int i);
    
    /**
     * Gets the "validTime" element
     */
    com.walgreens.rxit.ch.cda.IVLTS getValidTime();
    
    /**
     * True if has "validTime" element
     */
    boolean isSetValidTime();
    
    /**
     * Sets the "validTime" element
     */
    void setValidTime(com.walgreens.rxit.ch.cda.IVLTS validTime);
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    com.walgreens.rxit.ch.cda.IVLTS addNewValidTime();
    
    /**
     * Unsets the "validTime" element
     */
    void unsetValidTime();
    
    /**
     * Gets the "use" attribute
     */
    java.util.List getUse();
    
    /**
     * Gets (as xml) the "use" attribute
     */
    com.walgreens.rxit.ch.cda.SetEntityNameUse xgetUse();
    
    /**
     * True if has "use" attribute
     */
    boolean isSetUse();
    
    /**
     * Sets the "use" attribute
     */
    void setUse(java.util.List use);
    
    /**
     * Sets (as xml) the "use" attribute
     */
    void xsetUse(com.walgreens.rxit.ch.cda.SetEntityNameUse use);
    
    /**
     * Unsets the "use" attribute
     */
    void unsetUse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.EN newInstance() {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.EN parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.EN parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.EN parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.EN parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.EN parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
