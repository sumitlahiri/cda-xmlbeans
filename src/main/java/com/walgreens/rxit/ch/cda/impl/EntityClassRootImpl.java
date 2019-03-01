/*
 * XML Type:  EntityClassRoot
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityClassRoot
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityClassRoot(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.EntityClassNonPersonLivingSubject
 *     com.walgreens.rxit.ch.cda.EntityClassLivingSubject$Member
 *     com.walgreens.rxit.ch.cda.EntityClassContainer
 *     com.walgreens.rxit.ch.cda.EntityClassDevice
 *     com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial$Member
 *     com.walgreens.rxit.ch.cda.EntityClassMaterial$Member
 *     com.walgreens.rxit.ch.cda.State
 *     com.walgreens.rxit.ch.cda.EntityClassOrganization$Member
 *     com.walgreens.rxit.ch.cda.EntityClassPlace
 *     com.walgreens.rxit.ch.cda.EntityClassRoot$Member
 */
public class EntityClassRootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityClassRoot, com.walgreens.rxit.ch.cda.EntityClassLivingSubject, com.walgreens.rxit.ch.cda.EntityClassMaterial, com.walgreens.rxit.ch.cda.EntityClassOrganization, com.walgreens.rxit.ch.cda.EntityClassPlace, com.walgreens.rxit.ch.cda.EntityClassRoot.Member
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassRootImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassRootImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.EntityClassRoot$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.EntityClassRoot.Member
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
