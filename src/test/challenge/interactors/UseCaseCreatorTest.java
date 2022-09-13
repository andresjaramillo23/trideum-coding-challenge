package challenge.interactors;

import main.challenge.controllers.requests.FizzBuzzMakerRequest;
import main.challenge.controllers.requests.RequestFactory;
import main.challenge.interactors.FizzBuzzMaker;
import main.challenge.interactors.UseCaseCreator;
import main.challenge.interactors.responses.FizzBuzzMakerResponse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class UseCaseCreatorTest {
    private RequestFactory factory;

    @Before
    public void setup() {
        factory = new UseCaseCreator();
    }

    @After
    public void destroy() {
        factory = null;
    }

    @Test
    public void makeFizzBuzz() {
        FizzBuzzMakerResponse response = mock(FizzBuzzMakerResponse.class);
        FizzBuzzMakerRequest request = factory.makeFizzBuzz(response);

        Assert.assertSame(FizzBuzzMaker.class, request.getClass());
    }
}
