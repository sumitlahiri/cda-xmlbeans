/*
 * XML Type:  EntityNameUse
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityNameUse
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityNameUse(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.EntityNameSearchUse
 *     com.walgreens.rxit.ch.cda.NameRepresentationUse
 *     com.walgreens.rxit.ch.cda.OrganizationNameUse$Member
 *     com.walgreens.rxit.ch.cda.NamePseudonymUse
 *     com.walgreens.rxit.ch.cda.PersonNameUse$Member
 *     com.walgreens.rxit.ch.cda.EntityNameUse$Member
 */
public class EntityNameUseImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityNameUse, com.walgreens.rxit.ch.cda.EntityNameSearchUse, com.walgreens.rxit.ch.cda.NameRepresentationUse, com.walgreens.rxit.ch.cda.OrganizationNameUse, com.walgreens.rxit.ch.cda.PersonNameUse, com.walgreens.rxit.ch.cda.EntityNameUse.Member
{
    private static final long serialVersionUID = 1L;
    
    public EntityNameUseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityNameUseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.EntityNameUse$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.EntityNameUse.Member
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
