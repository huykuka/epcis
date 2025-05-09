package org.oliot.epcis.query.model;

import java.util.List;

/**
 * POJO representing an EPCIS query with strongly-typed fields
 * based on the query-schema.json specification.
 */
public class EPCISQuery {
    // Arrays
    private List<String> eventType;
    private List<String> EQ_action;
    private List<String> EQ_bizStep;
    private List<String> EQ_disposition;
    private List<String> EQ_persistentDisposition_set;
    private List<String> EQ_persistentDisposition_unset;
    private List<String> EQ_readPoint;
    private List<String> WD_readPoint;
    private List<String> EQ_bizLocation;
    private List<String> WD_bizLocation;
    private List<String> EQ_transformationID;
    private List<String> MATCH_epc;
    private List<String> MATCH_parentID;
    private List<String> MATCH_inputEPC;
    private List<String> MATCH_outputEPC;
    private List<String> MATCH_anyEPC;
    private List<String> MATCH_epcClass;
    private List<String> MATCH_inputEPCClass;
    private List<String> MATCH_outputEPCClass;
    private List<String> MATCH_anyEPCClass;
    private List<String> EQ_eventID;
    private List<String> EQ_correctiveEventID;
    private List<String> EQ_errorReason;
    private List<String> EQ_type;
    private List<String> EQ_deviceID;
    private List<String> EQ_dataProcessingMethod;
    private List<String> EQ_microorganism;
    private List<String> EQ_chemicalSubstance;
    private List<String> EQ_bizRules;
    private List<String> EQ_stringValue;
    private List<String> EQ_hexBinaryValue;
    private List<String> EQ_uriValue;

    // Numbers
    private Integer eventCountLimit;
    private Integer maxEventCount;
    private Integer EXISTS_errorDeclaration;
    private Integer EXISTS_sensorElementList;
    private Double GE_quantity;
    private Double GT_quantity;
    private Double LT_quantity;
    private Double LE_quantity;
    private Double GE_percRank;
    private Double LT_percRank;
    private Double GT_percRank;
    private Double LE_percRank;

    // Booleans
    private Boolean EQ_booleanValue;

    // Strings
    private String orderBy;
    private String orderDirection;
    private String nextPageToken;
    
    // Dates (as strings - can be parsed later if needed)
    private String GE_eventTime;
    private String LT_eventTime;
    private String GE_recordTime;
    private String LT_recordTime;
    private String GE_errorDeclaration_Time;
    private String LT_errorDeclaration_Time;
    private String GE_time;
    private String LT_time;
    private String GE_startTime;
    private String LT_startTime;
    private String GE_endTime;
    private String LT_endTime;

    // Getters and setters
    public List<String> getEventType() {
        return eventType;
    }

    public void setEventType(List<String> eventType) {
        this.eventType = eventType;
    }

    public List<String> getEQ_action() {
        return EQ_action;
    }

    public void setEQ_action(List<String> eQ_action) {
        EQ_action = eQ_action;
    }

    public List<String> getEQ_bizStep() {
        return EQ_bizStep;
    }

    public void setEQ_bizStep(List<String> eQ_bizStep) {
        EQ_bizStep = eQ_bizStep;
    }

    public List<String> getEQ_disposition() {
        return EQ_disposition;
    }

    public void setEQ_disposition(List<String> eQ_disposition) {
        EQ_disposition = eQ_disposition;
    }

    public List<String> getEQ_persistentDisposition_set() {
        return EQ_persistentDisposition_set;
    }

    public void setEQ_persistentDisposition_set(List<String> eQ_persistentDisposition_set) {
        EQ_persistentDisposition_set = eQ_persistentDisposition_set;
    }

    public List<String> getEQ_persistentDisposition_unset() {
        return EQ_persistentDisposition_unset;
    }

    public void setEQ_persistentDisposition_unset(List<String> eQ_persistentDisposition_unset) {
        EQ_persistentDisposition_unset = eQ_persistentDisposition_unset;
    }

    public List<String> getEQ_readPoint() {
        return EQ_readPoint;
    }

    public void setEQ_readPoint(List<String> eQ_readPoint) {
        EQ_readPoint = eQ_readPoint;
    }

    public List<String> getWD_readPoint() {
        return WD_readPoint;
    }

    public void setWD_readPoint(List<String> wD_readPoint) {
        WD_readPoint = wD_readPoint;
    }

    public List<String> getEQ_bizLocation() {
        return EQ_bizLocation;
    }

    public void setEQ_bizLocation(List<String> eQ_bizLocation) {
        EQ_bizLocation = eQ_bizLocation;
    }

    public List<String> getWD_bizLocation() {
        return WD_bizLocation;
    }

    public void setWD_bizLocation(List<String> wD_bizLocation) {
        WD_bizLocation = wD_bizLocation;
    }

    public List<String> getEQ_transformationID() {
        return EQ_transformationID;
    }

    public void setEQ_transformationID(List<String> eQ_transformationID) {
        EQ_transformationID = eQ_transformationID;
    }

    public List<String> getMATCH_epc() {
        return MATCH_epc;
    }

    public void setMATCH_epc(List<String> mATCH_epc) {
        MATCH_epc = mATCH_epc;
    }

    public List<String> getMATCH_parentID() {
        return MATCH_parentID;
    }

    public void setMATCH_parentID(List<String> mATCH_parentID) {
        MATCH_parentID = mATCH_parentID;
    }

    public List<String> getMATCH_inputEPC() {
        return MATCH_inputEPC;
    }

    public void setMATCH_inputEPC(List<String> mATCH_inputEPC) {
        MATCH_inputEPC = mATCH_inputEPC;
    }

    public List<String> getMATCH_outputEPC() {
        return MATCH_outputEPC;
    }

    public void setMATCH_outputEPC(List<String> mATCH_outputEPC) {
        MATCH_outputEPC = mATCH_outputEPC;
    }

    public List<String> getMATCH_anyEPC() {
        return MATCH_anyEPC;
    }

    public void setMATCH_anyEPC(List<String> mATCH_anyEPC) {
        MATCH_anyEPC = mATCH_anyEPC;
    }

    public List<String> getMATCH_epcClass() {
        return MATCH_epcClass;
    }

    public void setMATCH_epcClass(List<String> mATCH_epcClass) {
        MATCH_epcClass = mATCH_epcClass;
    }

    public List<String> getMATCH_inputEPCClass() {
        return MATCH_inputEPCClass;
    }

    public void setMATCH_inputEPCClass(List<String> mATCH_inputEPCClass) {
        MATCH_inputEPCClass = mATCH_inputEPCClass;
    }

    public List<String> getMATCH_outputEPCClass() {
        return MATCH_outputEPCClass;
    }

    public void setMATCH_outputEPCClass(List<String> mATCH_outputEPCClass) {
        MATCH_outputEPCClass = mATCH_outputEPCClass;
    }

    public List<String> getMATCH_anyEPCClass() {
        return MATCH_anyEPCClass;
    }

    public void setMATCH_anyEPCClass(List<String> mATCH_anyEPCClass) {
        MATCH_anyEPCClass = mATCH_anyEPCClass;
    }

    public List<String> getEQ_eventID() {
        return EQ_eventID;
    }

    public void setEQ_eventID(List<String> eQ_eventID) {
        EQ_eventID = eQ_eventID;
    }

    public List<String> getEQ_correctiveEventID() {
        return EQ_correctiveEventID;
    }

    public void setEQ_correctiveEventID(List<String> eQ_correctiveEventID) {
        EQ_correctiveEventID = eQ_correctiveEventID;
    }

    public List<String> getEQ_errorReason() {
        return EQ_errorReason;
    }

    public void setEQ_errorReason(List<String> eQ_errorReason) {
        EQ_errorReason = eQ_errorReason;
    }

    public List<String> getEQ_type() {
        return EQ_type;
    }

    public void setEQ_type(List<String> eQ_type) {
        EQ_type = eQ_type;
    }

    public List<String> getEQ_deviceID() {
        return EQ_deviceID;
    }

    public void setEQ_deviceID(List<String> eQ_deviceID) {
        EQ_deviceID = eQ_deviceID;
    }

    public List<String> getEQ_dataProcessingMethod() {
        return EQ_dataProcessingMethod;
    }

    public void setEQ_dataProcessingMethod(List<String> eQ_dataProcessingMethod) {
        EQ_dataProcessingMethod = eQ_dataProcessingMethod;
    }

    public List<String> getEQ_microorganism() {
        return EQ_microorganism;
    }

    public void setEQ_microorganism(List<String> eQ_microorganism) {
        EQ_microorganism = eQ_microorganism;
    }

    public List<String> getEQ_chemicalSubstance() {
        return EQ_chemicalSubstance;
    }

    public void setEQ_chemicalSubstance(List<String> eQ_chemicalSubstance) {
        EQ_chemicalSubstance = eQ_chemicalSubstance;
    }

    public List<String> getEQ_bizRules() {
        return EQ_bizRules;
    }

    public void setEQ_bizRules(List<String> eQ_bizRules) {
        EQ_bizRules = eQ_bizRules;
    }

    public List<String> getEQ_stringValue() {
        return EQ_stringValue;
    }

    public void setEQ_stringValue(List<String> eQ_stringValue) {
        EQ_stringValue = eQ_stringValue;
    }

    public List<String> getEQ_hexBinaryValue() {
        return EQ_hexBinaryValue;
    }

    public void setEQ_hexBinaryValue(List<String> eQ_hexBinaryValue) {
        EQ_hexBinaryValue = eQ_hexBinaryValue;
    }

    public List<String> getEQ_uriValue() {
        return EQ_uriValue;
    }

    public void setEQ_uriValue(List<String> eQ_uriValue) {
        EQ_uriValue = eQ_uriValue;
    }

    public Integer getEventCountLimit() {
        return eventCountLimit;
    }

    public void setEventCountLimit(Integer eventCountLimit) {
        this.eventCountLimit = eventCountLimit;
    }

    public Integer getMaxEventCount() {
        return maxEventCount;
    }

    public void setMaxEventCount(Integer maxEventCount) {
        this.maxEventCount = maxEventCount;
    }

    public Integer getEXISTS_errorDeclaration() {
        return EXISTS_errorDeclaration;
    }

    public void setEXISTS_errorDeclaration(Integer eXISTS_errorDeclaration) {
        EXISTS_errorDeclaration = eXISTS_errorDeclaration;
    }

    public Integer getEXISTS_sensorElementList() {
        return EXISTS_sensorElementList;
    }

    public void setEXISTS_sensorElementList(Integer eXISTS_sensorElementList) {
        EXISTS_sensorElementList = eXISTS_sensorElementList;
    }

    public Double getGE_quantity() {
        return GE_quantity;
    }

    public void setGE_quantity(Double gE_quantity) {
        GE_quantity = gE_quantity;
    }

    public Double getGT_quantity() {
        return GT_quantity;
    }

    public void setGT_quantity(Double gT_quantity) {
        GT_quantity = gT_quantity;
    }

    public Double getLT_quantity() {
        return LT_quantity;
    }

    public void setLT_quantity(Double lT_quantity) {
        LT_quantity = lT_quantity;
    }

    public Double getLE_quantity() {
        return LE_quantity;
    }

    public void setLE_quantity(Double lE_quantity) {
        LE_quantity = lE_quantity;
    }

    public Double getGE_percRank() {
        return GE_percRank;
    }

    public void setGE_percRank(Double gE_percRank) {
        GE_percRank = gE_percRank;
    }

    public Double getLT_percRank() {
        return LT_percRank;
    }

    public void setLT_percRank(Double lT_percRank) {
        LT_percRank = lT_percRank;
    }

    public Double getGT_percRank() {
        return GT_percRank;
    }

    public void setGT_percRank(Double gT_percRank) {
        GT_percRank = gT_percRank;
    }

    public Double getLE_percRank() {
        return LE_percRank;
    }

    public void setLE_percRank(Double lE_percRank) {
        LE_percRank = lE_percRank;
    }

    public Boolean getEQ_booleanValue() {
        return EQ_booleanValue;
    }

    public void setEQ_booleanValue(Boolean eQ_booleanValue) {
        EQ_booleanValue = eQ_booleanValue;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getGE_eventTime() {
        return GE_eventTime;
    }

    public void setGE_eventTime(String gE_eventTime) {
        GE_eventTime = gE_eventTime;
    }

    public String getLT_eventTime() {
        return LT_eventTime;
    }

    public void setLT_eventTime(String lT_eventTime) {
        LT_eventTime = lT_eventTime;
    }

    public String getGE_recordTime() {
        return GE_recordTime;
    }

    public void setGE_recordTime(String gE_recordTime) {
        GE_recordTime = gE_recordTime;
    }

    public String getLT_recordTime() {
        return LT_recordTime;
    }

    public void setLT_recordTime(String lT_recordTime) {
        LT_recordTime = lT_recordTime;
    }

    public String getGE_errorDeclaration_Time() {
        return GE_errorDeclaration_Time;
    }

    public void setGE_errorDeclaration_Time(String gE_errorDeclaration_Time) {
        GE_errorDeclaration_Time = gE_errorDeclaration_Time;
    }

    public String getLT_errorDeclaration_Time() {
        return LT_errorDeclaration_Time;
    }

    public void setLT_errorDeclaration_Time(String lT_errorDeclaration_Time) {
        LT_errorDeclaration_Time = lT_errorDeclaration_Time;
    }

    public String getGE_time() {
        return GE_time;
    }

    public void setGE_time(String gE_time) {
        GE_time = gE_time;
    }

    public String getLT_time() {
        return LT_time;
    }

    public void setLT_time(String lT_time) {
        LT_time = lT_time;
    }

    public String getGE_startTime() {
        return GE_startTime;
    }

    public void setGE_startTime(String gE_startTime) {
        GE_startTime = gE_startTime;
    }

    public String getLT_startTime() {
        return LT_startTime;
    }

    public void setLT_startTime(String lT_startTime) {
        LT_startTime = lT_startTime;
    }

    public String getGE_endTime() {
        return GE_endTime;
    }

    public void setGE_endTime(String gE_endTime) {
        GE_endTime = gE_endTime;
    }

    public String getLT_endTime() {
        return LT_endTime;
    }

    public void setLT_endTime(String lT_endTime) {
        LT_endTime = lT_endTime;
    }
}
