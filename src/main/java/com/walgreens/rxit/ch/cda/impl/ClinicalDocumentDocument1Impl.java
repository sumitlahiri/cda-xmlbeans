/*
 * An XML document type.
 * Localname: ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ClinicalDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * A document containing one ClinicalDocument(@urn:hl7-org:v3) element.
 *
 * This is a complex type.
 */
public class ClinicalDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.ClinicalDocumentDocument1
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLINICALDOCUMENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "ClinicalDocument");
    
    
    /**
     * Gets the "ClinicalDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 getClinicalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1)get_store().find_element_user(CLINICALDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ClinicalDocument" element
     */
    public void setClinicalDocument(com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 clinicalDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1)get_store().find_element_user(CLINICALDOCUMENT$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1)get_store().add_element_user(CLINICALDOCUMENT$0);
            }
            target.set(clinicalDocument);
        }
    }
    
    /**
     * Appends and returns a new empty "ClinicalDocument" element
     */
    public com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 addNewClinicalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1 target = null;
            target = (com.walgreens.rxit.ch.cda.POCDMT000040ClinicalDocument1)get_store().add_element_user(CLINICALDOCUMENT$0);
            return target;
        }
    }
}
