package com.ys.sample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by zengyuetian on 2017/6/2.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"}, features={"src/test/features"})
public class CheckoutJunitTest {

}
