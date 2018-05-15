import collection.main;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ExampleSuite {
    @Test
    public void case1() {
        String in = "1 2 3 4 1 2";
        ArrayList<Integer> out = main.Stroka(in);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2));
        Assert.assertEquals(expected, out);
        Assert.assertEquals(6, out.size());
    }

    @Test
    public void caseSet() {
        String in = "1 2 3 4 1 2";
        HashSet<Integer> out = main.Stroka2(in);
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 1, 2));
        Assert.assertEquals(expected, out);
        Assert.assertEquals(4, out.size());
    }

    @Test
    public  void Stroka3() throws FileNotFoundException {
        String filename ="./res/test1.txt";
        HashSet<String>set = main.Stroka3(filename);
        HashSet<String> expected = new HashSet<>(Arrays.asList(
                "сталь",
                "медь",
                "железо",
                "алюминий",
                "ртуть",
                "золото"));
        Assert.assertEquals(expected, set);


    }

}
