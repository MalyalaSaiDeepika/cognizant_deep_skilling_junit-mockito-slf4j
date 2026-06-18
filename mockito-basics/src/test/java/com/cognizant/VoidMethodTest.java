package com.cognizant;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();

        verify(mockApi).getData();
    }
}