/*
 * XML Type:  ED
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ED
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML ED(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface ED extends com.walgreens.rxit.ch.cda.BIN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ED.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("edda4etype");
    
    /**
     * Gets the "reference" element
     */
    com.walgreens.rxit.ch.cda.TEL getReference();
    
    /**
     * True if has "reference" element
     */
    boolean isSetReference();
    
    /**
     * Sets the "reference" element
     */
    void setReference(com.walgreens.rxit.ch.cda.TEL reference);
    
    /**
     * Appends and returns a new empty "reference" element
     */
    com.walgreens.rxit.ch.cda.TEL addNewReference();
    
    /**
     * Unsets the "reference" element
     */
    void unsetReference();
    
    /**
     * Gets the "thumbnail" element
     */
    com.walgreens.rxit.ch.cda.Thumbnail getThumbnail();
    
    /**
     * True if has "thumbnail" element
     */
    boolean isSetThumbnail();
    
    /**
     * Sets the "thumbnail" element
     */
    void setThumbnail(com.walgreens.rxit.ch.cda.Thumbnail thumbnail);
    
    /**
     * Appends and returns a new empty "thumbnail" element
     */
    com.walgreens.rxit.ch.cda.Thumbnail addNewThumbnail();
    
    /**
     * Unsets the "thumbnail" element
     */
    void unsetThumbnail();
    
    /**
     * Gets the "mediaType" attribute
     */
    java.lang.String getMediaType();
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    com.walgreens.rxit.ch.cda.Cs2 xgetMediaType();
    
    /**
     * True if has "mediaType" attribute
     */
    boolean isSetMediaType();
    
    /**
     * Sets the "mediaType" attribute
     */
    void setMediaType(java.lang.String mediaType);
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    void xsetMediaType(com.walgreens.rxit.ch.cda.Cs2 mediaType);
    
    /**
     * Unsets the "mediaType" attribute
     */
    void unsetMediaType();
    
    /**
     * Gets the "language" attribute
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" attribute
     */
    com.walgreens.rxit.ch.cda.Cs2 xgetLanguage();
    
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
    void xsetLanguage(com.walgreens.rxit.ch.cda.Cs2 language);
    
    /**
     * Unsets the "language" attribute
     */
    void unsetLanguage();
    
    /**
     * Gets the "compression" attribute
     */
    com.walgreens.rxit.ch.cda.CompressionAlgorithm.Enum getCompression();
    
    /**
     * Gets (as xml) the "compression" attribute
     */
    com.walgreens.rxit.ch.cda.CompressionAlgorithm xgetCompression();
    
    /**
     * True if has "compression" attribute
     */
    boolean isSetCompression();
    
    /**
     * Sets the "compression" attribute
     */
    void setCompression(com.walgreens.rxit.ch.cda.CompressionAlgorithm.Enum compression);
    
    /**
     * Sets (as xml) the "compression" attribute
     */
    void xsetCompression(com.walgreens.rxit.ch.cda.CompressionAlgorithm compression);
    
    /**
     * Unsets the "compression" attribute
     */
    void unsetCompression();
    
    /**
     * Gets the "integrityCheck" attribute
     */
    byte[] getIntegrityCheck();
    
    /**
     * Gets (as xml) the "integrityCheck" attribute
     */
    com.walgreens.rxit.ch.cda.Bin2 xgetIntegrityCheck();
    
    /**
     * True if has "integrityCheck" attribute
     */
    boolean isSetIntegrityCheck();
    
    /**
     * Sets the "integrityCheck" attribute
     */
    void setIntegrityCheck(byte[] integrityCheck);
    
    /**
     * Sets (as xml) the "integrityCheck" attribute
     */
    void xsetIntegrityCheck(com.walgreens.rxit.ch.cda.Bin2 integrityCheck);
    
    /**
     * Unsets the "integrityCheck" attribute
     */
    void unsetIntegrityCheck();
    
    /**
     * Gets the "integrityCheckAlgorithm" attribute
     */
    com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm.Enum getIntegrityCheckAlgorithm();
    
    /**
     * Gets (as xml) the "integrityCheckAlgorithm" attribute
     */
    com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm xgetIntegrityCheckAlgorithm();
    
    /**
     * True if has "integrityCheckAlgorithm" attribute
     */
    boolean isSetIntegrityCheckAlgorithm();
    
    /**
     * Sets the "integrityCheckAlgorithm" attribute
     */
    void setIntegrityCheckAlgorithm(com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm.Enum integrityCheckAlgorithm);
    
    /**
     * Sets (as xml) the "integrityCheckAlgorithm" attribute
     */
    void xsetIntegrityCheckAlgorithm(com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm integrityCheckAlgorithm);
    
    /**
     * Unsets the "integrityCheckAlgorithm" attribute
     */
    void unsetIntegrityCheckAlgorithm();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.ED newInstance() {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.ED parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.ED parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ED parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ED parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ED parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ED) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
