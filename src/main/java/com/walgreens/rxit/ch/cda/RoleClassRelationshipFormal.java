/*
 * XML Type:  RoleClassRelationshipFormal
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML RoleClassRelationshipFormal(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.LicensedEntityRole
 *     com.walgreens.rxit.ch.cda.RoleClassContact
 *     com.walgreens.rxit.ch.cda.RoleClassAssignedEntity$Member
 *     com.walgreens.rxit.ch.cda.RoleClassAgent$Member
 *     com.walgreens.rxit.ch.cda.RoleClassEmployee
 *     com.walgreens.rxit.ch.cda.RoleClassInvestigationSubject
 *     com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal$Member
 */
public interface RoleClassRelationshipFormal extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoleClassRelationshipFormal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("roleclassrelationshipformalf5b6type");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal$Member.
     */
    public interface Member extends com.walgreens.rxit.ch.cda.Cs2
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("anon1531type");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CIT = Enum.forString("CIT");
        static final Enum COVPTY = Enum.forString("COVPTY");
        static final Enum CRINV = Enum.forString("CRINV");
        static final Enum CRSPNSR = Enum.forString("CRSPNSR");
        static final Enum GUAR = Enum.forString("GUAR");
        static final Enum PAT = Enum.forString("PAT");
        static final Enum PAYEE = Enum.forString("PAYEE");
        static final Enum PAYOR = Enum.forString("PAYOR");
        static final Enum POLHOLD = Enum.forString("POLHOLD");
        static final Enum QUAL = Enum.forString("QUAL");
        static final Enum SPNSR = Enum.forString("SPNSR");
        static final Enum STD = Enum.forString("STD");
        static final Enum UNDWRT = Enum.forString("UNDWRT");
        
        static final int INT_CIT = Enum.INT_CIT;
        static final int INT_COVPTY = Enum.INT_COVPTY;
        static final int INT_CRINV = Enum.INT_CRINV;
        static final int INT_CRSPNSR = Enum.INT_CRSPNSR;
        static final int INT_GUAR = Enum.INT_GUAR;
        static final int INT_PAT = Enum.INT_PAT;
        static final int INT_PAYEE = Enum.INT_PAYEE;
        static final int INT_PAYOR = Enum.INT_PAYOR;
        static final int INT_POLHOLD = Enum.INT_POLHOLD;
        static final int INT_QUAL = Enum.INT_QUAL;
        static final int INT_SPNSR = Enum.INT_SPNSR;
        static final int INT_STD = Enum.INT_STD;
        static final int INT_UNDWRT = Enum.INT_UNDWRT;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CIT
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
            
            static final int INT_CIT = 1;
            static final int INT_COVPTY = 2;
            static final int INT_CRINV = 3;
            static final int INT_CRSPNSR = 4;
            static final int INT_GUAR = 5;
            static final int INT_PAT = 6;
            static final int INT_PAYEE = 7;
            static final int INT_PAYOR = 8;
            static final int INT_POLHOLD = 9;
            static final int INT_QUAL = 10;
            static final int INT_SPNSR = 11;
            static final int INT_STD = 12;
            static final int INT_UNDWRT = 13;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("CIT", INT_CIT),
                    new Enum("COVPTY", INT_COVPTY),
                    new Enum("CRINV", INT_CRINV),
                    new Enum("CRSPNSR", INT_CRSPNSR),
                    new Enum("GUAR", INT_GUAR),
                    new Enum("PAT", INT_PAT),
                    new Enum("PAYEE", INT_PAYEE),
                    new Enum("PAYOR", INT_PAYOR),
                    new Enum("POLHOLD", INT_POLHOLD),
                    new Enum("QUAL", INT_QUAL),
                    new Enum("SPNSR", INT_SPNSR),
                    new Enum("STD", INT_STD),
                    new Enum("UNDWRT", INT_UNDWRT),
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
            public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member newInstance() {
              return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal newInstance() {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
