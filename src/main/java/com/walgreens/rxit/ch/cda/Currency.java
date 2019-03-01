/*
 * XML Type:  Currency
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.Currency
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML Currency(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.Currency.
 */
public interface Currency extends com.walgreens.rxit.ch.cda.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Currency.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("currency133ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ARS = Enum.forString("ARS");
    static final Enum AUD = Enum.forString("AUD");
    static final Enum BRL = Enum.forString("BRL");
    static final Enum CAD = Enum.forString("CAD");
    static final Enum CHF = Enum.forString("CHF");
    static final Enum CLF = Enum.forString("CLF");
    static final Enum CNY = Enum.forString("CNY");
    static final Enum DEM = Enum.forString("DEM");
    static final Enum ESP = Enum.forString("ESP");
    static final Enum EUR = Enum.forString("EUR");
    static final Enum FIM = Enum.forString("FIM");
    static final Enum FRF = Enum.forString("FRF");
    static final Enum GBP = Enum.forString("GBP");
    static final Enum ILS = Enum.forString("ILS");
    static final Enum INR = Enum.forString("INR");
    static final Enum JPY = Enum.forString("JPY");
    static final Enum KRW = Enum.forString("KRW");
    static final Enum MXN = Enum.forString("MXN");
    static final Enum NLG = Enum.forString("NLG");
    static final Enum NZD = Enum.forString("NZD");
    static final Enum PHP = Enum.forString("PHP");
    static final Enum RUR = Enum.forString("RUR");
    static final Enum THB = Enum.forString("THB");
    static final Enum TRL = Enum.forString("TRL");
    static final Enum TWD = Enum.forString("TWD");
    static final Enum USD = Enum.forString("USD");
    static final Enum ZAR = Enum.forString("ZAR");
    
    static final int INT_ARS = Enum.INT_ARS;
    static final int INT_AUD = Enum.INT_AUD;
    static final int INT_BRL = Enum.INT_BRL;
    static final int INT_CAD = Enum.INT_CAD;
    static final int INT_CHF = Enum.INT_CHF;
    static final int INT_CLF = Enum.INT_CLF;
    static final int INT_CNY = Enum.INT_CNY;
    static final int INT_DEM = Enum.INT_DEM;
    static final int INT_ESP = Enum.INT_ESP;
    static final int INT_EUR = Enum.INT_EUR;
    static final int INT_FIM = Enum.INT_FIM;
    static final int INT_FRF = Enum.INT_FRF;
    static final int INT_GBP = Enum.INT_GBP;
    static final int INT_ILS = Enum.INT_ILS;
    static final int INT_INR = Enum.INT_INR;
    static final int INT_JPY = Enum.INT_JPY;
    static final int INT_KRW = Enum.INT_KRW;
    static final int INT_MXN = Enum.INT_MXN;
    static final int INT_NLG = Enum.INT_NLG;
    static final int INT_NZD = Enum.INT_NZD;
    static final int INT_PHP = Enum.INT_PHP;
    static final int INT_RUR = Enum.INT_RUR;
    static final int INT_THB = Enum.INT_THB;
    static final int INT_TRL = Enum.INT_TRL;
    static final int INT_TWD = Enum.INT_TWD;
    static final int INT_USD = Enum.INT_USD;
    static final int INT_ZAR = Enum.INT_ZAR;
    
    /**
     * Enumeration value class for com.walgreens.rxit.ch.cda.Currency.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ARS
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
        
        static final int INT_ARS = 1;
        static final int INT_AUD = 2;
        static final int INT_BRL = 3;
        static final int INT_CAD = 4;
        static final int INT_CHF = 5;
        static final int INT_CLF = 6;
        static final int INT_CNY = 7;
        static final int INT_DEM = 8;
        static final int INT_ESP = 9;
        static final int INT_EUR = 10;
        static final int INT_FIM = 11;
        static final int INT_FRF = 12;
        static final int INT_GBP = 13;
        static final int INT_ILS = 14;
        static final int INT_INR = 15;
        static final int INT_JPY = 16;
        static final int INT_KRW = 17;
        static final int INT_MXN = 18;
        static final int INT_NLG = 19;
        static final int INT_NZD = 20;
        static final int INT_PHP = 21;
        static final int INT_RUR = 22;
        static final int INT_THB = 23;
        static final int INT_TRL = 24;
        static final int INT_TWD = 25;
        static final int INT_USD = 26;
        static final int INT_ZAR = 27;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ARS", INT_ARS),
                new Enum("AUD", INT_AUD),
                new Enum("BRL", INT_BRL),
                new Enum("CAD", INT_CAD),
                new Enum("CHF", INT_CHF),
                new Enum("CLF", INT_CLF),
                new Enum("CNY", INT_CNY),
                new Enum("DEM", INT_DEM),
                new Enum("ESP", INT_ESP),
                new Enum("EUR", INT_EUR),
                new Enum("FIM", INT_FIM),
                new Enum("FRF", INT_FRF),
                new Enum("GBP", INT_GBP),
                new Enum("ILS", INT_ILS),
                new Enum("INR", INT_INR),
                new Enum("JPY", INT_JPY),
                new Enum("KRW", INT_KRW),
                new Enum("MXN", INT_MXN),
                new Enum("NLG", INT_NLG),
                new Enum("NZD", INT_NZD),
                new Enum("PHP", INT_PHP),
                new Enum("RUR", INT_RUR),
                new Enum("THB", INT_THB),
                new Enum("TRL", INT_TRL),
                new Enum("TWD", INT_TWD),
                new Enum("USD", INT_USD),
                new Enum("ZAR", INT_ZAR),
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
        public static com.walgreens.rxit.ch.cda.Currency newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.Currency) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.Currency newInstance() {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.Currency parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.Currency parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.Currency parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.Currency parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.Currency parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.Currency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
