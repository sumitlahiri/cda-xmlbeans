/*
 * XML Type:  HXIT_CE
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.HXITCE
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML HXIT_CE(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface HXITCE extends com.walgreens.rxit.ch.cda.CE
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HXITCE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("hxitce6c19type");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.HXITCE newInstance() {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.HXITCE parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.HXITCE parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.HXITCE parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.HXITCE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
