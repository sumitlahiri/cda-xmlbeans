/*
 * XML Type:  EntityClassLivingSubject
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityClassLivingSubject
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityClassLivingSubject(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.EntityClassNonPersonLivingSubject
 *     com.walgreens.rxit.ch.cda.EntityClassLivingSubject$Member
 */
public class EntityClassLivingSubjectImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityClassLivingSubject, com.walgreens.rxit.ch.cda.EntityClassNonPersonLivingSubject, com.walgreens.rxit.ch.cda.EntityClassLivingSubject.Member
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassLivingSubjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassLivingSubjectImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.EntityClassLivingSubject$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.EntityClassLivingSubject.Member
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
