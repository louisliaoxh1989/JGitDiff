package javadiff;

import java.util.LinkedList;

import javadiff.Diff_match_patch.Diff;

public class GoogleDiffMatchPatch {
	
	public static void compare(String fileContentOld, String fileContentNew){
		
		Diff_match_patch dmp = new Diff_match_patch();
		dmp.Diff_Timeout = 0;
		LinkedList<Diff> diffs = dmp.diff_main(fileContentOld, fileContentNew);
		
		String html = dmp.diff_prettyHtmlRbb(diffs); 
		
		System.out.println(html);
	}

}
