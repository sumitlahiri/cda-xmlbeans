/*
 * XML Type:  RoleClassPartitive
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RoleClassPartitive
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML RoleClassPartitive(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.RoleClassInactiveIngredient
 *     com.walgreens.rxit.ch.cda.RoleClassIngredientEntity$Member
 *     com.walgreens.rxit.ch.cda.RoleClassLocatedEntity
 *     com.walgreens.rxit.ch.cda.RoleClassSpecimen
 *     com.walgreens.rxit.ch.cda.RoleClassPartitive$Member
 */
public class RoleClassPartitiveImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.RoleClassPartitive, com.walgreens.rxit.ch.cda.RoleClassIngredientEntity, com.walgreens.rxit.ch.cda.RoleClassLocatedEntity, com.walgreens.rxit.ch.cda.RoleClassSpecimen, com.walgreens.rxit.ch.cda.RoleClassPartitive.Member
{
    private static final long serialVersionUID = 1L;
    
    public RoleClassPartitiveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleClassPartitiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.RoleClassPartitive$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.RoleClassPartitive.Member
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
