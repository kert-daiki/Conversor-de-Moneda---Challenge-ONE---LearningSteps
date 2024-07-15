package conversormoneda.api_service;

/**
 * ApiRecord
 */
public record ApiRecord(String result, String base_code, String target_code, int conversion_rate, int conversion_result) {
}
