/*
 * XML Type:  RoleClassRelationshipFormal
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML RoleClassRelationshipFormal(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.LicensedEntityRole
 *     com.walgreens.rxit.ch.cda.RoleClassContact
 *     com.walgreens.rxit.ch.cda.RoleClassAssignedEntity$Member
 *     com.walgreens.rxit.ch.cda.RoleClassAgent$Member
 *     com.walgreens.rxit.ch.cda.RoleClassEmployee
 *     com.walgreens.rxit.ch.cda.RoleClassInvestigationSubject
 *     com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal$Member
 */
public class RoleClassRelationshipFormalImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal, com.walgreens.rxit.ch.cda.LicensedEntityRole, com.walgreens.rxit.ch.cda.RoleClassAgent, com.walgreens.rxit.ch.cda.RoleClassEmployee, com.walgreens.rxit.ch.cda.RoleClassInvestigationSubject, com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member
{
    private static final long serialVersionUID = 1L;
    
    public RoleClassRelationshipFormalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleClassRelationshipFormalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.RoleClassRelationshipFormal.Member
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
