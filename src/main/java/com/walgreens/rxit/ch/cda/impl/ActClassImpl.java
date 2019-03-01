/*
 * XML Type:  ActClass
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActClass
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ActClass(@urn:hl7-org:v3).
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
public class ActClassImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ActClass, com.walgreens.rxit.ch.cda.ActClassRoot
{
    private static final long serialVersionUID = 1L;
    
    public ActClassImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActClassImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
