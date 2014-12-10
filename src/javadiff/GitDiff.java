package javadiff;

import java.nio.charset.Charset;

/**
 * TODO https://github.com/danielribeiro/github-diff-highlight
 *      http://balupton.github.io/jquery-syntaxhighlighter/demo/
 *      https://highlightjs.org/ -> https://highlightjs.org/static/demo/ #diff 
 */

public class GitDiff {

	
	
	public static void main(String[] args) {

		
		String text1 = "This is a simple test";
		String text2 = "This is a test";
		
		String lorem1 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."  
				+ System.lineSeparator() + System.lineSeparator() +"Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. "
				+ System.lineSeparator();
		
		String lorem2 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."  
				+ System.lineSeparator() + System.lineSeparator() + "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu  nulla  at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. "
				+ System.lineSeparator() + System.lineSeparator() + "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu  nulla  at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. "
				+ System.lineSeparator();

		byte[] text1ByteArray = lorem1.getBytes(Charset.forName("UTF-8"));
		byte[] text2ByteArray = lorem2.getBytes(Charset.forName("UTF-8"));

		System.out.println("#############");
		System.out.println("Plaintext");
		System.out.println("#############");
		System.out.println();
		
		StringDiff stringDiff = new StringDiff();
		stringDiff.compare(text1ByteArray, text2ByteArray);
		
		System.out.println("#############");
		System.out.println("Repository");
		System.out.println("#############");
		System.out.println();

		RepoDiff repoTest = new RepoDiff();
		repoTest.compare(text1ByteArray, text2ByteArray);
	}

}
