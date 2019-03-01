/*
 * XML Type:  StrucDoc.LinkHtml
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocLinkHtml
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML StrucDoc.LinkHtml(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocLinkHtml extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocLinkHtml.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("strucdoclinkhtml9665type");
    
    /**
     * Gets array of all "footnote" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote[] getFootnoteArray();
    
    /**
     * Gets ith "footnote" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote getFootnoteArray(int i);
    
    /**
     * Returns number of "footnote" element
     */
    int sizeOfFootnoteArray();
    
    /**
     * Sets array of all "footnote" element
     */
    void setFootnoteArray(com.walgreens.rxit.ch.cda.StrucDocFootnote[] footnoteArray);
    
    /**
     * Sets ith "footnote" element
     */
    void setFootnoteArray(int i, com.walgreens.rxit.ch.cda.StrucDocFootnote footnote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote insertNewFootnote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote addNewFootnote();
    
    /**
     * Removes the ith "footnote" element
     */
    void removeFootnote(int i);
    
    /**
     * Gets array of all "footnoteRef" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] getFootnoteRefArray();
    
    /**
     * Gets ith "footnoteRef" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef getFootnoteRefArray(int i);
    
    /**
     * Returns number of "footnoteRef" element
     */
    int sizeOfFootnoteRefArray();
    
    /**
     * Sets array of all "footnoteRef" element
     */
    void setFootnoteRefArray(com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] footnoteRefArray);
    
    /**
     * Sets ith "footnoteRef" element
     */
    void setFootnoteRefArray(int i, com.walgreens.rxit.ch.cda.StrucDocFootnoteRef footnoteRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteRef" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef insertNewFootnoteRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteRef" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef addNewFootnoteRef();
    
    /**
     * Removes the ith "footnoteRef" element
     */
    void removeFootnoteRef(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();
    
    /**
     * Gets (as xml) the "href" attribute
     */
    org.apache.xmlbeans.XmlString xgetHref();
    
    /**
     * True if has "href" attribute
     */
    boolean isSetHref();
    
    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);
    
    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.apache.xmlbeans.XmlString href);
    
    /**
     * Unsets the "href" attribute
     */
    void unsetHref();
    
    /**
     * Gets the "rel" attribute
     */
    java.lang.String getRel();
    
    /**
     * Gets (as xml) the "rel" attribute
     */
    org.apache.xmlbeans.XmlString xgetRel();
    
    /**
     * True if has "rel" attribute
     */
    boolean isSetRel();
    
    /**
     * Sets the "rel" attribute
     */
    void setRel(java.lang.String rel);
    
    /**
     * Sets (as xml) the "rel" attribute
     */
    void xsetRel(org.apache.xmlbeans.XmlString rel);
    
    /**
     * Unsets the "rel" attribute
     */
    void unsetRel();
    
    /**
     * Gets the "rev" attribute
     */
    java.lang.String getRev();
    
    /**
     * Gets (as xml) the "rev" attribute
     */
    org.apache.xmlbeans.XmlString xgetRev();
    
    /**
     * True if has "rev" attribute
     */
    boolean isSetRev();
    
    /**
     * Sets the "rev" attribute
     */
    void setRev(java.lang.String rev);
    
    /**
     * Sets (as xml) the "rev" attribute
     */
    void xsetRev(org.apache.xmlbeans.XmlString rev);
    
    /**
     * Unsets the "rev" attribute
     */
    void unsetRev();
    
    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" attribute
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();
    
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
     * Gets the "language" attribute
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetLanguage();
    
    /**
     * True if has "language" attribute
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" attribute
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" attribute
     */
    void xsetLanguage(org.apache.xmlbeans.XmlNMTOKEN language);
    
    /**
     * Unsets the "language" attribute
     */
    void unsetLanguage();
    
    /**
     * Gets the "styleCode" attribute
     */
    java.util.List getStyleCode();
    
    /**
     * Gets (as xml) the "styleCode" attribute
     */
    org.apache.xmlbeans.XmlNMTOKENS xgetStyleCode();
    
    /**
     * True if has "styleCode" attribute
     */
    boolean isSetStyleCode();
    
    /**
     * Sets the "styleCode" attribute
     */
    void setStyleCode(java.util.List styleCode);
    
    /**
     * Sets (as xml) the "styleCode" attribute
     */
    void xsetStyleCode(org.apache.xmlbeans.XmlNMTOKENS styleCode);
    
    /**
     * Unsets the "styleCode" attribute
     */
    void unsetStyleCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml newInstance() {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocLinkHtml parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocLinkHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
