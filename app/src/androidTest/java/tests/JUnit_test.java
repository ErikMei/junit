package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.londonappdeveloper.junitlab.MainActivity;
import com.londonappdeveloper.junitlab.R;

/**
 * Created by Erik Mei on 4/17/2016.
 */
public class JUnit_test  extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }
/*
    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);

    }
*/
    public void test_sum() {
        mainActivity =getActivity();
        assertEquals(mainActivity.add(3,4),7);
    }


}
