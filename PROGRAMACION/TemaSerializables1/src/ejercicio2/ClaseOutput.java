package ejercicio2;

import java.io.*;

public class ClaseOutput extends ObjectOutputStream{
	ClaseOutput(OutputStream f) throws IOException{
		super(f);
	}
	
	protected void writeStreamHeader() throws IOException{}

}
