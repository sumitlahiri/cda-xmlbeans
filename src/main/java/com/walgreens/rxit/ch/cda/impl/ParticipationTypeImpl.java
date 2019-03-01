/*
 * XML Type:  ParticipationType
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ParticipationType
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ParticipationType(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ParticipationAncillary
 *     com.walgreens.rxit.ch.cda.ParticipationIndirectTarget
 *     com.walgreens.rxit.ch.cda.ParticipationInformationGenerator
 *     com.walgreens.rxit.ch.cda.ParticipationInformationRecipient
 *     com.walgreens.rxit.ch.cda.ParticipationPhysicalPerformer
 *     com.walgreens.rxit.ch.cda.ParticipationTargetDevice
 *     com.walgreens.rxit.ch.cda.ParticipationTargetSubject
 *     com.walgreens.rxit.ch.cda.ParticipationTargetDirect$Member
 *     com.walgreens.rxit.ch.cda.ParticipationTargetLocation
 *     com.walgreens.rxit.ch.cda.ParticipationVerifier
 *     com.walgreens.rxit.ch.cda.XEncounterParticipant
 *     com.walgreens.rxit.ch.cda.XEncounterPerformerParticipation
 *     com.walgreens.rxit.ch.cda.XInformationRecipient
 *     com.walgreens.rxit.ch.cda.XParticipationAuthorPerformer
 *     com.walgreens.rxit.ch.cda.XParticipationEntVrf
 *     com.walgreens.rxit.ch.cda.XParticipationPrfEntVrf
 *     com.walgreens.rxit.ch.cda.XParticipationVrfRespSprfWit
 *     com.walgreens.rxit.ch.cda.XServiceEventPerformer
 *     com.walgreens.rxit.ch.cda.ParticipationType$Member
 */
public class ParticipationTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ParticipationType, com.walgreens.rxit.ch.cda.ParticipationAncillary, com.walgreens.rxit.ch.cda.ParticipationIndirectTarget, com.walgreens.rxit.ch.cda.ParticipationInformationGenerator, com.walgreens.rxit.ch.cda.ParticipationInformationRecipient, com.walgreens.rxit.ch.cda.ParticipationPhysicalPerformer, com.walgreens.rxit.ch.cda.ParticipationTargetDirect, com.walgreens.rxit.ch.cda.ParticipationTargetLocation, com.walgreens.rxit.ch.cda.ParticipationVerifier, com.walgreens.rxit.ch.cda.XEncounterParticipant, com.walgreens.rxit.ch.cda.XEncounterPerformerParticipation, com.walgreens.rxit.ch.cda.XInformationRecipient, com.walgreens.rxit.ch.cda.XParticipationAuthorPerformer, com.walgreens.rxit.ch.cda.XParticipationEntVrf, com.walgreens.rxit.ch.cda.XParticipationPrfEntVrf, com.walgreens.rxit.ch.cda.XParticipationVrfRespSprfWit, com.walgreens.rxit.ch.cda.XServiceEventPerformer, com.walgreens.rxit.ch.cda.ParticipationType.Member
{
    private static final long serialVersionUID = 1L;
    
    public ParticipationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ParticipationTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ParticipationType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.ParticipationType.Member
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
