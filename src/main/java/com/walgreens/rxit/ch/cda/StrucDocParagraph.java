/*
 * XML Type:  StrucDoc.Paragraph
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocParagraph
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML StrucDoc.Paragraph(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocParagraph extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocParagraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("strucdocparagraph6bb4type");
    
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
     * Gets array of all "content" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocContent[] getContentArray();
    
    /**
     * Gets ith "content" element
     */
    com.walgreens.rxit.ch.cda.StrucDocContent getContentArray(int i);
    
    /**
     * Returns number of "content" element
     */
    int sizeOfContentArray();
    
    /**
     * Sets array of all "content" element
     */
    void setContentArray(com.walgreens.rxit.ch.cda.StrucDocContent[] contentArray);
    
    /**
     * Sets ith "content" element
     */
    void setContentArray(int i, com.walgreens.rxit.ch.cda.StrucDocContent content);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    com.walgreens.rxit.ch.cda.StrucDocContent insertNewContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    com.walgreens.rxit.ch.cda.StrucDocContent addNewContent();
    
    /**
     * Removes the ith "content" element
     */
    void removeContent(int i);
    
    /**
     * Gets array of all "linkHtml" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocLinkHtml[] getLinkHtmlArray();
    
    /**
     * Gets ith "linkHtml" element
     */
    com.walgreens.rxit.ch.cda.StrucDocLinkHtml getLinkHtmlArray(int i);
    
    /**
     * Returns number of "linkHtml" element
     */
    int sizeOfLinkHtmlArray();
    
    /**
     * Sets array of all "linkHtml" element
     */
    void setLinkHtmlArray(com.walgreens.rxit.ch.cda.StrucDocLinkHtml[] linkHtmlArray);
    
    /**
     * Sets ith "linkHtml" element
     */
    void setLinkHtmlArray(int i, com.walgreens.rxit.ch.cda.StrucDocLinkHtml linkHtml);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkHtml" element
     */
    com.walgreens.rxit.ch.cda.StrucDocLinkHtml insertNewLinkHtml(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkHtml" element
     */
    com.walgreens.rxit.ch.cda.StrucDocLinkHtml addNewLinkHtml();
    
    /**
     * Removes the ith "linkHtml" element
     */
    void removeLinkHtml(int i);
    
    /**
     * Gets array of all "sub" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocSub[] getSubArray();
    
    /**
     * Gets ith "sub" element
     */
    com.walgreens.rxit.ch.cda.StrucDocSub getSubArray(int i);
    
    /**
     * Returns number of "sub" element
     */
    int sizeOfSubArray();
    
    /**
     * Sets array of all "sub" element
     */
    void setSubArray(com.walgreens.rxit.ch.cda.StrucDocSub[] subArray);
    
    /**
     * Sets ith "sub" element
     */
    void setSubArray(int i, com.walgreens.rxit.ch.cda.StrucDocSub sub);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sub" element
     */
    com.walgreens.rxit.ch.cda.StrucDocSub insertNewSub(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sub" element
     */
    com.walgreens.rxit.ch.cda.StrucDocSub addNewSub();
    
    /**
     * Removes the ith "sub" element
     */
    void removeSub(int i);
    
    /**
     * Gets array of all "sup" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocSup[] getSupArray();
    
    /**
     * Gets ith "sup" element
     */
    com.walgreens.rxit.ch.cda.StrucDocSup getSupArray(int i);
    
    /**
     * Returns number of "sup" element
     */
    int sizeOfSupArray();
    
    /**
     * Sets array of all "sup" element
     */
    void setSupArray(com.walgreens.rxit.ch.cda.StrucDocSup[] supArray);
    
    /**
     * Sets ith "sup" element
     */
    void setSupArray(int i, com.walgreens.rxit.ch.cda.StrucDocSup sup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sup" element
     */
    com.walgreens.rxit.ch.cda.StrucDocSup insertNewSup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sup" element
     */
    com.walgreens.rxit.ch.cda.StrucDocSup addNewSup();
    
    /**
     * Removes the ith "sup" element
     */
    void removeSup(int i);
    
    /**
     * Gets array of all "br" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocBr[] getBrArray();
    
    /**
     * Gets ith "br" element
     */
    com.walgreens.rxit.ch.cda.StrucDocBr getBrArray(int i);
    
    /**
     * Returns number of "br" element
     */
    int sizeOfBrArray();
    
    /**
     * Sets array of all "br" element
     */
    void setBrArray(com.walgreens.rxit.ch.cda.StrucDocBr[] brArray);
    
    /**
     * Sets ith "br" element
     */
    void setBrArray(int i, com.walgreens.rxit.ch.cda.StrucDocBr br);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    com.walgreens.rxit.ch.cda.StrucDocBr insertNewBr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    com.walgreens.rxit.ch.cda.StrucDocBr addNewBr();
    
    /**
     * Removes the ith "br" element
     */
    void removeBr(int i);
    
    /**
     * Gets array of all "footnote" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote[] getFootnoteArray();
    
    /**
     * Gets ith "footnote" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote getFootnoteArray(int i);
    
    /**
     * Returns number of "footnote" element
     */
    int sizeOfFootnoteArray();
    
    /**
     * Sets array of all "footnote" element
     */
    void setFootnoteArray(com.walgreens.rxit.ch.cda.StrucDocFootnote[] footnoteArray);
    
    /**
     * Sets ith "footnote" element
     */
    void setFootnoteArray(int i, com.walgreens.rxit.ch.cda.StrucDocFootnote footnote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote insertNewFootnote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnote addNewFootnote();
    
    /**
     * Removes the ith "footnote" element
     */
    void removeFootnote(int i);
    
    /**
     * Gets array of all "footnoteRef" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] getFootnoteRefArray();
    
    /**
     * Gets ith "footnoteRef" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef getFootnoteRefArray(int i);
    
    /**
     * Returns number of "footnoteRef" element
     */
    int sizeOfFootnoteRefArray();
    
    /**
     * Sets array of all "footnoteRef" element
     */
    void setFootnoteRefArray(com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] footnoteRefArray);
    
    /**
     * Sets ith "footnoteRef" element
     */
    void setFootnoteRefArray(int i, com.walgreens.rxit.ch.cda.StrucDocFootnoteRef footnoteRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteRef" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef insertNewFootnoteRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteRef" element
     */
    com.walgreens.rxit.ch.cda.StrucDocFootnoteRef addNewFootnoteRef();
    
    /**
     * Removes the ith "footnoteRef" element
     */
    void removeFootnoteRef(int i);
    
    /**
     * Gets array of all "renderMultiMedia" elements
     */
    com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia[] getRenderMultiMediaArray();
    
    /**
     * Gets ith "renderMultiMedia" element
     */
    com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia getRenderMultiMediaArray(int i);
    
    /**
     * Returns number of "renderMultiMedia" element
     */
    int sizeOfRenderMultiMediaArray();
    
    /**
     * Sets array of all "renderMultiMedia" element
     */
    void setRenderMultiMediaArray(com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia[] renderMultiMediaArray);
    
    /**
     * Sets ith "renderMultiMedia" element
     */
    void setRenderMultiMediaArray(int i, com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia renderMultiMedia);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "renderMultiMedia" element
     */
    com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia insertNewRenderMultiMedia(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "renderMultiMedia" element
     */
    com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia addNewRenderMultiMedia();
    
    /**
     * Removes the ith "renderMultiMedia" element
     */
    void removeRenderMultiMedia(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph newInstance() {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.StrucDocParagraph parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
