package org.launchcode.techjobs.persistent;

import org.launchcode.techjobs.persistent.models.Skill;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkillTest {

    @Test
    public void testSkillJobsFieldHasCorrectType() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> skillClass = Class.forName("org.launchcode.techjobs.persistent.models.Skill");
        Method getJobsMethod = skillClass.getMethod("getJobs");
        Skill skill = new Skill();
        Object jobsObj = getJobsMethod.invoke(skill);
        assertTrue(jobsObj instanceof List);
    }
}