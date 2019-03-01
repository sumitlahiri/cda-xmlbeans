/*
 * XML Type:  ActClassRoot
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActClassRoot
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML ActClassRoot(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActClassFinancialContract
 *     com.walgreens.rxit.ch.cda.ActClassContract$Member
 *     com.walgreens.rxit.ch.cda.ActClassControlAct
 *     com.walgreens.rxit.ch.cda.ActClassPublicHealthCase
 *     com.walgreens.rxit.ch.cda.ActClassCondition$Member
 *     com.walgreens.rxit.ch.cda.ActClassObservationSeries
 *     com.walgreens.rxit.ch.cda.ActClassROI
 *     com.walgreens.rxit.ch.cda.ActClassObservation$Member
 *     com.walgreens.rxit.ch.cda.ActClassSupply
 *     com.walgreens.rxit.ch.cda.ActClinicalDocument1
 *     com.walgreens.rxit.ch.cda.ActClassDocument1$Member
 *     com.walgreens.rxit.ch.cda.ActClassComposition$Member
 *     com.walgreens.rxit.ch.cda.ActClassEntry
 *     com.walgreens.rxit.ch.cda.ActClassExtract
 *     com.walgreens.rxit.ch.cda.ActClassOrganizer
 *     com.walgreens.rxit.ch.cda.ActContainer$Member
 *     com.walgreens.rxit.ch.cda.XActClassDocumentEntryAct
 *     com.walgreens.rxit.ch.cda.XActClassDocumentEntryOrganizer
 *     com.walgreens.rxit.ch.cda.ActClassRoot$Member
 */
public interface ActClassRoot extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActClassRoot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("actclassroota4e5type");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ActClassRoot$Member.
     */
    public interface Member extends com.walgreens.rxit.ch.cda.Cs2
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("anondecatype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ACT = Enum.forString("ACT");
        static final Enum ACCM = Enum.forString("ACCM");
        static final Enum ACCT = Enum.forString("ACCT");
        static final Enum ACSN = Enum.forString("ACSN");
        static final Enum ADJUD = Enum.forString("ADJUD");
        static final Enum CONS = Enum.forString("CONS");
        static final Enum CONTREG = Enum.forString("CONTREG");
        static final Enum CTTEVENT = Enum.forString("CTTEVENT");
        static final Enum DISPACT = Enum.forString("DISPACT");
        static final Enum ENC = Enum.forString("ENC");
        static final Enum INC = Enum.forString("INC");
        static final Enum INFRM = Enum.forString("INFRM");
        static final Enum INVE = Enum.forString("INVE");
        static final Enum LIST = Enum.forString("LIST");
        static final Enum MPROT = Enum.forString("MPROT");
        static final Enum PCPR = Enum.forString("PCPR");
        static final Enum PROC = Enum.forString("PROC");
        static final Enum REG = Enum.forString("REG");
        static final Enum REV = Enum.forString("REV");
        static final Enum SBADM = Enum.forString("SBADM");
        static final Enum SPCTRT = Enum.forString("SPCTRT");
        static final Enum SUBST = Enum.forString("SUBST");
        static final Enum TRNS = Enum.forString("TRNS");
        static final Enum VERIF = Enum.forString("VERIF");
        static final Enum XACT = Enum.forString("XACT");
        
        static final int INT_ACT = Enum.INT_ACT;
        static final int INT_ACCM = Enum.INT_ACCM;
        static final int INT_ACCT = Enum.INT_ACCT;
        static final int INT_ACSN = Enum.INT_ACSN;
        static final int INT_ADJUD = Enum.INT_ADJUD;
        static final int INT_CONS = Enum.INT_CONS;
        static final int INT_CONTREG = Enum.INT_CONTREG;
        static final int INT_CTTEVENT = Enum.INT_CTTEVENT;
        static final int INT_DISPACT = Enum.INT_DISPACT;
        static final int INT_ENC = Enum.INT_ENC;
        static final int INT_INC = Enum.INT_INC;
        static final int INT_INFRM = Enum.INT_INFRM;
        static final int INT_INVE = Enum.INT_INVE;
        static final int INT_LIST = Enum.INT_LIST;
        static final int INT_MPROT = Enum.INT_MPROT;
        static final int INT_PCPR = Enum.INT_PCPR;
        static final int INT_PROC = Enum.INT_PROC;
        static final int INT_REG = Enum.INT_REG;
        static final int INT_REV = Enum.INT_REV;
        static final int INT_SBADM = Enum.INT_SBADM;
        static final int INT_SPCTRT = Enum.INT_SPCTRT;
        static final int INT_SUBST = Enum.INT_SUBST;
        static final int INT_TRNS = Enum.INT_TRNS;
        static final int INT_VERIF = Enum.INT_VERIF;
        static final int INT_XACT = Enum.INT_XACT;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.ActClassRoot$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ACT
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
            
            static final int INT_ACT = 1;
            static final int INT_ACCM = 2;
            static final int INT_ACCT = 3;
            static final int INT_ACSN = 4;
            static final int INT_ADJUD = 5;
            static final int INT_CONS = 6;
            static final int INT_CONTREG = 7;
            static final int INT_CTTEVENT = 8;
            static final int INT_DISPACT = 9;
            static final int INT_ENC = 10;
            static final int INT_INC = 11;
            static final int INT_INFRM = 12;
            static final int INT_INVE = 13;
            static final int INT_LIST = 14;
            static final int INT_MPROT = 15;
            static final int INT_PCPR = 16;
            static final int INT_PROC = 17;
            static final int INT_REG = 18;
            static final int INT_REV = 19;
            static final int INT_SBADM = 20;
            static final int INT_SPCTRT = 21;
            static final int INT_SUBST = 22;
            static final int INT_TRNS = 23;
            static final int INT_VERIF = 24;
            static final int INT_XACT = 25;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("ACT", INT_ACT),
                    new Enum("ACCM", INT_ACCM),
                    new Enum("ACCT", INT_ACCT),
                    new Enum("ACSN", INT_ACSN),
                    new Enum("ADJUD", INT_ADJUD),
                    new Enum("CONS", INT_CONS),
                    new Enum("CONTREG", INT_CONTREG),
                    new Enum("CTTEVENT", INT_CTTEVENT),
                    new Enum("DISPACT", INT_DISPACT),
                    new Enum("ENC", INT_ENC),
                    new Enum("INC", INT_INC),
                    new Enum("INFRM", INT_INFRM),
                    new Enum("INVE", INT_INVE),
                    new Enum("LIST", INT_LIST),
                    new Enum("MPROT", INT_MPROT),
                    new Enum("PCPR", INT_PCPR),
                    new Enum("PROC", INT_PROC),
                    new Enum("REG", INT_REG),
                    new Enum("REV", INT_REV),
                    new Enum("SBADM", INT_SBADM),
                    new Enum("SPCTRT", INT_SPCTRT),
                    new Enum("SUBST", INT_SUBST),
                    new Enum("TRNS", INT_TRNS),
                    new Enum("VERIF", INT_VERIF),
                    new Enum("XACT", INT_XACT),
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
            public static com.walgreens.rxit.ch.cda.ActClassRoot.Member newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.ActClassRoot.Member) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.ActClassRoot.Member newInstance() {
              return (com.walgreens.rxit.ch.cda.ActClassRoot.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.ActClassRoot.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.ActClassRoot.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.ActClassRoot newValue(java.lang.Object obj) {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) type.newValue( obj ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot newInstance() {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.ActClassRoot parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.ActClassRoot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
