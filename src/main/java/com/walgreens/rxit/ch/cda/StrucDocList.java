/*
 * XML Type:  StrucDoc.List
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocList
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML StrucDoc.List(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("strucdoclist716ctype");
    
    /**
     * Gets the "caption" element
     */
    com.walgreens.rxit.ch.cda.StrucDocCaption getCaption();
    
    /**
     * True if has "caption" element
     */
    boolean isSetCaption();
    
    /**
     * Sets the "caption" element
     */
    void setCaption(com.walgreens.rxit.ch.cda.StrucDocCaption caption);
    
    /**
     * Appends and returns a new empty "caption" element
     */
    com.walgreens.rxit.ch.cda.StrucDocCaption addNewCaption();
    
    /**
     * Unsets the "caption" element
     */
    void unsetCaption();
    
    /**
     * Gets array of all "item" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocItem[] getItemArray();
    
    /**
     * Gets ith "item" element
     */
    com.walgreens.rxit.ch.cda.StrucDocItem getItemArray(int i);
    
    /**
     * Returns number of "item" element
     */
    int sizeOfItemArray();
    
    /**
     * Sets array of all "item" element
     */
    void setItemArray(com.walgreens.rxit.ch.cda.StrucDocItem[] itemArray);
    
    /**
     * Sets ith "item" element
     */
    void setItemArray(int i, com.walgreens.rxit.ch.cda.StrucDocItem item);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    com.walgreens.rxit.ch.cda.StrucDocItem insertNewItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    com.walgreens.rxit.ch.cda.StrucDocItem addNewItem();
    
    /**
     * Removes the ith "item" element
     */
    void removeItem(int i);
    
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
     * Gets the "listType" attribute
     */
    com.walgreens.rxit.ch.cda.StrucDocList.ListType.Enum getListType();
    
    /**
     * Gets (as xml) the "listType" attribute
     */
    com.walgreens.rxit.ch.cda.StrucDocList.ListType xgetListType();
    
    /**
     * True if has "listType" attribute
     */
    boolean isSetListType();
    
    /**
     * Sets the "listType" attribute
     */
    void setListType(com.walgreens.rxit.ch.cda.StrucDocList.ListType.Enum listType);
    
    /**
     * Sets (as xml) the "listType" attribute
     */
    void xsetListType(com.walgreens.rxit.ch.cda.StrucDocList.ListType listType);
    
    /**
     * Unsets the "listType" attribute
     */
    void unsetListType();
    
    /**
     * An XML listType(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocList$ListType.
     */
    public interface ListType extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("listtypeed54attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ORDERED = Enum.forString("ordered");
        static final Enum UNORDERED = Enum.forString("unordered");
        
        static final int INT_ORDERED = Enum.INT_ORDERED;
        static final int INT_UNORDERED = Enum.INT_UNORDERED;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.StrucDocList$ListType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ORDERED
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
            
            static final int INT_ORDERED = 1;
            static final int INT_UNORDERED = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("ordered", INT_ORDERED),
                    new Enum("unordered", INT_UNORDERED),
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
            public static com.walgreens.rxit.ch.cda.StrucDocList.ListType newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.StrucDocList.ListType) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.StrucDocList.ListType newInstance() {
              return (com.walgreens.rxit.ch.cda.StrucDocList.ListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.StrucDocList.ListType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.StrucDocList.ListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.StrucDocList newInstance() {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
