package gourmet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ClaseOutput extends ObjectOutputStream{
	ClaseOutput(OutputStream f) throws IOException{
		super(f);
	}
	
	protected void writeStreamHeader() throws IOException{}

}