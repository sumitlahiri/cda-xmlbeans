package com.walgreens.rxit.ch.cda.test;

import java.io.InputStream;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.custommonkey.xmlunit.XMLAssert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.walgreens.rxit.ch.cda.ClinicalDocumentDocument1;
import com.walgreens.rxit.ch.cda.POCDMT000040InfrastructureRootTypeId;

public class MDLiveCCDSample {
	
	private static Logger LOG = LoggerFactory.getLogger(MDLiveCCDSample.class);
	private static final String CCD_PATH = "/samples/ConnHealth/C32_from_ConnHealth.xml";
	//private static final String CCD_PATH = "/samples/MDLive/CCD_from_MDLive.xml";
	//private static final String CCD_PATH = "/samples/MDLive/CCD_from_Sutter.xml";
	
	private static ClinicalDocumentDocument1 document;
	
	@BeforeClass
	public static void before() throws Exception {
		InputStream is = MDLiveCCDSample.class.getResourceAsStream(CCD_PATH);
		document = ClinicalDocumentDocument1.Factory.parse(is);
		LOG.info(document.xmlText());
	}

	@Test
	public void compareDocument() throws Exception {
		String originalCCD = IOUtils.toString(MDLiveCCDSample.class.getResourceAsStream(CCD_PATH));
		XMLAssert.assertXMLEqual(originalCCD, document.xmlText());
	}
	
	@Test
	public void unmarshallCCDTypeId() throws Exception {
		POCDMT000040InfrastructureRootTypeId typeId = document.getClinicalDocument().getTypeId();
		Assert.assertNotNull(typeId);
		Assert.assertTrue(typeId.xmlText().indexOf("2.16.840.1.113883.1.3") > 1);
		Assert.assertTrue(typeId.xmlText().indexOf("POCD_HD000040") > 1);
	}
	
}
