/*
 * XML Type:  ActRelationshipPertains
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActRelationshipPertains
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML ActRelationshipPertains(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActRelationshipCostTracking
 *     com.walgreens.rxit.ch.cda.ActRelationshipPosting
 *     com.walgreens.rxit.ch.cda.ActRelationshipAccounting$Member
 *     com.walgreens.rxit.ch.cda.TemporallyPertains
 *     com.walgreens.rxit.ch.cda.HasSupport
 *     com.walgreens.rxit.ch.cda.ActRelationshipPertains$Member
 */
public interface ActRelationshipPertains extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActRelationshipPertains.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("actrelationshippertains14b1type");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ActRelationshipPertains$Member.
     */
    public interface Member extends com.walgreens.rxit.ch.cda.Cs2
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("anon29actype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum PERT = Enum.forString("PERT");
        static final Enum AUTH = Enum.forString("AUTH");
        static final Enum CAUS = Enum.forString("CAUS");
        static final Enum COVBY = Enum.forString("COVBY");
        static final Enum DRIV = Enum.forString("DRIV");
        static final Enum EXPL = Enum.forString("EXPL");
        static final Enum ITEMSLOC = Enum.forString("ITEMSLOC");
        static final Enum LIMIT = Enum.forString("LIMIT");
        static final Enum MFST = Enum.forString("MFST");
        static final Enum NAME = Enum.forString("NAME");
        static final Enum PREV = Enum.forString("PREV");
        static final Enum REFR = Enum.forString("REFR");
        static final Enum REFV = Enum.forString("REFV");
        static final Enum SUBJ = Enum.forString("SUBJ");
        static final Enum SUMM = Enum.forString("SUMM");
        
        static final int INT_PERT = Enum.INT_PERT;
        static final int INT_AUTH = Enum.INT_AUTH;
        static final int INT_CAUS = Enum.INT_CAUS;
        static final int INT_COVBY = Enum.INT_COVBY;
        static final int INT_DRIV = Enum.INT_DRIV;
        static final int INT_EXPL = Enum.INT_EXPL;
        static final int INT_ITEMSLOC = Enum.INT_ITEMSLOC;
        static final int INT_LIMIT = Enum.INT_LIMIT;
        static final int INT_MFST = Enum.INT_MFST;
        static final int INT_NAME = Enum.INT_NAME;
        static final int INT_PREV = Enum.INT_PREV;
        static final int INT_REFR = Enum.INT_REFR;
        static final int INT_REFV = Enum.INT_REFV;
        static final int INT_SUBJ = Enum.INT_SUBJ;
        static final int INT_SUMM = Enum.INT_SUMM;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.ActRelationshipPertains$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_PERT
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
            
            static final int INT_PERT = 1;
            static final int INT_AUTH = 2;
            static final int INT_CAUS = 3;
            static final int INT_COVBY = 4;
            static final int INT_DRIV = 5;
            static final int INT_EXPL = 6;
            static final int INT_ITEMSLOC = 7;
            static final int INT_LIMIT = 8;
            static final int INT_MFST = 9;
            static final int INT_NAME = 10;
            static final int INT_PREV = 11;
            static final int INT_REFR = 12;
            static final int INT_REFV = 13;
            static final int INT_SUBJ = 14;
            static final int INT_SUMM = 15;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("PERT", INT_PERT),
                    new Enum("AUTH", INT_AUTH),
                    new Enum("CAUS", INT_CAUS),
                    new Enum("COVBY", INT_COVBY),
                    new Enum("DRIV", INT_DRIV),
                    new Enum("EXPL", INT_EXPL),
                    new Enum("ITEMSLOC", INT_ITEMSLOC),
                    new Enum("LIMIT", INT_LIMIT),
                    new Enum("MFST", INT_MFST),
                    new Enum("NAME", INT_NAME),
                    new Enum("PREV", INT_PREV),
                    new Enum("REFR", INT_REFR),
                    new Enum("REFV", INT_REFV),
                    new Enum("SUBJ", INT_SUBJ),
                    new Enum("SUMM", INT_SUMM),
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
            public static com.walgreens.rxit.ch.cda.ActRelationshipPertains.Member newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.ActRelationshipPertains.Member) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.ActRelationshipPertains.Member newInstance() {
              return (com.walgreens.rxit.ch.cda.ActRelationshipPertains.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.ActRelationshipPertains.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.ActRelationshipPertains.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains newInstance() {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ActRelationshipPertains parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ActRelationshipPertains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
