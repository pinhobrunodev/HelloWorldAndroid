package br.com.mariojp.exercise1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.pm.ActivityInfo;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4ClassRunner.class)
public class CorrecaoTest {


    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(
            MainActivity.class);

    @Test
    public void textoInicial() {
        onView(withId(R.id.editNome))
                .check(matches(withText("")));
        onView(withId(R.id.labelMensagem))
                .check(matches(withText("Alô, Mundo!")));
    }

    @Test
    public void mudaTexto() {

        onView(withId(R.id.editNome))
                .perform(typeText("1234"));

        onView(withId(R.id.editNome)).perform(ViewActions.closeSoftKeyboard());


        onView(withId(R.id.btnCumprimentar))
                .perform(click());

        onView(withId(R.id.labelMensagem))
                .check(matches(withText("Alô, 1234!")));

    }

    @Test
    public void mantemLabelECaixaDeTextoAposRotacao() {

        onView(withId(R.id.editNome))
                .perform(typeText("1234"));

        onView(withId(R.id.editNome)).perform(ViewActions.closeSoftKeyboard());


        onView(withId(R.id.btnCumprimentar))
                .perform(click());

        onView(withId(R.id.editNome))
                .perform(typeText("56"));


        activityScenarioRule.getScenario().onActivity(activity -> {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        });

        onView(withId(R.id.editNome)).perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.labelMensagem))
                .check(matches(withText("Alô, 1234!")));
        onView(withId(R.id.editNome))
                .check(matches(withText("123456")));



    }
}