//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.16 at 10:50:18 AM PET 
//

package org.openfact.commons;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.PayableAmountType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information about a Consolidated InvoiceLine.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Consolidated  InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for AdditionalMonetaryTotalType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalMonetaryTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1}ReferenceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1}TotalAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalMonetaryTotalType", namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", propOrder = {
		"id", "name", "referenceAmount", "payableAmount", "percent", "totalAmount" })
public class AdditionalMonetaryTotalType {

	@XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
	protected IDType id;
	@XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
	protected NameType name;
	@XmlElement(name = "ReferenceAmount")
	protected AmountType referenceAmount;
	@XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
	protected PayableAmountType payableAmount;
	@XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
	protected BigDecimal percent;
	@XmlElement(name = "TotalAmount")
	protected AmountType totalAmount;

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine Billing Payment&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Billing Payment.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Billing Payment&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
	 * </pre>
	 * 
	 * 
	 * @returngi possible object is {@link IDType }
	 * 
	 */
	public IDType getID() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link IDType }
	 * 
	 */
	public void setID(IDType value) {
		this.id = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine. AllowanceCharge&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to AllowanceCharge.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;AllowanceCharge&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;AllowanceCharge&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link NameTypeCommBas }
	 * 
	 */
	public NameType getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link NameTypeCommBas }
	 * 
	 */
	public void setName(NameType value) {
		this.name = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine Billing Payment&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Billing Payment.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Billing Payment&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link BigDecimalCommBas }
	 * 
	 */
	public AmountType getReferenceAmount() {
		return referenceAmount;
	}

	/**
	 * Sets the value of the referenceAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimalCommBas }
	 * 
	 */
	public void setReferenceAmount(AmountType value) {
		this.referenceAmount = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine Billing Payment&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Billing Payment.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Billing Payment&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link PayableBigDecimal }
	 * 
	 */
	public PayableAmountType getPayableAmount() {
		return payableAmount;
	}

	/**
	 * Sets the value of the payableAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link PayableBigDecimal }
	 * 
	 */
	public void setPayableAmount(PayableAmountType value) {
		this.payableAmount = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine. AllowanceCharge&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to AllowanceCharge.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;AllowanceCharge&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;AllowanceCharge&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getPercent() {
		return percent;
	}

	/**
	 * Sets the value of the percent property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setPercent(BigDecimal value) {
		this.percent = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Consolidated InvoiceLine. TaxTotal&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to TaxTotal.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Consolidated InvoiceLine&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;TaxTotal&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;TaxTotal&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link BigDecimalCommBas }
	 * 
	 */
	public AmountType getTotalAmount() {
		return totalAmount;
	}

	/**
	 * Sets the value of the totalAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimalCommBas }
	 * 
	 */
	public void setTotalAmount(AmountType value) {
		this.totalAmount = value;
	}

}
