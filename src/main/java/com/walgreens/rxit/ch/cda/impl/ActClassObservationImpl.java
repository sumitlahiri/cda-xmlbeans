/*
 * XML Type:  ActClassObservation
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActClassObservation
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ActClassObservation(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActClassPublicHealthCase
 *     com.walgreens.rxit.ch.cda.ActClassCondition$Member
 *     com.walgreens.rxit.ch.cda.ActClassObservationSeries
 *     com.walgreens.rxit.ch.cda.ActClassROI
 *     com.walgreens.rxit.ch.cda.ActClassObservation$Member
 */
public class ActClassObservationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ActClassObservation, com.walgreens.rxit.ch.cda.ActClassCondition, com.walgreens.rxit.ch.cda.ActClassObservationSeries, com.walgreens.rxit.ch.cda.ActClassROI, com.walgreens.rxit.ch.cda.ActClassObservation.Member
{
    private static final long serialVersionUID = 1L;
    
    public ActClassObservationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActClassObservationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ActClassObservation$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.ActClassObservation.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
