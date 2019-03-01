/*
 * XML Type:  EntityNamePartType
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityNamePartType
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityNamePartType(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.XOrganizationNamePartType
 *     com.walgreens.rxit.ch.cda.XPersonNamePartType
 *     com.walgreens.rxit.ch.cda.EntityNamePartType$Member
 */
public class EntityNamePartTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityNamePartType, com.walgreens.rxit.ch.cda.XOrganizationNamePartType, com.walgreens.rxit.ch.cda.XPersonNamePartType, com.walgreens.rxit.ch.cda.EntityNamePartType.Member
{
    private static final long serialVersionUID = 1L;
    
    public EntityNamePartTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityNamePartTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.EntityNamePartType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.EntityNamePartType.Member
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
