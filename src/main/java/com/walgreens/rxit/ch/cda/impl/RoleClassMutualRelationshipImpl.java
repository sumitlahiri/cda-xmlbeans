/*
 * XML Type:  RoleClassMutualRelationship
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RoleClassMutualRelationship
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML RoleClassMutualRelationship(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.LicensedEntityRole
 *     com.walgreens.rxit.ch.cda.RoleClassContact
 *     com.walgreens.rxit.ch.cda.RoleClassAssignedEntity$Member
 *     com.walgreens.rxit.ch.cda.RoleClassAgent$Member
 *     com.walgreens.rxit.ch.cda.RoleClassEmployee
 *     com.walgreens.rxit.ch.cda.RoleClassInvestigationSubject
 *     com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal$Member
 *     com.walgreens.rxit.ch.cda.RoleClassMutualRelationship$Member
 */
public class RoleClassMutualRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.RoleClassMutualRelationship, com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal, com.walgreens.rxit.ch.cda.RoleClassMutualRelationship.Member
{
    private static final long serialVersionUID = 1L;
    
    public RoleClassMutualRelationshipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleClassMutualRelationshipImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.RoleClassMutualRelationship$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.RoleClassMutualRelationship.Member
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
