package HW4;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView <T extends Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());


    public void sendOnConsole(List<Teacher> teacher) {
        for(Teacher user: teacher){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(TeacherGroup teacherGroup) {
        logger.info(teacherGroup.toString());
    }

    @Override
    public String toString() {
        return "Continue ";
    }
}
