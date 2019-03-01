/*
 * XML Type:  RoleClassRoot
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RoleClassRoot
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML RoleClassRoot(@urn:hl7-org:v3).
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
 *     com.walgreens.rxit.ch.cda.RoleClassDistributedMaterial
 *     com.walgreens.rxit.ch.cda.RoleClassManufacturedProduct
 *     com.walgreens.rxit.ch.cda.RoleClassServiceDeliveryLocation
 *     com.walgreens.rxit.ch.cda.RoleClassPassive$Member
 *     com.walgreens.rxit.ch.cda.RoleClassAssociative$Member
 *     com.walgreens.rxit.ch.cda.RoleClassIsSpeciesEntity
 *     com.walgreens.rxit.ch.cda.RoleClassOntological$Member
 *     com.walgreens.rxit.ch.cda.RoleClassInactiveIngredient
 *     com.walgreens.rxit.ch.cda.RoleClassIngredientEntity$Member
 *     com.walgreens.rxit.ch.cda.RoleClassLocatedEntity
 *     com.walgreens.rxit.ch.cda.RoleClassSpecimen
 *     com.walgreens.rxit.ch.cda.RoleClassPartitive$Member
 *     com.walgreens.rxit.ch.cda.XDocumentEntrySubject
 *     com.walgreens.rxit.ch.cda.XDocumentSubject
 *     com.walgreens.rxit.ch.cda.XInformationRecipientRole
 *     com.walgreens.rxit.ch.cda.XRoleClassAccommodationRequestor
 *     com.walgreens.rxit.ch.cda.XRoleClassCoverage
 *     com.walgreens.rxit.ch.cda.XRoleClassCoverageInvoice
 *     com.walgreens.rxit.ch.cda.XRoleClassCredentialedEntity$Member
 *     com.walgreens.rxit.ch.cda.XRoleClassPayeePolicyRelationship
 *     com.walgreens.rxit.ch.cda.RoleClassRoot$Member
 */
public class RoleClassRootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.RoleClassRoot, com.walgreens.rxit.ch.cda.RoleClassAssociative, com.walgreens.rxit.ch.cda.RoleClassOntological, com.walgreens.rxit.ch.cda.RoleClassPartitive, com.walgreens.rxit.ch.cda.XDocumentEntrySubject, com.walgreens.rxit.ch.cda.XDocumentSubject, com.walgreens.rxit.ch.cda.XInformationRecipientRole, com.walgreens.rxit.ch.cda.XRoleClassAccommodationRequestor, com.walgreens.rxit.ch.cda.XRoleClassCoverage, com.walgreens.rxit.ch.cda.XRoleClassCoverageInvoice, com.walgreens.rxit.ch.cda.XRoleClassCredentialedEntity, com.walgreens.rxit.ch.cda.XRoleClassPayeePolicyRelationship, com.walgreens.rxit.ch.cda.RoleClassRoot.Member
{
    private static final long serialVersionUID = 1L;
    
    public RoleClassRootImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleClassRootImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.RoleClassRoot$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.RoleClassRoot.Member
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
