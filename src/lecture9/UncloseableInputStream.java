package lecture9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UncloseableInputStream extends FilterInputStream {

    protected UncloseableInputStream(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        // NOP
    }
}
