/*
 * XML Type:  CalendarCycleTwoLetter
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML CalendarCycleTwoLetter(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.GregorianCalendarCycle
 *     com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter$Member
 */
public interface CalendarCycleTwoLetter extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalendarCycleTwoLetter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("calendarcycletwoletter73c3type");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter$Member.
     */
    public interface Member extends com.walgreens.rxit.ch.cda.Cs2
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("anon5368type");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CD = Enum.forString("CD");
        static final Enum CH = Enum.forString("CH");
        static final Enum CM = Enum.forString("CM");
        static final Enum CN = Enum.forString("CN");
        static final Enum CS = Enum.forString("CS");
        static final Enum CW = Enum.forString("CW");
        static final Enum CY = Enum.forString("CY");
        static final Enum DM = Enum.forString("DM");
        static final Enum DW = Enum.forString("DW");
        static final Enum DY = Enum.forString("DY");
        static final Enum HD = Enum.forString("HD");
        static final Enum MY = Enum.forString("MY");
        static final Enum NH = Enum.forString("NH");
        static final Enum SN = Enum.forString("SN");
        static final Enum WY = Enum.forString("WY");
        
        static final int INT_CD = Enum.INT_CD;
        static final int INT_CH = Enum.INT_CH;
        static final int INT_CM = Enum.INT_CM;
        static final int INT_CN = Enum.INT_CN;
        static final int INT_CS = Enum.INT_CS;
        static final int INT_CW = Enum.INT_CW;
        static final int INT_CY = Enum.INT_CY;
        static final int INT_DM = Enum.INT_DM;
        static final int INT_DW = Enum.INT_DW;
        static final int INT_DY = Enum.INT_DY;
        static final int INT_HD = Enum.INT_HD;
        static final int INT_MY = Enum.INT_MY;
        static final int INT_NH = Enum.INT_NH;
        static final int INT_SN = Enum.INT_SN;
        static final int INT_WY = Enum.INT_WY;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CD
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
            
            static final int INT_CD = 1;
            static final int INT_CH = 2;
            static final int INT_CM = 3;
            static final int INT_CN = 4;
            static final int INT_CS = 5;
            static final int INT_CW = 6;
            static final int INT_CY = 7;
            static final int INT_DM = 8;
            static final int INT_DW = 9;
            static final int INT_DY = 10;
            static final int INT_HD = 11;
            static final int INT_MY = 12;
            static final int INT_NH = 13;
            static final int INT_SN = 14;
            static final int INT_WY = 15;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("CD", INT_CD),
                    new Enum("CH", INT_CH),
                    new Enum("CM", INT_CM),
                    new Enum("CN", INT_CN),
                    new Enum("CS", INT_CS),
                    new Enum("CW", INT_CW),
                    new Enum("CY", INT_CY),
                    new Enum("DM", INT_DM),
                    new Enum("DW", INT_DW),
                    new Enum("DY", INT_DY),
                    new Enum("HD", INT_HD),
                    new Enum("MY", INT_MY),
                    new Enum("NH", INT_NH),
                    new Enum("SN", INT_SN),
                    new Enum("WY", INT_WY),
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
            public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member newInstance() {
              return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter newInstance() {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
