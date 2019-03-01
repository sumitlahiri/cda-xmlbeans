/*
 * XML Type:  ActRelationshipAccounting
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActRelationshipAccounting
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ActRelationshipAccounting(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActRelationshipCostTracking
 *     com.walgreens.rxit.ch.cda.ActRelationshipPosting
 *     com.walgreens.rxit.ch.cda.ActRelationshipAccounting$Member
 */
public class ActRelationshipAccountingImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ActRelationshipAccounting, com.walgreens.rxit.ch.cda.ActRelationshipCostTracking, com.walgreens.rxit.ch.cda.ActRelationshipPosting, com.walgreens.rxit.ch.cda.ActRelationshipAccounting.Member
{
    private static final long serialVersionUID = 1L;
    
    public ActRelationshipAccountingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActRelationshipAccountingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ActRelationshipAccounting$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.walgreens.rxit.ch.cda.ActRelationshipAccounting.Member
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
