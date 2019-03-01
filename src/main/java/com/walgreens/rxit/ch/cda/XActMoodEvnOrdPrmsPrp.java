/*
 * XML Type:  x_ActMoodEvnOrdPrmsPrp
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML x_ActMoodEvnOrdPrmsPrp(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp.
 */
public interface XActMoodEvnOrdPrmsPrp extends com.walgreens.rxit.ch.cda.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XActMoodEvnOrdPrmsPrp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("xactmoodevnordprmsprp2bedtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EVN = Enum.forString("EVN");
    static final Enum PRMS = Enum.forString("PRMS");
    static final Enum PRP = Enum.forString("PRP");
    static final Enum RQO = Enum.forString("RQO");
    
    static final int INT_EVN = Enum.INT_EVN;
    static final int INT_PRMS = Enum.INT_PRMS;
    static final int INT_PRP = Enum.INT_PRP;
    static final int INT_RQO = Enum.INT_RQO;
    
    /**
     * Enumeration value class for com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EVN
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_EVN = 1;
        static final int INT_PRMS = 2;
        static final int INT_PRP = 3;
        static final int INT_RQO = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("EVN", INT_EVN),
                new Enum("PRMS", INT_PRMS),
                new Enum("PRP", INT_PRP),
                new Enum("RQO", INT_RQO),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp newInstance() {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}