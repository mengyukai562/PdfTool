import java.io.File;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java -cp \"bin;lib\\Spire.Doc.jar;lib\\Spire.Pdf.jar;lib\\jaxb\\*\" Main <input.pdf> [output.docx]");
			System.out.println("Example: run.bat \"C:\\path\\to\\file.pdf\" \"C:\\path\\to\\output.docx\"");
			return;
		}

		String srcPath = args[0];
		String desPath = args.length >= 2 ? args[1] : null;

		File f = new File(srcPath);
		if (!f.exists() || !f.isFile()) {
			System.out.println("File not found: " + srcPath);
			return;
		}

		String res = new PdfToWord().pdftoword(srcPath, desPath);
		System.out.println(res);
	}
}
