/*
 * XML Type:  CalendarCycleTwoLetter
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML CalendarCycleTwoLetter(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.GregorianCalendarCycle
 *     com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter$Member
 */
public class CalendarCycleTwoLetterImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter, com.walgreens.rxit.ch.cda.GregorianCalendarCycle, com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member
{
    private static final long serialVersionUID = 1L;
    
    public CalendarCycleTwoLetterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CalendarCycleTwoLetterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter.Member
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
