/*
 * XML Type:  ActMood
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActMood
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ActMood(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActMoodIntent
 *     com.walgreens.rxit.ch.cda.ActMoodCompletionTrack$Member
 *     com.walgreens.rxit.ch.cda.ActMoodPredicate
 *     com.walgreens.rxit.ch.cda.XActMoodDefEvn
 *     com.walgreens.rxit.ch.cda.XActMoodDefEvnRqoPrmsPrp
 *     com.walgreens.rxit.ch.cda.XActMoodDocumentObservation
 *     com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp
 *     com.walgreens.rxit.ch.cda.XActMoodIntentEvent$Member
 *     com.walgreens.rxit.ch.cda.XActMoodOrdPrms
 *     com.walgreens.rxit.ch.cda.XActMoodOrdPrmsEvn
 *     com.walgreens.rxit.ch.cda.XActMoodRqoPrpAptArq
 *     com.walgreens.rxit.ch.cda.XDocumentActMood
 *     com.walgreens.rxit.ch.cda.XDocumentEncounterMood
 *     com.walgreens.rxit.ch.cda.XDocumentProcedureMood
 *     com.walgreens.rxit.ch.cda.XDocumentSubstanceMood
 */
public class ActMoodImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ActMood, com.walgreens.rxit.ch.cda.ActMoodCompletionTrack, com.walgreens.rxit.ch.cda.ActMoodPredicate, com.walgreens.rxit.ch.cda.XActMoodDefEvn, com.walgreens.rxit.ch.cda.XActMoodDefEvnRqoPrmsPrp, com.walgreens.rxit.ch.cda.XActMoodDocumentObservation, com.walgreens.rxit.ch.cda.XActMoodEvnOrdPrmsPrp, com.walgreens.rxit.ch.cda.XActMoodIntentEvent, com.walgreens.rxit.ch.cda.XActMoodOrdPrms, com.walgreens.rxit.ch.cda.XActMoodOrdPrmsEvn, com.walgreens.rxit.ch.cda.XActMoodRqoPrpAptArq, com.walgreens.rxit.ch.cda.XDocumentActMood, com.walgreens.rxit.ch.cda.XDocumentEncounterMood, com.walgreens.rxit.ch.cda.XDocumentProcedureMood, com.walgreens.rxit.ch.cda.XDocumentSubstanceMood
{
    private static final long serialVersionUID = 1L;
    
    public ActMoodImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActMoodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
