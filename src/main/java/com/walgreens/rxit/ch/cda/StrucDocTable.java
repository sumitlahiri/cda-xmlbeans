/*
 * XML Type:  StrucDoc.Table
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocTable
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML StrucDoc.Table(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocTable extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("strucdoctable3354type");
    
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
     * Gets array of all "col" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocCol[] getColArray();
    
    /**
     * Gets ith "col" element
     */
    com.walgreens.rxit.ch.cda.StrucDocCol getColArray(int i);
    
    /**
     * Returns number of "col" element
     */
    int sizeOfColArray();
    
    /**
     * Sets array of all "col" element
     */
    void setColArray(com.walgreens.rxit.ch.cda.StrucDocCol[] colArray);
    
    /**
     * Sets ith "col" element
     */
    void setColArray(int i, com.walgreens.rxit.ch.cda.StrucDocCol col);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col" element
     */
    com.walgreens.rxit.ch.cda.StrucDocCol insertNewCol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col" element
     */
    com.walgreens.rxit.ch.cda.StrucDocCol addNewCol();
    
    /**
     * Removes the ith "col" element
     */
    void removeCol(int i);
    
    /**
     * Gets array of all "colgroup" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocColgroup[] getColgroupArray();
    
    /**
     * Gets ith "colgroup" element
     */
    com.walgreens.rxit.ch.cda.StrucDocColgroup getColgroupArray(int i);
    
    /**
     * Returns number of "colgroup" element
     */
    int sizeOfColgroupArray();
    
    /**
     * Sets array of all "colgroup" element
     */
    void setColgroupArray(com.walgreens.rxit.ch.cda.StrucDocColgroup[] colgroupArray);
    
    /**
     * Sets ith "colgroup" element
     */
    void setColgroupArray(int i, com.walgreens.rxit.ch.cda.StrucDocColgroup colgroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colgroup" element
     */
    com.walgreens.rxit.ch.cda.StrucDocColgroup insertNewColgroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colgroup" element
     */
    com.walgreens.rxit.ch.cda.StrucDocColgroup addNewColgroup();
    
    /**
     * Removes the ith "colgroup" element
     */
    void removeColgroup(int i);
    
    /**
     * Gets the "thead" element
     */
    com.walgreens.rxit.ch.cda.StrucDocThead getThead();
    
    /**
     * True if has "thead" element
     */
    boolean isSetThead();
    
    /**
     * Sets the "thead" element
     */
    void setThead(com.walgreens.rxit.ch.cda.StrucDocThead thead);
    
    /**
     * Appends and returns a new empty "thead" element
     */
    com.walgreens.rxit.ch.cda.StrucDocThead addNewThead();
    
    /**
     * Unsets the "thead" element
     */
    void unsetThead();
    
    /**
     * Gets the "tfoot" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTfoot getTfoot();
    
    /**
     * True if has "tfoot" element
     */
    boolean isSetTfoot();
    
    /**
     * Sets the "tfoot" element
     */
    void setTfoot(com.walgreens.rxit.ch.cda.StrucDocTfoot tfoot);
    
    /**
     * Appends and returns a new empty "tfoot" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTfoot addNewTfoot();
    
    /**
     * Unsets the "tfoot" element
     */
    void unsetTfoot();
    
    /**
     * Gets array of all "tbody" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocTbody[] getTbodyArray();
    
    /**
     * Gets ith "tbody" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTbody getTbodyArray(int i);
    
    /**
     * Returns number of "tbody" element
     */
    int sizeOfTbodyArray();
    
    /**
     * Sets array of all "tbody" element
     */
    void setTbodyArray(com.walgreens.rxit.ch.cda.StrucDocTbody[] tbodyArray);
    
    /**
     * Sets ith "tbody" element
     */
    void setTbodyArray(int i, com.walgreens.rxit.ch.cda.StrucDocTbody tbody);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tbody" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTbody insertNewTbody(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tbody" element
     */
    com.walgreens.rxit.ch.cda.StrucDocTbody addNewTbody();
    
    /**
     * Removes the ith "tbody" element
     */
    void removeTbody(int i);
    
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
     * Gets the "summary" attribute
     */
    java.lang.String getSummary();
    
    /**
     * Gets (as xml) the "summary" attribute
     */
    org.apache.xmlbeans.XmlString xgetSummary();
    
    /**
     * True if has "summary" attribute
     */
    boolean isSetSummary();
    
    /**
     * Sets the "summary" attribute
     */
    void setSummary(java.lang.String summary);
    
    /**
     * Sets (as xml) the "summary" attribute
     */
    void xsetSummary(org.apache.xmlbeans.XmlString summary);
    
    /**
     * Unsets the "summary" attribute
     */
    void unsetSummary();
    
    /**
     * Gets the "width" attribute
     */
    java.lang.String getWidth();
    
    /**
     * Gets (as xml) the "width" attribute
     */
    org.apache.xmlbeans.XmlString xgetWidth();
    
    /**
     * True if has "width" attribute
     */
    boolean isSetWidth();
    
    /**
     * Sets the "width" attribute
     */
    void setWidth(java.lang.String width);
    
    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(org.apache.xmlbeans.XmlString width);
    
    /**
     * Unsets the "width" attribute
     */
    void unsetWidth();
    
    /**
     * Gets the "border" attribute
     */
    java.lang.String getBorder();
    
    /**
     * Gets (as xml) the "border" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorder();
    
    /**
     * True if has "border" attribute
     */
    boolean isSetBorder();
    
    /**
     * Sets the "border" attribute
     */
    void setBorder(java.lang.String border);
    
    /**
     * Sets (as xml) the "border" attribute
     */
    void xsetBorder(org.apache.xmlbeans.XmlString border);
    
    /**
     * Unsets the "border" attribute
     */
    void unsetBorder();
    
    /**
     * Gets the "frame" attribute
     */
    com.walgreens.rxit.ch.cda.StrucDocTable.Frame.Enum getFrame();
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    com.walgreens.rxit.ch.cda.StrucDocTable.Frame xgetFrame();
    
    /**
     * True if has "frame" attribute
     */
    boolean isSetFrame();
    
    /**
     * Sets the "frame" attribute
     */
    void setFrame(com.walgreens.rxit.ch.cda.StrucDocTable.Frame.Enum frame);
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    void xsetFrame(com.walgreens.rxit.ch.cda.StrucDocTable.Frame frame);
    
    /**
     * Unsets the "frame" attribute
     */
    void unsetFrame();
    
    /**
     * Gets the "rules" attribute
     */
    com.walgreens.rxit.ch.cda.StrucDocTable.Rules.Enum getRules();
    
    /**
     * Gets (as xml) the "rules" attribute
     */
    com.walgreens.rxit.ch.cda.StrucDocTable.Rules xgetRules();
    
    /**
     * True if has "rules" attribute
     */
    boolean isSetRules();
    
    /**
     * Sets the "rules" attribute
     */
    void setRules(com.walgreens.rxit.ch.cda.StrucDocTable.Rules.Enum rules);
    
    /**
     * Sets (as xml) the "rules" attribute
     */
    void xsetRules(com.walgreens.rxit.ch.cda.StrucDocTable.Rules rules);
    
    /**
     * Unsets the "rules" attribute
     */
    void unsetRules();
    
    /**
     * Gets the "cellspacing" attribute
     */
    java.lang.String getCellspacing();
    
    /**
     * Gets (as xml) the "cellspacing" attribute
     */
    org.apache.xmlbeans.XmlString xgetCellspacing();
    
    /**
     * True if has "cellspacing" attribute
     */
    boolean isSetCellspacing();
    
    /**
     * Sets the "cellspacing" attribute
     */
    void setCellspacing(java.lang.String cellspacing);
    
    /**
     * Sets (as xml) the "cellspacing" attribute
     */
    void xsetCellspacing(org.apache.xmlbeans.XmlString cellspacing);
    
    /**
     * Unsets the "cellspacing" attribute
     */
    void unsetCellspacing();
    
    /**
     * Gets the "cellpadding" attribute
     */
    java.lang.String getCellpadding();
    
    /**
     * Gets (as xml) the "cellpadding" attribute
     */
    org.apache.xmlbeans.XmlString xgetCellpadding();
    
    /**
     * True if has "cellpadding" attribute
     */
    boolean isSetCellpadding();
    
    /**
     * Sets the "cellpadding" attribute
     */
    void setCellpadding(java.lang.String cellpadding);
    
    /**
     * Sets (as xml) the "cellpadding" attribute
     */
    void xsetCellpadding(org.apache.xmlbeans.XmlString cellpadding);
    
    /**
     * Unsets the "cellpadding" attribute
     */
    void unsetCellpadding();
    
    /**
     * An XML frame(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocTable$Frame.
     */
    public interface Frame extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Frame.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("framef229attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum VOID = Enum.forString("void");
        static final Enum ABOVE = Enum.forString("above");
        static final Enum BELOW = Enum.forString("below");
        static final Enum HSIDES = Enum.forString("hsides");
        static final Enum LHS = Enum.forString("lhs");
        static final Enum RHS = Enum.forString("rhs");
        static final Enum VSIDES = Enum.forString("vsides");
        static final Enum BOX = Enum.forString("box");
        static final Enum BORDER = Enum.forString("border");
        
        static final int INT_VOID = Enum.INT_VOID;
        static final int INT_ABOVE = Enum.INT_ABOVE;
        static final int INT_BELOW = Enum.INT_BELOW;
        static final int INT_HSIDES = Enum.INT_HSIDES;
        static final int INT_LHS = Enum.INT_LHS;
        static final int INT_RHS = Enum.INT_RHS;
        static final int INT_VSIDES = Enum.INT_VSIDES;
        static final int INT_BOX = Enum.INT_BOX;
        static final int INT_BORDER = Enum.INT_BORDER;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.StrucDocTable$Frame.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_VOID
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
            
            static final int INT_VOID = 1;
            static final int INT_ABOVE = 2;
            static final int INT_BELOW = 3;
            static final int INT_HSIDES = 4;
            static final int INT_LHS = 5;
            static final int INT_RHS = 6;
            static final int INT_VSIDES = 7;
            static final int INT_BOX = 8;
            static final int INT_BORDER = 9;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("void", INT_VOID),
                    new Enum("above", INT_ABOVE),
                    new Enum("below", INT_BELOW),
                    new Enum("hsides", INT_HSIDES),
                    new Enum("lhs", INT_LHS),
                    new Enum("rhs", INT_RHS),
                    new Enum("vsides", INT_VSIDES),
                    new Enum("box", INT_BOX),
                    new Enum("border", INT_BORDER),
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
            public static com.walgreens.rxit.ch.cda.StrucDocTable.Frame newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.StrucDocTable.Frame) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.StrucDocTable.Frame newInstance() {
              return (com.walgreens.rxit.ch.cda.StrucDocTable.Frame) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.StrucDocTable.Frame newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.StrucDocTable.Frame) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML rules(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocTable$Rules.
     */
    public interface Rules extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("rulese9b3attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NONE = Enum.forString("none");
        static final Enum GROUPS = Enum.forString("groups");
        static final Enum ROWS = Enum.forString("rows");
        static final Enum COLS = Enum.forString("cols");
        static final Enum ALL = Enum.forString("all");
        
        static final int INT_NONE = Enum.INT_NONE;
        static final int INT_GROUPS = Enum.INT_GROUPS;
        static final int INT_ROWS = Enum.INT_ROWS;
        static final int INT_COLS = Enum.INT_COLS;
        static final int INT_ALL = Enum.INT_ALL;
        
        /**
         * Enumeration value class for com.walgreens.rxit.ch.cda.StrucDocTable$Rules.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_NONE
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
            
            static final int INT_NONE = 1;
            static final int INT_GROUPS = 2;
            static final int INT_ROWS = 3;
            static final int INT_COLS = 4;
            static final int INT_ALL = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("none", INT_NONE),
                    new Enum("groups", INT_GROUPS),
                    new Enum("rows", INT_ROWS),
                    new Enum("cols", INT_COLS),
                    new Enum("all", INT_ALL),
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
            public static com.walgreens.rxit.ch.cda.StrucDocTable.Rules newValue(java.lang.Object obj) {
              return (com.walgreens.rxit.ch.cda.StrucDocTable.Rules) type.newValue( obj ); }
            
            public static com.walgreens.rxit.ch.cda.StrucDocTable.Rules newInstance() {
              return (com.walgreens.rxit.ch.cda.StrucDocTable.Rules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.walgreens.rxit.ch.cda.StrucDocTable.Rules newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.walgreens.rxit.ch.cda.StrucDocTable.Rules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.StrucDocTable newInstance() {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocTable parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
