package com.cognizant;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class ArgumentTest {

    @Test
    public void testArguments() {

        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();

        verify(mockApi).getData();
    }
}