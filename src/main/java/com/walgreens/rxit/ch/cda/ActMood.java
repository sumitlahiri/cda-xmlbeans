/*
 * XML Type:  ActMood
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActMood
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML ActMood(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActMoodIntent
 *     com.walgreens.rxit.ch.cda.ActMoodCompletionTrack$Member
 *     com.walgreens.rxit.ch.cda.ActMoodPredicate
 *     com.walgreens.rxit.ch.cda.XActMoodDefEvn
 *     com.walgreens.rxit.ch.cda.XActMoodDefEvnRqoPrmsPrp
 *     com.walgreens.rxit.ch.cda.XActMoodDocumentObservation
 *     com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp
 *     com.walgreens.rxit.ch.cda.XActMoodIntentEvent$Member
 *     com.walgreens.rxit.ch.cda.XActMoodOrdPrms
 *     com.walgreens.rxit.ch.cda.XActMoodOrdPrmsEvn
 *     com.walgreens.rxit.ch.cda.XActMoodRqoPrpAptArq
 *     com.walgreens.rxit.ch.cda.XDocumentActMood
 *     com.walgreens.rxit.ch.cda.XDocumentEncounterMood
 *     com.walgreens.rxit.ch.cda.XDocumentProcedureMood
 *     com.walgreens.rxit.ch.cda.XDocumentSubstanceMood
 */
public interface ActMood extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActMood.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("actmood5c16type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.ActMood newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.ActMood) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood newInstance() {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActMood parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ActMood parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ActMood parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ActMood) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
