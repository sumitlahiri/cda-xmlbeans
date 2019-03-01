/*
 * XML Type:  ActRelationshipSequel
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActRelationshipSequel
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ActRelationshipSequel(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActRelationshipExcerpt
 *     com.walgreens.rxit.ch.cda.ActRelationshipFulfills
 *     com.walgreens.rxit.ch.cda.ActRelationshipReplacement
 *     com.walgreens.rxit.ch.cda.ActRelationshipSequel$Member
 */
public class ActRelationshipSequelImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ActRelationshipSequel, com.walgreens.rxit.ch.cda.ActRelationshipExcerpt, com.walgreens.rxit.ch.cda.ActRelationshipFulfills, com.walgreens.rxit.ch.cda.ActRelationshipReplacement, com.walgreens.rxit.ch.cda.ActRelationshipSequel.Member
{
    private static final long serialVersionUID = 1L;
    
    public ActRelationshipSequelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActRelationshipSequelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ActRelationshipSequel$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.ActRelationshipSequel.Member
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
