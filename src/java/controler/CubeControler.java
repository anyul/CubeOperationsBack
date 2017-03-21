package controler;

import model.TestCase;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

@Path("cubeControler")
public class CubeControler {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ControlCubo
     */
    public CubeControler() {
    }

    @POST
    @Path("postResponseOperations")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String postResponseOperations(String test) throws JSONException, IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        TestCase testCase = jsonMapper.readValue(test, TestCase.class);
        testCase.run();
        JSONArray resposeOperations = new JSONArray(testCase.getResponseOperations());
        return resposeOperations.toString();
    }
}
