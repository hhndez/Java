import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by hhndez on 30/03/16.
 */
public class Solution2 {

	static String createPath(String[] pathSegments) {
		// You should replace or update the below
//		return '/' + Arrays.asList(pathSegments).stream().collect(Collectors.joining("/"));
		List<String> list = Arrays.asList(pathSegments);
		List <String> list1 = new ArrayList();


		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			if (element.contains("/")) {
				String[] subelements = element.split("/");
				for (String e : subelements) {
					list1.add(e);
				}

			} else {
				list1.add(element);
			}
		}

		for (int i = 0; i < list1.size(); i++) {
			String element = list1.get(i);

			if (element.contains("..") && i > 0) {
				list1.set(i + 1, element.replace(".." ,""));
				int j = 1;
				while("".equals(list1.get(i - j)) && (i - j) >= 0 ) {
					j++;
				}
				list1.set(i -j + 1, "");

			}
		}
		return '/' + Arrays.asList(pathSegments).stream().filter(s -> !s.isEmpty()).collect(Collectors.joining("/"));



	}



	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;

		int _pathSegments_size = 0;
		_pathSegments_size = Integer.parseInt(in.nextLine().trim());
		String[] _pathSegments = new String[_pathSegments_size];
		String _pathSegments_item;
		for(int _pathSegments_i = 0; _pathSegments_i < _pathSegments_size; _pathSegments_i++) {
			try {
				_pathSegments_item = in.nextLine();
			} catch (Exception e) {
				_pathSegments_item = null;
			}
			_pathSegments[_pathSegments_i] = _pathSegments_item;
		}

		res = createPath(_pathSegments);
		bw.write(res);
		bw.newLine();

		bw.close();
	}

}
