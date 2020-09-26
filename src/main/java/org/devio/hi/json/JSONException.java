package org.devio.hi.json;

// Note: this class was written without inspecting the non-free org.json sourcecode.

/**
 * Thrown to indicate a problem with the JSON API. Such problems include:
 * <ul>
 *   <li>Attempts to parse or construct malformed documents
 *   <li>Use of null as a name
 *   <li>Use of numeric types not available to JSON, such as {@link
 *       Double#isNaN() NaNs} or {@link Double#isInfinite() infinities}.
 *   <li>Lookups using an out of range index or nonexistent name
 *   <li>Type mismatches on lookups
 * </ul>
 *
 * <p>Although this is a checked exception, it is rarely recoverable. Most
 * callers should simply wrap this exception in an unchecked exception and
 * rethrow:
 * <pre>  public JSONArray toJSONObject() {
 *     try {
 *         JSONObject result = new JSONObject();
 *         ...
 *     } catch (JSONException e) {
 *         throw new RuntimeException(e);
 *     }
 * }</pre>
 */
public class JSONException extends Exception {

    public JSONException(String s) {
        super(s);
    }

    public JSONException(String message, Throwable cause) {
        super(message, cause);
    }

    public JSONException(Throwable cause) {
        super(cause);
    }

}
