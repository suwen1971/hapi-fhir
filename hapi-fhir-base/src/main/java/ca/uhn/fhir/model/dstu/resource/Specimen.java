















package ca.uhn.fhir.model.dstu.resource;


import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;

import ca.uhn.fhir.model.dstu.composite.AddressDt;
import ca.uhn.fhir.model.dstu.valueset.AdministrativeGenderCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.AdmitSourceEnum;
import ca.uhn.fhir.model.dstu.valueset.AggregationModeEnum;
import ca.uhn.fhir.model.dstu.valueset.AnimalSpeciesEnum;
import ca.uhn.fhir.model.dstu.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu.valueset.BindingConformanceEnum;
import ca.uhn.fhir.model.dstu.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu.composite.CodingDt;
import ca.uhn.fhir.model.dstu.valueset.ConformanceEventModeEnum;
import ca.uhn.fhir.model.dstu.valueset.ConformanceStatementStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.ConstraintSeverityEnum;
import ca.uhn.fhir.model.dstu.composite.ContactDt;
import ca.uhn.fhir.model.dstu.valueset.DataTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Device;
import ca.uhn.fhir.model.dstu.resource.DiagnosticOrder;
import ca.uhn.fhir.model.dstu.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.dstu.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.DocumentModeEnum;
import ca.uhn.fhir.model.dstu.resource.Encounter;
import ca.uhn.fhir.model.dstu.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu.valueset.EncounterReasonCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu.valueset.EncounterTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ExtensionContextEnum;
import ca.uhn.fhir.model.dstu.valueset.FHIRDefinedTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.FilterOperatorEnum;
import ca.uhn.fhir.model.dstu.resource.Group;
import ca.uhn.fhir.model.dstu.valueset.GroupTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.HierarchicalRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu.valueset.ImagingModalityEnum;
import ca.uhn.fhir.model.dstu.resource.ImagingStudy;
import ca.uhn.fhir.model.dstu.valueset.InstanceAvailabilityEnum;
import ca.uhn.fhir.model.dstu.valueset.LinkTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Location;
import ca.uhn.fhir.model.dstu.valueset.LocationModeEnum;
import ca.uhn.fhir.model.dstu.valueset.LocationStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.LocationTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.dstu.resource.Media;
import ca.uhn.fhir.model.dstu.valueset.MediaTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Medication;
import ca.uhn.fhir.model.dstu.valueset.MedicationKindEnum;
import ca.uhn.fhir.model.dstu.valueset.MessageEventEnum;
import ca.uhn.fhir.model.dstu.valueset.MessageSignificanceCategoryEnum;
import ca.uhn.fhir.model.dstu.valueset.MessageTransportEnum;
import ca.uhn.fhir.model.dstu.valueset.ModalityEnum;
import ca.uhn.fhir.model.dstu.resource.Observation;
import ca.uhn.fhir.model.dstu.valueset.ObservationInterpretationCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.ObservationRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ObservationReliabilityEnum;
import ca.uhn.fhir.model.dstu.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.dstu.resource.Organization;
import ca.uhn.fhir.model.dstu.valueset.OrganizationTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ParticipantTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Patient;
import ca.uhn.fhir.model.dstu.valueset.PatientRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.composite.PeriodDt;
import ca.uhn.fhir.model.dstu.resource.Practitioner;
import ca.uhn.fhir.model.dstu.valueset.PractitionerRoleEnum;
import ca.uhn.fhir.model.dstu.valueset.PractitionerSpecialtyEnum;
import ca.uhn.fhir.model.dstu.resource.Profile;
import ca.uhn.fhir.model.dstu.valueset.PropertyRepresentationEnum;
import ca.uhn.fhir.model.dstu.composite.QuantityDt;
import ca.uhn.fhir.model.dstu.composite.RangeDt;
import ca.uhn.fhir.model.dstu.composite.RatioDt;
import ca.uhn.fhir.model.dstu.resource.RelatedPerson;
import ca.uhn.fhir.model.dstu.valueset.ResourceProfileStatusEnum;
import ca.uhn.fhir.model.dstu.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu.valueset.ResourceTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulConformanceModeEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulOperationSystemEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulOperationTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulSecurityServiceEnum;
import ca.uhn.fhir.model.dstu.composite.SampledDataDt;
import ca.uhn.fhir.model.dstu.valueset.SearchParamTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SlicingRulesEnum;
import ca.uhn.fhir.model.dstu.resource.Specimen;
import ca.uhn.fhir.model.dstu.valueset.SpecimenCollectionMethodEnum;
import ca.uhn.fhir.model.dstu.valueset.SpecimenTreatmentProcedureEnum;
import ca.uhn.fhir.model.dstu.resource.Substance;
import ca.uhn.fhir.model.dstu.valueset.SubstanceTypeEnum;
import ca.uhn.fhir.model.dstu.resource.ValueSet;
import ca.uhn.fhir.model.dstu.valueset.ValueSetStatusEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu.composite.DurationDt;
import ca.uhn.fhir.model.primitive.Base64BinaryDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.BoundCodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.primitive.OidDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.UriDt;


/**
 * HAPI/FHIR <b>Specimen</b> Resource
 * (Sample for analysis)
 *
 * <p>
 * <b>Definition:</b>
 * Sample for analysis
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 */
@ResourceDef(name="Specimen", profile="http://hl7.org/fhir/profiles/Specimen", id="specimen")
public class Specimen extends BaseResource implements IResource {

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the specimen</b><br/>
	 * Type: <b>reference</b><br/>
	 * Path: <b>Specimen.subject</b><br/>
	 * </p>
	 */
	public static final String SP_SUBJECT = "subject";


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="External Identifier",
		formalDefinition="Id for specimen"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="type", type=CodeableConceptDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Kind of material that forms the specimen",
		formalDefinition="Kind of material that forms the specimen"
	)
	private CodeableConceptDt myType;
	
	@Child(name="source", order=2, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Parent of specimen",
		formalDefinition="Parent specimen from which the focal specimen was a component"
	)
	private java.util.List<Source> mySource;
	
	@Child(name="subject", order=3, min=1, max=1, type={
		ca.uhn.fhir.model.dstu.resource.Patient.class,
		ca.uhn.fhir.model.dstu.resource.Group.class,
		ca.uhn.fhir.model.dstu.resource.Device.class,
		ca.uhn.fhir.model.dstu.resource.Substance.class,
	})
	@Description(
		shortDefinition="Where the specimen came from. This may be the patient(s) or from the environment or  a device",
		formalDefinition=""
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="accessionIdentifier", type=IdentifierDt.class, order=4, min=0, max=1)	
	@Description(
		shortDefinition="Identifier assigned by the lab",
		formalDefinition="The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures."
	)
	private IdentifierDt myAccessionIdentifier;
	
	@Child(name="receivedTime", type=DateTimeDt.class, order=5, min=0, max=1)	
	@Description(
		shortDefinition="The time when specimen was received for processing",
		formalDefinition="Time when specimen was received for processing or testing"
	)
	private DateTimeDt myReceivedTime;
	
	@Child(name="collection", order=6, min=1, max=1)	
	@Description(
		shortDefinition="Collection details",
		formalDefinition="Details concerning the specimen collection"
	)
	private Collection myCollection;
	
	@Child(name="treatment", order=7, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Treatment and processing step details",
		formalDefinition="Details concerning treatment and processing steps for the specimen"
	)
	private java.util.List<Treatment> myTreatment;
	
	@Child(name="container", order=8, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Direct container of specimen (tube/slide, etc)",
		formalDefinition="The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here."
	)
	private java.util.List<Container> myContainer;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myType,  mySource,  mySubject,  myAccessionIdentifier,  myReceivedTime,  myCollection,  myTreatment,  myContainer);
	}
	
	@Override
	public java.util.List<IElement> getAllPopulatedChildElements() {
		return getAllPopulatedChildElementsOfType(null);
	}

	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myType, mySource, mySubject, myAccessionIdentifier, myReceivedTime, myCollection, myTreatment, myContainer);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (External Identifier).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id for specimen
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (External Identifier)
	 *
     * <p>
     * <b>Definition:</b>
     * Id for specimen
     * </p> 
	 */
	public void setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
	}

	/**
	 * Adds and returns a new value for <b>identifier</b> (External Identifier)
	 *
     * <p>
     * <b>Definition:</b>
     * Id for specimen
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

  
	/**
	 * Gets the value(s) for <b>type</b> (Kind of material that forms the specimen).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Kind of material that forms the specimen
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (Kind of material that forms the specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * Kind of material that forms the specimen
     * </p> 
	 */
	public void setType(CodeableConceptDt theValue) {
		myType = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>source</b> (Parent of specimen).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Parent specimen from which the focal specimen was a component
     * </p> 
	 */
	public java.util.List<Source> getSource() {  
		if (mySource == null) {
			mySource = new java.util.ArrayList<Source>();
		}
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source</b> (Parent of specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * Parent specimen from which the focal specimen was a component
     * </p> 
	 */
	public void setSource(java.util.List<Source> theValue) {
		mySource = theValue;
	}

	/**
	 * Adds and returns a new value for <b>source</b> (Parent of specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * Parent specimen from which the focal specimen was a component
     * </p> 
	 */
	public Source addSource() {
		Source newType = new Source();
		getSource().add(newType);
		return newType; 
	}

  
	/**
	 * Gets the value(s) for <b>subject</b> (Where the specimen came from. This may be the patient(s) or from the environment or  a device).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getSubject() {  
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> (Where the specimen came from. This may be the patient(s) or from the environment or  a device)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public void setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>accessionIdentifier</b> (Identifier assigned by the lab).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
     * </p> 
	 */
	public IdentifierDt getAccessionIdentifier() {  
		if (myAccessionIdentifier == null) {
			myAccessionIdentifier = new IdentifierDt();
		}
		return myAccessionIdentifier;
	}

	/**
	 * Sets the value(s) for <b>accessionIdentifier</b> (Identifier assigned by the lab)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
     * </p> 
	 */
	public void setAccessionIdentifier(IdentifierDt theValue) {
		myAccessionIdentifier = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>receivedTime</b> (The time when specimen was received for processing).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public DateTimeDt getReceivedTime() {  
		if (myReceivedTime == null) {
			myReceivedTime = new DateTimeDt();
		}
		return myReceivedTime;
	}

	/**
	 * Sets the value(s) for <b>receivedTime</b> (The time when specimen was received for processing)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public void setReceivedTime(DateTimeDt theValue) {
		myReceivedTime = theValue;
	}


 	/**
	 * Sets the value for <b>receivedTime</b> (The time when specimen was received for processing)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public void setReceivedTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myReceivedTime = new DateTimeDt(theDate, thePrecision); 
	}

	/**
	 * Sets the value for <b>receivedTime</b> (The time when specimen was received for processing)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public void setReceivedTimeWithSecondsPrecision( Date theDate) {
		myReceivedTime = new DateTimeDt(theDate); 
	}

 
	/**
	 * Gets the value(s) for <b>collection</b> (Collection details).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning the specimen collection
     * </p> 
	 */
	public Collection getCollection() {  
		if (myCollection == null) {
			myCollection = new Collection();
		}
		return myCollection;
	}

	/**
	 * Sets the value(s) for <b>collection</b> (Collection details)
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning the specimen collection
     * </p> 
	 */
	public void setCollection(Collection theValue) {
		myCollection = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>treatment</b> (Treatment and processing step details).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public java.util.List<Treatment> getTreatment() {  
		if (myTreatment == null) {
			myTreatment = new java.util.ArrayList<Treatment>();
		}
		return myTreatment;
	}

	/**
	 * Sets the value(s) for <b>treatment</b> (Treatment and processing step details)
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public void setTreatment(java.util.List<Treatment> theValue) {
		myTreatment = theValue;
	}

	/**
	 * Adds and returns a new value for <b>treatment</b> (Treatment and processing step details)
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public Treatment addTreatment() {
		Treatment newType = new Treatment();
		getTreatment().add(newType);
		return newType; 
	}

  
	/**
	 * Gets the value(s) for <b>container</b> (Direct container of specimen (tube/slide, etc)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public java.util.List<Container> getContainer() {  
		if (myContainer == null) {
			myContainer = new java.util.ArrayList<Container>();
		}
		return myContainer;
	}

	/**
	 * Sets the value(s) for <b>container</b> (Direct container of specimen (tube/slide, etc))
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public void setContainer(java.util.List<Container> theValue) {
		myContainer = theValue;
	}

	/**
	 * Adds and returns a new value for <b>container</b> (Direct container of specimen (tube/slide, etc))
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public Container addContainer() {
		Container newType = new Container();
		getContainer().add(newType);
		return newType; 
	}

  
	/**
	 * Block class for child element: <b>Specimen.source</b> (Parent of specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * Parent specimen from which the focal specimen was a component
     * </p> 
	 */
	@Block(name="Specimen.source")	
	public static class Source extends BaseElement implements IResourceBlock {
	
	@Child(name="relationship", type=CodeDt.class, order=0, min=1, max=1)	
	@Description(
		shortDefinition="parent | child",
		formalDefinition="Whether this relationship is to a parent or to a child"
	)
	private BoundCodeDt<HierarchicalRelationshipTypeEnum> myRelationship;
	
	@Child(name="target", order=1, min=0, max=Child.MAX_UNLIMITED, type={
		ca.uhn.fhir.model.dstu.resource.Specimen.class,
	})
	@Description(
		shortDefinition="The subject of the relationship",
		formalDefinition="The specimen resource that is the target of this relationship"
	)
	private java.util.List<ResourceReferenceDt> myTarget;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRelationship,  myTarget);
	}
	
	@Override
	public java.util.List<IElement> getAllPopulatedChildElements() {
		return getAllPopulatedChildElementsOfType(null);
	}

	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRelationship, myTarget);
	}

	/**
	 * Gets the value(s) for <b>relationship</b> (parent | child).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this relationship is to a parent or to a child
     * </p> 
	 */
	public BoundCodeDt<HierarchicalRelationshipTypeEnum> getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new BoundCodeDt<HierarchicalRelationshipTypeEnum>(HierarchicalRelationshipTypeEnum.VALUESET_BINDER);
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> (parent | child)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this relationship is to a parent or to a child
     * </p> 
	 */
	public void setRelationship(BoundCodeDt<HierarchicalRelationshipTypeEnum> theValue) {
		myRelationship = theValue;
	}


	/**
	 * Sets the value(s) for <b>relationship</b> (parent | child)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this relationship is to a parent or to a child
     * </p> 
	 */
	public void setRelationship(HierarchicalRelationshipTypeEnum theValue) {
		getRelationship().setValueAsEnum(theValue);
	}

  
	/**
	 * Gets the value(s) for <b>target</b> (The subject of the relationship).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The specimen resource that is the target of this relationship
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getTarget() {  
		if (myTarget == null) {
			myTarget = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> (The subject of the relationship)
	 *
     * <p>
     * <b>Definition:</b>
     * The specimen resource that is the target of this relationship
     * </p> 
	 */
	public void setTarget(java.util.List<ResourceReferenceDt> theValue) {
		myTarget = theValue;
	}


  

	}


	/**
	 * Block class for child element: <b>Specimen.collection</b> (Collection details)
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning the specimen collection
     * </p> 
	 */
	@Block(name="Specimen.collection")	
	public static class Collection extends BaseElement implements IResourceBlock {
	
	@Child(name="collector", order=0, min=0, max=1, type={
		ca.uhn.fhir.model.dstu.resource.Practitioner.class,
	})
	@Description(
		shortDefinition="Who collected the specimen",
		formalDefinition="Person who collected the specimen"
	)
	private ResourceReferenceDt myCollector;
	
	@Child(name="comment", type=StringDt.class, order=1, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Collector comments",
		formalDefinition="To communicate any details or issues encountered during the specimen collection procedure."
	)
	private java.util.List<StringDt> myComment;
	
	@Child(name="collected", order=2, min=0, max=1, type={
		DateTimeDt.class,
		PeriodDt.class,
	})
	@Description(
		shortDefinition="Collection time",
		formalDefinition="Time when specimen was collected from subject - the physiologically relevant time"
	)
	private IDatatype myCollected;
	
	@Child(name="quantity", type=QuantityDt.class, order=3, min=0, max=1)	
	@Description(
		shortDefinition="The quantity of specimen collected",
		formalDefinition="The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample"
	)
	private QuantityDt myQuantity;
	
	@Child(name="method", type=CodeableConceptDt.class, order=4, min=0, max=1)	
	@Description(
		shortDefinition="Technique used to perform collection",
		formalDefinition="A coded value specifying the technique that is used to perform the procedure"
	)
	private BoundCodeableConceptDt<SpecimenCollectionMethodEnum> myMethod;
	
	@Child(name="sourceSite", type=CodeableConceptDt.class, order=5, min=0, max=1)	
	@Description(
		shortDefinition="Anatomical collection site",
		formalDefinition="Anatomical location from which the specimen should be collected (if subject is a patient). This element is not used for environmental specimens."
	)
	private CodeableConceptDt mySourceSite;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCollector,  myComment,  myCollected,  myQuantity,  myMethod,  mySourceSite);
	}
	
	@Override
	public java.util.List<IElement> getAllPopulatedChildElements() {
		return getAllPopulatedChildElementsOfType(null);
	}

	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCollector, myComment, myCollected, myQuantity, myMethod, mySourceSite);
	}

	/**
	 * Gets the value(s) for <b>collector</b> (Who collected the specimen).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Person who collected the specimen
     * </p> 
	 */
	public ResourceReferenceDt getCollector() {  
		if (myCollector == null) {
			myCollector = new ResourceReferenceDt();
		}
		return myCollector;
	}

	/**
	 * Sets the value(s) for <b>collector</b> (Who collected the specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * Person who collected the specimen
     * </p> 
	 */
	public void setCollector(ResourceReferenceDt theValue) {
		myCollector = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>comment</b> (Collector comments).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public java.util.List<StringDt> getComment() {  
		if (myComment == null) {
			myComment = new java.util.ArrayList<StringDt>();
		}
		return myComment;
	}

	/**
	 * Sets the value(s) for <b>comment</b> (Collector comments)
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public void setComment(java.util.List<StringDt> theValue) {
		myComment = theValue;
	}

	/**
	 * Adds and returns a new value for <b>comment</b> (Collector comments)
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public StringDt addComment() {
		StringDt newType = new StringDt();
		getComment().add(newType);
		return newType; 
	}

 	/**
	 * Adds a new value for <b>comment</b> (Collector comments)
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public void addComment( String theString) {
		if (myComment == null) {
			myComment = new java.util.ArrayList<StringDt>();
		}
		myComment.add(new StringDt(theString)); 
	}

 
	/**
	 * Gets the value(s) for <b>collected[x]</b> (Collection time).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was collected from subject - the physiologically relevant time
     * </p> 
	 */
	public IDatatype getCollected() {  
		return myCollected;
	}

	/**
	 * Sets the value(s) for <b>collected[x]</b> (Collection time)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was collected from subject - the physiologically relevant time
     * </p> 
	 */
	public void setCollected(IDatatype theValue) {
		myCollected = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>quantity</b> (The quantity of specimen collected).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample
     * </p> 
	 */
	public QuantityDt getQuantity() {  
		if (myQuantity == null) {
			myQuantity = new QuantityDt();
		}
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity</b> (The quantity of specimen collected)
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample
     * </p> 
	 */
	public void setQuantity(QuantityDt theValue) {
		myQuantity = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>method</b> (Technique used to perform collection).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the technique that is used to perform the procedure
     * </p> 
	 */
	public BoundCodeableConceptDt<SpecimenCollectionMethodEnum> getMethod() {  
		if (myMethod == null) {
			myMethod = new BoundCodeableConceptDt<SpecimenCollectionMethodEnum>(SpecimenCollectionMethodEnum.VALUESET_BINDER);
		}
		return myMethod;
	}

	/**
	 * Sets the value(s) for <b>method</b> (Technique used to perform collection)
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the technique that is used to perform the procedure
     * </p> 
	 */
	public void setMethod(BoundCodeableConceptDt<SpecimenCollectionMethodEnum> theValue) {
		myMethod = theValue;
	}


	/**
	 * Sets the value(s) for <b>method</b> (Technique used to perform collection)
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the technique that is used to perform the procedure
     * </p> 
	 */
	public void setMethod(SpecimenCollectionMethodEnum theValue) {
		getMethod().setValueAsEnum(theValue);
	}

  
	/**
	 * Gets the value(s) for <b>sourceSite</b> (Anatomical collection site).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Anatomical location from which the specimen should be collected (if subject is a patient). This element is not used for environmental specimens.
     * </p> 
	 */
	public CodeableConceptDt getSourceSite() {  
		if (mySourceSite == null) {
			mySourceSite = new CodeableConceptDt();
		}
		return mySourceSite;
	}

	/**
	 * Sets the value(s) for <b>sourceSite</b> (Anatomical collection site)
	 *
     * <p>
     * <b>Definition:</b>
     * Anatomical location from which the specimen should be collected (if subject is a patient). This element is not used for environmental specimens.
     * </p> 
	 */
	public void setSourceSite(CodeableConceptDt theValue) {
		mySourceSite = theValue;
	}


  

	}


	/**
	 * Block class for child element: <b>Specimen.treatment</b> (Treatment and processing step details)
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	@Block(name="Specimen.treatment")	
	public static class Treatment extends BaseElement implements IResourceBlock {
	
	@Child(name="description", type=StringDt.class, order=0, min=0, max=1)	
	@Description(
		shortDefinition="Textual description of procedure",
		formalDefinition=""
	)
	private StringDt myDescription;
	
	@Child(name="procedure", type=CodeableConceptDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Indicates the treatment or processing step  applied to the specimen",
		formalDefinition="A coded value specifying the procedure used to process the specimen"
	)
	private BoundCodeableConceptDt<SpecimenTreatmentProcedureEnum> myProcedure;
	
	@Child(name="additive", order=2, min=0, max=Child.MAX_UNLIMITED, type={
		ca.uhn.fhir.model.dstu.resource.Substance.class,
	})
	@Description(
		shortDefinition="Material used in the processing step",
		formalDefinition=""
	)
	private java.util.List<ResourceReferenceDt> myAdditive;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDescription,  myProcedure,  myAdditive);
	}
	
	@Override
	public java.util.List<IElement> getAllPopulatedChildElements() {
		return getAllPopulatedChildElementsOfType(null);
	}

	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDescription, myProcedure, myAdditive);
	}

	/**
	 * Gets the value(s) for <b>description</b> (Textual description of procedure).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getDescription() {  
		if (myDescription == null) {
			myDescription = new StringDt();
		}
		return myDescription;
	}

	/**
	 * Sets the value(s) for <b>description</b> (Textual description of procedure)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public void setDescription(StringDt theValue) {
		myDescription = theValue;
	}


 	/**
	 * Sets the value for <b>description</b> (Textual description of procedure)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public void setDescription( String theString) {
		myDescription = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>procedure</b> (Indicates the treatment or processing step  applied to the specimen).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the procedure used to process the specimen
     * </p> 
	 */
	public BoundCodeableConceptDt<SpecimenTreatmentProcedureEnum> getProcedure() {  
		if (myProcedure == null) {
			myProcedure = new BoundCodeableConceptDt<SpecimenTreatmentProcedureEnum>(SpecimenTreatmentProcedureEnum.VALUESET_BINDER);
		}
		return myProcedure;
	}

	/**
	 * Sets the value(s) for <b>procedure</b> (Indicates the treatment or processing step  applied to the specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the procedure used to process the specimen
     * </p> 
	 */
	public void setProcedure(BoundCodeableConceptDt<SpecimenTreatmentProcedureEnum> theValue) {
		myProcedure = theValue;
	}


	/**
	 * Sets the value(s) for <b>procedure</b> (Indicates the treatment or processing step  applied to the specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the procedure used to process the specimen
     * </p> 
	 */
	public void setProcedure(SpecimenTreatmentProcedureEnum theValue) {
		getProcedure().setValueAsEnum(theValue);
	}

  
	/**
	 * Gets the value(s) for <b>additive</b> (Material used in the processing step).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAdditive() {  
		if (myAdditive == null) {
			myAdditive = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAdditive;
	}

	/**
	 * Sets the value(s) for <b>additive</b> (Material used in the processing step)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public void setAdditive(java.util.List<ResourceReferenceDt> theValue) {
		myAdditive = theValue;
	}


  

	}


	/**
	 * Block class for child element: <b>Specimen.container</b> (Direct container of specimen (tube/slide, etc))
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	@Block(name="Specimen.container")	
	public static class Container extends BaseElement implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Id for the container",
		formalDefinition="Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Textual description of the container",
		formalDefinition=""
	)
	private StringDt myDescription;
	
	@Child(name="type", type=CodeableConceptDt.class, order=2, min=0, max=1)	
	@Description(
		shortDefinition="Kind of container directly associated with specimen",
		formalDefinition="The type of container associated with the specimen (e.g. slide, aliquot, etc)"
	)
	private CodeableConceptDt myType;
	
	@Child(name="capacity", type=QuantityDt.class, order=3, min=0, max=1)	
	@Description(
		shortDefinition="Container volume or size",
		formalDefinition="The capacity (volume or other measure) the container may contain."
	)
	private QuantityDt myCapacity;
	
	@Child(name="specimenQuantity", type=QuantityDt.class, order=4, min=0, max=1)	
	@Description(
		shortDefinition="Quantity of specimen within container",
		formalDefinition="The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type"
	)
	private QuantityDt mySpecimenQuantity;
	
	@Child(name="additive", order=5, min=0, max=1, type={
		ca.uhn.fhir.model.dstu.resource.Substance.class,
	})
	@Description(
		shortDefinition="Additive associated with container",
		formalDefinition="Additive associated with the container"
	)
	private ResourceReferenceDt myAdditive;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myDescription,  myType,  myCapacity,  mySpecimenQuantity,  myAdditive);
	}
	
	@Override
	public java.util.List<IElement> getAllPopulatedChildElements() {
		return getAllPopulatedChildElementsOfType(null);
	}

	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myDescription, myType, myCapacity, mySpecimenQuantity, myAdditive);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (Id for the container).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (Id for the container)
	 *
     * <p>
     * <b>Definition:</b>
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances
     * </p> 
	 */
	public void setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
	}

	/**
	 * Adds and returns a new value for <b>identifier</b> (Id for the container)
	 *
     * <p>
     * <b>Definition:</b>
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

  
	/**
	 * Gets the value(s) for <b>description</b> (Textual description of the container).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getDescription() {  
		if (myDescription == null) {
			myDescription = new StringDt();
		}
		return myDescription;
	}

	/**
	 * Sets the value(s) for <b>description</b> (Textual description of the container)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public void setDescription(StringDt theValue) {
		myDescription = theValue;
	}


 	/**
	 * Sets the value for <b>description</b> (Textual description of the container)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public void setDescription( String theString) {
		myDescription = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> (Kind of container directly associated with specimen).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of container associated with the specimen (e.g. slide, aliquot, etc)
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (Kind of container directly associated with specimen)
	 *
     * <p>
     * <b>Definition:</b>
     * The type of container associated with the specimen (e.g. slide, aliquot, etc)
     * </p> 
	 */
	public void setType(CodeableConceptDt theValue) {
		myType = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>capacity</b> (Container volume or size).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The capacity (volume or other measure) the container may contain.
     * </p> 
	 */
	public QuantityDt getCapacity() {  
		if (myCapacity == null) {
			myCapacity = new QuantityDt();
		}
		return myCapacity;
	}

	/**
	 * Sets the value(s) for <b>capacity</b> (Container volume or size)
	 *
     * <p>
     * <b>Definition:</b>
     * The capacity (volume or other measure) the container may contain.
     * </p> 
	 */
	public void setCapacity(QuantityDt theValue) {
		myCapacity = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>specimenQuantity</b> (Quantity of specimen within container).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type
     * </p> 
	 */
	public QuantityDt getSpecimenQuantity() {  
		if (mySpecimenQuantity == null) {
			mySpecimenQuantity = new QuantityDt();
		}
		return mySpecimenQuantity;
	}

	/**
	 * Sets the value(s) for <b>specimenQuantity</b> (Quantity of specimen within container)
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type
     * </p> 
	 */
	public void setSpecimenQuantity(QuantityDt theValue) {
		mySpecimenQuantity = theValue;
	}


  
	/**
	 * Gets the value(s) for <b>additive</b> (Additive associated with container).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additive associated with the container
     * </p> 
	 */
	public ResourceReferenceDt getAdditive() {  
		if (myAdditive == null) {
			myAdditive = new ResourceReferenceDt();
		}
		return myAdditive;
	}

	/**
	 * Sets the value(s) for <b>additive</b> (Additive associated with container)
	 *
     * <p>
     * <b>Definition:</b>
     * Additive associated with the container
     * </p> 
	 */
	public void setAdditive(ResourceReferenceDt theValue) {
		myAdditive = theValue;
	}


  

	}




}