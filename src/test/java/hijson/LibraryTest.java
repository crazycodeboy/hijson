/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hijson;

import org.devio.hi.json.HiJson;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        //        Library classUnderTest = new Library();
        //        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        String city = new HiJson(testJson).get("lives").get(0).value("city");
        assertNotNull(city);
        System.out.println(city);
    }

    static String testJson =
        "{\n" + "    \"status\": \"1\",\n" + "    \"count\": \"1\",\n" + "    \"info\": \"OK\",\n" + "    \"infocode\": \"10000\",\n"
            + "    \"lives\": [\n" + "        {\n" + "            \"province\": \"河北\",\n" + "            \"city\": \"邢台市\",\n"
            + "            \"adcode\": \"130500\",\n" + "            \"weather\": \"多云\",\n" + "            \"temperature\": \"17\",\n"
            + "            \"winddirection\": \"北\",\n" + "            \"windpower\": \"≤3\",\n" + "            \"humidity\": \"98\",\n"
            + "            \"reporttime\": \"2020-09-26 21:58:34\"\n" + "        }\n" + "    ]\n" + "}";
}