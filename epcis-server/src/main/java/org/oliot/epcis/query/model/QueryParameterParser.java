package org.oliot.epcis.query.model;

import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Utility class for parsing query parameters into typed objects
 */
public class QueryParameterParser {

    /**
     * Parse query parameters into an EPCISQuery object with proper type conversion
     * @param params MultiMap of query parameters
     * @return EPCISQuery object with properly typed fields
     */
    public static EPCISQuery parseQueryParams(MultiMap params) {
        EPCISQuery query = new EPCISQuery();
        
        // Process each parameter
        for (Map.Entry<String, String> entry : params.entries()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            if (value == null || value.isEmpty()) {
                continue;
            }
            
            // Handle integer parameters
            if (isIntegerParam(key)) {
                try {
                    setIntegerParam(query, key, Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    // Skip invalid numbers
                }
                continue;
            }
            
            // Handle double parameters
            if (isDoubleParam(key)) {
                try {
                    setDoubleParam(query, key, Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    // Skip invalid numbers
                }
                continue;
            }
            
            // Handle boolean parameters
            if (isBooleanParam(key)) {
                setBooleanParam(query, key, Boolean.parseBoolean(value));
                continue;
            }
            
            // Handle array parameters (comma-separated)
            if (isArrayParam(key)) {
                List<String> values = Arrays.asList(value.split(","));
                setArrayParam(query, key, values);
                continue;
            }
            
            // Handle string parameters (default)
            setStringParam(query, key, value);
        }
        
        return query;
    }
    
    /**
     * Convert EPCISQuery to JsonObject
     * @param query The EPCISQuery object
     * @return JsonObject representation
     */
    public static JsonObject toJsonObject(EPCISQuery query) {
        JsonObject json = new JsonObject();
        
        // This is a simplified conversion - in a real implementation,
        // you would use reflection or a more comprehensive mapping
        
        // Add integer fields
        if (query.getEventCountLimit() != null) {
            json.put("eventCountLimit", query.getEventCountLimit());
        }
        if (query.getMaxEventCount() != null) {
            json.put("maxEventCount", query.getMaxEventCount());
        }
        if (query.getEXISTS_errorDeclaration() != null) {
            json.put("EXISTS_errorDeclaration", query.getEXISTS_errorDeclaration());
        }
        if (query.getEXISTS_sensorElementList() != null) {
            json.put("EXISTS_sensorElementList", query.getEXISTS_sensorElementList());
        }
        
        // Add double fields
        if (query.getGE_quantity() != null) {
            json.put("GE_quantity", query.getGE_quantity());
        }
        if (query.getGT_quantity() != null) {
            json.put("GT_quantity", query.getGT_quantity());
        }
        if (query.getLT_quantity() != null) {
            json.put("LT_quantity", query.getLT_quantity());
        }
        if (query.getLE_quantity() != null) {
            json.put("LE_quantity", query.getLE_quantity());
        }
        
        // Add boolean fields
        if (query.getEQ_booleanValue() != null) {
            json.put("EQ_booleanValue", query.getEQ_booleanValue());
        }
        
        // Add string fields
        if (query.getOrderBy() != null) {
            json.put("orderBy", query.getOrderBy());
        }
        if (query.getOrderDirection() != null) {
            json.put("orderDirection", query.getOrderDirection());
        }
        if (query.getNextPageToken() != null) {
            json.put("nextPageToken", query.getNextPageToken());
        }
        
        // Add date fields
        if (query.getGE_eventTime() != null) {
            json.put("GE_eventTime", query.getGE_eventTime());
        }
        if (query.getLT_eventTime() != null) {
            json.put("LT_eventTime", query.getLT_eventTime());
        }
        if (query.getGE_recordTime() != null) {
            json.put("GE_recordTime", query.getGE_recordTime());
        }
        if (query.getLT_recordTime() != null) {
            json.put("LT_recordTime", query.getLT_recordTime());
        }
        
        // Add array fields
        if (query.getEventType() != null) {
            json.put("eventType", query.getEventType());
        }
        if (query.getEQ_action() != null) {
            json.put("EQ_action", query.getEQ_action());
        }
        if (query.getEQ_bizStep() != null) {
            json.put("EQ_bizStep", query.getEQ_bizStep());
        }
        if (query.getEQ_disposition() != null) {
            json.put("EQ_disposition", query.getEQ_disposition());
        }
        
        // Add more fields as needed...
        
        return json;
    }
    
    // Helper methods to determine parameter types
    
    private static boolean isIntegerParam(String key) {
        return key.equals("eventCountLimit") || 
               key.equals("maxEventCount") || 
               key.equals("EXISTS_errorDeclaration") ||
               key.equals("EXISTS_sensorElementList");
    }
    
    private static boolean isDoubleParam(String key) {
        return key.startsWith("GE_quantity") || 
               key.startsWith("GT_quantity") || 
               key.startsWith("LT_quantity") || 
               key.startsWith("LE_quantity") ||
               key.startsWith("GE_percRank") ||
               key.startsWith("LT_percRank") ||
               key.startsWith("GT_percRank") ||
               key.startsWith("LE_percRank");
    }
    
    private static boolean isBooleanParam(String key) {
        return key.equals("EQ_booleanValue");
    }
    
    private static boolean isArrayParam(String key) {
        return key.equals("eventType") ||
               key.startsWith("EQ_action") ||
               key.startsWith("EQ_bizStep") ||
               key.startsWith("EQ_disposition") ||
               key.startsWith("EQ_persistentDisposition_") ||
               key.startsWith("EQ_readPoint") ||
               key.startsWith("WD_readPoint") ||
               key.startsWith("EQ_bizLocation") ||
               key.startsWith("WD_bizLocation") ||
               key.startsWith("EQ_transformationID") ||
               key.startsWith("MATCH_") ||
               key.startsWith("EQ_eventID") ||
               key.startsWith("EQ_correctiveEventID") ||
               key.startsWith("EQ_errorReason") ||
               key.startsWith("EQ_type") ||
               key.startsWith("EQ_deviceID") ||
               key.startsWith("EQ_dataProcessingMethod") ||
               key.startsWith("EQ_microorganism") ||
               key.startsWith("EQ_chemicalSubstance") ||
               key.startsWith("EQ_bizRules") ||
               key.startsWith("EQ_stringValue") ||
               key.startsWith("EQ_hexBinaryValue") ||
               key.startsWith("EQ_uriValue");
    }
    
    // Helper methods to set values in the query object
    
    private static void setIntegerParam(EPCISQuery query, String key, int value) {
        switch (key) {
            case "eventCountLimit":
                query.setEventCountLimit(value);
                break;
            case "maxEventCount":
                query.setMaxEventCount(value);
                break;
            case "EXISTS_errorDeclaration":
                query.setEXISTS_errorDeclaration(value);
                break;
            case "EXISTS_sensorElementList":
                query.setEXISTS_sensorElementList(value);
                break;
            // Add more cases as needed
        }
    }
    
    private static void setDoubleParam(EPCISQuery query, String key, double value) {
        switch (key) {
            case "GE_quantity":
                query.setGE_quantity(value);
                break;
            case "GT_quantity":
                query.setGT_quantity(value);
                break;
            case "LT_quantity":
                query.setLT_quantity(value);
                break;
            case "LE_quantity":
                query.setLE_quantity(value);
                break;
            case "GE_percRank":
                query.setGE_percRank(value);
                break;
            case "LT_percRank":
                query.setLT_percRank(value);
                break;
            case "GT_percRank":
                query.setGT_percRank(value);
                break;
            case "LE_percRank":
                query.setLE_percRank(value);
                break;
            // Add more cases as needed
        }
    }
    
    private static void setBooleanParam(EPCISQuery query, String key, boolean value) {
        switch (key) {
            case "EQ_booleanValue":
                query.setEQ_booleanValue(value);
                break;
            // Add more cases as needed
        }
    }
    
    private static void setArrayParam(EPCISQuery query, String key, List<String> values) {
        switch (key) {
            case "eventType":
                query.setEventType(values);
                break;
            case "EQ_action":
                query.setEQ_action(values);
                break;
            case "EQ_bizStep":
                query.setEQ_bizStep(values);
                break;
            case "EQ_disposition":
                query.setEQ_disposition(values);
                break;
            case "EQ_persistentDisposition_set":
                query.setEQ_persistentDisposition_set(values);
                break;
            case "EQ_persistentDisposition_unset":
                query.setEQ_persistentDisposition_unset(values);
                break;
            case "EQ_readPoint":
                query.setEQ_readPoint(values);
                break;
            case "WD_readPoint":
                query.setWD_readPoint(values);
                break;
            case "EQ_bizLocation":
                query.setEQ_bizLocation(values);
                break;
            case "WD_bizLocation":
                query.setWD_bizLocation(values);
                break;
            case "EQ_transformationID":
                query.setEQ_transformationID(values);
                break;
            case "MATCH_epc":
                query.setMATCH_epc(values);
                break;
            case "MATCH_parentID":
                query.setMATCH_parentID(values);
                break;
            case "MATCH_inputEPC":
                query.setMATCH_inputEPC(values);
                break;
            case "MATCH_outputEPC":
                query.setMATCH_outputEPC(values);
                break;
            case "MATCH_anyEPC":
                query.setMATCH_anyEPC(values);
                break;
            case "MATCH_epcClass":
                query.setMATCH_epcClass(values);
                break;
            case "MATCH_inputEPCClass":
                query.setMATCH_inputEPCClass(values);
                break;
            case "MATCH_outputEPCClass":
                query.setMATCH_outputEPCClass(values);
                break;
            case "MATCH_anyEPCClass":
                query.setMATCH_anyEPCClass(values);
                break;
            case "EQ_eventID":
                query.setEQ_eventID(values);
                break;
            case "EQ_correctiveEventID":
                query.setEQ_correctiveEventID(values);
                break;
            case "EQ_errorReason":
                query.setEQ_errorReason(values);
                break;
            case "EQ_type":
                query.setEQ_type(values);
                break;
            case "EQ_deviceID":
                query.setEQ_deviceID(values);
                break;
            case "EQ_dataProcessingMethod":
                query.setEQ_dataProcessingMethod(values);
                break;
            case "EQ_microorganism":
                query.setEQ_microorganism(values);
                break;
            case "EQ_chemicalSubstance":
                query.setEQ_chemicalSubstance(values);
                break;
            case "EQ_bizRules":
                query.setEQ_bizRules(values);
                break;
            case "EQ_stringValue":
                query.setEQ_stringValue(values);
                break;
            case "EQ_hexBinaryValue":
                query.setEQ_hexBinaryValue(values);
                break;
            case "EQ_uriValue":
                query.setEQ_uriValue(values);
                break;
            // Add more cases as needed
        }
    }
    
    private static void setStringParam(EPCISQuery query, String key, String value) {
        switch (key) {
            case "orderBy":
                query.setOrderBy(value);
                break;
            case "orderDirection":
                query.setOrderDirection(value);
                break;
            case "nextPageToken":
                query.setNextPageToken(value);
                break;
            case "GE_eventTime":
                query.setGE_eventTime(value);
                break;
            case "LT_eventTime":
                query.setLT_eventTime(value);
                break;
            case "GE_recordTime":
                query.setGE_recordTime(value);
                break;
            case "LT_recordTime":
                query.setLT_recordTime(value);
                break;
            case "GE_errorDeclaration_Time":
                query.setGE_errorDeclaration_Time(value);
                break;
            case "LT_errorDeclaration_Time":
                query.setLT_errorDeclaration_Time(value);
                break;
            case "GE_time":
                query.setGE_time(value);
                break;
            case "LT_time":
                query.setLT_time(value);
                break;
            case "GE_startTime":
                query.setGE_startTime(value);
                break;
            case "LT_startTime":
                query.setLT_startTime(value);
                break;
            case "GE_endTime":
                query.setGE_endTime(value);
                break;
            case "LT_endTime":
                query.setLT_endTime(value);
                break;
            // Add more cases as needed
        }
    }
}
