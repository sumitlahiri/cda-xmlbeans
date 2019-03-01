/*
 * XML Type:  CD
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.CD
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML CD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface CD extends com.walgreens.rxit.ch.cda.ANY
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("cd1e4ctype");
    
    /**
     * Gets the "originalText" element
     */
    com.walgreens.rxit.ch.cda.ED getOriginalText();
    
    /**
     * True if has "originalText" element
     */
    boolean isSetOriginalText();
    
    /**
     * Sets the "originalText" element
     */
    void setOriginalText(com.walgreens.rxit.ch.cda.ED originalText);
    
    /**
     * Appends and returns a new empty "originalText" element
     */
    com.walgreens.rxit.ch.cda.ED addNewOriginalText();
    
    /**
     * Unsets the "originalText" element
     */
    void unsetOriginalText();
    
    /**
     * Gets array of all "qualifier" elements
     */
    com.walgreens.rxit.ch.cda.CR[] getQualifierArray();
    
    /**
     * Gets ith "qualifier" element
     */
    com.walgreens.rxit.ch.cda.CR getQualifierArray(int i);
    
    /**
     * Returns number of "qualifier" element
     */
    int sizeOfQualifierArray();
    
    /**
     * Sets array of all "qualifier" element
     */
    void setQualifierArray(com.walgreens.rxit.ch.cda.CR[] qualifierArray);
    
    /**
     * Sets ith "qualifier" element
     */
    void setQualifierArray(int i, com.walgreens.rxit.ch.cda.CR qualifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
     */
    com.walgreens.rxit.ch.cda.CR insertNewQualifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualifier" element
     */
    com.walgreens.rxit.ch.cda.CR addNewQualifier();
    
    /**
     * Removes the ith "qualifier" element
     */
    void removeQualifier(int i);
    
    /**
     * Gets array of all "translation" elements
     */
    com.walgreens.rxit.ch.cda.CD[] getTranslationArray();
    
    /**
     * Gets ith "translation" element
     */
    com.walgreens.rxit.ch.cda.CD getTranslationArray(int i);
    
    /**
     * Returns number of "translation" element
     */
    int sizeOfTranslationArray();
    
    /**
     * Sets array of all "translation" element
     */
    void setTranslationArray(com.walgreens.rxit.ch.cda.CD[] translationArray);
    
    /**
     * Sets ith "translation" element
     */
    void setTranslationArray(int i, com.walgreens.rxit.ch.cda.CD translation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "translation" element
     */
    com.walgreens.rxit.ch.cda.CD insertNewTranslation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "translation" element
     */
    com.walgreens.rxit.ch.cda.CD addNewTranslation();
    
    /**
     * Removes the ith "translation" element
     */
    void removeTranslation(int i);
    
    /**
     * Gets the "code" attribute
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" attribute
     */
    com.walgreens.rxit.ch.cda.Cs2 xgetCode();
    
    /**
     * True if has "code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" attribute
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(com.walgreens.rxit.ch.cda.Cs2 code);
    
    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
    
    /**
     * Gets the "codeSystem" attribute
     */
    java.lang.String getCodeSystem();
    
    /**
     * Gets (as xml) the "codeSystem" attribute
     */
    com.walgreens.rxit.ch.cda.Uid xgetCodeSystem();
    
    /**
     * True if has "codeSystem" attribute
     */
    boolean isSetCodeSystem();
    
    /**
     * Sets the "codeSystem" attribute
     */
    void setCodeSystem(java.lang.String codeSystem);
    
    /**
     * Sets (as xml) the "codeSystem" attribute
     */
    void xsetCodeSystem(com.walgreens.rxit.ch.cda.Uid codeSystem);
    
    /**
     * Unsets the "codeSystem" attribute
     */
    void unsetCodeSystem();
    
    /**
     * Gets the "codeSystemName" attribute
     */
    java.lang.String getCodeSystemName();
    
    /**
     * Gets (as xml) the "codeSystemName" attribute
     */
    com.walgreens.rxit.ch.cda.St2 xgetCodeSystemName();
    
    /**
     * True if has "codeSystemName" attribute
     */
    boolean isSetCodeSystemName();
    
    /**
     * Sets the "codeSystemName" attribute
     */
    void setCodeSystemName(java.lang.String codeSystemName);
    
    /**
     * Sets (as xml) the "codeSystemName" attribute
     */
    void xsetCodeSystemName(com.walgreens.rxit.ch.cda.St2 codeSystemName);
    
    /**
     * Unsets the "codeSystemName" attribute
     */
    void unsetCodeSystemName();
    
    /**
     * Gets the "codeSystemVersion" attribute
     */
    java.lang.String getCodeSystemVersion();
    
    /**
     * Gets (as xml) the "codeSystemVersion" attribute
     */
    com.walgreens.rxit.ch.cda.St2 xgetCodeSystemVersion();
    
    /**
     * True if has "codeSystemVersion" attribute
     */
    boolean isSetCodeSystemVersion();
    
    /**
     * Sets the "codeSystemVersion" attribute
     */
    void setCodeSystemVersion(java.lang.String codeSystemVersion);
    
    /**
     * Sets (as xml) the "codeSystemVersion" attribute
     */
    void xsetCodeSystemVersion(com.walgreens.rxit.ch.cda.St2 codeSystemVersion);
    
    /**
     * Unsets the "codeSystemVersion" attribute
     */
    void unsetCodeSystemVersion();
    
    /**
     * Gets the "displayName" attribute
     */
    java.lang.String getDisplayName();
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    com.walgreens.rxit.ch.cda.St2 xgetDisplayName();
    
    /**
     * True if has "displayName" attribute
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "displayName" attribute
     */
    void setDisplayName(java.lang.String displayName);
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    void xsetDisplayName(com.walgreens.rxit.ch.cda.St2 displayName);
    
    /**
     * Unsets the "displayName" attribute
     */
    void unsetDisplayName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.CD newInstance() {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.CD parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.CD parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CD parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.CD parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.CD parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
